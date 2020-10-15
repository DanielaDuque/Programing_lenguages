import unittest
import tests

class TestRealCode(unittest.TestCase):
  def test_code_short(self):
    case = {
      "code": """var z:num;
z := 0;
while (z < 10)
  {
  z := z + 1;
  print z;
  }
end
# salida: 1 2 3 4 5 6 7 8 9 10""",
      "result": """<var,1,1>
<id,z,1,5>
<tk_dospuntos,1,6>
<num,1,7>
<tk_puntoycoma,1,10>
<id,z,2,1>
<tk_asignacion,2,3>
<tk_num,0,2,6>
<tk_puntoycoma,2,7>
<while,3,1>
<tk_par_izq,3,7>
<id,z,3,8>
<tk_menor,3,10>
<tk_num,10,3,12>
<tk_par_der,3,14>
<tk_llave_izq,4,3>
<id,z,5,3>
<tk_asignacion,5,5>
<id,z,5,8>
<tk_mas,5,10>
<tk_num,1,5,12>
<tk_puntoycoma,5,13>
<print,6,3>
<id,z,6,9>
<tk_puntoycoma,6,10>
<tk_llave_der,7,3>
<end,8,1>"""
    }
    self.assertEqual(tests.getLexicalOutput(case["code"]), case["result"])

  def test_code_long(self):
    case = {
      "code": """## función min(x, y)
function @min:num (x:num, y:num)
  {
  when ((x < y) == true) do return x;
  return y;
  }

## función max(x, y)
function @max:num (x:num, y:num)
  {
  if ((x < y) == false) do
    {
    return x;
    }
  else
    {
    return y;
    }
  }

print @min(1,2);
print @max(1,2);
a := 10;
a %= 2;
end""",
      "result": """<function,2,1>
<fid,@min,2,10>
<tk_dospuntos,2,14>
<num,2,15>
<tk_par_izq,2,19>
<id,x,2,20>
<tk_dospuntos,2,21>
<num,2,22>
<tk_coma,2,25>
<id,y,2,27>
<tk_dospuntos,2,28>
<num,2,29>
<tk_par_der,2,32>
<tk_llave_izq,3,3>
<when,4,3>
<tk_par_izq,4,8>
<tk_par_izq,4,9>
<id,x,4,10>
<tk_menor,4,12>
<id,y,4,14>
<tk_par_der,4,15>
<tk_igualdad,4,17>
<true,4,20>
<tk_par_der,4,24>
<do,4,26>
<return,4,29>
<id,x,4,36>
<tk_puntoycoma,4,37>
<return,5,3>
<id,y,5,10>
<tk_puntoycoma,5,11>
<tk_llave_der,6,3>
<function,9,1>
<fid,@max,9,10>
<tk_dospuntos,9,14>
<num,9,15>
<tk_par_izq,9,19>
<id,x,9,20>
<tk_dospuntos,9,21>
<num,9,22>
<tk_coma,9,25>
<id,y,9,27>
<tk_dospuntos,9,28>
<num,9,29>
<tk_par_der,9,32>
<tk_llave_izq,10,3>
<if,11,3>
<tk_par_izq,11,6>
<tk_par_izq,11,7>
<id,x,11,8>
<tk_menor,11,10>
<id,y,11,12>
<tk_par_der,11,13>
<tk_igualdad,11,15>
<false,11,18>
<tk_par_der,11,23>
<do,11,25>
<tk_llave_izq,12,5>
<return,13,5>
<id,x,13,12>
<tk_puntoycoma,13,13>
<tk_llave_der,14,5>
<else,15,3>
<tk_llave_izq,16,5>
<return,17,5>
<id,y,17,12>
<tk_puntoycoma,17,13>
<tk_llave_der,18,5>
<tk_llave_der,19,3>
<print,21,1>
<fid,@min,21,7>
<tk_par_izq,21,11>
<tk_num,1,21,12>
<tk_coma,21,13>
<tk_num,2,21,14>
<tk_par_der,21,15>
<tk_puntoycoma,21,16>
<print,22,1>
<fid,@max,22,7>
<tk_par_izq,22,11>
<tk_num,1,22,12>
<tk_coma,22,13>
<tk_num,2,22,14>
<tk_par_der,22,15>
<tk_puntoycoma,22,16>
<id,a,23,1>
<tk_asignacion,23,3>
<tk_num,10,23,6>
<tk_puntoycoma,23,8>
<id,a,24,1>
<tk_mod_asig,24,3>
<tk_num,2,24,6>
<tk_puntoycoma,24,7>
<end,25,1>"""
    }
    self.assertEqual(tests.getLexicalOutput(case["code"]), case["result"])

  def test_uncode_ejemplo1(self):
    case = {
      "code": """var z:num;
z := 0;
while (z < 10)""",
      "result": """<var,1,1>
<id,z,1,5>
<tk_dospuntos,1,6>
<num,1,7>
<tk_puntoycoma,1,10>
<id,z,2,1>
<tk_asignacion,2,3>
<tk_num,0,2,6>
<tk_puntoycoma,2,7>
<while,3,1>
<tk_par_izq,3,7>
<id,z,3,8>
<tk_menor,3,10>
<tk_num,10,3,12>
<tk_par_der,3,14>"""
    }
    self.assertEqual(tests.getLexicalOutput(case["code"]), case["result"])

  def test_uncode_ejemplo2(self):
    case = {
      "code": """## función min(x, y)
function @min:num (x:num, y:num)""",
      "result": """<function,2,1>
<fid,@min,2,10>
<tk_dospuntos,2,14>
<num,2,15>
<tk_par_izq,2,19>
<id,x,2,20>
<tk_dospuntos,2,21>
<num,2,22>
<tk_coma,2,25>
<id,y,2,27>
<tk_dospuntos,2,28>
<num,2,29>
<tk_par_der,2,32>"""
    }
    self.assertEqual(tests.getLexicalOutput(case["code"]), case["result"])

if __name__ == "__main__":
  unittest.main()