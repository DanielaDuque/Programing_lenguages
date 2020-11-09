// Generated from C:/Users/vbbis/Documents/Programing_lenguages/Analizador_semantico/grammar\Bcc_grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Bcc_grammarParser}.
 */
public interface Bcc_grammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Bcc_grammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Bcc_grammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bcc_grammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Bcc_grammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bcc_grammarParser#main_prog}.
	 * @param ctx the parse tree
	 */
	void enterMain_prog(Bcc_grammarParser.Main_progContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bcc_grammarParser#main_prog}.
	 * @param ctx the parse tree
	 */
	void exitMain_prog(Bcc_grammarParser.Main_progContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bcc_grammarParser#fn_decl_list}.
	 * @param ctx the parse tree
	 */
	void enterFn_decl_list(Bcc_grammarParser.Fn_decl_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bcc_grammarParser#fn_decl_list}.
	 * @param ctx the parse tree
	 */
	void exitFn_decl_list(Bcc_grammarParser.Fn_decl_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bcc_grammarParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(Bcc_grammarParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bcc_grammarParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(Bcc_grammarParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bcc_grammarParser#var_decl_pc}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl_pc(Bcc_grammarParser.Var_decl_pcContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bcc_grammarParser#var_decl_pc}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl_pc(Bcc_grammarParser.Var_decl_pcContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bcc_grammarParser#stmt_block}.
	 * @param ctx the parse tree
	 */
	void enterStmt_block(Bcc_grammarParser.Stmt_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bcc_grammarParser#stmt_block}.
	 * @param ctx the parse tree
	 */
	void exitStmt_block(Bcc_grammarParser.Stmt_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bcc_grammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(Bcc_grammarParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bcc_grammarParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(Bcc_grammarParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bcc_grammarParser#lexpr}.
	 * @param ctx the parse tree
	 */
	void enterLexpr(Bcc_grammarParser.LexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bcc_grammarParser#lexpr}.
	 * @param ctx the parse tree
	 */
	void exitLexpr(Bcc_grammarParser.LexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bcc_grammarParser#nexpr}.
	 * @param ctx the parse tree
	 */
	void enterNexpr(Bcc_grammarParser.NexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bcc_grammarParser#nexpr}.
	 * @param ctx the parse tree
	 */
	void exitNexpr(Bcc_grammarParser.NexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bcc_grammarParser#rexpr}.
	 * @param ctx the parse tree
	 */
	void enterRexpr(Bcc_grammarParser.RexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bcc_grammarParser#rexpr}.
	 * @param ctx the parse tree
	 */
	void exitRexpr(Bcc_grammarParser.RexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bcc_grammarParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void enterSimple_expr(Bcc_grammarParser.Simple_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bcc_grammarParser#simple_expr}.
	 * @param ctx the parse tree
	 */
	void exitSimple_expr(Bcc_grammarParser.Simple_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bcc_grammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(Bcc_grammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bcc_grammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(Bcc_grammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link Bcc_grammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(Bcc_grammarParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Bcc_grammarParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(Bcc_grammarParser.FactorContext ctx);
}