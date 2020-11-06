// Generated from C:/Users/daniela/Documents/Universidad/Semestre 8/Lenguajes/Programing_lenguages/Analizador_semantico/grammar\Bcc_Grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Bcc_GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		End=1, Print=2, Input=3, When=4, If=5, Unless=6, While=7, Return=8, Until=9, 
		Loop=10, Do=11, Else=12, Repeat=13, For=14, Next=15, Break=16, Not=17, 
		And=18, Or=19, Var=20, Function=21, Tk_type=22, Tk_bool=23, Tk_num=24, 
		ID=25, FID=26, Tk_diferente=27, Tk_mod=28, Tk_mod_asig=29, Tk_par_izq=30, 
		Tk_par_der=31, Tk_mul=32, Tk_mul_asig=33, Tk_mas=34, Tk_incremento=35, 
		Tk_sum_asig=36, Tk_coma=37, Tk_menos=38, Tk_decremento=39, Tk_res_asig=40, 
		Tk_div=41, Tk_div_asig=42, Tk_dospuntos=43, Tk_asignacion=44, Tk_puntoycoma=45, 
		Tk_menor=46, Tk_menor_igual=47, Tk_igualdad=48, Tk_mayor=49, Tk_mayor_igual=50, 
		Tk_llave_izq=51, Tk_llave_der=52, ESP=53, Directive=54;
	public static final int
		RULE_prog = 0, RULE_main_prog = 1, RULE_fn_decl_list = 2, RULE_var_decl = 3, 
		RULE_stmt_block = 4, RULE_stmt = 5, RULE_lexpr = 6, RULE_nexpr = 7, RULE_rexpr = 8, 
		RULE_simple_expr = 9, RULE_term = 10, RULE_factor = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "main_prog", "fn_decl_list", "var_decl", "stmt_block", "stmt", 
			"lexpr", "nexpr", "rexpr", "simple_expr", "term", "factor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'end'", "'print'", "'input'", "'when'", "'if'", "'unless'", "'while'", 
			"'return'", "'until'", "'loop'", "'do'", "'else'", "'repeat'", "'for'", 
			"'next'", "'break'", "'not'", "'and'", "'or'", "'var'", "'function'", 
			null, null, null, null, null, "'!='", "'%'", "'%='", "'('", "')'", "'*'", 
			"'*='", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'/'", "'/='", 
			"':'", "':='", "';'", "'<'", "'<='", "'=='", "'>'", "'>='", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "End", "Print", "Input", "When", "If", "Unless", "While", "Return", 
			"Until", "Loop", "Do", "Else", "Repeat", "For", "Next", "Break", "Not", 
			"And", "Or", "Var", "Function", "Tk_type", "Tk_bool", "Tk_num", "ID", 
			"FID", "Tk_diferente", "Tk_mod", "Tk_mod_asig", "Tk_par_izq", "Tk_par_der", 
			"Tk_mul", "Tk_mul_asig", "Tk_mas", "Tk_incremento", "Tk_sum_asig", "Tk_coma", 
			"Tk_menos", "Tk_decremento", "Tk_res_asig", "Tk_div", "Tk_div_asig", 
			"Tk_dospuntos", "Tk_asignacion", "Tk_puntoycoma", "Tk_menor", "Tk_menor_igual", 
			"Tk_igualdad", "Tk_mayor", "Tk_mayor_igual", "Tk_llave_izq", "Tk_llave_der", 
			"ESP", "Directive"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Bcc_Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Bcc_GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public Main_progContext main_prog() {
			return getRuleContext(Main_progContext.class,0);
		}
		public List<Fn_decl_listContext> fn_decl_list() {
			return getRuleContexts(Fn_decl_listContext.class);
		}
		public Fn_decl_listContext fn_decl_list(int i) {
			return getRuleContext(Fn_decl_listContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_GrammarListener ) ((Bcc_GrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_GrammarListener ) ((Bcc_GrammarListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Bcc_GrammarVisitor ) return ((Bcc_GrammarVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Function) {
				{
				{
				setState(24);
				fn_decl_list();
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(30);
			main_prog();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Main_progContext extends ParserRuleContext {
		public TerminalNode End() { return getToken(Bcc_GrammarParser.End, 0); }
		public TerminalNode Var() { return getToken(Bcc_GrammarParser.Var, 0); }
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public TerminalNode Tk_puntoycoma() { return getToken(Bcc_GrammarParser.Tk_puntoycoma, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Main_progContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_GrammarListener ) ((Bcc_GrammarListener)listener).enterMain_prog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_GrammarListener ) ((Bcc_GrammarListener)listener).exitMain_prog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Bcc_GrammarVisitor ) return ((Bcc_GrammarVisitor<? extends T>)visitor).visitMain_prog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Main_progContext main_prog() throws RecognitionException {
		Main_progContext _localctx = new Main_progContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				{
				setState(32);
				match(Var);
				setState(33);
				var_decl();
				setState(34);
				match(Tk_puntoycoma);
				}
				break;
			case End:
			case Print:
			case Input:
			case When:
			case If:
			case Unless:
			case While:
			case Return:
			case Until:
			case Loop:
			case Do:
			case Repeat:
			case For:
			case Next:
			case Break:
			case ID:
			case Tk_incremento:
			case Tk_decremento:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(42);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Print) | (1L << Input) | (1L << When) | (1L << If) | (1L << Unless) | (1L << While) | (1L << Return) | (1L << Until) | (1L << Loop) | (1L << Do) | (1L << Repeat) | (1L << For) | (1L << Next) | (1L << Break) | (1L << ID) | (1L << Tk_incremento) | (1L << Tk_decremento))) != 0)) {
				{
				{
				setState(39);
				stmt();
				}
				}
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(45);
			match(End);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Fn_decl_listContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(Bcc_GrammarParser.Function, 0); }
		public TerminalNode FID() { return getToken(Bcc_GrammarParser.FID, 0); }
		public TerminalNode Tk_dospuntos() { return getToken(Bcc_GrammarParser.Tk_dospuntos, 0); }
		public TerminalNode Tk_type() { return getToken(Bcc_GrammarParser.Tk_type, 0); }
		public TerminalNode Tk_par_izq() { return getToken(Bcc_GrammarParser.Tk_par_izq, 0); }
		public TerminalNode Tk_par_der() { return getToken(Bcc_GrammarParser.Tk_par_der, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public TerminalNode Var() { return getToken(Bcc_GrammarParser.Var, 0); }
		public TerminalNode Tk_puntoycoma() { return getToken(Bcc_GrammarParser.Tk_puntoycoma, 0); }
		public Fn_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fn_decl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_GrammarListener ) ((Bcc_GrammarListener)listener).enterFn_decl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_GrammarListener ) ((Bcc_GrammarListener)listener).exitFn_decl_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Bcc_GrammarVisitor ) return ((Bcc_GrammarVisitor<? extends T>)visitor).visitFn_decl_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fn_decl_listContext fn_decl_list() throws RecognitionException {
		Fn_decl_listContext _localctx = new Fn_decl_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fn_decl_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(Function);
			setState(48);
			match(FID);
			setState(49);
			match(Tk_dospuntos);
			setState(50);
			match(Tk_type);
			setState(51);
			match(Tk_par_izq);
			setState(54);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(52);
				var_decl();
				}
				break;
			case Tk_par_der:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(56);
			match(Tk_par_der);
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				{
				setState(57);
				match(Var);
				setState(58);
				var_decl();
				setState(59);
				match(Tk_puntoycoma);
				}
				break;
			case Print:
			case Input:
			case When:
			case If:
			case Unless:
			case While:
			case Return:
			case Until:
			case Loop:
			case Do:
			case Repeat:
			case For:
			case Next:
			case Break:
			case ID:
			case Tk_incremento:
			case Tk_decremento:
			case Tk_llave_izq:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(64);
			stmt_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Var_declContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(Bcc_GrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Bcc_GrammarParser.ID, i);
		}
		public List<TerminalNode> Tk_dospuntos() { return getTokens(Bcc_GrammarParser.Tk_dospuntos); }
		public TerminalNode Tk_dospuntos(int i) {
			return getToken(Bcc_GrammarParser.Tk_dospuntos, i);
		}
		public List<TerminalNode> Tk_type() { return getTokens(Bcc_GrammarParser.Tk_type); }
		public TerminalNode Tk_type(int i) {
			return getToken(Bcc_GrammarParser.Tk_type, i);
		}
		public List<TerminalNode> Tk_coma() { return getTokens(Bcc_GrammarParser.Tk_coma); }
		public TerminalNode Tk_coma(int i) {
			return getToken(Bcc_GrammarParser.Tk_coma, i);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_GrammarListener ) ((Bcc_GrammarListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_GrammarListener ) ((Bcc_GrammarListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Bcc_GrammarVisitor ) return ((Bcc_GrammarVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_var_decl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(ID);
			setState(67);
			match(Tk_dospuntos);
			setState(68);
			match(Tk_type);
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_coma) {
				{
				{
				setState(69);
				match(Tk_coma);
				setState(70);
				match(ID);
				setState(71);
				match(Tk_dospuntos);
				setState(72);
				match(Tk_type);
				}
				}
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stmt_blockContext extends ParserRuleContext {
		public TerminalNode Tk_llave_izq() { return getToken(Bcc_GrammarParser.Tk_llave_izq, 0); }
		public TerminalNode Tk_llave_der() { return getToken(Bcc_GrammarParser.Tk_llave_der, 0); }
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public Stmt_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_GrammarListener ) ((Bcc_GrammarListener)listener).enterStmt_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_GrammarListener ) ((Bcc_GrammarListener)listener).exitStmt_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Bcc_GrammarVisitor ) return ((Bcc_GrammarVisitor<? extends T>)visitor).visitStmt_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_blockContext stmt_block() throws RecognitionException {
		Stmt_blockContext _localctx = new Stmt_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stmt_block);
		int _la;
		try {
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_llave_izq:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(Tk_llave_izq);
				setState(80); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(79);
					stmt();
					}
					}
					setState(82); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Print) | (1L << Input) | (1L << When) | (1L << If) | (1L << Unless) | (1L << While) | (1L << Return) | (1L << Until) | (1L << Loop) | (1L << Do) | (1L << Repeat) | (1L << For) | (1L << Next) | (1L << Break) | (1L << ID) | (1L << Tk_incremento) | (1L << Tk_decremento))) != 0) );
				setState(84);
				match(Tk_llave_der);
				}
				break;
			case Print:
			case Input:
			case When:
			case If:
			case Unless:
			case While:
			case Return:
			case Until:
			case Loop:
			case Do:
			case Repeat:
			case For:
			case Next:
			case Break:
			case ID:
			case Tk_incremento:
			case Tk_decremento:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				stmt();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmtContext extends ParserRuleContext {
		public TerminalNode Print() { return getToken(Bcc_GrammarParser.Print, 0); }
		public List<LexprContext> lexpr() {
			return getRuleContexts(LexprContext.class);
		}
		public LexprContext lexpr(int i) {
			return getRuleContext(LexprContext.class,i);
		}
		public List<TerminalNode> Tk_puntoycoma() { return getTokens(Bcc_GrammarParser.Tk_puntoycoma); }
		public TerminalNode Tk_puntoycoma(int i) {
			return getToken(Bcc_GrammarParser.Tk_puntoycoma, i);
		}
		public TerminalNode Input() { return getToken(Bcc_GrammarParser.Input, 0); }
		public TerminalNode ID() { return getToken(Bcc_GrammarParser.ID, 0); }
		public TerminalNode When() { return getToken(Bcc_GrammarParser.When, 0); }
		public TerminalNode Tk_par_izq() { return getToken(Bcc_GrammarParser.Tk_par_izq, 0); }
		public TerminalNode Tk_par_der() { return getToken(Bcc_GrammarParser.Tk_par_der, 0); }
		public TerminalNode Do() { return getToken(Bcc_GrammarParser.Do, 0); }
		public List<Stmt_blockContext> stmt_block() {
			return getRuleContexts(Stmt_blockContext.class);
		}
		public Stmt_blockContext stmt_block(int i) {
			return getRuleContext(Stmt_blockContext.class,i);
		}
		public TerminalNode If() { return getToken(Bcc_GrammarParser.If, 0); }
		public TerminalNode Else() { return getToken(Bcc_GrammarParser.Else, 0); }
		public TerminalNode While() { return getToken(Bcc_GrammarParser.While, 0); }
		public TerminalNode Return() { return getToken(Bcc_GrammarParser.Return, 0); }
		public TerminalNode Unless() { return getToken(Bcc_GrammarParser.Unless, 0); }
		public TerminalNode Until() { return getToken(Bcc_GrammarParser.Until, 0); }
		public TerminalNode Loop() { return getToken(Bcc_GrammarParser.Loop, 0); }
		public TerminalNode Repeat() { return getToken(Bcc_GrammarParser.Repeat, 0); }
		public TerminalNode Tk_num() { return getToken(Bcc_GrammarParser.Tk_num, 0); }
		public TerminalNode Tk_dospuntos() { return getToken(Bcc_GrammarParser.Tk_dospuntos, 0); }
		public TerminalNode For() { return getToken(Bcc_GrammarParser.For, 0); }
		public TerminalNode Next() { return getToken(Bcc_GrammarParser.Next, 0); }
		public TerminalNode Break() { return getToken(Bcc_GrammarParser.Break, 0); }
		public TerminalNode Tk_asignacion() { return getToken(Bcc_GrammarParser.Tk_asignacion, 0); }
		public TerminalNode Tk_sum_asig() { return getToken(Bcc_GrammarParser.Tk_sum_asig, 0); }
		public TerminalNode Tk_res_asig() { return getToken(Bcc_GrammarParser.Tk_res_asig, 0); }
		public TerminalNode Tk_mul_asig() { return getToken(Bcc_GrammarParser.Tk_mul_asig, 0); }
		public TerminalNode Tk_div_asig() { return getToken(Bcc_GrammarParser.Tk_div_asig, 0); }
		public TerminalNode Tk_mod_asig() { return getToken(Bcc_GrammarParser.Tk_mod_asig, 0); }
		public TerminalNode Tk_incremento() { return getToken(Bcc_GrammarParser.Tk_incremento, 0); }
		public TerminalNode Tk_decremento() { return getToken(Bcc_GrammarParser.Tk_decremento, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_GrammarListener ) ((Bcc_GrammarListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_GrammarListener ) ((Bcc_GrammarListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Bcc_GrammarVisitor ) return ((Bcc_GrammarVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmt);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(89);
				match(Print);
				setState(90);
				lexpr();
				setState(91);
				match(Tk_puntoycoma);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(Input);
				setState(94);
				match(ID);
				setState(95);
				match(Tk_puntoycoma);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(When);
				setState(97);
				match(Tk_par_izq);
				setState(98);
				lexpr();
				setState(99);
				match(Tk_par_der);
				setState(100);
				match(Do);
				setState(101);
				stmt_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				match(If);
				setState(104);
				match(Tk_par_izq);
				setState(105);
				lexpr();
				setState(106);
				match(Tk_par_der);
				setState(107);
				match(Do);
				setState(108);
				stmt_block();
				setState(109);
				match(Else);
				setState(110);
				stmt_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(112);
				match(While);
				setState(113);
				match(Tk_par_izq);
				setState(114);
				lexpr();
				setState(115);
				match(Tk_par_der);
				setState(116);
				match(Do);
				setState(117);
				stmt_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(119);
				match(Return);
				setState(120);
				lexpr();
				setState(121);
				match(Tk_puntoycoma);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(123);
				match(Unless);
				setState(124);
				match(Tk_par_izq);
				setState(125);
				lexpr();
				setState(126);
				match(Tk_par_der);
				setState(127);
				match(Do);
				setState(128);
				stmt_block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(130);
				match(Until);
				setState(131);
				match(Tk_par_izq);
				setState(132);
				lexpr();
				setState(133);
				match(Tk_par_der);
				setState(134);
				match(Do);
				setState(135);
				stmt_block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(137);
				match(Loop);
				setState(138);
				stmt_block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(139);
				match(Do);
				setState(140);
				stmt_block();
				setState(141);
				match(While);
				setState(142);
				match(Tk_par_izq);
				setState(143);
				lexpr();
				setState(144);
				match(Tk_par_der);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(146);
				match(Do);
				setState(147);
				stmt_block();
				setState(148);
				match(Until);
				setState(149);
				match(Tk_par_izq);
				setState(150);
				lexpr();
				setState(151);
				match(Tk_par_der);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(153);
				match(Repeat);
				setState(154);
				match(Tk_num);
				setState(155);
				match(Tk_dospuntos);
				setState(156);
				stmt_block();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(157);
				match(For);
				setState(158);
				match(Tk_par_izq);
				setState(159);
				lexpr();
				setState(160);
				match(Tk_puntoycoma);
				setState(161);
				lexpr();
				setState(162);
				match(Tk_puntoycoma);
				setState(163);
				lexpr();
				setState(164);
				match(Tk_par_der);
				setState(165);
				match(Do);
				setState(166);
				stmt_block();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(168);
				match(Next);
				setState(169);
				match(Tk_puntoycoma);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(170);
				match(Break);
				setState(171);
				match(Tk_puntoycoma);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(172);
				match(ID);
				setState(173);
				match(Tk_asignacion);
				setState(174);
				lexpr();
				setState(175);
				match(Tk_puntoycoma);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(177);
				match(ID);
				setState(178);
				match(Tk_sum_asig);
				setState(179);
				lexpr();
				setState(180);
				match(Tk_puntoycoma);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(182);
				match(ID);
				setState(183);
				match(Tk_res_asig);
				setState(184);
				lexpr();
				setState(185);
				match(Tk_puntoycoma);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(187);
				match(ID);
				setState(188);
				match(Tk_mul_asig);
				setState(189);
				lexpr();
				setState(190);
				match(Tk_puntoycoma);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(192);
				match(ID);
				setState(193);
				match(Tk_div_asig);
				setState(194);
				lexpr();
				setState(195);
				match(Tk_puntoycoma);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(197);
				match(ID);
				setState(198);
				match(Tk_mod_asig);
				setState(199);
				lexpr();
				setState(200);
				match(Tk_puntoycoma);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(202);
				match(ID);
				setState(203);
				match(Tk_incremento);
				setState(204);
				match(Tk_puntoycoma);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(205);
				match(ID);
				setState(206);
				match(Tk_decremento);
				setState(207);
				match(Tk_puntoycoma);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(208);
				match(Tk_decremento);
				setState(209);
				match(ID);
				setState(210);
				match(Tk_puntoycoma);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(211);
				match(Tk_incremento);
				setState(212);
				match(ID);
				setState(213);
				match(Tk_puntoycoma);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LexprContext extends ParserRuleContext {
		public List<NexprContext> nexpr() {
			return getRuleContexts(NexprContext.class);
		}
		public NexprContext nexpr(int i) {
			return getRuleContext(NexprContext.class,i);
		}
		public List<TerminalNode> And() { return getTokens(Bcc_GrammarParser.And); }
		public TerminalNode And(int i) {
			return getToken(Bcc_GrammarParser.And, i);
		}
		public List<TerminalNode> Or() { return getTokens(Bcc_GrammarParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(Bcc_GrammarParser.Or, i);
		}
		public LexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_GrammarListener ) ((Bcc_GrammarListener)listener).enterLexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_GrammarListener ) ((Bcc_GrammarListener)listener).exitLexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Bcc_GrammarVisitor ) return ((Bcc_GrammarVisitor<? extends T>)visitor).visitLexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexprContext lexpr() throws RecognitionException {
		LexprContext _localctx = new LexprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_lexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			nexpr();
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==And) {
					{
					{
					setState(217);
					match(And);
					setState(218);
					nexpr();
					}
					}
					setState(223);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(228);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Or) {
					{
					{
					setState(224);
					match(Or);
					setState(225);
					nexpr();
					}
					}
					setState(230);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				{
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NexprContext extends ParserRuleContext {
		public TerminalNode Not() { return getToken(Bcc_GrammarParser.Not, 0); }
		public TerminalNode Tk_par_izq() { return getToken(Bcc_GrammarParser.Tk_par_izq, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode Tk_par_der() { return getToken(Bcc_GrammarParser.Tk_par_der, 0); }
		public RexprContext rexpr() {
			return getRuleContext(RexprContext.class,0);
		}
		public NexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_GrammarListener ) ((Bcc_GrammarListener)listener).enterNexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_GrammarListener ) ((Bcc_GrammarListener)listener).exitNexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Bcc_GrammarVisitor ) return ((Bcc_GrammarVisitor<? extends T>)visitor).visitNexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NexprContext nexpr() throws RecognitionException {
		NexprContext _localctx = new NexprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_nexpr);
		try {
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(Not);
				setState(235);
				match(Tk_par_izq);
				setState(236);
				lexpr();
				setState(237);
				match(Tk_par_der);
				}
				break;
			case Tk_bool:
			case Tk_num:
			case ID:
			case FID:
			case Tk_par_izq:
			case Tk_incremento:
			case Tk_decremento:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				rexpr();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RexprContext extends ParserRuleContext {
		public List<Simple_exprContext> simple_expr() {
			return getRuleContexts(Simple_exprContext.class);
		}
		public Simple_exprContext simple_expr(int i) {
			return getRuleContext(Simple_exprContext.class,i);
		}
		public TerminalNode Tk_menor() { return getToken(Bcc_GrammarParser.Tk_menor, 0); }
		public TerminalNode Tk_igualdad() { return getToken(Bcc_GrammarParser.Tk_igualdad, 0); }
		public TerminalNode Tk_menor_igual() { return getToken(Bcc_GrammarParser.Tk_menor_igual, 0); }
		public TerminalNode Tk_mayor() { return getToken(Bcc_GrammarParser.Tk_mayor, 0); }
		public TerminalNode Tk_mayor_igual() { return getToken(Bcc_GrammarParser.Tk_mayor_igual, 0); }
		public TerminalNode Tk_diferente() { return getToken(Bcc_GrammarParser.Tk_diferente, 0); }
		public RexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_GrammarListener ) ((Bcc_GrammarListener)listener).enterRexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_GrammarListener ) ((Bcc_GrammarListener)listener).exitRexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Bcc_GrammarVisitor ) return ((Bcc_GrammarVisitor<? extends T>)visitor).visitRexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RexprContext rexpr() throws RecognitionException {
		RexprContext _localctx = new RexprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			simple_expr();
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_diferente:
			case Tk_menor:
			case Tk_menor_igual:
			case Tk_igualdad:
			case Tk_mayor:
			case Tk_mayor_igual:
				{
				setState(243);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_diferente) | (1L << Tk_menor) | (1L << Tk_menor_igual) | (1L << Tk_igualdad) | (1L << Tk_mayor) | (1L << Tk_mayor_igual))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(244);
				simple_expr();
				}
				break;
			case And:
			case Or:
			case Tk_par_der:
			case Tk_coma:
			case Tk_puntoycoma:
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_exprContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> Tk_mas() { return getTokens(Bcc_GrammarParser.Tk_mas); }
		public TerminalNode Tk_mas(int i) {
			return getToken(Bcc_GrammarParser.Tk_mas, i);
		}
		public List<TerminalNode> Tk_menos() { return getTokens(Bcc_GrammarParser.Tk_menos); }
		public TerminalNode Tk_menos(int i) {
			return getToken(Bcc_GrammarParser.Tk_menos, i);
		}
		public Simple_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_GrammarListener ) ((Bcc_GrammarListener)listener).enterSimple_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_GrammarListener ) ((Bcc_GrammarListener)listener).exitSimple_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Bcc_GrammarVisitor ) return ((Bcc_GrammarVisitor<? extends T>)visitor).visitSimple_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_exprContext simple_expr() throws RecognitionException {
		Simple_exprContext _localctx = new Simple_exprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_simple_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			term();
			setState(253);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_mas || _la==Tk_menos) {
				{
				{
				setState(249);
				_la = _input.LA(1);
				if ( !(_la==Tk_mas || _la==Tk_menos) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(250);
				term();
				}
				}
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> Tk_mul() { return getTokens(Bcc_GrammarParser.Tk_mul); }
		public TerminalNode Tk_mul(int i) {
			return getToken(Bcc_GrammarParser.Tk_mul, i);
		}
		public List<TerminalNode> Tk_div() { return getTokens(Bcc_GrammarParser.Tk_div); }
		public TerminalNode Tk_div(int i) {
			return getToken(Bcc_GrammarParser.Tk_div, i);
		}
		public List<TerminalNode> Tk_mod() { return getTokens(Bcc_GrammarParser.Tk_mod); }
		public TerminalNode Tk_mod(int i) {
			return getToken(Bcc_GrammarParser.Tk_mod, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_GrammarListener ) ((Bcc_GrammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_GrammarListener ) ((Bcc_GrammarListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Bcc_GrammarVisitor ) return ((Bcc_GrammarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			factor();
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mod) | (1L << Tk_mul) | (1L << Tk_div))) != 0)) {
				{
				{
				setState(257);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mod) | (1L << Tk_mul) | (1L << Tk_div))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(258);
				factor();
				}
				}
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode Tk_num() { return getToken(Bcc_GrammarParser.Tk_num, 0); }
		public TerminalNode Tk_bool() { return getToken(Bcc_GrammarParser.Tk_bool, 0); }
		public TerminalNode ID() { return getToken(Bcc_GrammarParser.ID, 0); }
		public TerminalNode Tk_incremento() { return getToken(Bcc_GrammarParser.Tk_incremento, 0); }
		public TerminalNode Tk_decremento() { return getToken(Bcc_GrammarParser.Tk_decremento, 0); }
		public TerminalNode Tk_par_izq() { return getToken(Bcc_GrammarParser.Tk_par_izq, 0); }
		public List<LexprContext> lexpr() {
			return getRuleContexts(LexprContext.class);
		}
		public LexprContext lexpr(int i) {
			return getRuleContext(LexprContext.class,i);
		}
		public TerminalNode Tk_par_der() { return getToken(Bcc_GrammarParser.Tk_par_der, 0); }
		public TerminalNode FID() { return getToken(Bcc_GrammarParser.FID, 0); }
		public List<TerminalNode> Tk_coma() { return getTokens(Bcc_GrammarParser.Tk_coma); }
		public TerminalNode Tk_coma(int i) {
			return getToken(Bcc_GrammarParser.Tk_coma, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_GrammarListener ) ((Bcc_GrammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_GrammarListener ) ((Bcc_GrammarListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Bcc_GrammarVisitor ) return ((Bcc_GrammarVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_factor);
		int _la;
		try {
			setState(289);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(264);
				match(Tk_num);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(265);
				match(Tk_bool);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(266);
				match(ID);
				setState(267);
				_la = _input.LA(1);
				if ( !(_la==Tk_incremento || _la==Tk_decremento) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(268);
				_la = _input.LA(1);
				if ( !(_la==Tk_incremento || _la==Tk_decremento) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(269);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(270);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(271);
				match(Tk_par_izq);
				setState(272);
				lexpr();
				setState(273);
				match(Tk_par_der);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(275);
				match(FID);
				setState(276);
				match(Tk_par_izq);
				setState(286);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Not:
				case Tk_bool:
				case Tk_num:
				case ID:
				case FID:
				case Tk_par_izq:
				case Tk_incremento:
				case Tk_decremento:
					{
					setState(277);
					lexpr();
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Tk_coma) {
						{
						{
						setState(278);
						match(Tk_coma);
						setState(279);
						lexpr();
						}
						}
						setState(284);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case Tk_par_der:
					{
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(288);
				match(Tk_par_der);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u0126\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\3\3\3\5\3(\n\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\49\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4A\n\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5L\n\5\f\5\16\5O\13\5\3\6\3\6\6\6S\n\6\r\6\16"+
		"\6T\3\6\3\6\3\6\5\6Z\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00d9\n\7\3\b\3\b\3\b\7\b\u00de"+
		"\n\b\f\b\16\b\u00e1\13\b\3\b\3\b\7\b\u00e5\n\b\f\b\16\b\u00e8\13\b\3\b"+
		"\5\b\u00eb\n\b\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00f3\n\t\3\n\3\n\3\n\3\n\5"+
		"\n\u00f9\n\n\3\13\3\13\3\13\7\13\u00fe\n\13\f\13\16\13\u0101\13\13\3\f"+
		"\3\f\3\f\7\f\u0106\n\f\f\f\16\f\u0109\13\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u011b\n\r\f\r\16\r\u011e\13\r"+
		"\3\r\5\r\u0121\n\r\3\r\5\r\u0124\n\r\3\r\2\2\16\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\2\6\4\2\35\35\60\64\4\2$$((\5\2\36\36\"\"++\4\2%%))\2\u0149\2\35"+
		"\3\2\2\2\4\'\3\2\2\2\6\61\3\2\2\2\bD\3\2\2\2\nY\3\2\2\2\f\u00d8\3\2\2"+
		"\2\16\u00da\3\2\2\2\20\u00f2\3\2\2\2\22\u00f4\3\2\2\2\24\u00fa\3\2\2\2"+
		"\26\u0102\3\2\2\2\30\u0123\3\2\2\2\32\34\5\6\4\2\33\32\3\2\2\2\34\37\3"+
		"\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37\35\3\2\2\2 !\5\4\3\2"+
		"!\3\3\2\2\2\"#\7\26\2\2#$\5\b\5\2$%\7/\2\2%(\3\2\2\2&(\3\2\2\2\'\"\3\2"+
		"\2\2\'&\3\2\2\2(,\3\2\2\2)+\5\f\7\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3"+
		"\2\2\2-/\3\2\2\2.,\3\2\2\2/\60\7\3\2\2\60\5\3\2\2\2\61\62\7\27\2\2\62"+
		"\63\7\34\2\2\63\64\7-\2\2\64\65\7\30\2\2\658\7 \2\2\669\5\b\5\2\679\3"+
		"\2\2\28\66\3\2\2\28\67\3\2\2\29:\3\2\2\2:@\7!\2\2;<\7\26\2\2<=\5\b\5\2"+
		"=>\7/\2\2>A\3\2\2\2?A\3\2\2\2@;\3\2\2\2@?\3\2\2\2AB\3\2\2\2BC\5\n\6\2"+
		"C\7\3\2\2\2DE\7\33\2\2EF\7-\2\2FM\7\30\2\2GH\7\'\2\2HI\7\33\2\2IJ\7-\2"+
		"\2JL\7\30\2\2KG\3\2\2\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2N\t\3\2\2\2OM\3\2"+
		"\2\2PR\7\65\2\2QS\5\f\7\2RQ\3\2\2\2ST\3\2\2\2TR\3\2\2\2TU\3\2\2\2UV\3"+
		"\2\2\2VW\7\66\2\2WZ\3\2\2\2XZ\5\f\7\2YP\3\2\2\2YX\3\2\2\2Z\13\3\2\2\2"+
		"[\\\7\4\2\2\\]\5\16\b\2]^\7/\2\2^\u00d9\3\2\2\2_`\7\5\2\2`a\7\33\2\2a"+
		"\u00d9\7/\2\2bc\7\6\2\2cd\7 \2\2de\5\16\b\2ef\7!\2\2fg\7\r\2\2gh\5\n\6"+
		"\2h\u00d9\3\2\2\2ij\7\7\2\2jk\7 \2\2kl\5\16\b\2lm\7!\2\2mn\7\r\2\2no\5"+
		"\n\6\2op\7\16\2\2pq\5\n\6\2q\u00d9\3\2\2\2rs\7\t\2\2st\7 \2\2tu\5\16\b"+
		"\2uv\7!\2\2vw\7\r\2\2wx\5\n\6\2x\u00d9\3\2\2\2yz\7\n\2\2z{\5\16\b\2{|"+
		"\7/\2\2|\u00d9\3\2\2\2}~\7\b\2\2~\177\7 \2\2\177\u0080\5\16\b\2\u0080"+
		"\u0081\7!\2\2\u0081\u0082\7\r\2\2\u0082\u0083\5\n\6\2\u0083\u00d9\3\2"+
		"\2\2\u0084\u0085\7\13\2\2\u0085\u0086\7 \2\2\u0086\u0087\5\16\b\2\u0087"+
		"\u0088\7!\2\2\u0088\u0089\7\r\2\2\u0089\u008a\5\n\6\2\u008a\u00d9\3\2"+
		"\2\2\u008b\u008c\7\f\2\2\u008c\u00d9\5\n\6\2\u008d\u008e\7\r\2\2\u008e"+
		"\u008f\5\n\6\2\u008f\u0090\7\t\2\2\u0090\u0091\7 \2\2\u0091\u0092\5\16"+
		"\b\2\u0092\u0093\7!\2\2\u0093\u00d9\3\2\2\2\u0094\u0095\7\r\2\2\u0095"+
		"\u0096\5\n\6\2\u0096\u0097\7\13\2\2\u0097\u0098\7 \2\2\u0098\u0099\5\16"+
		"\b\2\u0099\u009a\7!\2\2\u009a\u00d9\3\2\2\2\u009b\u009c\7\17\2\2\u009c"+
		"\u009d\7\32\2\2\u009d\u009e\7-\2\2\u009e\u00d9\5\n\6\2\u009f\u00a0\7\20"+
		"\2\2\u00a0\u00a1\7 \2\2\u00a1\u00a2\5\16\b\2\u00a2\u00a3\7/\2\2\u00a3"+
		"\u00a4\5\16\b\2\u00a4\u00a5\7/\2\2\u00a5\u00a6\5\16\b\2\u00a6\u00a7\7"+
		"!\2\2\u00a7\u00a8\7\r\2\2\u00a8\u00a9\5\n\6\2\u00a9\u00d9\3\2\2\2\u00aa"+
		"\u00ab\7\21\2\2\u00ab\u00d9\7/\2\2\u00ac\u00ad\7\22\2\2\u00ad\u00d9\7"+
		"/\2\2\u00ae\u00af\7\33\2\2\u00af\u00b0\7.\2\2\u00b0\u00b1\5\16\b\2\u00b1"+
		"\u00b2\7/\2\2\u00b2\u00d9\3\2\2\2\u00b3\u00b4\7\33\2\2\u00b4\u00b5\7&"+
		"\2\2\u00b5\u00b6\5\16\b\2\u00b6\u00b7\7/\2\2\u00b7\u00d9\3\2\2\2\u00b8"+
		"\u00b9\7\33\2\2\u00b9\u00ba\7*\2\2\u00ba\u00bb\5\16\b\2\u00bb\u00bc\7"+
		"/\2\2\u00bc\u00d9\3\2\2\2\u00bd\u00be\7\33\2\2\u00be\u00bf\7#\2\2\u00bf"+
		"\u00c0\5\16\b\2\u00c0\u00c1\7/\2\2\u00c1\u00d9\3\2\2\2\u00c2\u00c3\7\33"+
		"\2\2\u00c3\u00c4\7,\2\2\u00c4\u00c5\5\16\b\2\u00c5\u00c6\7/\2\2\u00c6"+
		"\u00d9\3\2\2\2\u00c7\u00c8\7\33\2\2\u00c8\u00c9\7\37\2\2\u00c9\u00ca\5"+
		"\16\b\2\u00ca\u00cb\7/\2\2\u00cb\u00d9\3\2\2\2\u00cc\u00cd\7\33\2\2\u00cd"+
		"\u00ce\7%\2\2\u00ce\u00d9\7/\2\2\u00cf\u00d0\7\33\2\2\u00d0\u00d1\7)\2"+
		"\2\u00d1\u00d9\7/\2\2\u00d2\u00d3\7)\2\2\u00d3\u00d4\7\33\2\2\u00d4\u00d9"+
		"\7/\2\2\u00d5\u00d6\7%\2\2\u00d6\u00d7\7\33\2\2\u00d7\u00d9\7/\2\2\u00d8"+
		"[\3\2\2\2\u00d8_\3\2\2\2\u00d8b\3\2\2\2\u00d8i\3\2\2\2\u00d8r\3\2\2\2"+
		"\u00d8y\3\2\2\2\u00d8}\3\2\2\2\u00d8\u0084\3\2\2\2\u00d8\u008b\3\2\2\2"+
		"\u00d8\u008d\3\2\2\2\u00d8\u0094\3\2\2\2\u00d8\u009b\3\2\2\2\u00d8\u009f"+
		"\3\2\2\2\u00d8\u00aa\3\2\2\2\u00d8\u00ac\3\2\2\2\u00d8\u00ae\3\2\2\2\u00d8"+
		"\u00b3\3\2\2\2\u00d8\u00b8\3\2\2\2\u00d8\u00bd\3\2\2\2\u00d8\u00c2\3\2"+
		"\2\2\u00d8\u00c7\3\2\2\2\u00d8\u00cc\3\2\2\2\u00d8\u00cf\3\2\2\2\u00d8"+
		"\u00d2\3\2\2\2\u00d8\u00d5\3\2\2\2\u00d9\r\3\2\2\2\u00da\u00ea\5\20\t"+
		"\2\u00db\u00dc\7\24\2\2\u00dc\u00de\5\20\t\2\u00dd\u00db\3\2\2\2\u00de"+
		"\u00e1\3\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00eb\3\2"+
		"\2\2\u00e1\u00df\3\2\2\2\u00e2\u00e3\7\25\2\2\u00e3\u00e5\5\20\t\2\u00e4"+
		"\u00e2\3\2\2\2\u00e5\u00e8\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2"+
		"\2\2\u00e7\u00eb\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00df\3\2\2\2\u00ea\u00e6\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb\17\3\2\2"+
		"\2\u00ec\u00ed\7\23\2\2\u00ed\u00ee\7 \2\2\u00ee\u00ef\5\16\b\2\u00ef"+
		"\u00f0\7!\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00f3\5\22\n\2\u00f2\u00ec\3\2"+
		"\2\2\u00f2\u00f1\3\2\2\2\u00f3\21\3\2\2\2\u00f4\u00f8\5\24\13\2\u00f5"+
		"\u00f6\t\2\2\2\u00f6\u00f9\5\24\13\2\u00f7\u00f9\3\2\2\2\u00f8\u00f5\3"+
		"\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\23\3\2\2\2\u00fa\u00ff\5\26\f\2\u00fb"+
		"\u00fc\t\3\2\2\u00fc\u00fe\5\26\f\2\u00fd\u00fb\3\2\2\2\u00fe\u0101\3"+
		"\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\25\3\2\2\2\u0101"+
		"\u00ff\3\2\2\2\u0102\u0107\5\30\r\2\u0103\u0104\t\4\2\2\u0104\u0106\5"+
		"\30\r\2\u0105\u0103\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2\2\2\u0107"+
		"\u0108\3\2\2\2\u0108\27\3\2\2\2\u0109\u0107\3\2\2\2\u010a\u0124\7\32\2"+
		"\2\u010b\u0124\7\31\2\2\u010c\u010d\7\33\2\2\u010d\u0124\t\5\2\2\u010e"+
		"\u010f\t\5\2\2\u010f\u0124\7\33\2\2\u0110\u0124\7\33\2\2\u0111\u0112\7"+
		" \2\2\u0112\u0113\5\16\b\2\u0113\u0114\7!\2\2\u0114\u0124\3\2\2\2\u0115"+
		"\u0116\7\34\2\2\u0116\u0120\7 \2\2\u0117\u011c\5\16\b\2\u0118\u0119\7"+
		"\'\2\2\u0119\u011b\5\16\b\2\u011a\u0118\3\2\2\2\u011b\u011e\3\2\2\2\u011c"+
		"\u011a\3\2\2\2\u011c\u011d\3\2\2\2\u011d\u0121\3\2\2\2\u011e\u011c\3\2"+
		"\2\2\u011f\u0121\3\2\2\2\u0120\u0117\3\2\2\2\u0120\u011f\3\2\2\2\u0121"+
		"\u0122\3\2\2\2\u0122\u0124\7!\2\2\u0123\u010a\3\2\2\2\u0123\u010b\3\2"+
		"\2\2\u0123\u010c\3\2\2\2\u0123\u010e\3\2\2\2\u0123\u0110\3\2\2\2\u0123"+
		"\u0111\3\2\2\2\u0123\u0115\3\2\2\2\u0124\31\3\2\2\2\25\35\',8@MTY\u00d8"+
		"\u00df\u00e6\u00ea\u00f2\u00f8\u00ff\u0107\u011c\u0120\u0123";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}