import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.LinkedList;
import java.util.Queue;

public class BccToJava extends Bcc_GrammarBaseListener {

    Queue<String> stmBlockNextWord= new LinkedList();
    String lexprNextWord ="";

    Bcc_GrammarParser parser;

    boolean tkLlaveExits = false;

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterProg(Bcc_GrammarParser.ProgContext ctx) {
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitProg(Bcc_GrammarParser.ProgContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterMain_prog(Bcc_GrammarParser.Main_progContext ctx) {
        System.out.println("public class Translate { \n"+
            "public static void main(String[] args) throws Exception {\n");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitMain_prog(Bcc_GrammarParser.Main_progContext ctx) {
        System.out.println("\n\n}\n}");
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFn_decl_list(Bcc_GrammarParser.Fn_decl_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFn_decl_list(Bcc_GrammarParser.Fn_decl_listContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterVar_decl(Bcc_GrammarParser.Var_declContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitVar_decl(Bcc_GrammarParser.Var_declContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterStmt_block(Bcc_GrammarParser.Stmt_blockContext ctx) {
        if(ctx.Tk_llave_der() != null){
            tkLlaveExits = false;
            System.out.print(" {\n");
        }

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitStmt_block(Bcc_GrammarParser.Stmt_blockContext ctx) {

        if(ctx.Tk_llave_der() != null){
            tkLlaveExits = true;
            System.out.print(" }\n ");
           // System.out.println("<<<"+ctx.parent);
            if (!stmBlockNextWord.isEmpty()) {
                System.out.print(stmBlockNextWord.poll());
                //System.out.println("else");
            }

        }

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterStmt(Bcc_GrammarParser.StmtContext ctx) {
        //System.out.println(ctx.toString());
       //stmBlockNextWord.add("") ;
        System.out.println("<<<" + ctx);
        if (ctx.Print() != null){
            System.out.print("\nSystem.out.print (");
        }
        if (ctx.If() != null){
            System.out.print("if");
            stmBlockNextWord.add("else") ;
        }
        if (ctx.Return() != null){
            System.out.print("return ");
        }
        if (ctx.Else() != null){
            System.out.print("else cosita");
            //stmBlockNextWord.add("else") ;
        }

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitStmt(Bcc_GrammarParser.StmtContext ctx) {
        if (ctx.Print() != null){
            System.out.print(" );");
        }
        if(ctx.Tk_puntoycoma() != null && !tkLlaveExits){
            tkLlaveExits = false;
            //System.out.println("<<<"+ctx.getText()+ '\n');
            System.out.println(";");

        }
        //System.out.println(ctx.getText()+ '\n');
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterLexpr(Bcc_GrammarParser.LexprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitLexpr(Bcc_GrammarParser.LexprContext ctx) {

        System.out.print(lexprNextWord);
        lexprNextWord ="";
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterNexpr(Bcc_GrammarParser.NexprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitNexpr(Bcc_GrammarParser.NexprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterRexpr(Bcc_GrammarParser.RexprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitRexpr(Bcc_GrammarParser.RexprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterSimple_expr(Bcc_GrammarParser.Simple_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitSimple_expr(Bcc_GrammarParser.Simple_exprContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterTerm(Bcc_GrammarParser.TermContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitTerm(Bcc_GrammarParser.TermContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterFactor(Bcc_GrammarParser.FactorContext ctx) {
        if (ctx.FID() != null){
            String funtion = ctx.FID().getText();
            System.out.print(funtion.substring(1));
        }
        else if (ctx.Tk_bool() != null) {
            System.out.print(ctx.getText());
        }
        else if (ctx.Tk_num() != null) {
            System.out.print(ctx.getText());
        }
        else if (ctx.ID() != null) {
            System.out.print(ctx.getText());
        }

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFactor(Bcc_GrammarParser.FactorContext ctx) {
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterEveryRule(ParserRuleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitEveryRule(ParserRuleContext ctx) { }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitTerminal(TerminalNode node) {
        String token = node.getText();
        switch (token){
            case "(":
                System.out.print("( ");
                break;
            case ")":
                System.out.print(") ");
                break;
            case ",":
                System.out.print(", ");
                break;
            case "<":
                System.out.print(" < ");
                break;
            case "==":
                System.out.print(" == ");
                break;
            default:
                break;
        }


    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void visitErrorNode(ErrorNode node) { }
}
