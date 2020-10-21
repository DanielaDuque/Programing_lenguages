import rule
import grammar
import not_terminal
import first

def next_aux(grammar, grammar_class, char_seen, char_actual, isterminal, char_inicial):  # funcion recursiva para obtener los no terminales

    gram = grammar.copy()

    if char_actual == char_inicial: #signo inicial tiene siempre $
        gram.get(char_actual).put_next("$")

    for r, right_part in gram.items():  # regla, y not_terminal
        for rule in right_part.rules: # iteracion sobre not_terminal de 
            for i in range(len(rule.right_part)): # iteracion sobre caracteres de la regla
                character = rule.right_part[i]
                if character == char_actual: # Confirma que sea l no tereminal ara el cual se calcula next

                    if i+1==len(rule.right_part): # Si es el ultimo de la regla
                        char_seen +=[r]
                        if character == r:
                            continue
                        aux = next_aux(gram, grammar_class, char_seen, r, isterminal,char_inicial).get(r).next # next(regla)
                        gram.get(char_actual).put_next( aux )
                    else:
                        aux_var = first.first_string(grammar_class, rule.right_part[i+1:])
                        character_next = rule.right_part[i+1] #Caracter siguiente
                        if not isterminal(character_next): # Si es terminal 
                            gram.get(char_actual).put_next(character_next)

                        elif character_next in char_seen :  # para salir si es circular
                            continue
                            # if char_actual == char_inicial:
                            #     gram.get(char_actual).put_next(gram.get(character_next).first)

                        elif "epsilon" in aux_var: # si primeros de beta tiene epsilon
                            char_seen +=[r]
                            gram.get(char_actual).put_next( aux_var )
                            gram.get(char_actual).next.remove("epsilon")
                            if character == r:
                                continue
                            aux = next_aux(gram, grammar_class, char_seen, r, isterminal, char_inicial ).get(r).next
                            gram.get(char_actual).put_next( aux )
                        else:
                            gram.get(char_actual).put_next( aux )

    
    return gram
                
def next (grammar):
    gramm = grammar.rules.copy()
    not_ter = list(gramm.keys())
    char_ini = not_ter[0]
    for not_te_aux in not_ter:
        if len(gramm[not_te_aux].next)==0:
            gramm = next_aux(gramm, grammar, [], not_te_aux, lambda x: grammar.is_terminal(x), char_ini )
    return gramm


def main():

    # from first import first, first_string



    # var z := int(papito) +
    # gram1 = {"A": not_terminal.Not_terminal("A", [rule.Rule("B C"), rule.Rule("bad")]),
    #          "B": not_terminal.Not_terminal("B", [rule.Rule("big C boss"), rule.Rule("epsilon")]),
    #          "C": not_terminal.Not_terminal("C", [rule.Rule("cat"), rule.Rule("cow")])}

    # gram1 = {"S": not_terminal.Not_terminal("S", [rule.Rule("A uno B C"), rule.Rule("S dos")]),
    #          "A": not_terminal.Not_terminal("A", [rule.Rule("B C D"), rule.Rule("A tres"), rule.Rule("epsilon")]),
    #          "B": not_terminal.Not_terminal("B", [rule.Rule("D cuatro C tres"), rule.Rule("epsilon")]),
    #          "C": not_terminal.Not_terminal("C", [rule.Rule("cinco D B"), rule.Rule("epsilon")]),
    #          "D": not_terminal.Not_terminal("D", [rule.Rule("seis"), rule.Rule("epsilon")])}

    # grammar = grammar.Grammar(gram1)

    # grammar.rules = first(grammar).copy()


    #gram = next_aux(gramar.rules, [] , "D", lambda x: gramar.is_terminal(x), "S") 


    # print(grammar["S"].next,grammar["A"].next,grammar["B"].next,grammar["C"].next,grammar["D"].next)



    # def next(gram , ):

    #     gram = grammar.rules.copy()

        # for r, right_part in grammar.rules.items():  # regla, y not_terminal
        #     if len(gram.get(r).first):  # si ya tiene elementos en first y epsilon no esta
        #         continue
        #     for value in right_part.rules:  # iteracion sobre not_terminal de r
        #         for i in range(len(value.right_part)):  

                
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

    gram1 = {"S": not_terminal.Not_terminal("S", [rule.Rule("A B C"), rule.Rule("D E")]),
             "A": not_terminal.Not_terminal("A", [rule.Rule("dos B tres"), rule.Rule("epsilon")]),
             "B": not_terminal.Not_terminal("B", [rule.Rule("cuatro C cinco B"), rule.Rule("epsilon")]),
             "C": not_terminal.Not_terminal("C", [rule.Rule("seis A B")]),
             "D": not_terminal.Not_terminal("D", [rule.Rule("uno A E"), rule.Rule("B")]),
             "E": not_terminal.Not_terminal("E", [rule.Rule("tres")])}


    gramar = grammar.Grammar(gram1)

    gramar.rules = first.first(gramar).copy()
    gra = next(gramar)

    for key, value in gra.items():
        print(key, " ", value.next)

    # print(gramar["S"].first, gramar["A"].first, gramar["B"].first, gramar["C"].first, gramar["D"].first)
    # print(gramar["D"].rules[1].first)




    return 


if __name__ == "__main__":
    main()

