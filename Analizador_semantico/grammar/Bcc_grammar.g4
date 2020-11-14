grammar Bcc_grammar;

prog:
    fn_decl_list* main_prog;

main_prog :
    ( Var var_decl_pc Tk_puntoycoma | ) stmt* End;  // Check

fn_decl_list: // check, creo
    Function FID Tk_dospuntos Tk_type Tk_par_izq ( var_decl | )  Tk_par_der ( Var var_decl_pc Tk_puntoycoma | ) stmt_block ;

var_decl: ID Tk_dospuntos Tk_type (Tk_coma ID Tk_dospuntos Tk_type)*; // Check separado por comas

var_decl_pc: ID Tk_dospuntos Tk_type (Tk_coma ID Tk_dospuntos Tk_type)*; // Check separado por punto y coma

stmt_block:
    Tk_llave_izq stmt+ Tk_llave_der // Check
    | stmt; // Check


stmt: Print lexpr Tk_puntoycoma // Check
	| Input ID Tk_puntoycoma // Check
	| When Tk_par_izq lexpr Tk_par_der Do stmt_block
	| If Tk_par_izq lexpr Tk_par_der Do stmt_block Else stmt_block // Check
	| While Tk_par_izq lexpr Tk_par_der Do stmt_block // Check
    | Return lexpr Tk_puntoycoma // Check
	| Unless Tk_par_izq lexpr Tk_par_der Do stmt_block
	| Until Tk_par_izq lexpr Tk_par_der Do stmt_block // check
	| Loop stmt_block // check
	| Do stmt_block While Tk_par_izq lexpr Tk_par_der // Check
	| Do stmt_block Until Tk_par_izq lexpr Tk_par_der // Check
	| Repeat Tk_num Tk_dospuntos stmt_block // check
    | For Tk_par_izq lexpr Tk_puntoycoma lexpr Tk_puntoycoma lexpr Tk_par_der Do stmt_block
    | Next Tk_puntoycoma // Check
    | Break Tk_puntoycoma // Check
    | ID Tk_asignacion lexpr Tk_puntoycoma // Check
    | ID Tk_sum_asig lexpr Tk_puntoycoma // Check en teoria
    | ID Tk_res_asig lexpr Tk_puntoycoma // Check en teoria
    | ID Tk_mul_asig lexpr Tk_puntoycoma // Check en teoria
    | ID Tk_div_asig lexpr Tk_puntoycoma // Check en teoria
    | ID Tk_mod_asig lexpr Tk_puntoycoma // Check en teoria
    | ID Tk_incremento Tk_puntoycoma // Check
    | ID Tk_decremento Tk_puntoycoma // Check
    | Tk_decremento ID Tk_puntoycoma // Check
    | Tk_incremento ID Tk_puntoycoma; // Check

lexpr: nexpr ((And nexpr)* | (Or nexpr)* | ); // Check en teoria

nexpr: Not Tk_par_izq lexpr Tk_par_der // Check en teoria
	| rexpr;

rexpr: simple_expr ( (Tk_menor|Tk_igualdad|Tk_menor_igual|Tk_mayor|Tk_mayor_igual|Tk_diferente) simple_expr | ); // Check en teoria

simple_expr: term ((Tk_mas|Tk_menos) term)*; // Check en teoria

term: factor ( (Tk_mul|Tk_div|Tk_mod) factor)*; // Check en teoria


factor:
    Tk_num // Check
    | Tk_bool // Check
    | ID ( Tk_incremento | Tk_decremento ) // Check
    | ( Tk_incremento | Tk_decremento ) ID // Check
    | ID // Check
    | Tk_par_izq lexpr Tk_par_der // Check
    | FID Tk_par_izq (lexpr (Tk_coma lexpr)* | )  Tk_par_der ; // Check


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
Tk_num : [0-9]+ ( | [.] [0-9]+  );
ID : [a-zA-Z]([a-zA-Z0-9_] )* ;
FID: [@][a-zA-Z]([a-zA-Z0-9_] )* ;


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
Tk_dospuntos : ':';  // No lo traduje por que depende dee la regla see usa diferente
Tk_asignacion : ':=';
Tk_puntoycoma : ';'; // No lo traduje por que depende dee la regla see usa diferente
Tk_menor : '<';
Tk_menor_igual : '<=';
Tk_igualdad : '==';
Tk_mayor : '>';
Tk_mayor_igual : '>=';
Tk_llave_izq : '{';
Tk_llave_der : '}';





ESP : [ \t\r\n]+ -> skip ;
Directive: '#' ~ [\n]* -> channel (HIDDEN);