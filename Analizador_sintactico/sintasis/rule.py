class Rule:
    def __init__ (self, right_part):
        self.right_part = right_part.split()# Array de string
        self.first = []
        self.prediction_set = []

    def set_prediction_set(self, prediction_set):
        self.prediction_set = prediction_set

    def put_first(self, terminal):
        if type(terminal) == list:
            self.first += terminal
        else:
            self.first.append(terminal)

        self.first = list(set(self.first))

    def put_prediction_set(self, terminal):
        self.prediction_set.append(terminal)
    
    def __str__(self):
        return " ".join(self.right_part) + " : {" + ", ".join(self.prediction_set) + "}"