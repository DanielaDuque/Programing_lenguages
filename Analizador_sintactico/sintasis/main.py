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




class Lexical:
    def __init__(self, tokens=[]):
        self.data = tokens
        self.current = 0

    def get_current_token(self):
        if(self.current >= len(self.data)):
            return None
        return self.data[self.current]

    def get_next_token(self):
        token = self.get_current_token()
        self.current += 1
        return token

    def get_previus_token(self):   
        return self.data[self.current - 1]


class SyntacticError(Exception):
    symbolToErrorMessage = {
        'tk_diferente': '!=',
        'tk_mod': '%',
        'tk_mod_asig': '%=',
        'tk_par_izq': '(',
        'tk_par_der': ')',
        'tk_mul': '*',
        'tk_mul_asig': '*=',
        'tk_mas': '+',
        'tk_incremento': '++',
        'tk_sum_asig': '+=',
        'tk_coma': ',',
        'tk_menos': '-',
        'tk_decremento': '--',
        'tk_res_asig': '-=',
        'tk_div': '/',
        'tk_div_asig': '/=',
        'tk_dospuntos': ':',
        'tk_asignacion': ':=',
        'tk_puntoycoma': ';',
        'tk_menor': '<',
        'tk_menor_igual': '<=',
        'tk_igualdad': '==',
        'tk_mayor': '>',
        'tk_mayor_igual': '>=',
        'bool': 'bool',
        'end': 'end',
        'false': 'false',
        'id': 'identificador',
        'fid': 'identificador de funcion',
        'tk_num': 'numero',
        'true': 'true',
        'tk_llave_izq': '{',
        'tk_llave_der': '}'
    }



    def __init__(self, lexem, predictions, row=1, col=1):
        if type(predictions) is str:
          predictions = [predictions]
        # print(pre_sorted[1], " ", type(pre_sorted))
        # if len (pre_sorted)
        expected = sorted(map(self.convertSymbol, predictions))
        # print(expected)
        for i, v in enumerate(expected):
            if i == len(expected)-1:
                break
            if v in expected[i+1]:
                expected[i] = expected[i+1]
                expected[i+1] = v
        
        expected = str(expected)[1:-1]
        
        self.message = "<{}:{}> Error sintactico: se encontro: '{}'; se esperaba: {}.".format(
            row, col, self.convertSymbol(lexem), expected)
        super().__init__(self.message)

    def convertSymbol(self, symbol):
        if symbol in self.symbolToErrorMessage.keys():
            return self.symbolToErrorMessage[symbol]
        else:
            return symbol

    def __str__(self):
        return self.message


def match(expectedSymbol, lexical):
    token = lexical.get_next_token()
    # print(token.t_type)
    # print(expectedSymbol)
    
    if token.t_type != expectedSymbol:
        raise SyntacticError(token.t_type, expectedSymbol,token.row,token.column)


def asd(nonterminal, final_grammar, lexical):
    firstSymbol = lexical.get_current_token()

    if firstSymbol == None:
        # print("----> syntactic error")
        token = lexical.get_previus_token()
        raise Exception("<{}:{}> Error sintactico: se encontro final de archivo; se esperaba 'end'.".format(len_file, len_lastile ))

    rules = final_grammar.rules[nonterminal].rules
    # print(nonterminal, " ",firstSymbol.t_type)
    selectedRule = list(
        filter(lambda rule: firstSymbol.t_type in rule.prediction_set, rules))
    # if len(selectedRule) > 1:
    #     # print("----> grammar error")
    #     raise Exception("Error Gramatica")
    if len(selectedRule) == 0:
        predictions = {
            symbol for rule in rules for symbol in rule.prediction_set}
        # print("entre ", selectedRule)              
        raise SyntacticError(firstSymbol.t_type, predictions,
                             firstSymbol.row, firstSymbol.column)

    right_part = selectedRule[0].right_part
    if right_part == ['epsilon']:
        right_part = []
    for symbol in right_part:
        # print(symbol)
        if final_grammar.is_terminal(symbol):
            asd(symbol, final_grammar, lexical)
        else:
            
            match(symbol, lexical)


def getLexicalOutput(code):
    idx_line = 1
    tokens = []
    hasError = False
    for line in code:
        line = line.replace("\t", " " * 4)
        line = line.replace("\n", "")
        line = line.replace("\r", "")
        line_result = lexico.iterate_line(line, idx_line)
        tokens_line = line_result["words"]
        tokens.extend(tokens_line)
        if (line_result["status"] == 1):
            hasError = True
            break
        idx_line += 1

    # if len(tokens) > 0:
    #     print("\n".join([str(x) for x in tokens]))
    if(hasError):
        return None
    global len_file 
    len_file = len(code) + 1
    global len_lastile 
    len_lastile = len(code[-1]) -1
    # globals().update({len_file: len(code)} )
    # globals().update({len_lastile: len(code[-1])} )
    # len_lastile =
    return (tokens)


def main():
    import sys
    text = sys.stdin.readlines()
    lexical_array= getLexicalOutput(text)

    # print(len_file, " ",len_lastile)
    if(lexical_array == None):
        return
    lexical = Lexical(lexical_array)
    file = open("predition_set.obj", 'rb')
    dic = pickle.load(file)
    final_grammar = Grammar(dic)
    # print(final_grammar)
    try:
        asd('prog', final_grammar, lexical)
        print("El analisis sintactico ha finalizado correctamente.")
    except Exception as e:
        print(str(e))

# Por lineas
if __name__ == "__main__":
    main()
