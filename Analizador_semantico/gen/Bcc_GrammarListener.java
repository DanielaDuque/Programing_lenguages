// Generated from C:/Users/daniela/Documents/Universidad/Semestre 8/Lenguajes/Programing_lenguages/Analizador_semantico/grammar\Bcc_Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Bcc_GrammarParser}.
 */
public interface Bcc_GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Bcc_GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Bcc_GrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bcc_GrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Bcc_GrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bcc_GrammarParser#main_prog}.
	 * @param ctx the parse tree
	 */
	void enterMain_prog(Bcc_GrammarParser.Main_progContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bcc_GrammarParser#main_prog}.
	 * @param ctx the parse tree
	 */
	void exitMain_prog(Bcc_GrammarParser.Main_progContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bcc_GrammarParser#fn_decl_list}.
	 * @param ctx the parse tree
	 */
	void enterFn_decl_list(Bcc_GrammarParser.Fn_decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bcc_GrammarParser#fn_decl_list}.
	 * @param ctx the parse tree
	 */
	void exitFn_decl_list(Bcc_GrammarParser.Fn_decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bcc_GrammarParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(Bcc_GrammarParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bcc_GrammarParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(Bcc_GrammarParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bcc_GrammarParser#stmt_block}.
	 * @param ctx the parse tree
	 */
	void enterStmt_block(Bcc_GrammarParser.Stmt_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bcc_GrammarParser#stmt_block}.
	 * @param ctx the parse tree
	 */
	void exitStmt_block(Bcc_GrammarParser.Stmt_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bcc_GrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(Bcc_GrammarParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bcc_GrammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(Bcc_GrammarParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bcc_GrammarParser#lexpr}.
	 * @param ctx the parse tree
	 */
	void enterLexpr(Bcc_GrammarParser.LexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bcc_GrammarParser#lexpr}.
	 * @param ctx the parse tree
	 */
	void exitLexpr(Bcc_GrammarParser.LexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bcc_GrammarParser#nexpr}.
	 * @param ctx the parse tree
	 */
	void enterNexpr(Bcc_GrammarParser.NexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bcc_GrammarParser#nexpr}.
	 * @param ctx the parse tree
	 */
	void exitNexpr(Bcc_GrammarParser.NexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bcc_GrammarParser#rexpr}.
	 * @param ctx the parse tree
	 */
	void enterRexpr(Bcc_GrammarParser.RexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bcc_GrammarParser#rexpr}.
	 * @param ctx the parse tree
	 */
	void exitRexpr(Bcc_GrammarParser.RexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bcc_GrammarParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expr(Bcc_GrammarParser.Simple_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bcc_GrammarParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expr(Bcc_GrammarParser.Simple_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bcc_GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(Bcc_GrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bcc_GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(Bcc_GrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bcc_GrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(Bcc_GrammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bcc_GrammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(Bcc_GrammarParser.FactorContext ctx);
}