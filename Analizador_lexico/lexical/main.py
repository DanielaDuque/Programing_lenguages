# -*- coding: utf-8 -*-


"""
Autores:

- Daniela Duque Garcia
- Valentina bernal buitrago
- Jhonatan Torres Forero

"""
import sys

class Token ():
	def __init__(self, t_type, row, column, lexem=None):
		self.t_type = t_type
		self.row = row
		self.column = column
		self.lexem = lexem  


	def __str__(self):
		if self.t_type=="ERROR":
			return ">>> Error léxico(línea:{},posición:{})".format(self.row, self.column)
		if self.lexem==None:
			return "<{},{},{}>".format(self.t_type, self.row, self.column)
		else:
			return "<{},{},{},{}>".format(self.t_type, self.lexem, self.row, self.column)



characters =  {
    ">" : "tk_mayor", 
    ">=" : "tk_mayor_igual", 
    "<" : "tk_menor", 
    "<=" : "tk_menor_igual", 
    ":=" : "tk_asignacion", 
    "+=" : "tk_sum_asig", 
    "-=" : "tk_res_asig", 
    "*=" : "tk_mul_asig", 
    "/=" : "tk_div_asig", 
    "%=" : "tk_mod_asig", 
    "==" : "tk_igualdad", 
    "!=" : "tk_diferente", 
    "++" : "tk_incremento", 
    "--" : "tk_decremento", 
    "{" : "tk_llave_izq", 
    "}" : "tk_llave_der", 
    "(" : "tk_par_izq", 
    ")" : "tk_par_der", 
    "+" : "tk_mas", 
    "-" : "tk_menos", 
    "*" : "tk_mul", 
    "/" : "tk_div", 
    "%" : "tk_mod", 
    "," : "tk_coma", 
    ";" : "tk_puntoycoma", 
    ":" : "tk_dospuntos"
}

reserved_words = (
	"bool",
    "print",
    "input",
    "id",
    "when",
    "if",
    "unless",
    "while",
    "return",
    "until",
    "loop",
    "do",
    "else",
    "repeat",
    "num",
    "for",
    "end",
    "next",
    "break",
    "not",
    "and",
    "or",
    "var",
    "function",
    "true",
    "false",
    "return"
)

def get_token_type(str_t):
    if str_t in reserved_words:
        return str_t
    return characters.get(str_t, "ERROR")



# Leer numeros ya sea real o no
def read_numbers(line, index):
    ini_index = index
    word = ""
    is_real_number = False
    number = True
    l = len(line)
    while number:
        word += line[index]
        index += 1
        if index < l:
            if line[index] == ".":
                if is_real_number:
                    return (word, index,ini_index)
                else:
                    is_real_number = True 
                    if index+1 > l:
                        return (word[:-1], index,ini_index)
                    else:
                        if index+1 >= l or not line[index+1].isdigit() :
                            return (word, index,ini_index)
            else:
                number = line[index].isdigit()   
        else:
            break   
    return (word, index, ini_index)
  

# Leer identificadores, combinacion de letras y numeros
def read_letters_numbers(line, index):
	ini_index = index
	word = ""
	letter = True
	l = len(line)
	while letter:
		word += line[index]
		index += 1
		if index < l:
			letter = line[index].isalnum() or line[index]=="_"
		else:
			break
	return (word, index, ini_index)

# Leer caracteres especiales
def read_characters(line, index):
	ini_index = index
	chars = line[index]
	index += 1
	t_type1 = get_token_type(chars)

	if index < len(line):
		char = line[index]
		if not char.isalnum() and char != " ":
			t_type2 = get_token_type(chars +  char)
			if t_type2 == "ERROR":
				return (t_type1, index,ini_index)
			else:
				return (t_type2, index+1,ini_index)
	return (t_type1, index, ini_index)

def iterate_line(line,idx_line):
	index = 0
	lenght = len(line)
	line_result = {
		"words": [],
		"status": 0
	}
	while index < lenght:
		
		# Caracter espacio
		if line[index] == " ":
			index += 1
		else:
		# Comentario
			if line[index] == "#":
				return line_result

			# Numeros 
			elif line[index].isdigit():
				word, index , ini_index = read_numbers(line, index)
				token = Token("tk_num", idx_line , ini_index+1 ,word)

			# Funciones
			elif line[index] == '@':
				if line[index + 1 ].isalpha() :
					word, index , ini_index= read_letters_numbers(line, index)
					token = Token("fid",idx_line,ini_index+1 ,word)
				else: 
					token = Token("ERROR",idx_line,index+1)
					line_result["words"].append(token)
					line_result["status"] = 1
					return line_result
					
			# id y palabras reservadas
			elif line[index].isalpha() or line[index] == '_':
				word, index , ini_index= read_letters_numbers(line, index)
				if word in reserved_words:
					token = Token(word,idx_line,ini_index+1)
				else:
					token = Token("id",idx_line,ini_index+1 ,word)
			# Caracteres especiales
			else:
				word, index , ini_index= read_characters(line, index)
				if word == "ERROR":
					token = Token(word,idx_line,index)
					line_result["words"].append(token)
					line_result["status"] = 1	
					return line_result
				token = Token(word,idx_line,ini_index+1 )
				
			line_result["words"].append(token)
			if index == lenght:
				return line_result  
	return line_result


## Por lineas
if __name__ == "__main__":
    
	text = sys.stdin.readlines()
	idx_line= 1
	tokens=[]
	for line in text:
		line = line.replace("\t"," "*4)
		line = line.replace("\n","")
		line = line.replace("\r","")
		line = line + " "
		line_result = iterate_line(line,idx_line)
		tokens_line=  line_result["words"]
		tokens.extend(tokens_line)
		if(line_result["status"] == 1):
			break
		idx_line +=1
	if len (tokens) >0 : 	
		print( "\n".join ([str(x) for x in tokens]) )

  
