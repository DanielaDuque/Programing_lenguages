

def prediction_set(grammar):  # funcion recursiva para obtener los no terminales

    gram = grammar.rules.copy()

    for r, right_part in gram.items():  # regla, y not_terminal
        for rule in right_part.rules: # iteracion sobre not_terminal de 
            if "epsilon" in rule.first:
                rule.prediction_set = rule.first + gram.get(r).next
                print("<<<")
                print(r," ",rule.right_part, " " ,rule.first, " ", rule.prediction_set)
                rule.prediction_set.remove("epsilon")
                print(r," ",rule.right_part, " " ,rule.first, " ", rule.prediction_set)
            else:
                print("<<<")
                rule.prediction_set = rule.first
                print(r," ",rule.right_part, " " ,rule.first, " ", rule.prediction_set)
    return gram
                

def main():
    import rule
    import grammar
    import not_terminal
    from first import first
    from next import next
    # var z := int(papito) +
    # gram1 = {"A": not_terminal.Not_terminal("A", [rule.Rule("B C"), rule.Rule("bad")]),
    #          "B": not_terminal.Not_terminal("B", [rule.Rule("big C boss"), rule.Rule("epsilon")]),
    #          "C": not_terminal.Not_terminal("C", [rule.Rule("cat"), rule.Rule("cow")])}

    gram1 = {"S": not_terminal.Not_terminal("S", [rule.Rule("A uno B C"), rule.Rule("S dos")]),
             "A": not_terminal.Not_terminal("A", [rule.Rule("B C D"), rule.Rule("A tres"), rule.Rule("epsilon")]),
             "B": not_terminal.Not_terminal("B", [rule.Rule("D cuatro C tres"), rule.Rule("epsilon")]),
             "C": not_terminal.Not_terminal("C", [rule.Rule("cinco D B"), rule.Rule("epsilon")]),
             "D": not_terminal.Not_terminal("D", [rule.Rule("seis"), rule.Rule("epsilon")])}



    grammar = grammar.Grammar(gram1)
    
    grammar.rules = first(grammar).copy()

    grammar.rules = next (grammar).copy()
    grammar = prediction_set(grammar).copy()

    for r, right_part in grammar.items():  # regla, y not_terminal
        for rule in right_part.rules: # iteracion sobre not_terminal de 
            print (r, " -> ", rule.right_part, " : ",rule.prediction_set)



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

    # gramar = grammar.Grammar(gram1)

    # # gramar = first(gramar)

    # print(gramar["S"].first, gramar["A"].first, gramar["B"].first, gramar["C"].first, gramar["D"].first)
    # print(gramar["D"].rules[1].first)


    return 


if __name__ == "__main__":
    main()

