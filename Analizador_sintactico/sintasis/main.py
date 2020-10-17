# -*- coding: utf-8 -*-


"""
Autores:

- Daniela Duque Garcia
- Valentina bernal buitrago
- Jhonatan Torres Forero

"""

import lexico


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

    text = sys.stdin.readlines()
    token_list = getLexicalOutput(text)
    print(token_list)
