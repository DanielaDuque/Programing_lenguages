/***
 * Excerpted from "The Definitive ANTLR 4 Reference",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/tpantlr2 for more book information.
 ***/
// import ANTLR's runtime libraries
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Translate {
    public static void main(String[] args) throws Exception {
        try {
            // crear un analizador léxico que se alimenta a partir de la entrada (archivo  o consola)
            Bcc_GrammarLexer lexer;
            if (args.length > 0)
                lexer = new Bcc_GrammarLexer(CharStreams.fromFileName(args[0]));
            else
                lexer = new Bcc_GrammarLexer(CharStreams.fromStream(System.in));

            // create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // create a parser that feeds off the tokens buffer
            Bcc_GrammarParser parser = new Bcc_GrammarParser(tokens);
            ParseTree tree = parser.prog(); // begin parsing at init rule

            // Create a generic parse tree walker that can trigger callbacks
            ParseTreeWalker walker = new ParseTreeWalker();
            // Walk the tree created during the parse, trigger callbacks
            walker.walk(new BccToJava(), tree);
            System.out.println(); // print a \n after translation
        } catch (Exception e) {
            System.err.println("Error (Test): " + e);
        }
    }
}