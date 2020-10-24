import rule
import grammar
import not_terminal
from first import first, first_string
from next import next
from grammar_definition import grammarDictionary
import pickle

def prediction_set(grammar):  # funcion recursiva para obtener los no terminales

    gram = grammar.rules.copy()
    for r, right_part in gram.items():  # regla, y not_terminal
        for rule in right_part.rules: # iteracion sobre not_terminal de
            aux_var = first_string(grammar, rule.right_part)
            if "epsilon" in aux_var:
                rule.prediction_set = aux_var + gram.get(r).next
                rule.prediction_set.remove("epsilon")
            else:
                rule.prediction_set = aux_var
            rule.prediction_set.sort()


    filehandler = open(b"predition_set.obj", "wb")
    pickle.dump(gram, filehandler)




    return gram
                

def main():

    # var z := int(papito) +
    # gram1 = {"A": not_terminal.Not_terminal("A", [rule.Rule("B C"), rule.Rule("bad")]),
    #          "B": not_terminal.Not_terminal("B", [rule.Rule("big C boss"), rule.Rule("epsilon")]),
    #          "C": not_terminal.Not_terminal("C", [rule.Rule("cat"), rule.Rule("cow")])}

    gram1 = {"S": not_terminal.Not_terminal("S", [rule.Rule("A uno B C"), rule.Rule("S dos")]),
             "A": not_terminal.Not_terminal("A", [rule.Rule("B C D"), rule.Rule("A tres"), rule.Rule("epsilon")]),
             "B": not_terminal.Not_terminal("B", [rule.Rule("D cuatro C tres"), rule.Rule("epsilon")]),
             "C": not_terminal.Not_terminal("C", [rule.Rule("cinco D B"), rule.Rule("epsilon")]),
             "D": not_terminal.Not_terminal("D", [rule.Rule("seis"), rule.Rule("epsilon")])}

    # gram1 = {"S": not_terminal.Not_terminal("S", [rule.Rule("A B C"), rule.Rule("D E")]),
    #          "A": not_terminal.Not_terminal("A", [rule.Rule("dos B tres"), rule.Rule("epsilon")]),
    #          "B": not_terminal.Not_terminal("B", [rule.Rule("cuatro C cinco B"), rule.Rule("epsilon")]),
    #          "C": not_terminal.Not_terminal("C", [rule.Rule("seis A B")]),
    #          "D": not_terminal.Not_terminal("D", [rule.Rule("uno A E"), rule.Rule("B")]),
    #          "E": not_terminal.Not_terminal("E", [rule.Rule("tres")])}



    grammar_1 = grammar.Grammar(grammarDictionary)
    
    grammar_1.rules = first(grammar_1).copy()

    grammar_1.rules = next (grammar_1).copy()
    gramm= prediction_set(grammar_1).copy()

    # print(gramm["main_prog"].first)

    # for r, right_part in gramm.items():  # regla, y not_terminal
    #     for ru in right_part.rules: # iteracion sobre not_terminal de
    #         print("<<<<<<<<<>>>")
    #         print (r, " -> ", ru.right_part, " : ",ru.prediction_set)



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

