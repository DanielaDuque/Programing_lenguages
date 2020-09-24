import unittest
import tests

class TestCharacters(unittest.TestCase):
  def test_sum(self):
    case = {
      "code": """+++\n""",
      "result": """<tk_incremento,1,1>
<tk_mas,1,3>"""
    }
    self.assertEqual(tests.getLexicalOutput(case["code"]), case["result"])

  def test_sum_2(self):
    case = {
      "code": """+= ++ + +++ ++++ +=++\n""",
      "result": """<tk_sum_asig,1,1>
<tk_incremento,1,4>
<tk_mas,1,7>
<tk_incremento,1,9>
<tk_mas,1,11>
<tk_incremento,1,13>
<tk_incremento,1,15>
<tk_sum_asig,1,18>
<tk_incremento,1,20>"""
    }
    self.assertEqual(tests.getLexicalOutput(case["code"]), case["result"])

  def test_minus(self):
    case = {
      "code": """-= -- - --- ---- -=--\n""",
      "result": """<tk_res_asig,1,1>
<tk_decremento,1,4>
<tk_menos,1,7>
<tk_decremento,1,9>
<tk_menos,1,11>
<tk_decremento,1,13>
<tk_decremento,1,15>
<tk_res_asig,1,18>
<tk_decremento,1,20>"""
    }
    self.assertEqual(tests.getLexicalOutput(case["code"]), case["result"])
    
  def test_general_characters(self):
    case = {
      "code": """{}();,:<>+-*/%.\n""",
      "result": """<tk_llave_izq,1,1>
<tk_llave_der,1,2>
<tk_par_izq,1,3>
<tk_par_der,1,4>
<tk_puntoycoma,1,5>
<tk_coma,1,6>
<tk_dospuntos,1,7>
<tk_menor,1,8>
<tk_mayor,1,9>
<tk_mas,1,10>
<tk_menos,1,11>
<tk_mul,1,12>
<tk_div,1,13>
<tk_mod,1,14>
>>> Error léxico(línea:1,posición:15)"""
    }
    self.assertEqual(tests.getLexicalOutput(case["code"]), case["result"])

if __name__ == "__main__":
  unittest.main()