# -*- coding: utf-8 -*-


"""
Autores:

- Daniela Duque Garcia
- Valentina bernal buitrago
- Jhonatan Torres Forero

"""

import lexico
import rule
from grammar import Grammar
import not_terminal
from first import first, first_string
from next import next
from grammar_definition import grammarDictionary
import pickle

def getLexicalOutput(code):
    idx_line = 1
    tokens = []
    for line in text:
        line = line.replace("\t", " " * 4)
        line = line.replace("\n", "")
        line_result = lexico.iterate_line(line, idx_line)
        tokens_line = line_result["words"]
        tokens.extend(tokens_line)
        if (line_result["status"] == 1):
            break
        idx_line += 1

    return tokens



## Por lineas
if __name__ == "__main__":
    import sys

    # text = sys.stdin.readlin
    # put(text)
    # print(token_list)

    file = open("predition_set.obj", 'rb')

    dic = pickle.load(file)
    # for key, value in dic.items():
    #     for v in value.rules:
    #         print(key, " ", v.prediction_set)

    final_grammar = Grammar(dic)
    print(final_grammar)
    # print(dic)
