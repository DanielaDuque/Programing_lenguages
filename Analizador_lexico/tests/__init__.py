from lexical import main

def getLexicalOutput(code):
	text = [f"{line}\n" for line in code.split("\n")]
	idx_line = 1
	tokens=[]
	for line in text:
		line = line.replace("\t"," "*4)
		line = line.replace("\n","")
		line_result = main.iterate_line(line,idx_line)
		tokens_line=  line_result["words"]
		tokens.extend(tokens_line)
		if(line_result["status"] == 1):
			break
		idx_line +=1
      
	return  "\n".join ([str(x) for x in tokens]) 