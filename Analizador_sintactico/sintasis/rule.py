

class Rule ():
    def __init__ (self, rigth_part, prediction_set = []):
        self.rigth_part = rigth_part # Array de string
        self.prediction_set = prediction_set

    def set_prediction_set(self,predition_st):
        self.predition_st = predition_st

    def put_prediction_set (self, terminal):
        self.prediction_set.append(terminal)
    
    def __str__(self):
        return  ",".join(self.rigth_part)


