
def first (grammar, no_terminal):

    for rule in grammar:
        for character in rule.rigth_part:

            if character == "epsilon":
                return "epsilon"
            
            if rule.is_terminal(character): # Si es terminal
                return character
            
            else :
                first ()
                    