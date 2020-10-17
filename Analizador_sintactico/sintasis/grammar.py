
class Grammar ():
    def __init__ (self, rules):
        self.rules = rules
        """
            rule = dict ["not_terminal" : Not_terminal]
        """
    def is_terminal(self,char):
        return char in (rules.keys())


