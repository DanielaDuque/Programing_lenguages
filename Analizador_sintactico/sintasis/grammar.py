class Grammar:
    def __init__(self, nonterminals):
        self.rules = nonterminals
        """
            rule = dict ["not_terminal" : Not_terminal]
        """
    def is_terminal(self, char):
        return char in (self.rules.keys())
    def __str__(self):
        str = "COMPLETE GRAMMAR DEFINITION\n\n"
        for key in self.rules:
            str += self.rules[key].__str__()
        return str