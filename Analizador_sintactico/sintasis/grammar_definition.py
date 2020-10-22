from not_terminal import Not_terminal
import grammar
from rule import Rule
grammarDictionary = {
    'prog': 
        Not_terminal('prog', 
                     [Rule('A main_prog')]),
    'A': 
        Not_terminal('A', 
                     [Rule('fn_decl_list A'), 
                      Rule('epsilon')]),
    'main_prog': 
        Not_terminal('main_prog', 
                     [Rule('G B end')]),
    'G': 
        Not_terminal('G', 
                     [Rule('var var_decl tk_puntoycoma'), 
                      Rule('epsilon')]),
    'B': 
        Not_terminal('B', 
                     [Rule('stmt B'), 
                      Rule('epsilon')]),
    'fn_decl_list': 
        Not_terminal('fn_decl_list', 
                     [Rule('function fid tk_dospuntos C tk_par_izq D tk_par_der E F')]),
    'C': 
        Not_terminal('C', 
                     [Rule('num'), 
                      Rule('bool')]),
    'D': 
        Not_terminal('D', 
                     [Rule('var_decl'), 
                      Rule('epsilon')]),
    'E': 
        Not_terminal('E', 
                     [Rule('var var_decl tk_puntoycoma'), 
                      Rule('epsilon')]),
    'F': 
        Not_terminal('F', 
                     [Rule('stmt_block')]),
    'stmt_block': 
        Not_terminal('stmt_block', 
                     [Rule('tk_llave_izq stmt H tk_llave_der'), 
                      Rule('stmt')]),
    'H': 
        Not_terminal('H', 
                     [Rule('stmt H'), 
                      Rule('epsilon')]),
    'var_decl': 
        Not_terminal('var_decl', 
                     [Rule('id tk_dospuntos C I')]),
    'I': 
        Not_terminal('I', 
                     [Rule('tk_coma id tk_dospuntos C I'), 
                      Rule('epsilon')]),
    'stmt': 
        Not_terminal('stmt', 
                     [Rule('print lexpr tk_puntoycoma'),
                      Rule('input id tk_puntoycoma'), 
                      Rule('when tk_par_izq lexpr tk_par_der do stmt_block'), 
                      Rule('if tk_par_izq lexpr tk_par_der do stmt_block TK_else stmt_block'),
                      Rule('unless tk_par_izq lexpr tk_par_der do stmt_block'),
                      Rule('while tk_par_izq lexpr tk_par_der do stmt_block'),
                      Rule('return lexpr tk_puntoycoma'), 
                      Rule('until tk_par_izq lexpr tk_par_der do stmt_block'), 
                      Rule('loop stmt_block'), 
                      Rule('do stmt_block L'), 
                      Rule('repeat tk_num tk_dospuntos stmt_block'),
                      Rule('for tk_par_izq lexpr tk_puntoycoma lexpr tk_puntoycoma lexpr tk_par_der do stmt_block'), 
                      Rule('next tk_puntoycoma'), 
                      Rule('break tk_puntoycoma'), 
                      Rule('tk_decremento id tk_puntoycoma'), 
                      Rule('tk_incremento id tk_puntoycoma'), 
                      Rule('id K tk_puntoycoma')]),
    'K':
        Not_terminal('K',
                      [Rule('tk_asignacion lexp'),
                       Rule('tk_sum_asig lexpr'),
                       Rule('tk_res_asig lexpr'),
                       Rule('tk_mul_asig lexpr'),
                       Rule('tk_div_asig lexpr'),
                       Rule('tk_mod_asig lexpr'),
                       Rule('tk_incremento'),
                       Rule('tk_decremento')]),
    'L': 
        Not_terminal('L', 
                      [Rule('while tk_par_izq lexpr tk_par_der'), 
                       Rule('until tk_par_izq lexpr tk_par_der')]),
    'nexpr': 
        Not_terminal('nexpr',
                     [Rule('not tk_par_izq lexpr tk_par_der'), 
                      Rule('rexpr')]),
    'lexpr': 
        Not_terminal('lexpr', 
                     [Rule('nexpr M')]),
    'M':
        Not_terminal('M', 
                     [Rule('N'),
                      Rule('O'),
                      Rule('epsilon')]),
    'N': 
        Not_terminal('N', 
                     [Rule('and nexpr N'),
                      Rule('epsilon')]),
    'O': 
        Not_terminal('O', 
                     [Rule('or nexpr O'),
                      Rule('epsilon')]),
    'rexpr': 
        Not_terminal('rexpr', 
                     [Rule('simple_expr P')]),
    'P': 
        Not_terminal('P', 
                     [Rule('Q simple_expr'),
                      Rule('epsilon')]),
    'Q': 
        Not_terminal('Q', 
                     [Rule('tk_menor'),
                      Rule('tk_igualdad'),
                      Rule('tk_menor_igual'),
                      Rule('tk_mayor'),
                      Rule('tk_mayor_igual'),
                      Rule('tk_diferente')]),
    'simple_expr': 
        Not_terminal('simple_expr', 
                     [Rule('term R')]),
    'R': 
        Not_terminal('R', 
                     [Rule('tk_mas term R'),
                      Rule('tk_menos term R'),
                      Rule('epsilon')]),
    'term': 
        Not_terminal('term', 
                     [Rule('factor S')]),
    'S': 
        Not_terminal('S', 
                     [Rule('T factor S'),
                      Rule('epsilon')]),
    'T': 
        Not_terminal('T', 
                     [Rule('tk_mul'),
                      Rule('tk_div'),
                      Rule('tk_mod')]),
    'factor': 
        Not_terminal('factor', 
                     [Rule('tk_num'),
                      Rule('true'),
                      Rule('false'),
                      Rule('id U'),
                      Rule('tk_incremento id'),
                      Rule('tk_decremento id'),
                      Rule('tk_par_izq lexpr tk_par_der'),
                      Rule('fid tk_par_izq V tk_par_der')]),
    'U': 
        Not_terminal('U', 
                     [Rule('tk_incremento'),
                      Rule('tk_decremento'),
                      Rule('epsilon')]),
    'V': 
        Not_terminal('V', 
                     [Rule('lexpr W'),
                      Rule('epsilon')]),
    'W': 
        Not_terminal('W', 
                     [Rule('tk_coma lexpr W'),
                      Rule('epsilon')]),
}
# grammar = Grammar(grammarDictionary)
# print(grammar)