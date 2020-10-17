

class Rule ():
    def __init__ (self, right_part, prediction_set=[]):
        self.right_part = rigth_part # Array de string
        self.prediction_set = prediction_set

    def set_prediction_set(self, prediction_set):
        self.prediction_set = prediction_set

    def put_prediction_set(self, terminal):
        self.prediction_set.append(terminal)
    
    def __str__(self):
        return ",".join(self.right_part)


