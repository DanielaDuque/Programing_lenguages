import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BccToJava extends Bcc_GrammarBaseListener {

    int contador = 0;
    Deque<String> contadores= new LinkedList();
    String lexprNextWord ="";
    String lexprPrevWord ="";
    boolean hasInput = false;
    boolean putcoma = true;
    int typeUntil = -1 ;

    Bcc_GrammarParser parser;

    boolean tkLlaveExits = false;

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterProg(Bcc_GrammarParser.ProgContext ctx) {
        System.out.println("public class Translate { \n");
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
        System.out.println("public static void main(String[] args) throws Exception {\n");
        hasInput= false;
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
    @Override public void enterFn_decl_list(Bcc_GrammarParser.Fn_decl_listContext ctx) {
        hasInput= false;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitFn_decl_list(Bcc_GrammarParser.Fn_decl_listContext ctx) { }


    public String getDataType(String datatype){
        if (datatype.equals("num")){
           return "double";
        }
        else {
            return "boolean";
        }
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */

    @Override public void enterVar_decl(Bcc_GrammarParser.Var_declContext ctx) {
        if(ctx.start.getText().equals(",")){
            System.out.println(", ");
        }
        List<TerminalNode> type = ctx.Tk_type();
        List<TerminalNode> idList = ctx.ID();
        String vars = "";
        for(int i =0; i<type.size();i++) {

            String id = idList.get(i).getText();
            String type_node = getDataType(type.get(i).getText());

            vars += type_node + " " + id + ", ";

        }
        System.out.print(vars.substring(0, vars.length()-2));
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitVar_decl(Bcc_GrammarParser.Var_declContext ctx) {
        putcoma= true;
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterStmt_block(Bcc_GrammarParser.Stmt_blockContext ctx) {

            tkLlaveExits = false;
            System.out.print(" {\n");


    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitStmt_block(Bcc_GrammarParser.Stmt_blockContext ctx) {
        if (ctx.getParent().start.getText().equals("repeat")){
            System.out.println(contadores.removeLast() +"++;");

        }

        tkLlaveExits = true;
        System.out.print(" }\n ");


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
    @Override public void enterStmt(Bcc_GrammarParser.StmtContext ctx) {
        if(ctx.Until()!=null){
            typeUntil = ctx.Until().getSymbol().getType();

        }
        //System.out.println(ctx.toString());
       //stmBlockNextWord.add("") ;
        //System.out.println("<<<" + ctx.getText());
        if (ctx.start.getText().equals("print")){
            System.out.print("\nSystem.out.print (");
        }
        else if (ctx.start.getText().equals("if")){
            System.out.print("if");
            //stmBlockNextWord.add("else") ;
        }
        else if (ctx.start.getText().equals("loop")){
            System.out.print("while (true)");
            //stmBlockNextWord.add("else") ;

        }
        else if (ctx.start.getText().equals("repeat")){

            System.out.println("int contador_repeat"+contador+";");
            System.out.println("contador_repeat"+contador+" = 0;");
            System.out.print("while ( contador_repeat"+contador+" < " +ctx.Tk_num()+ ")" );
            contadores.add("contador_repeat"+contador);
            contador++;


            //stmBlockNextWord.add("else") ;

        }
        else if (ctx.start.getText().equals("return")){
            System.out.print("return ");
        }
        else if(ctx.start.getText().equals("do")){
            System.out.print("do ");
        }
        else if(ctx.start.getText().equals("++")){
            System.out.print(ctx.Tk_incremento().getText() + ctx.ID().getText());
        }
        else if(ctx.start.getText().equals("--")){
            System.out.print(ctx.Tk_decremento().getText() + ctx.ID().getText());
        }
        else if(ctx.start.getText().equals("next")){
            System.out.print("continue ");
        }
        else if(ctx.start.getText().equals("break")){
            System.out.print("break ");
        }

        else if(ctx.start.getText().equals("input")) {
            if (!hasInput) {
                System.out.println("Scanner myObj = new Scanner(System.in)");
            }
            System.out.print(ctx.ID().getText() + " = myObj.nextLine()");
            hasInput = true;
        }

        else if(ctx.ID() != null){
            //System.out.print(ctx.ID().getText() );


            if(ctx.Tk_asignacion() != null){
                System.out.print(ctx.ID().getText() + " = ");
            }
            else if(ctx.Tk_mod_asig() != null){
                System.out.print(ctx.ID().getText() + " "+ ctx.Tk_mod_asig()+" ");
            }
            else if(ctx.Tk_div_asig() != null){
                System.out.print(ctx.ID().getText() + " "+ ctx.Tk_div_asig()+" ");
            }
            else if(ctx.Tk_mul_asig() != null){
                System.out.print(ctx.ID().getText() + " "+ ctx.Tk_mul_asig()+" ");
            }
            else if(ctx.Tk_sum_asig() != null){
                System.out.print(ctx.ID().getText() + " "+ ctx.Tk_incremento().getText()+" ");
            }
            else if (ctx.Tk_decremento() != null){
                System.out.print(ctx.ID().getText() + ctx.Tk_incremento().getText()+" ");
            }
            else if (ctx.Tk_incremento() != null){
                System.out.print(ctx.ID().getText() + ctx.Tk_incremento().getText()+" ");
            }
        }

    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitStmt(Bcc_GrammarParser.StmtContext ctx) {
        //System.out.println("<<<sali");
        if (ctx.Print() != null){
            System.out.print(" );");
        }
        //System.out.println();
        if(ctx.Tk_puntoycoma() != null && !tkLlaveExits && !ctx.getStop().getText().equals(")" ) ){
            tkLlaveExits = false;
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
    @Override public void enterLexpr(Bcc_GrammarParser.LexprContext ctx) {
        ParserRuleContext pctx = ctx.getParent();
        List<TerminalNode> nodes = pctx.getTokens(typeUntil); // type de until
        if(!nodes.isEmpty() ){
            System.out.print("!(");
        }
        /*
        if(ctx.getParent().start.getText().equals("until") ){
            System.out.print("!(");
        }*/
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void exitLexpr(Bcc_GrammarParser.LexprContext ctx) {
        ParserRuleContext pctx = ctx.getParent();
        List<TerminalNode> nodes = pctx.getTokens(9); // type de until
        if(!nodes.isEmpty() ){
            System.out.print(")");
        }
        System.out.print(lexprNextWord);
        lexprNextWord ="";
    }
    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override public void enterNexpr(Bcc_GrammarParser.NexprContext ctx) {
        if (ctx.Not() != null){
            System.out.print("!");
        }
    }
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
        else if(ctx.start.getText().equals("++")){
            System.out.print(ctx.getText());
        }
        else if(ctx.start.getText().equals("--")){
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
                if(putcoma) {
                    System.out.print(", ");
                }
                break;
            case  "%":
                System.out.print(" % ");
                break;
            case  "*":
                System.out.print(" * ");
                break;
            case  "+":
                System.out.print(" + ");
                break;
/*            case  "++":
                System.out.print(" ++ ");
                break;
            case  "--":
                System.out.print(" -- ");
                break;*/
            case  "-":
                System.out.print(" - ");
                break;
            case  "/":
                System.out.print(" / ");
                break;
/*            case  "%=":
                System.out.print(" %= ");
                break;

            case  "*=":
                System.out.print(" *= ");
                break;

            case  "+=":
                System.out.print(" += ");
                break;

            case  "-=":
                System.out.print(" -= ");
                break;

            case  "/=":
                System.out.print(" /= ");
                break;
            case  ":=":
                System.out.print(" = ");
                break;*/
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
                System.out.print(" else ");
                break;
            case "and":
                System.out.print(" && ");
                break;
            case "or":
                System.out.print(" || ");
                break;
            case "while":
            case "until":
                System.out.print("while");
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
