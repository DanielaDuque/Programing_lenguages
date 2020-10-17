

class Rule ():
    def __init__ (self, rigth_part, predition_st = []):
        self.rigth_part = rigth_part # Array de string
        self.predition_st = predition_st

    def prediction_set(self,predition_st):
        self.predition_st = predition_st
    
    def is_terminal(self,char):
        terminal_set = []
        return char in (terminal_set)

    def __str__(self):
        return  ",".join(self.rigth_part)


