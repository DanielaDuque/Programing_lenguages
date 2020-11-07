grammar Bcc_grammar;

prog:
    fn_decl_list* main_prog;

main_prog :
    ( Var var_decl Tk_puntoycoma | ) stmt* End;

fn_decl_list:
    Function FID Tk_dospuntos Tk_type Tk_par_izq ( var_decl | )  Tk_par_der ( Var var_decl Tk_puntoycoma | ) stmt_block ;

var_decl: ID Tk_dospuntos Tk_type (Tk_coma ID Tk_dospuntos Tk_type)*;

stmt_block:
    Tk_llave_izq stmt+ Tk_llave_der
    | stmt;


stmt: Print lexpr Tk_puntoycoma
	| Input ID Tk_puntoycoma
	| When Tk_par_izq lexpr Tk_par_der Do stmt_block
	| If Tk_par_izq lexpr Tk_par_der Do stmt_block Else stmt_block
	| While Tk_par_izq lexpr Tk_par_der Do stmt_block
    | Return lexpr Tk_puntoycoma
	| Unless Tk_par_izq lexpr Tk_par_der Do stmt_block
	| Until Tk_par_izq lexpr Tk_par_der Do stmt_block
	| Loop stmt_block
	| Do stmt_block While Tk_par_izq lexpr Tk_par_der
	| Do stmt_block Until Tk_par_izq lexpr Tk_par_der
	| Repeat Tk_num Tk_dospuntos stmt_block
    | For Tk_par_izq lexpr Tk_puntoycoma lexpr Tk_puntoycoma lexpr Tk_par_der Do stmt_block
    | Next Tk_puntoycoma
    | Break Tk_puntoycoma
    | ID Tk_asignacion lexpr Tk_puntoycoma
    | ID Tk_sum_asig lexpr Tk_puntoycoma
    | ID Tk_res_asig lexpr Tk_puntoycoma
    | ID Tk_mul_asig lexpr Tk_puntoycoma
    | ID Tk_div_asig lexpr Tk_puntoycoma
    | ID Tk_mod_asig lexpr Tk_puntoycoma
    | ID Tk_incremento Tk_puntoycoma
    | ID Tk_decremento Tk_puntoycoma
    | Tk_decremento ID Tk_puntoycoma
    | Tk_incremento ID Tk_puntoycoma;

lexpr: nexpr ((And nexpr)* | (Or nexpr)* | );

nexpr: Not Tk_par_izq lexpr Tk_par_der
	| rexpr;

rexpr: simple_expr ( (Tk_menor|Tk_igualdad|Tk_menor_igual|Tk_mayor|Tk_mayor_igual|Tk_diferente) simple_expr | );

simple_expr: term ((Tk_mas|Tk_menos) term)*;

term: factor ( (Tk_mul|Tk_div|Tk_mod) factor)*;


factor:
    Tk_num
    | Tk_bool
    | ID ( Tk_incremento | Tk_decremento )
    | ( Tk_incremento | Tk_decremento ) ID
    | ID
    | Tk_par_izq lexpr Tk_par_der
    | FID Tk_par_izq (lexpr (Tk_coma lexpr)* | )  Tk_par_der ;


/**
 ------------- Palabras reservadas ---------------
*/



End : 'end';
Print : 'print';
Input : 'input';
When : 'when';
If : 'if';
Unless :'unless';
While : 'while';
Return : 'return';
Until : 'until';
Loop : 'loop';
Do : 'do';
Else : 'else';
Repeat : 'repeat';
For : 'for';
Next : 'next';
Break : 'break';
Not : 'not';
And : 'and';
Or : 'or';
Var : 'var';
Function : 'function';




/**
 ------------- Tokens ---------------
*/

Tk_type : 'bool'| 'num';
Tk_bool : 'true' | 'false';
Tk_num : [1-9]+ ( | [.] [1-9]+  );
ID : [a-zA-Z]([a-zA-Z1-9_] )* ;
FID: [@][a-zA-Z]([a-zA-Z1-9_] )* ;


Tk_diferente : '!=';
Tk_mod : '%';
Tk_mod_asig : '%=';
Tk_par_izq : '(';
Tk_par_der : ')';
Tk_mul : '*';
Tk_mul_asig : '*=';
Tk_mas : '+';
Tk_incremento : '++';
Tk_sum_asig : '+=';
Tk_coma : ',';
Tk_menos : '-';
Tk_decremento : '--';
Tk_res_asig : '-=';
Tk_div : '/';
Tk_div_asig : '/=';
Tk_dospuntos : ':';
Tk_asignacion : ':=';
Tk_puntoycoma : ';';
Tk_menor : '<';
Tk_menor_igual : '<=';
Tk_igualdad : '==';
Tk_mayor : '>';
Tk_mayor_igual : '>=';
Tk_llave_izq : '{';
Tk_llave_der : '}';





ESP : [ \t\r\n]+ -> skip ;
Directive: '#' ~ [\n]* -> channel (HIDDEN);