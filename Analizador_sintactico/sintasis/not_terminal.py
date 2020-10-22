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
        # self.next.append(terminal)
        if type(terminal) == list:
            self.next += terminal
        else:
            # print("entra")
            self.next.append(terminal)
        # print(type(self.next), self.next)
        self.next = list(set(self.next))
        
    def __str__(self):
        str = ""
        if len(self.not_terminal) > 1:
            str += self.not_terminal.upper() + ":\n"
        str += ("  ● " + self.not_terminal + " -> ") + ("  ● " + self.not_terminal + " -> ").join(map(lambda x: x.__str__() + "\n", self.rules))
        return str
        
