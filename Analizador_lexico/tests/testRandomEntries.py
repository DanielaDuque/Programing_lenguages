import unittest
import tests

class testRandomEntries(unittest.TestCase):
  def test_jaime(self):
    case = {
      "code": """a 1.0je==+=#jeje
!===
<=<#ASDASD

>=> >+

==
/=////
*=***
*=*
%=	%
---=-
+++=+

;(),{};#,{{
,

;(),{};,{{

:= ::= :

@a
0.0001

123.31123a123

unLESs
UNLESS
UNTIL
LOOP
REPEAT
NEXT
BREAK
END
NOT
AND
OR
var
print
while
end
function
when
true
do
return
if
false
else
for
num
bool
unless
until
loop
repeat
next
break
end
not
and
or



(),{} ++ += + -- -= - %= %


1000
bool true
    a

-an1123

100.1
kasd123
12jasdasd

:=

100.0

100 kekeke jeje 123asdas
#soya asdasd asds
100h""",
      "result": """<id,a,1,1>
<tk_num,1.0,1,3>
<id,je,1,6>
<tk_igualdad,1,8>
<tk_sum_asig,1,10>
<tk_diferente,2,1>
<tk_igualdad,2,3>
<tk_menor_igual,3,1>
<tk_menor,3,3>
<tk_mayor_igual,5,1>
<tk_mayor,5,3>
<tk_mayor,5,5>
<tk_mas,5,6>
<tk_igualdad,7,1>
<tk_div_asig,8,1>
<tk_div,8,3>
<tk_div,8,4>
<tk_div,8,5>
<tk_div,8,6>
<tk_mul_asig,9,1>
<tk_mul,9,3>
<tk_mul,9,4>
<tk_mul,9,5>
<tk_mul_asig,10,1>
<tk_mul,10,3>
<tk_mod_asig,11,1>
<tk_mod,11,7>
<tk_decremento,12,1>
<tk_res_asig,12,3>
<tk_menos,12,5>
<tk_incremento,13,1>
<tk_sum_asig,13,3>
<tk_mas,13,5>
<tk_puntoycoma,15,1>
<tk_par_izq,15,2>
<tk_par_der,15,3>
<tk_coma,15,4>
<tk_llave_izq,15,5>
<tk_llave_der,15,6>
<tk_puntoycoma,15,7>
<tk_coma,16,1>
<tk_puntoycoma,18,1>
<tk_par_izq,18,2>
<tk_par_der,18,3>
<tk_coma,18,4>
<tk_llave_izq,18,5>
<tk_llave_der,18,6>
<tk_puntoycoma,18,7>
<tk_coma,18,8>
<tk_llave_izq,18,9>
<tk_llave_izq,18,10>
<tk_asignacion,20,1>
<tk_dospuntos,20,4>
<tk_asignacion,20,5>
<tk_dospuntos,20,8>
<fid,@a,22,1>
<tk_num,0.0001,23,1>
<tk_num,123.31123,25,1>
<id,a123,25,10>
<id,unLESs,27,1>
<id,UNLESS,28,1>
<id,UNTIL,29,1>
<id,LOOP,30,1>
<id,REPEAT,31,1>
<id,NEXT,32,1>
<id,BREAK,33,1>
<id,END,34,1>
<id,NOT,35,1>
<id,AND,36,1>
<id,OR,37,1>
<var,38,1>
<print,39,1>
<while,40,1>
<end,41,1>
<function,42,1>
<when,43,1>
<true,44,1>
<do,45,1>
<return,46,1>
<if,47,1>
<false,48,1>
<else,49,1>
<for,50,1>
<num,51,1>
<bool,52,1>
<unless,53,1>
<until,54,1>
<loop,55,1>
<repeat,56,1>
<next,57,1>
<break,58,1>
<end,59,1>
<not,60,1>
<and,61,1>
<or,62,1>
<tk_par_izq,66,1>
<tk_par_der,66,2>
<tk_coma,66,3>
<tk_llave_izq,66,4>
<tk_llave_der,66,5>
<tk_incremento,66,7>
<tk_sum_asig,66,10>
<tk_mas,66,13>
<tk_decremento,66,15>
<tk_res_asig,66,18>
<tk_menos,66,21>
<tk_mod_asig,66,23>
<tk_mod,66,26>
<tk_num,1000,69,1>
<bool,70,1>
<true,70,6>
<id,a,71,5>
<tk_menos,73,1>
<id,an1123,73,2>
<tk_num,100.1,75,1>
<id,kasd123,76,1>
<tk_num,12,77,1>
<id,jasdasd,77,3>
<tk_asignacion,79,1>
<tk_num,100.0,81,1>
<tk_num,100,83,1>
<id,kekeke,83,5>
<id,jeje,83,12>
<tk_num,123,83,17>
<id,asdas,83,20>
<tk_num,100,85,1>
<id,h,85,4>"""
    }
    self.assertEqual(tests.getLexicalOutput(case["code"]), case["result"])


if __name__ == "__main__":
  unittest.main()