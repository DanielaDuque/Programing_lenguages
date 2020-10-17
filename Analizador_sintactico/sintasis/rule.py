

class rule ():
    def __init__ (self, not_terminal, rigth_part, predition_st = None):
        self.not_terminal = not_terminal
        self.rigth_part = rigth_part
        self.predition_st = predition_st

    def prediction_set(self,predition_st):
        self.predition_st = predition_st
    
    def is_terminal(self,char):
        terminal_set = []
        return char in (terminal_set)

    def __str__(self):
        return self.not_terminal + "->" + ",".join(self.rigth_part)


