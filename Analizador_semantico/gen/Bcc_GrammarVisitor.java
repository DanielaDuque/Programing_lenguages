// Generated from C:/Users/daniela/Documents/Universidad/Semestre 8/Lenguajes/Programing_lenguages/Analizador_semantico/grammar\Bcc_Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Bcc_GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Bcc_GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Bcc_GrammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(Bcc_GrammarParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link Bcc_GrammarParser#main_prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain_prog(Bcc_GrammarParser.Main_progContext ctx);
	/**
	 * Visit a parse tree produced by {@link Bcc_GrammarParser#fn_decl_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFn_decl_list(Bcc_GrammarParser.Fn_decl_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link Bcc_GrammarParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(Bcc_GrammarParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link Bcc_GrammarParser#stmt_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt_block(Bcc_GrammarParser.Stmt_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link Bcc_GrammarParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(Bcc_GrammarParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link Bcc_GrammarParser#lexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLexpr(Bcc_GrammarParser.LexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Bcc_GrammarParser#nexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNexpr(Bcc_GrammarParser.NexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Bcc_GrammarParser#rexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRexpr(Bcc_GrammarParser.RexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Bcc_GrammarParser#simple_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_expr(Bcc_GrammarParser.Simple_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link Bcc_GrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(Bcc_GrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link Bcc_GrammarParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(Bcc_GrammarParser.FactorContext ctx);
}