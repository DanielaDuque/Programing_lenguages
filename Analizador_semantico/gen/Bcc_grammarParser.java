// Generated from C:/Users/vbbis/Documents/Programing_lenguages/Analizador_semantico/grammar\Bcc_grammar.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Bcc_grammarParser extends Parser {
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
		RULE_var_decl_pc = 4, RULE_stmt_block = 5, RULE_stmt = 6, RULE_lexpr = 7, 
		RULE_nexpr = 8, RULE_rexpr = 9, RULE_simple_expr = 10, RULE_term = 11, 
		RULE_factor = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "main_prog", "fn_decl_list", "var_decl", "var_decl_pc", "stmt_block", 
			"stmt", "lexpr", "nexpr", "rexpr", "simple_expr", "term", "factor"
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
	public String getGrammarFileName() { return "Bcc_grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Bcc_grammarParser(TokenStream input) {
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
			if ( listener instanceof Bcc_grammarListener ) ((Bcc_grammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_grammarListener ) ((Bcc_grammarListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Bcc_grammarVisitor ) return ((Bcc_grammarVisitor<? extends T>)visitor).visitProg(this);
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
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Function) {
				{
				{
				setState(26);
				fn_decl_list();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
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
		public TerminalNode End() { return getToken(Bcc_grammarParser.End, 0); }
		public TerminalNode Var() { return getToken(Bcc_grammarParser.Var, 0); }
		public Var_decl_pcContext var_decl_pc() {
			return getRuleContext(Var_decl_pcContext.class,0);
		}
		public TerminalNode Tk_puntoycoma() { return getToken(Bcc_grammarParser.Tk_puntoycoma, 0); }
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
			if ( listener instanceof Bcc_grammarListener ) ((Bcc_grammarListener)listener).enterMain_prog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_grammarListener ) ((Bcc_grammarListener)listener).exitMain_prog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Bcc_grammarVisitor ) return ((Bcc_grammarVisitor<? extends T>)visitor).visitMain_prog(this);
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
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				{
				setState(34);
				match(Var);
				setState(35);
				var_decl_pc();
				setState(36);
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
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Print) | (1L << Input) | (1L << When) | (1L << If) | (1L << Unless) | (1L << While) | (1L << Return) | (1L << Until) | (1L << Loop) | (1L << Do) | (1L << Repeat) | (1L << For) | (1L << Next) | (1L << Break) | (1L << ID) | (1L << Tk_incremento) | (1L << Tk_decremento))) != 0)) {
				{
				{
				setState(41);
				stmt();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(47);
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
		public TerminalNode Function() { return getToken(Bcc_grammarParser.Function, 0); }
		public TerminalNode FID() { return getToken(Bcc_grammarParser.FID, 0); }
		public TerminalNode Tk_dospuntos() { return getToken(Bcc_grammarParser.Tk_dospuntos, 0); }
		public TerminalNode Tk_type() { return getToken(Bcc_grammarParser.Tk_type, 0); }
		public TerminalNode Tk_par_izq() { return getToken(Bcc_grammarParser.Tk_par_izq, 0); }
		public TerminalNode Tk_par_der() { return getToken(Bcc_grammarParser.Tk_par_der, 0); }
		public Stmt_blockContext stmt_block() {
			return getRuleContext(Stmt_blockContext.class,0);
		}
		public Var_declContext var_decl() {
			return getRuleContext(Var_declContext.class,0);
		}
		public TerminalNode Var() { return getToken(Bcc_grammarParser.Var, 0); }
		public Var_decl_pcContext var_decl_pc() {
			return getRuleContext(Var_decl_pcContext.class,0);
		}
		public TerminalNode Tk_puntoycoma() { return getToken(Bcc_grammarParser.Tk_puntoycoma, 0); }
		public Fn_decl_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fn_decl_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_grammarListener ) ((Bcc_grammarListener)listener).enterFn_decl_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_grammarListener ) ((Bcc_grammarListener)listener).exitFn_decl_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Bcc_grammarVisitor ) return ((Bcc_grammarVisitor<? extends T>)visitor).visitFn_decl_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Fn_decl_listContext fn_decl_list() throws RecognitionException {
		Fn_decl_listContext _localctx = new Fn_decl_listContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fn_decl_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(Function);
			setState(50);
			match(FID);
			setState(51);
			match(Tk_dospuntos);
			setState(52);
			match(Tk_type);
			setState(53);
			match(Tk_par_izq);
			setState(56);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(54);
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
			setState(58);
			match(Tk_par_der);
			setState(64);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				{
				setState(59);
				match(Var);
				setState(60);
				var_decl_pc();
				setState(61);
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
			setState(66);
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
		public List<TerminalNode> ID() { return getTokens(Bcc_grammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Bcc_grammarParser.ID, i);
		}
		public List<TerminalNode> Tk_dospuntos() { return getTokens(Bcc_grammarParser.Tk_dospuntos); }
		public TerminalNode Tk_dospuntos(int i) {
			return getToken(Bcc_grammarParser.Tk_dospuntos, i);
		}
		public List<TerminalNode> Tk_type() { return getTokens(Bcc_grammarParser.Tk_type); }
		public TerminalNode Tk_type(int i) {
			return getToken(Bcc_grammarParser.Tk_type, i);
		}
		public List<TerminalNode> Tk_coma() { return getTokens(Bcc_grammarParser.Tk_coma); }
		public TerminalNode Tk_coma(int i) {
			return getToken(Bcc_grammarParser.Tk_coma, i);
		}
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_grammarListener ) ((Bcc_grammarListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_grammarListener ) ((Bcc_grammarListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Bcc_grammarVisitor ) return ((Bcc_grammarVisitor<? extends T>)visitor).visitVar_decl(this);
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
			setState(68);
			match(ID);
			setState(69);
			match(Tk_dospuntos);
			setState(70);
			match(Tk_type);
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_coma) {
				{
				{
				setState(71);
				match(Tk_coma);
				setState(72);
				match(ID);
				setState(73);
				match(Tk_dospuntos);
				setState(74);
				match(Tk_type);
				}
				}
				setState(79);
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

	public static class Var_decl_pcContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(Bcc_grammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Bcc_grammarParser.ID, i);
		}
		public List<TerminalNode> Tk_dospuntos() { return getTokens(Bcc_grammarParser.Tk_dospuntos); }
		public TerminalNode Tk_dospuntos(int i) {
			return getToken(Bcc_grammarParser.Tk_dospuntos, i);
		}
		public List<TerminalNode> Tk_type() { return getTokens(Bcc_grammarParser.Tk_type); }
		public TerminalNode Tk_type(int i) {
			return getToken(Bcc_grammarParser.Tk_type, i);
		}
		public List<TerminalNode> Tk_coma() { return getTokens(Bcc_grammarParser.Tk_coma); }
		public TerminalNode Tk_coma(int i) {
			return getToken(Bcc_grammarParser.Tk_coma, i);
		}
		public Var_decl_pcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl_pc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_grammarListener ) ((Bcc_grammarListener)listener).enterVar_decl_pc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_grammarListener ) ((Bcc_grammarListener)listener).exitVar_decl_pc(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Bcc_grammarVisitor ) return ((Bcc_grammarVisitor<? extends T>)visitor).visitVar_decl_pc(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_decl_pcContext var_decl_pc() throws RecognitionException {
		Var_decl_pcContext _localctx = new Var_decl_pcContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_var_decl_pc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(ID);
			setState(81);
			match(Tk_dospuntos);
			setState(82);
			match(Tk_type);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_coma) {
				{
				{
				setState(83);
				match(Tk_coma);
				setState(84);
				match(ID);
				setState(85);
				match(Tk_dospuntos);
				setState(86);
				match(Tk_type);
				}
				}
				setState(91);
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
		public TerminalNode Tk_llave_izq() { return getToken(Bcc_grammarParser.Tk_llave_izq, 0); }
		public TerminalNode Tk_llave_der() { return getToken(Bcc_grammarParser.Tk_llave_der, 0); }
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
			if ( listener instanceof Bcc_grammarListener ) ((Bcc_grammarListener)listener).enterStmt_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_grammarListener ) ((Bcc_grammarListener)listener).exitStmt_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Bcc_grammarVisitor ) return ((Bcc_grammarVisitor<? extends T>)visitor).visitStmt_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stmt_blockContext stmt_block() throws RecognitionException {
		Stmt_blockContext _localctx = new Stmt_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_stmt_block);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_llave_izq:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				match(Tk_llave_izq);
				setState(94); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(93);
					stmt();
					}
					}
					setState(96); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Print) | (1L << Input) | (1L << When) | (1L << If) | (1L << Unless) | (1L << While) | (1L << Return) | (1L << Until) | (1L << Loop) | (1L << Do) | (1L << Repeat) | (1L << For) | (1L << Next) | (1L << Break) | (1L << ID) | (1L << Tk_incremento) | (1L << Tk_decremento))) != 0) );
				setState(98);
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
				setState(100);
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
		public TerminalNode Print() { return getToken(Bcc_grammarParser.Print, 0); }
		public List<LexprContext> lexpr() {
			return getRuleContexts(LexprContext.class);
		}
		public LexprContext lexpr(int i) {
			return getRuleContext(LexprContext.class,i);
		}
		public List<TerminalNode> Tk_puntoycoma() { return getTokens(Bcc_grammarParser.Tk_puntoycoma); }
		public TerminalNode Tk_puntoycoma(int i) {
			return getToken(Bcc_grammarParser.Tk_puntoycoma, i);
		}
		public TerminalNode Input() { return getToken(Bcc_grammarParser.Input, 0); }
		public TerminalNode ID() { return getToken(Bcc_grammarParser.ID, 0); }
		public TerminalNode When() { return getToken(Bcc_grammarParser.When, 0); }
		public TerminalNode Tk_par_izq() { return getToken(Bcc_grammarParser.Tk_par_izq, 0); }
		public TerminalNode Tk_par_der() { return getToken(Bcc_grammarParser.Tk_par_der, 0); }
		public TerminalNode Do() { return getToken(Bcc_grammarParser.Do, 0); }
		public List<Stmt_blockContext> stmt_block() {
			return getRuleContexts(Stmt_blockContext.class);
		}
		public Stmt_blockContext stmt_block(int i) {
			return getRuleContext(Stmt_blockContext.class,i);
		}
		public TerminalNode If() { return getToken(Bcc_grammarParser.If, 0); }
		public TerminalNode Else() { return getToken(Bcc_grammarParser.Else, 0); }
		public TerminalNode While() { return getToken(Bcc_grammarParser.While, 0); }
		public TerminalNode Return() { return getToken(Bcc_grammarParser.Return, 0); }
		public TerminalNode Unless() { return getToken(Bcc_grammarParser.Unless, 0); }
		public TerminalNode Until() { return getToken(Bcc_grammarParser.Until, 0); }
		public TerminalNode Loop() { return getToken(Bcc_grammarParser.Loop, 0); }
		public TerminalNode Repeat() { return getToken(Bcc_grammarParser.Repeat, 0); }
		public TerminalNode Tk_num() { return getToken(Bcc_grammarParser.Tk_num, 0); }
		public TerminalNode Tk_dospuntos() { return getToken(Bcc_grammarParser.Tk_dospuntos, 0); }
		public TerminalNode For() { return getToken(Bcc_grammarParser.For, 0); }
		public TerminalNode Next() { return getToken(Bcc_grammarParser.Next, 0); }
		public TerminalNode Break() { return getToken(Bcc_grammarParser.Break, 0); }
		public TerminalNode Tk_asignacion() { return getToken(Bcc_grammarParser.Tk_asignacion, 0); }
		public TerminalNode Tk_sum_asig() { return getToken(Bcc_grammarParser.Tk_sum_asig, 0); }
		public TerminalNode Tk_res_asig() { return getToken(Bcc_grammarParser.Tk_res_asig, 0); }
		public TerminalNode Tk_mul_asig() { return getToken(Bcc_grammarParser.Tk_mul_asig, 0); }
		public TerminalNode Tk_div_asig() { return getToken(Bcc_grammarParser.Tk_div_asig, 0); }
		public TerminalNode Tk_mod_asig() { return getToken(Bcc_grammarParser.Tk_mod_asig, 0); }
		public TerminalNode Tk_incremento() { return getToken(Bcc_grammarParser.Tk_incremento, 0); }
		public TerminalNode Tk_decremento() { return getToken(Bcc_grammarParser.Tk_decremento, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_grammarListener ) ((Bcc_grammarListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_grammarListener ) ((Bcc_grammarListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Bcc_grammarVisitor ) return ((Bcc_grammarVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_stmt);
		try {
			setState(228);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(103);
				match(Print);
				setState(104);
				lexpr();
				setState(105);
				match(Tk_puntoycoma);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(Input);
				setState(108);
				match(ID);
				setState(109);
				match(Tk_puntoycoma);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(110);
				match(When);
				setState(111);
				match(Tk_par_izq);
				setState(112);
				lexpr();
				setState(113);
				match(Tk_par_der);
				setState(114);
				match(Do);
				setState(115);
				stmt_block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				match(If);
				setState(118);
				match(Tk_par_izq);
				setState(119);
				lexpr();
				setState(120);
				match(Tk_par_der);
				setState(121);
				match(Do);
				setState(122);
				stmt_block();
				setState(123);
				match(Else);
				setState(124);
				stmt_block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				match(While);
				setState(127);
				match(Tk_par_izq);
				setState(128);
				lexpr();
				setState(129);
				match(Tk_par_der);
				setState(130);
				match(Do);
				setState(131);
				stmt_block();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(133);
				match(Return);
				setState(134);
				lexpr();
				setState(135);
				match(Tk_puntoycoma);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(137);
				match(Unless);
				setState(138);
				match(Tk_par_izq);
				setState(139);
				lexpr();
				setState(140);
				match(Tk_par_der);
				setState(141);
				match(Do);
				setState(142);
				stmt_block();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(144);
				match(Until);
				setState(145);
				match(Tk_par_izq);
				setState(146);
				lexpr();
				setState(147);
				match(Tk_par_der);
				setState(148);
				match(Do);
				setState(149);
				stmt_block();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(151);
				match(Loop);
				setState(152);
				stmt_block();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(153);
				match(Do);
				setState(154);
				stmt_block();
				setState(155);
				match(While);
				setState(156);
				match(Tk_par_izq);
				setState(157);
				lexpr();
				setState(158);
				match(Tk_par_der);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(160);
				match(Do);
				setState(161);
				stmt_block();
				setState(162);
				match(Until);
				setState(163);
				match(Tk_par_izq);
				setState(164);
				lexpr();
				setState(165);
				match(Tk_par_der);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(167);
				match(Repeat);
				setState(168);
				match(Tk_num);
				setState(169);
				match(Tk_dospuntos);
				setState(170);
				stmt_block();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(171);
				match(For);
				setState(172);
				match(Tk_par_izq);
				setState(173);
				lexpr();
				setState(174);
				match(Tk_puntoycoma);
				setState(175);
				lexpr();
				setState(176);
				match(Tk_puntoycoma);
				setState(177);
				lexpr();
				setState(178);
				match(Tk_par_der);
				setState(179);
				match(Do);
				setState(180);
				stmt_block();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(182);
				match(Next);
				setState(183);
				match(Tk_puntoycoma);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(184);
				match(Break);
				setState(185);
				match(Tk_puntoycoma);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(186);
				match(ID);
				setState(187);
				match(Tk_asignacion);
				setState(188);
				lexpr();
				setState(189);
				match(Tk_puntoycoma);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(191);
				match(ID);
				setState(192);
				match(Tk_sum_asig);
				setState(193);
				lexpr();
				setState(194);
				match(Tk_puntoycoma);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(196);
				match(ID);
				setState(197);
				match(Tk_res_asig);
				setState(198);
				lexpr();
				setState(199);
				match(Tk_puntoycoma);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(201);
				match(ID);
				setState(202);
				match(Tk_mul_asig);
				setState(203);
				lexpr();
				setState(204);
				match(Tk_puntoycoma);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(206);
				match(ID);
				setState(207);
				match(Tk_div_asig);
				setState(208);
				lexpr();
				setState(209);
				match(Tk_puntoycoma);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(211);
				match(ID);
				setState(212);
				match(Tk_mod_asig);
				setState(213);
				lexpr();
				setState(214);
				match(Tk_puntoycoma);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(216);
				match(ID);
				setState(217);
				match(Tk_incremento);
				setState(218);
				match(Tk_puntoycoma);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(219);
				match(ID);
				setState(220);
				match(Tk_decremento);
				setState(221);
				match(Tk_puntoycoma);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(222);
				match(Tk_decremento);
				setState(223);
				match(ID);
				setState(224);
				match(Tk_puntoycoma);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(225);
				match(Tk_incremento);
				setState(226);
				match(ID);
				setState(227);
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
		public List<TerminalNode> And() { return getTokens(Bcc_grammarParser.And); }
		public TerminalNode And(int i) {
			return getToken(Bcc_grammarParser.And, i);
		}
		public List<TerminalNode> Or() { return getTokens(Bcc_grammarParser.Or); }
		public TerminalNode Or(int i) {
			return getToken(Bcc_grammarParser.Or, i);
		}
		public LexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_grammarListener ) ((Bcc_grammarListener)listener).enterLexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_grammarListener ) ((Bcc_grammarListener)listener).exitLexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Bcc_grammarVisitor ) return ((Bcc_grammarVisitor<? extends T>)visitor).visitLexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LexprContext lexpr() throws RecognitionException {
		LexprContext _localctx = new LexprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_lexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			nexpr();
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(235);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==And) {
					{
					{
					setState(231);
					match(And);
					setState(232);
					nexpr();
					}
					}
					setState(237);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Or) {
					{
					{
					setState(238);
					match(Or);
					setState(239);
					nexpr();
					}
					}
					setState(244);
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
		public TerminalNode Not() { return getToken(Bcc_grammarParser.Not, 0); }
		public TerminalNode Tk_par_izq() { return getToken(Bcc_grammarParser.Tk_par_izq, 0); }
		public LexprContext lexpr() {
			return getRuleContext(LexprContext.class,0);
		}
		public TerminalNode Tk_par_der() { return getToken(Bcc_grammarParser.Tk_par_der, 0); }
		public RexprContext rexpr() {
			return getRuleContext(RexprContext.class,0);
		}
		public NexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_grammarListener ) ((Bcc_grammarListener)listener).enterNexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_grammarListener ) ((Bcc_grammarListener)listener).exitNexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Bcc_grammarVisitor ) return ((Bcc_grammarVisitor<? extends T>)visitor).visitNexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NexprContext nexpr() throws RecognitionException {
		NexprContext _localctx = new NexprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_nexpr);
		try {
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Not:
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(Not);
				setState(249);
				match(Tk_par_izq);
				setState(250);
				lexpr();
				setState(251);
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
				setState(253);
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
		public TerminalNode Tk_menor() { return getToken(Bcc_grammarParser.Tk_menor, 0); }
		public TerminalNode Tk_igualdad() { return getToken(Bcc_grammarParser.Tk_igualdad, 0); }
		public TerminalNode Tk_menor_igual() { return getToken(Bcc_grammarParser.Tk_menor_igual, 0); }
		public TerminalNode Tk_mayor() { return getToken(Bcc_grammarParser.Tk_mayor, 0); }
		public TerminalNode Tk_mayor_igual() { return getToken(Bcc_grammarParser.Tk_mayor_igual, 0); }
		public TerminalNode Tk_diferente() { return getToken(Bcc_grammarParser.Tk_diferente, 0); }
		public RexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_grammarListener ) ((Bcc_grammarListener)listener).enterRexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_grammarListener ) ((Bcc_grammarListener)listener).exitRexpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Bcc_grammarVisitor ) return ((Bcc_grammarVisitor<? extends T>)visitor).visitRexpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RexprContext rexpr() throws RecognitionException {
		RexprContext _localctx = new RexprContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_rexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			simple_expr();
			setState(260);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Tk_diferente:
			case Tk_menor:
			case Tk_menor_igual:
			case Tk_igualdad:
			case Tk_mayor:
			case Tk_mayor_igual:
				{
				setState(257);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_diferente) | (1L << Tk_menor) | (1L << Tk_menor_igual) | (1L << Tk_igualdad) | (1L << Tk_mayor) | (1L << Tk_mayor_igual))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(258);
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
		public List<TerminalNode> Tk_mas() { return getTokens(Bcc_grammarParser.Tk_mas); }
		public TerminalNode Tk_mas(int i) {
			return getToken(Bcc_grammarParser.Tk_mas, i);
		}
		public List<TerminalNode> Tk_menos() { return getTokens(Bcc_grammarParser.Tk_menos); }
		public TerminalNode Tk_menos(int i) {
			return getToken(Bcc_grammarParser.Tk_menos, i);
		}
		public Simple_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_grammarListener ) ((Bcc_grammarListener)listener).enterSimple_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_grammarListener ) ((Bcc_grammarListener)listener).exitSimple_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Bcc_grammarVisitor ) return ((Bcc_grammarVisitor<? extends T>)visitor).visitSimple_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Simple_exprContext simple_expr() throws RecognitionException {
		Simple_exprContext _localctx = new Simple_exprContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_simple_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			term();
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Tk_mas || _la==Tk_menos) {
				{
				{
				setState(263);
				_la = _input.LA(1);
				if ( !(_la==Tk_mas || _la==Tk_menos) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(264);
				term();
				}
				}
				setState(269);
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
		public List<TerminalNode> Tk_mul() { return getTokens(Bcc_grammarParser.Tk_mul); }
		public TerminalNode Tk_mul(int i) {
			return getToken(Bcc_grammarParser.Tk_mul, i);
		}
		public List<TerminalNode> Tk_div() { return getTokens(Bcc_grammarParser.Tk_div); }
		public TerminalNode Tk_div(int i) {
			return getToken(Bcc_grammarParser.Tk_div, i);
		}
		public List<TerminalNode> Tk_mod() { return getTokens(Bcc_grammarParser.Tk_mod); }
		public TerminalNode Tk_mod(int i) {
			return getToken(Bcc_grammarParser.Tk_mod, i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_grammarListener ) ((Bcc_grammarListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_grammarListener ) ((Bcc_grammarListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Bcc_grammarVisitor ) return ((Bcc_grammarVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			factor();
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mod) | (1L << Tk_mul) | (1L << Tk_div))) != 0)) {
				{
				{
				setState(271);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Tk_mod) | (1L << Tk_mul) | (1L << Tk_div))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(272);
				factor();
				}
				}
				setState(277);
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
		public TerminalNode Tk_num() { return getToken(Bcc_grammarParser.Tk_num, 0); }
		public TerminalNode Tk_bool() { return getToken(Bcc_grammarParser.Tk_bool, 0); }
		public TerminalNode ID() { return getToken(Bcc_grammarParser.ID, 0); }
		public TerminalNode Tk_incremento() { return getToken(Bcc_grammarParser.Tk_incremento, 0); }
		public TerminalNode Tk_decremento() { return getToken(Bcc_grammarParser.Tk_decremento, 0); }
		public TerminalNode Tk_par_izq() { return getToken(Bcc_grammarParser.Tk_par_izq, 0); }
		public List<LexprContext> lexpr() {
			return getRuleContexts(LexprContext.class);
		}
		public LexprContext lexpr(int i) {
			return getRuleContext(LexprContext.class,i);
		}
		public TerminalNode Tk_par_der() { return getToken(Bcc_grammarParser.Tk_par_der, 0); }
		public TerminalNode FID() { return getToken(Bcc_grammarParser.FID, 0); }
		public List<TerminalNode> Tk_coma() { return getTokens(Bcc_grammarParser.Tk_coma); }
		public TerminalNode Tk_coma(int i) {
			return getToken(Bcc_grammarParser.Tk_coma, i);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_grammarListener ) ((Bcc_grammarListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Bcc_grammarListener ) ((Bcc_grammarListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Bcc_grammarVisitor ) return ((Bcc_grammarVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_factor);
		int _la;
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(278);
				match(Tk_num);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(Tk_bool);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(280);
				match(ID);
				setState(281);
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
				setState(282);
				_la = _input.LA(1);
				if ( !(_la==Tk_incremento || _la==Tk_decremento) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(283);
				match(ID);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(284);
				match(ID);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(285);
				match(Tk_par_izq);
				setState(286);
				lexpr();
				setState(287);
				match(Tk_par_der);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(289);
				match(FID);
				setState(290);
				match(Tk_par_izq);
				setState(300);
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
					setState(291);
					lexpr();
					setState(296);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Tk_coma) {
						{
						{
						setState(292);
						match(Tk_coma);
						setState(293);
						lexpr();
						}
						}
						setState(298);
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
				setState(302);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u0134\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\5\3*\n\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4;\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4C\n\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5N\n\5\f\5\16\5Q\13\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\7\6Z\n\6\f\6\16\6]\13\6\3\7\3\7\6\7a\n\7\r\7\16\7b\3\7"+
		"\3\7\3\7\5\7h\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00e7\n\b\3\t\3\t\3\t\7\t\u00ec\n\t\f"+
		"\t\16\t\u00ef\13\t\3\t\3\t\7\t\u00f3\n\t\f\t\16\t\u00f6\13\t\3\t\5\t\u00f9"+
		"\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0101\n\n\3\13\3\13\3\13\3\13\5\13\u0107"+
		"\n\13\3\f\3\f\3\f\7\f\u010c\n\f\f\f\16\f\u010f\13\f\3\r\3\r\3\r\7\r\u0114"+
		"\n\r\f\r\16\r\u0117\13\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0129\n\16\f\16\16\16\u012c\13"+
		"\16\3\16\5\16\u012f\n\16\3\16\5\16\u0132\n\16\3\16\2\2\17\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\2\6\4\2\35\35\60\64\4\2$$((\5\2\36\36\"\"++\4\2"+
		"%%))\2\u0157\2\37\3\2\2\2\4)\3\2\2\2\6\63\3\2\2\2\bF\3\2\2\2\nR\3\2\2"+
		"\2\fg\3\2\2\2\16\u00e6\3\2\2\2\20\u00e8\3\2\2\2\22\u0100\3\2\2\2\24\u0102"+
		"\3\2\2\2\26\u0108\3\2\2\2\30\u0110\3\2\2\2\32\u0131\3\2\2\2\34\36\5\6"+
		"\4\2\35\34\3\2\2\2\36!\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37"+
		"\3\2\2\2\"#\5\4\3\2#\3\3\2\2\2$%\7\26\2\2%&\5\n\6\2&\'\7/\2\2\'*\3\2\2"+
		"\2(*\3\2\2\2)$\3\2\2\2)(\3\2\2\2*.\3\2\2\2+-\5\16\b\2,+\3\2\2\2-\60\3"+
		"\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60.\3\2\2\2\61\62\7\3\2\2\62\5"+
		"\3\2\2\2\63\64\7\27\2\2\64\65\7\34\2\2\65\66\7-\2\2\66\67\7\30\2\2\67"+
		":\7 \2\28;\5\b\5\29;\3\2\2\2:8\3\2\2\2:9\3\2\2\2;<\3\2\2\2<B\7!\2\2=>"+
		"\7\26\2\2>?\5\n\6\2?@\7/\2\2@C\3\2\2\2AC\3\2\2\2B=\3\2\2\2BA\3\2\2\2C"+
		"D\3\2\2\2DE\5\f\7\2E\7\3\2\2\2FG\7\33\2\2GH\7-\2\2HO\7\30\2\2IJ\7\'\2"+
		"\2JK\7\33\2\2KL\7-\2\2LN\7\30\2\2MI\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2"+
		"\2\2P\t\3\2\2\2QO\3\2\2\2RS\7\33\2\2ST\7-\2\2T[\7\30\2\2UV\7\'\2\2VW\7"+
		"\33\2\2WX\7-\2\2XZ\7\30\2\2YU\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\"+
		"\13\3\2\2\2][\3\2\2\2^`\7\65\2\2_a\5\16\b\2`_\3\2\2\2ab\3\2\2\2b`\3\2"+
		"\2\2bc\3\2\2\2cd\3\2\2\2de\7\66\2\2eh\3\2\2\2fh\5\16\b\2g^\3\2\2\2gf\3"+
		"\2\2\2h\r\3\2\2\2ij\7\4\2\2jk\5\20\t\2kl\7/\2\2l\u00e7\3\2\2\2mn\7\5\2"+
		"\2no\7\33\2\2o\u00e7\7/\2\2pq\7\6\2\2qr\7 \2\2rs\5\20\t\2st\7!\2\2tu\7"+
		"\r\2\2uv\5\f\7\2v\u00e7\3\2\2\2wx\7\7\2\2xy\7 \2\2yz\5\20\t\2z{\7!\2\2"+
		"{|\7\r\2\2|}\5\f\7\2}~\7\16\2\2~\177\5\f\7\2\177\u00e7\3\2\2\2\u0080\u0081"+
		"\7\t\2\2\u0081\u0082\7 \2\2\u0082\u0083\5\20\t\2\u0083\u0084\7!\2\2\u0084"+
		"\u0085\7\r\2\2\u0085\u0086\5\f\7\2\u0086\u00e7\3\2\2\2\u0087\u0088\7\n"+
		"\2\2\u0088\u0089\5\20\t\2\u0089\u008a\7/\2\2\u008a\u00e7\3\2\2\2\u008b"+
		"\u008c\7\b\2\2\u008c\u008d\7 \2\2\u008d\u008e\5\20\t\2\u008e\u008f\7!"+
		"\2\2\u008f\u0090\7\r\2\2\u0090\u0091\5\f\7\2\u0091\u00e7\3\2\2\2\u0092"+
		"\u0093\7\13\2\2\u0093\u0094\7 \2\2\u0094\u0095\5\20\t\2\u0095\u0096\7"+
		"!\2\2\u0096\u0097\7\r\2\2\u0097\u0098\5\f\7\2\u0098\u00e7\3\2\2\2\u0099"+
		"\u009a\7\f\2\2\u009a\u00e7\5\f\7\2\u009b\u009c\7\r\2\2\u009c\u009d\5\f"+
		"\7\2\u009d\u009e\7\t\2\2\u009e\u009f\7 \2\2\u009f\u00a0\5\20\t\2\u00a0"+
		"\u00a1\7!\2\2\u00a1\u00e7\3\2\2\2\u00a2\u00a3\7\r\2\2\u00a3\u00a4\5\f"+
		"\7\2\u00a4\u00a5\7\13\2\2\u00a5\u00a6\7 \2\2\u00a6\u00a7\5\20\t\2\u00a7"+
		"\u00a8\7!\2\2\u00a8\u00e7\3\2\2\2\u00a9\u00aa\7\17\2\2\u00aa\u00ab\7\32"+
		"\2\2\u00ab\u00ac\7-\2\2\u00ac\u00e7\5\f\7\2\u00ad\u00ae\7\20\2\2\u00ae"+
		"\u00af\7 \2\2\u00af\u00b0\5\20\t\2\u00b0\u00b1\7/\2\2\u00b1\u00b2\5\20"+
		"\t\2\u00b2\u00b3\7/\2\2\u00b3\u00b4\5\20\t\2\u00b4\u00b5\7!\2\2\u00b5"+
		"\u00b6\7\r\2\2\u00b6\u00b7\5\f\7\2\u00b7\u00e7\3\2\2\2\u00b8\u00b9\7\21"+
		"\2\2\u00b9\u00e7\7/\2\2\u00ba\u00bb\7\22\2\2\u00bb\u00e7\7/\2\2\u00bc"+
		"\u00bd\7\33\2\2\u00bd\u00be\7.\2\2\u00be\u00bf\5\20\t\2\u00bf\u00c0\7"+
		"/\2\2\u00c0\u00e7\3\2\2\2\u00c1\u00c2\7\33\2\2\u00c2\u00c3\7&\2\2\u00c3"+
		"\u00c4\5\20\t\2\u00c4\u00c5\7/\2\2\u00c5\u00e7\3\2\2\2\u00c6\u00c7\7\33"+
		"\2\2\u00c7\u00c8\7*\2\2\u00c8\u00c9\5\20\t\2\u00c9\u00ca\7/\2\2\u00ca"+
		"\u00e7\3\2\2\2\u00cb\u00cc\7\33\2\2\u00cc\u00cd\7#\2\2\u00cd\u00ce\5\20"+
		"\t\2\u00ce\u00cf\7/\2\2\u00cf\u00e7\3\2\2\2\u00d0\u00d1\7\33\2\2\u00d1"+
		"\u00d2\7,\2\2\u00d2\u00d3\5\20\t\2\u00d3\u00d4\7/\2\2\u00d4\u00e7\3\2"+
		"\2\2\u00d5\u00d6\7\33\2\2\u00d6\u00d7\7\37\2\2\u00d7\u00d8\5\20\t\2\u00d8"+
		"\u00d9\7/\2\2\u00d9\u00e7\3\2\2\2\u00da\u00db\7\33\2\2\u00db\u00dc\7%"+
		"\2\2\u00dc\u00e7\7/\2\2\u00dd\u00de\7\33\2\2\u00de\u00df\7)\2\2\u00df"+
		"\u00e7\7/\2\2\u00e0\u00e1\7)\2\2\u00e1\u00e2\7\33\2\2\u00e2\u00e7\7/\2"+
		"\2\u00e3\u00e4\7%\2\2\u00e4\u00e5\7\33\2\2\u00e5\u00e7\7/\2\2\u00e6i\3"+
		"\2\2\2\u00e6m\3\2\2\2\u00e6p\3\2\2\2\u00e6w\3\2\2\2\u00e6\u0080\3\2\2"+
		"\2\u00e6\u0087\3\2\2\2\u00e6\u008b\3\2\2\2\u00e6\u0092\3\2\2\2\u00e6\u0099"+
		"\3\2\2\2\u00e6\u009b\3\2\2\2\u00e6\u00a2\3\2\2\2\u00e6\u00a9\3\2\2\2\u00e6"+
		"\u00ad\3\2\2\2\u00e6\u00b8\3\2\2\2\u00e6\u00ba\3\2\2\2\u00e6\u00bc\3\2"+
		"\2\2\u00e6\u00c1\3\2\2\2\u00e6\u00c6\3\2\2\2\u00e6\u00cb\3\2\2\2\u00e6"+
		"\u00d0\3\2\2\2\u00e6\u00d5\3\2\2\2\u00e6\u00da\3\2\2\2\u00e6\u00dd\3\2"+
		"\2\2\u00e6\u00e0\3\2\2\2\u00e6\u00e3\3\2\2\2\u00e7\17\3\2\2\2\u00e8\u00f8"+
		"\5\22\n\2\u00e9\u00ea\7\24\2\2\u00ea\u00ec\5\22\n\2\u00eb\u00e9\3\2\2"+
		"\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee\3\2\2\2\u00ee\u00f9"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00f1\7\25\2\2\u00f1\u00f3\5\22\n\2"+
		"\u00f2\u00f0\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\u00f9\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f9\3\2\2\2\u00f8"+
		"\u00ed\3\2\2\2\u00f8\u00f4\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\21\3\2\2"+
		"\2\u00fa\u00fb\7\23\2\2\u00fb\u00fc\7 \2\2\u00fc\u00fd\5\20\t\2\u00fd"+
		"\u00fe\7!\2\2\u00fe\u0101\3\2\2\2\u00ff\u0101\5\24\13\2\u0100\u00fa\3"+
		"\2\2\2\u0100\u00ff\3\2\2\2\u0101\23\3\2\2\2\u0102\u0106\5\26\f\2\u0103"+
		"\u0104\t\2\2\2\u0104\u0107\5\26\f\2\u0105\u0107\3\2\2\2\u0106\u0103\3"+
		"\2\2\2\u0106\u0105\3\2\2\2\u0107\25\3\2\2\2\u0108\u010d\5\30\r\2\u0109"+
		"\u010a\t\3\2\2\u010a\u010c\5\30\r\2\u010b\u0109\3\2\2\2\u010c\u010f\3"+
		"\2\2\2\u010d\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e\27\3\2\2\2\u010f"+
		"\u010d\3\2\2\2\u0110\u0115\5\32\16\2\u0111\u0112\t\4\2\2\u0112\u0114\5"+
		"\32\16\2\u0113\u0111\3\2\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115"+
		"\u0116\3\2\2\2\u0116\31\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u0132\7\32\2"+
		"\2\u0119\u0132\7\31\2\2\u011a\u011b\7\33\2\2\u011b\u0132\t\5\2\2\u011c"+
		"\u011d\t\5\2\2\u011d\u0132\7\33\2\2\u011e\u0132\7\33\2\2\u011f\u0120\7"+
		" \2\2\u0120\u0121\5\20\t\2\u0121\u0122\7!\2\2\u0122\u0132\3\2\2\2\u0123"+
		"\u0124\7\34\2\2\u0124\u012e\7 \2\2\u0125\u012a\5\20\t\2\u0126\u0127\7"+
		"\'\2\2\u0127\u0129\5\20\t\2\u0128\u0126\3\2\2\2\u0129\u012c\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012f\3\2\2\2\u012c\u012a\3\2"+
		"\2\2\u012d\u012f\3\2\2\2\u012e\u0125\3\2\2\2\u012e\u012d\3\2\2\2\u012f"+
		"\u0130\3\2\2\2\u0130\u0132\7!\2\2\u0131\u0118\3\2\2\2\u0131\u0119\3\2"+
		"\2\2\u0131\u011a\3\2\2\2\u0131\u011c\3\2\2\2\u0131\u011e\3\2\2\2\u0131"+
		"\u011f\3\2\2\2\u0131\u0123\3\2\2\2\u0132\33\3\2\2\2\26\37).:BO[bg\u00e6"+
		"\u00ed\u00f4\u00f8\u0100\u0106\u010d\u0115\u012a\u012e\u0131";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}