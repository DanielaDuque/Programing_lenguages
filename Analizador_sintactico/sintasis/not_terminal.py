
class Not_terminal():
    def __init__(self, not_terminal, rules):
        self.not_terminal = not_terminal
        self.rules = rules
        self.frist = []
        self.next = []

    def put_first(self, terminal):
        self.frist.append(terminal)

    def put_next(self, terminal):
        self.next.append(terminal)