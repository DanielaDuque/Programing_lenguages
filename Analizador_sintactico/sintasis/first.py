import rule
import grammar
import not_terminal
from rule import Rule
from not_terminal import  Not_terminal

def first_string(grammar, beta):

    first_array = []

    for c in beta:
        if not grammar.is_terminal(c):
            first_array.append(c)
            if "epsilon" in first_array and not len(beta) ==1:
                first_array.remove("epsilon")
            break

        first_array += grammar.rules[c].first
        if not "epsilon" in grammar.rules[c].first:
            break

    return list(set(first_array))



def first_aux(gram, terminal):
    li_glob = []
    seen = []

    def rec(char, ac, before):
        # print(li)
        if not gram.is_terminal(char): # si es terminal
            if char not in li_glob: # si no esta en primeros
                # print(seen)
                li_glob.append(char)
            seen[:] = seen[:-1]
            return

        if ac and char == terminal: # si vuelve al primer terminal
            return

        for value_1 in gram.rules[char].rules: # recorre las reglas del terminal char (A)
            if value_1 == before: # si la regla anterior es la misma que estamos mirando no la revise
                continue
            for i in range(len(value_1.right_part)): # recorre los elementos de la regla (alfa_i)
                if value_1.right_part[i] not in seen:
                    seen.append(value_1.right_part[i])
                    rec(value_1.right_part[i], 1, value_1) #calcula first de alfa_i
                    seen[:] = seen[:-1]

                    if "epsilon" not in li_glob: # si epsilon no esta en los first de alfa_i, pase a otra regla
                        break

                    if i < len(value_1.right_part)-1: # si epsilon esta en first de char y no es el ultimo terminal
                        li_glob.remove("epsilon") #quitar epsilon
                else:
                    return


    rec(terminal, 0, "")
    return li_glob



def first(gram):
    gramm = gram.rules.copy()
    for key in gram.rules.keys():
        gramm[key].first = first_aux(gram, key)
        # print(key, " ", gramm[key].first)

    return gramm



def main():
    # gram1 = {"A": not_terminal.Not_terminal("A", [rule.Rule("B C"), rule.Rule("bad")]),
    #          "B": not_terminal.Not_terminal("B", [rule.Rule("big C boss"), rule.Rule("epsilon")]),
    #          "C": not_terminal.Not_terminal("C", [rule.Rule("cat"), rule.Rule("cow")])}

    # gram1 = {"S": not_terminal.Not_terminal("S", [rule.Rule("A uno B C"), rule.Rule("S dos")]),
    #          "A": not_terminal.Not_terminal("A", [rule.Rule("B C D"), rule.Rule("A tres"), rule.Rule("epsilon")]),
    #          "B": not_terminal.Not_terminal("B", [rule.Rule("D cuatro C tres"), rule.Rule("epsilon")]),
    #          "C": not_terminal.Not_terminal("C", [rule.Rule("cinco D B"), rule.Rule("epsilon")]),
    #          "D": not_terminal.Not_terminal("D", [rule.Rule("seis"), rule.Rule("epsilon")])}

    # gram1 = {"A": not_terminal.Not_terminal("A", [rule.Rule("ant C"), rule.Rule("B")]),
    #          "B": not_terminal.Not_terminal("B", [rule.Rule("cat C"), rule.Rule("C")]),
    #          "C": not_terminal.Not_terminal("C", [rule.Rule("D fat"), rule.Rule("D")]),
    #          "D": not_terminal.Not_terminal("D", [rule.Rule("B")])}

    # gram1 = {"A": not_terminal.Not_terminal("A", [rule.Rule("ant C"), rule.Rule("B")]),
    #          "B": not_terminal.Not_terminal("B", [rule.Rule("cat C"), rule.Rule("C")]),
    #          "C": not_terminal.Not_terminal("C", [rule.Rule("fat D"), rule.Rule("D")]),
    #          "D": not_terminal.Not_terminal("D", [rule.Rule("B")])}

    gramar = grammar.Grammar(gram1)

    # gramar = first(gramar) IMPORTANTE
    # first(gramar)
    # print(first_aux(gramar, "S"))
    first(gramar)


    # print(gramar["S"].first, gramar["A"].first, gramar["B"].first, gramar["C"].first, gramar["D"].first)
    # for key, value in gramar.items():
    #     print(key, " ", value.first)
    # print(gramar["A"].rules[0].first)

if __name__ == '__main__':
    main()