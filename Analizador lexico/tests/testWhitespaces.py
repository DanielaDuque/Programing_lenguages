import unittest
import tests

class TestWhitespaces(unittest.TestCase):
  def test_tab(self):
    case = {
      "code": """	4""",
      "result": """<tk_num,4,1,5>"""
    }
    self.assertEqual(tests.getLexicalOutput(case["code"]), case["result"])

  def test_newline(self):
    case = {
      "code": """\n\n\n\n4""",
      "result": """<tk_num,4,5,1>"""
    }
    self.assertEqual(tests.getLexicalOutput(case["code"]), case["result"])
  
  def test_spaces(self):
    case = {
      "code": """    4""",
      "result": """<tk_num,4,1,5>"""
    }
    self.assertEqual(tests.getLexicalOutput(case["code"]), case["result"])

if __name__ == "__main__":
  unittest.main()