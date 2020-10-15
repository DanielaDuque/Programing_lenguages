import unittest
import tests

class TestIdentifiers(unittest.TestCase):
  def test_identifiers1(self):
    case = {
      "code": """var i a1A1b2B2c1C9090""",
      "result": """<var,1,1>
<id,i,1,5>
<id,a1A1b2B2c1C9090,1,7>"""
    }
    self.assertEqual(tests.getLexicalOutput(case["code"]), case["result"])

  def test_identifiers2(self):
    case = {
      "code": """while1234 1a 1.23a 1.a""",
      "result": """<id,while1234,1,1>
<tk_num,1,1,11>
<id,a,1,12>
<tk_num,1.23,1,14>
<id,a,1,18>
<tk_num,1,1,20>
>>> Error léxico(línea:1,posición:21)"""
    }
    self.assertEqual(tests.getLexicalOutput(case["code"]), case["result"])

  def test_functions1(self):
    case = {
      "code": """@max@min""",
      "result": """<fid,@max,1,1>
<fid,@min,1,5>"""
    }
    self.assertEqual(tests.getLexicalOutput(case["code"]), case["result"])
  
  def test_functions2(self):
    case = {
      "code": """@1""",
      "result": """>>> Error léxico(línea:1,posición:1)"""
    }
    self.assertEqual(tests.getLexicalOutput(case["code"]), case["result"])

  def test_functions3(self):
    case = {
      "code": """@@""",
      "result": """>>> Error léxico(línea:1,posición:1)"""
    }
    self.assertEqual(tests.getLexicalOutput(case["code"]), case["result"])

if __name__ == "__main__":
  unittest.main()