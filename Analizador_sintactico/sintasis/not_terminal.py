
class Not_terminal():
    def __init__(self, not_terminal, rules):
        self.not_terminal = not_terminal
        self.rules = rules
        self.first = []
        self.next = []

    def put_first(self, terminal):
        if type(terminal) == list:
            self.first += terminal
        else:
            self.first.append(terminal)

        self.first = list(set(self.first))

    def put_next(self, terminal):
        if type(terminal) == list:
            self.next += terminal
        else:
            self.next.append(terminal)

        self.next = list(set(self.next))