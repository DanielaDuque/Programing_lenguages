// Generated from C:/Users/vbbis/Documents/Programing_lenguages/Analizador_semantico/grammar\Bcc_grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Bcc_grammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Bcc_grammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Bcc_grammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(Bcc_grammarParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link Bcc_grammarParser#main_prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_prog(Bcc_grammarParser.Main_progContext ctx);
	/**
	 * Visit a parse tree produced by {@link Bcc_grammarParser#fn_decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFn_decl_list(Bcc_grammarParser.Fn_decl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Bcc_grammarParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(Bcc_grammarParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link Bcc_grammarParser#var_decl_pc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl_pc(Bcc_grammarParser.Var_decl_pcContext ctx);
	/**
	 * Visit a parse tree produced by {@link Bcc_grammarParser#stmt_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_block(Bcc_grammarParser.Stmt_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Bcc_grammarParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(Bcc_grammarParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Bcc_grammarParser#lexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexpr(Bcc_grammarParser.LexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Bcc_grammarParser#nexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNexpr(Bcc_grammarParser.NexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Bcc_grammarParser#rexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRexpr(Bcc_grammarParser.RexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Bcc_grammarParser#simple_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expr(Bcc_grammarParser.Simple_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Bcc_grammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(Bcc_grammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link Bcc_grammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(Bcc_grammarParser.FactorContext ctx);
}