import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.File;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws Exception {
        try{
            // crear un analizador léxico que se alimenta a partir de la entrada (archivo  o consola)
            Bcc_grammarLexer lexer;
            if (args.length>0)
                lexer = new Bcc_grammarLexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new Bcc_grammarLexer(CharStreams.fromStream(System.in));
            // Identificar al analizador léxico como fuente de tokens para el sintactico
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Crear el objeto correspondiente al analizador sintáctico que se alimenta a partir del buffer de tokens
            Bcc_grammarParser parser = new Bcc_grammarParser(tokens);
            ParseTree tree = parser.prog(); // Iniciar el analisis sintáctico en la regla inicial: r
            //System.out.println(tree.toStringTree(parser)); // imprime el arbol al estilo LISP
        } catch (Exception e){
            System.err.println("Error (Test): " + e);
        }
    }
}
