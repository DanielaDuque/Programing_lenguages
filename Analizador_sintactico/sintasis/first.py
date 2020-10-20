import rule
import grammar
import not_terminal


def first(grammar):
    gram = grammar.rules.copy()

    for r, right_part in grammar.rules.items():  # regla, y not_terminal
        if len(gram.get(r).first):  # si ya tiene elementos en first y epsilon no esta
            continue

        for value in right_part.rules:  # iteracion sobre not_terminal de r
            li = []
            for i in range(len(value.right_part)):  # iteracion sobre caracteres de la regla
                character = value.right_part[i]  # caracter i-esimo

                if not grammar.is_terminal(character):  # Si es terminal se agrega directamente y hace break
                    gram.get(r).put_first(character)
                    value.put_first(character)
                    break

                else:  # si es no terminal

                    def recursion(char, ac):  # funcion recursiva para obtener los no terminales

                        if not grammar.is_terminal(char):
                            return char

                        if char == r or (char == character and ac != 0) :  # para salir si es circular
                            return

                        for value in grammar.rules[char].rules: # iteracion sobre las reglas de char
                            for i in range(len(value.right_part)):
                                val = recursion(value.right_part[i], ac+1)
                                if val:
                                    gram.get(character).put_first(val)
                                    value.put_first(val)
                                    if not val == "epsilon":
                                        break

                    if not len(gram.get(character).first):  # se verifica si character ya tiene first
                        recursion(character, 0)

                    aux = gram.get(character).first
                    gram.get(r).put_first(aux)  # se agrega los first de character en r
                    value.put_first(aux)

                    if not "epsilon" in gram.get(r).first:  # si epsilon no esta en la lista
                        break
                    else:
                        if not i == len(
                                value.right_part):  # si estamos en el ultimo caracter de la lista y toca quitar epsilon
                            gram.get(r).first.remove("epsilon")
                            value.first.remove("epsilon")

    return gram

def __main__ ():
    # gram1 = {"A": [rule.Rule("C"), rule.Rule("masssssss")], "B": [rule.Rule("ma")], "C": [rule.Rule("B"), rule.Rule("oso")]}
    # gram1 = {"A": [rule.Rule("B C"), rule.Rule("bad")], "B": [rule.Rule("big C boss"), rule.Rule("bet")],
    #          "C": [rule.Rule("cat"), rule.Rule("cow")]}


    # gram1 = {"A": not_terminal.Not_terminal("A", [rule.Rule("B C"), rule.Rule("bad")]),
    #          "B": not_terminal.Not_terminal("B", [rule.Rule("big C boss"), rule.Rule("epsilon")]),
    #          "C": not_terminal.Not_terminal("C", [rule.Rule("cat"), rule.Rule("cow")])}

    # gram1 = {"A": not_terminal.Not_terminal("A", [rule.Rule("B"), rule.Rule("bad")]), "B": not_terminal.Not_terminal("B", [rule.Rule("A")])}


    # gram1 = {"S": not_terminal.Not_terminal("S", [rule.Rule("A uno B C"), rule.Rule("S dos")]),
    #          "A": not_terminal.Not_terminal("A", [rule.Rule("B C D"), rule.Rule("A tres"), rule.Rule("epsilon")]),
    #          "B": not_terminal.Not_terminal("B", [rule.Rule("D cuatro C tres"), rule.Rule("epsilon")]),
    #          "C": not_terminal.Not_terminal("C", [rule.Rule("cinco D B"), rule.Rule("epsilon")]),
    #          "D": not_terminal.Not_terminal("D", [rule.Rule("seis"), rule.Rule("epsilon")])}

    # gramar = grammar.Grammar(gram1)

    # gramar = first(gramar)

    # print(gramar["S"].first, gramar["A"].first, gramar["B"].first, gramar["C"].first, gramar["D"].first)
    # print(gramar["D"].rules[1].first)
    return


if __name__ == "__main__":
    __main__()

