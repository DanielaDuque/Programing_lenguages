import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BccToJava extends Bcc_grammarBaseListener {

    int contador = 0;
    Deque<String> contadores = new LinkedList();
    String lexprNextWord = "";
    String lexprPrevWord = "";
    boolean hasInput = false;
    boolean putcoma = true;
    int typeUntil = -1;
    int typeUnless = -1;
    String varDeclFunction = "";
    boolean printedVarDeclFunction = false;
    boolean puntoyComaStmt = false;
    int countLexprFor = 0;

    Bcc_grammarParser parser;

    boolean tkLlaveExits = false;
    int tabCount = 0;

    public void println(String text) {
        String out = "";
        for (int i = 0; i < tabCount; i++) {
            out += "\t";
        }
        System.out.println(out + text);
    }
    public void print(String text) {
        String out = "";
        for (int i = 0; i < tabCount; i++) {
            out += "\t";
        }
        System.out.print(out + text);
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterProg(Bcc_grammarParser.ProgContext ctx) {
        println("public class Translate { \n");
        tabCount++;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitProg(Bcc_grammarParser.ProgContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterMain_prog(Bcc_grammarParser.Main_progContext ctx) {
        println("public static void main(String[] args) throws Exception {\n");
        hasInput = false;
        tabCount++;
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitMain_prog(Bcc_grammarParser.Main_progContext ctx) {
        println("\n\t}\n}");
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterFn_decl_list(Bcc_grammarParser.Fn_decl_listContext ctx) {
        hasInput = false;

        print("public " + getDataType(ctx.Tk_type().getText()) + " " + ctx.FID().getText().substring(1) + " ");

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitFn_decl_list(Bcc_grammarParser.Fn_decl_listContext ctx) {
    }


    public String getDataType(String datatype) {
        if (datatype.equals("num")) {
            return "double";
        } else {
            return "boolean";
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */

    @Override
    public void enterVar_decl(Bcc_grammarParser.Var_declContext ctx) {

        if (ctx.start.getText().equals(",")) {
            System.out.println(", ");
        }

        List<TerminalNode> type = ctx.Tk_type();
        List<TerminalNode> idList = ctx.ID();
        String vars = "";
        for (int i = 0; i < type.size(); i++) {

            String id = idList.get(i).getText();
            String type_node = getDataType(type.get(i).getText());

            vars += type_node + " " + id + ", ";

        }

        System.out.print(vars.substring(0, vars.length() - 2));
        putcoma = false;

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitVar_decl(Bcc_grammarParser.Var_declContext ctx) {

    }

    @Override
    public void enterVar_decl_pc(Bcc_grammarParser.Var_decl_pcContext ctx) {
        List<TerminalNode> type = ctx.Tk_type();
        List<TerminalNode> idList = ctx.ID();

        String result = "";
        for (int i = 0; i < type.size(); i++) {

            String id = idList.get(i).getText();
            String type_node = getDataType(type.get(i).getText());

            result += type_node + " " + id + ";\n";

        }

        if (ctx.getParent().start.getText().equals("function")) {
            this.varDeclFunction = result;
        } else {
            println(result);
        }


    }

    @Override
    public void exitVar_decl_pc(Bcc_grammarParser.Var_decl_pcContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */

    @Override
    public void enterStmt_block(Bcc_grammarParser.Stmt_blockContext ctx) {


        tkLlaveExits = false;
        System.out.println(" {");
        tabCount++;
        if (varDeclFunction.length() != 0 && !this.printedVarDeclFunction) {
            System.out.println(varDeclFunction);
            this.printedVarDeclFunction = true;
        }

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitStmt_block(Bcc_grammarParser.Stmt_blockContext ctx) {
        if (ctx.getParent().start.getText().equals("repeat")) {
            System.out.println(contadores.removeLast() + "++;");

        }

        tkLlaveExits = true;
        tabCount--;
        println(" }");

        // System.out.println("<<<"+ctx.parent);
            /*
            if (!stmBlockNextWord.isEmpty()) {
                System.out.print(stmBlockNextWord.poll());
                //System.out.println("else");
            }*/


    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterStmt(Bcc_grammarParser.StmtContext ctx) {

        if (ctx.Until() != null) {
            typeUntil = ctx.Until().getSymbol().getType();
        }
        if (ctx.Unless() != null) {
            typeUnless = ctx.Unless().getSymbol().getType();
        }
        //System.out.println(ctx.toString());
        //stmBlockNextWord.add("") ;
        //System.out.println("<<<" + ctx.getText());
        if (ctx.start.getText().equals("print")) {
            print("\nSystem.out.print (");
        } else if (ctx.start.getText().equals("loop")) {
            print("while (true)");
            //stmBlockNextWord.add("else") ;

        } else if (ctx.start.getText().equals("repeat")) {

            println("int contador_repeat" + contador + ";");
            println("contador_repeat" + contador + " = 0;");
            print("while ( contador_repeat" + contador + " < " + ctx.Tk_num() + ")");
            contadores.add("contador_repeat" + contador);
            contador++;


            //stmBlockNextWord.add("else") ;

        } else if (ctx.start.getText().equals("return")) {
            this.puntoyComaStmt = false;
            print("return ");
        } else if (ctx.start.getText().equals("do")) {
            print("do ");
        } else if (ctx.start.getText().equals("++")) {
            print(ctx.Tk_incremento().getText() + ctx.ID().getText());
        } else if (ctx.start.getText().equals("--")) {
            print(ctx.Tk_decremento().getText() + ctx.ID().getText());
        } else if (ctx.start.getText().equals("next")) {
            this.puntoyComaStmt = false;
            print("continue ");
        } else if (ctx.start.getText().equals("break")) {
            this.puntoyComaStmt = false;
            print("break ");
        } else if (ctx.start.getText().equals("for")) {
            print("for ");
            this.countLexprFor = 0;
        } else if (ctx.start.getText().equals("input")) {
            this.puntoyComaStmt = false;
            if (!hasInput) {
                println("Scanner myObj = new Scanner(System.in)");
            }
            print(ctx.ID().getText() + " = myObj.nextLine()");
            hasInput = true;
        } else if (ctx.ID() != null) {
            this.puntoyComaStmt = false;
            //System.out.print(ctx.ID().getText() );


            if (ctx.Tk_asignacion() != null) {
                print(ctx.ID().getText() + " = ");
            } else if (ctx.Tk_mod_asig() != null) {
                print(ctx.ID().getText() + " " + ctx.Tk_mod_asig() + " ");
            } else if (ctx.Tk_div_asig() != null) {
                print(ctx.ID().getText() + " " + ctx.Tk_div_asig() + " ");
            } else if (ctx.Tk_mul_asig() != null) {
                print(ctx.ID().getText() + " " + ctx.Tk_mul_asig() + " ");
            } else if (ctx.Tk_sum_asig() != null) {
                print(ctx.ID().getText() + " " + ctx.Tk_sum_asig().getText() + " ");
            } else if (ctx.Tk_res_asig() != null) {
                print(ctx.ID().getText() + " " + ctx.Tk_res_asig().getText() + " ");
            } else if (ctx.Tk_decremento() != null) {
                print(ctx.ID().getText() + ctx.Tk_decremento().getText() + " ");
            } else if (ctx.Tk_incremento() != null) {
                print(ctx.ID().getText() + ctx.Tk_incremento().getText() + " ");
            }
        }

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */

    /// ACA PUNTO Y COMA
    @Override
    public void exitStmt(Bcc_grammarParser.StmtContext ctx) {
        //System.out.println("<<<sali");
        if (ctx.Print() != null) {
            System.out.print(" );");
            this.puntoyComaStmt = true;
        }
        //System.out.println((ctx.Tk_puntoycoma() != null) + " " + (!tkLlaveExits) + " " + !ctx.getStop().getText().equals(")") + " "+ !this.puntoyComaStmt);
        if (ctx.Tk_puntoycoma() != null && !tkLlaveExits && !ctx.getStop().getText().equals(")") && !this.puntoyComaStmt || (ctx.getStop().getText().equals(";") && !this.puntoyComaStmt)) {
            tkLlaveExits = false;
            this.puntoyComaStmt = true;
            //System.out.println("<<<"+ctx.getText()+ '\n');
            System.out.println(";");

        }
        /*
        if(ctx.start.getText().equals("do")){
            System.out.print(")");
        }
                 */


        //System.out.println(ctx.getText()+ '\n');
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterLexpr(Bcc_grammarParser.LexprContext ctx) {


        ParserRuleContext pctx = ctx.getParent();// type de until
        if (!pctx.getTokens(typeUntil).isEmpty() || !pctx.getTokens(typeUntil).isEmpty()) {
            System.out.print("!(");
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitLexpr(Bcc_grammarParser.LexprContext ctx) {
        ParserRuleContext pctx = ctx.getParent();
        List<TerminalNode> nodes = pctx.getTokens(9); // type de until
        if (!nodes.isEmpty()) {
            System.out.print(")");
        }
        System.out.print(lexprNextWord);
        lexprNextWord = "";

        if (ctx.getParent().start.getText().equals("for")) {
            if (this.countLexprFor < 2) {
                System.out.print("; ");
                this.countLexprFor += 1;
            }
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterNexpr(Bcc_grammarParser.NexprContext ctx) {
        if (ctx.Not() != null) {
            System.out.print("!");
        }
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitNexpr(Bcc_grammarParser.NexprContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterRexpr(Bcc_grammarParser.RexprContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitRexpr(Bcc_grammarParser.RexprContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterSimple_expr(Bcc_grammarParser.Simple_exprContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitSimple_expr(Bcc_grammarParser.Simple_exprContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterTerm(Bcc_grammarParser.TermContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitTerm(Bcc_grammarParser.TermContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterFactor(Bcc_grammarParser.FactorContext ctx) {
        if (ctx.FID() != null) {
            putcoma = true;
            String funtion = ctx.FID().getText();
            System.out.print(funtion.substring(1));
        } else if (ctx.Tk_bool() != null) {
            System.out.print(ctx.getText());
        } else if (ctx.Tk_num() != null) {
            System.out.print(ctx.getText());
        } else if (ctx.start.getText().equals("++")) {
            System.out.print(ctx.getText());
        } else if (ctx.start.getText().equals("--")) {
            System.out.print(ctx.getText());
        } else if (ctx.ID() != null) {
            System.out.print(ctx.getText());
        }

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitFactor(Bcc_grammarParser.FactorContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitEveryRule(ParserRuleContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void visitTerminal(TerminalNode node) {
        String token = node.getText();
        switch (token) {
            case "(":
                System.out.print("( ");
                break;
            case ")":
                System.out.print(") ");
                break;
            case ",":
                if (putcoma) {
                    System.out.print(", ");
                }
                break;
            case "%":
                System.out.print(" % ");
                break;
            case "*":
                System.out.print(" * ");
                break;
            case "+":
                System.out.print(" + ");
                break;
            case "-":
                System.out.print(" - ");
                break;
            case "/":
                System.out.print(" / ");
                break;
            case "<":
                System.out.print(" < ");
                break;
            case "<=":
                System.out.print(" <= ");
                break;
            case ">":
                System.out.print(" > ");
                break;
            case ">=":
                System.out.print(" >= ");
                break;
            case "==":
                System.out.print(" == ");
                break;
            case "!=":
                System.out.print(" != ");
                break;
            case "else":
                print(" else ");
                break;
            case "and":
                System.out.print(" && ");
                break;
            case "or":
                System.out.print(" || ");
                break;
            case "while":
            case "until":
                print("while");
                break;
            case "if":
            case "when":
            case "unless":
                print("if");
                break;
            //case ";":
            //  System.out.print(";");
            //break;
            default:
                break;
        }


    }


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void visitErrorNode(ErrorNode node) {
    }
}
