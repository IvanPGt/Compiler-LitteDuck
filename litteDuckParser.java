// Generated from litteDuck.g4 by ANTLR 4.13.1

    import java.util.Stack;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class litteDuckParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, ID=30, CTE_INT=31, CTE_FLOAT=32, 
		CTE_STRING=33, NEWLINE=34, WHITESPACE=35;
	public static final int
		RULE_programa = 0, RULE_vars = 1, RULE_md_vars = 2, RULE_def_vars = 3, 
		RULE_def_vars_ = 4, RULE_list_ids = 5, RULE_list_ids_ = 6, RULE_type = 7, 
		RULE_funcs = 8, RULE_md_funcs_ = 9, RULE_md_funcs = 10, RULE_ids_funcs = 11, 
		RULE_ids_funcs_ = 12, RULE_body = 13, RULE_md_body = 14, RULE_md_body_ = 15, 
		RULE_statement = 16, RULE_assign = 17, RULE_expresion = 18, RULE_md_exp = 19, 
		RULE_expresion_op = 20, RULE_exp = 21, RULE_termino_ = 22, RULE_termino_op = 23, 
		RULE_termino = 24, RULE_factor_ = 25, RULE_factor_op = 26, RULE_factor = 27, 
		RULE_factor_op_ = 28, RULE_factor_cte = 29, RULE_cte = 30, RULE_condition = 31, 
		RULE_condition_else = 32, RULE_cicle = 33, RULE_f_call = 34, RULE_md_f_call = 35, 
		RULE_md_f_call_ = 36, RULE_print = 37, RULE_md_print = 38, RULE_md_print_ = 39;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "vars", "md_vars", "def_vars", "def_vars_", "list_ids", "list_ids_", 
			"type", "funcs", "md_funcs_", "md_funcs", "ids_funcs", "ids_funcs_", 
			"body", "md_body", "md_body_", "statement", "assign", "expresion", "md_exp", 
			"expresion_op", "exp", "termino_", "termino_op", "termino", "factor_", 
			"factor_op", "factor", "factor_op_", "factor_cte", "cte", "condition", 
			"condition_else", "cicle", "f_call", "md_f_call", "md_f_call_", "print", 
			"md_print", "md_print_"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'program'", "';'", "'main'", "'end'", "'var'", "':'", "','", "'int'", 
			"'float'", "'void'", "'('", "')'", "'['", "']'", "'{'", "'}'", "'='", 
			"'>'", "'<'", "'!='", "'+'", "'-'", "'*'", "'/'", "'if'", "'else'", "'do'", 
			"'while'", "'print'", null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "ID", "CTE_INT", "CTE_FLOAT", "CTE_STRING", 
			"NEWLINE", "WHITESPACE"
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
	public String getGrammarFileName() { return "litteDuck.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public litteDuckParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramaContext extends ParserRuleContext {
		public Functions f = new Functions();
		public ArrayList<TVariables> globalVar = new ArrayList<TVariables>();
		public ArrayList<String> dirFunc = new ArrayList<String>();
		public CuboSemantico cuboSemantico = new CuboSemantico();
		public ArrayList<Quad> quads = new ArrayList<Quad>();
		public Stack<String> PilaO = new Stack<>();
		public Stack<String> PilaT = new Stack<>();
		public Stack<String> POper = new Stack<>();
		public Stack<Integer> PJumps = new Stack<>();
		public int avail = 0;
		public int quad_cont = 0;
		public boolean isLocalVar = false;
		public Token ID;
		public TerminalNode ID() { return getToken(litteDuckParser.ID, 0); }
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public FuncsContext funcs() {
			return getRuleContext(FuncsContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(T__0);
			setState(81);
			((ProgramaContext)_localctx).ID = match(ID);
			 ((ProgramaContext)getInvokingContext(0)).dirFunc.add((((ProgramaContext)_localctx).ID!=null?((ProgramaContext)_localctx).ID.getText():null)); 
			        System.out.println("------debug-------");
			         System.out.println("ahi va excepcion");
			        
			        if(!((ProgramaContext)getInvokingContext(0)).POper.empty()){
			            if( "<".equals(((ProgramaContext)getInvokingContext(0)).POper.peek()) ){
			                System.out.println("dentro: NO EXCEPTION");
			            }
			        }
			 
			        System.out.println("NO EXCEPTION");
			        System.out.println("hola");
			        System.out.println("------debug-------");
			    
			    
			setState(83);
			match(T__1);
			setState(84);
			vars();
			setState(85);
			funcs();
			setState(86);
			match(T__2);
			setState(87);
			body();
			setState(88);
			match(T__3);

			        System.out.println("quad_cont: "+((ProgramaContext)getInvokingContext(0)).quad_cont);
			        System.out.println("-------CUADRUPOS-------");
			        System.out.println(((ProgramaContext)getInvokingContext(0)).quads);
			        System.out.println("-------CUADRUPOS_FIN-------");
			    
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarsContext extends ParserRuleContext {
		public Md_varsContext md_vars() {
			return getRuleContext(Md_varsContext.class,0);
		}
		public VarsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterVars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitVars(this);
		}
	}

	public final VarsContext vars() throws RecognitionException {
		VarsContext _localctx = new VarsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_vars);
		try {
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				md_vars();
				}
				break;
			case T__2:
			case T__9:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Md_varsContext extends ParserRuleContext {
		public Def_varsContext def_vars() {
			return getRuleContext(Def_varsContext.class,0);
		}
		public Md_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_md_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterMd_vars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitMd_vars(this);
		}
	}

	public final Md_varsContext md_vars() throws RecognitionException {
		Md_varsContext _localctx = new Md_varsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_md_vars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__4);
			setState(96);
			def_vars();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Def_varsContext extends ParserRuleContext {
		public ArrayList<String> pendigIds = new ArrayList<String>();
		public TypeContext type;
		public List_idsContext list_ids() {
			return getRuleContext(List_idsContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Def_vars_Context def_vars_() {
			return getRuleContext(Def_vars_Context.class,0);
		}
		public Def_varsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_vars; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterDef_vars(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitDef_vars(this);
		}
	}

	public final Def_varsContext def_vars() throws RecognitionException {
		Def_varsContext _localctx = new Def_varsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_def_vars);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			list_ids();
			setState(99);
			match(T__5);
			setState(100);
			((Def_varsContext)_localctx).type = type();

			        for(int i = 0; i < ((Def_varsContext)getInvokingContext(3)).pendigIds.size(); i++){
			            TVariables _variable = new TVariables(((Def_varsContext)getInvokingContext(3)).pendigIds.get(i), (((Def_varsContext)_localctx).type!=null?_input.getText(((Def_varsContext)_localctx).type.start,((Def_varsContext)_localctx).type.stop):null), null);
			            if(((ProgramaContext)getInvokingContext(0)).isLocalVar) {

			                if ( ((FuncsContext)getInvokingContext(8)).localVar.contains(_variable) || ((ProgramaContext)getInvokingContext(0)).globalVar.contains(_variable) ) {
			                    System.err.println("ERROR: Double definition for local variable: "+((Def_varsContext)getInvokingContext(3)).pendigIds.get(i) );
			                } else { 
			                    ((FuncsContext)getInvokingContext(8)).localVar.add(_variable);
			                }

			            } else {

			                if ( ((ProgramaContext)getInvokingContext(0)).globalVar.contains(_variable) ) {
			                    System.err.println("ERROR: Double definition for global variable: "+((Def_varsContext)getInvokingContext(3)).pendigIds.get(i) );
			                } else {
			                    ((ProgramaContext)getInvokingContext(0)).globalVar.add(_variable);
			                }

			            }
			        }
			    
			setState(102);
			match(T__1);
			setState(103);
			def_vars_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Def_vars_Context extends ParserRuleContext {
		public Def_varsContext def_vars() {
			return getRuleContext(Def_varsContext.class,0);
		}
		public Def_vars_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_def_vars_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterDef_vars_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitDef_vars_(this);
		}
	}

	public final Def_vars_Context def_vars_() throws RecognitionException {
		Def_vars_Context _localctx = new Def_vars_Context(_ctx, getState());
		enterRule(_localctx, 8, RULE_def_vars_);
		try {
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				def_vars();
				}
				break;
			case T__2:
			case T__9:
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class List_idsContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(litteDuckParser.ID, 0); }
		public List_ids_Context list_ids_() {
			return getRuleContext(List_ids_Context.class,0);
		}
		public List_idsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_ids; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterList_ids(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitList_ids(this);
		}
	}

	public final List_idsContext list_ids() throws RecognitionException {
		List_idsContext _localctx = new List_idsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_list_ids);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			((List_idsContext)_localctx).ID = match(ID);
			 ((Def_varsContext)getInvokingContext(3)).pendigIds.add((((List_idsContext)_localctx).ID!=null?((List_idsContext)_localctx).ID.getText():null)); 
			setState(111);
			list_ids_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class List_ids_Context extends ParserRuleContext {
		public List_idsContext list_ids() {
			return getRuleContext(List_idsContext.class,0);
		}
		public List_ids_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_ids_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterList_ids_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitList_ids_(this);
		}
	}

	public final List_ids_Context list_ids_() throws RecognitionException {
		List_ids_Context _localctx = new List_ids_Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_list_ids_);
		try {
			setState(116);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(T__6);
				setState(114);
				list_ids();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitType(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !(_la==T__7 || _la==T__8) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FuncsContext extends ParserRuleContext {
		public ArrayList<TVariables> localVar = new ArrayList<TVariables>();
		public Md_funcsContext md_funcs() {
			return getRuleContext(Md_funcsContext.class,0);
		}
		public Md_funcs_Context md_funcs_() {
			return getRuleContext(Md_funcs_Context.class,0);
		}
		public FuncsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterFuncs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitFuncs(this);
		}
	}

	public final FuncsContext funcs() throws RecognitionException {
		FuncsContext _localctx = new FuncsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcs);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				((ProgramaContext)getInvokingContext(0)).isLocalVar =  true;
				setState(121);
				md_funcs();
				setState(122);
				md_funcs_();
				((ProgramaContext)getInvokingContext(0)).isLocalVar =  false;
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Md_funcs_Context extends ParserRuleContext {
		public FuncsContext funcs() {
			return getRuleContext(FuncsContext.class,0);
		}
		public Md_funcs_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_md_funcs_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterMd_funcs_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitMd_funcs_(this);
		}
	}

	public final Md_funcs_Context md_funcs_() throws RecognitionException {
		Md_funcs_Context _localctx = new Md_funcs_Context(_ctx, getState());
		enterRule(_localctx, 18, RULE_md_funcs_);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				funcs();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Md_funcsContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(litteDuckParser.ID, 0); }
		public Ids_funcsContext ids_funcs() {
			return getRuleContext(Ids_funcsContext.class,0);
		}
		public VarsContext vars() {
			return getRuleContext(VarsContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Md_funcsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_md_funcs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterMd_funcs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitMd_funcs(this);
		}
	}

	public final Md_funcsContext md_funcs() throws RecognitionException {
		Md_funcsContext _localctx = new Md_funcsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_md_funcs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__9);
			setState(133);
			((Md_funcsContext)_localctx).ID = match(ID);


			        if ( ((ProgramaContext)getInvokingContext(0)).dirFunc.contains((((Md_funcsContext)_localctx).ID!=null?((Md_funcsContext)_localctx).ID.getText():null)) ) {
			            System.err.println("ERROR: Double definition for function: "+(((Md_funcsContext)_localctx).ID!=null?((Md_funcsContext)_localctx).ID.getText():null) );
			        } else {
			            ((ProgramaContext)getInvokingContext(0)).dirFunc.add((((Md_funcsContext)_localctx).ID!=null?((Md_funcsContext)_localctx).ID.getText():null));
			        }

			        
			setState(135);
			match(T__10);
			setState(136);
			ids_funcs();
			setState(137);
			match(T__11);
			setState(138);
			match(T__12);
			setState(139);
			vars();
			setState(140);
			body();
			setState(141);
			match(T__13);
			setState(142);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ids_funcsContext extends ParserRuleContext {
		public Token ID;
		public TypeContext type;
		public TerminalNode ID() { return getToken(litteDuckParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public Ids_funcs_Context ids_funcs_() {
			return getRuleContext(Ids_funcs_Context.class,0);
		}
		public Ids_funcsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids_funcs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterIds_funcs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitIds_funcs(this);
		}
	}

	public final Ids_funcsContext ids_funcs() throws RecognitionException {
		Ids_funcsContext _localctx = new Ids_funcsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ids_funcs);
		try {
			setState(151);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(144);
				((Ids_funcsContext)_localctx).ID = match(ID);
				setState(145);
				match(T__5);
				setState(146);
				((Ids_funcsContext)_localctx).type = type();

				        TVariables _variable = new TVariables((((Ids_funcsContext)_localctx).ID!=null?((Ids_funcsContext)_localctx).ID.getText():null), (((Ids_funcsContext)_localctx).type!=null?_input.getText(((Ids_funcsContext)_localctx).type.start,((Ids_funcsContext)_localctx).type.stop):null), null);

				        if ( ((FuncsContext)getInvokingContext(8)).localVar.contains(_variable) || ((ProgramaContext)getInvokingContext(0)).globalVar.contains(_variable) ) {
				            System.err.println("ERROR: Double definition for local variable parameter: "+(((Ids_funcsContext)_localctx).ID!=null?((Ids_funcsContext)_localctx).ID.getText():null) );
				        } else {
				            ((FuncsContext)getInvokingContext(8)).localVar.add(_variable);
				        }

				        
				setState(148);
				ids_funcs_();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Ids_funcs_Context extends ParserRuleContext {
		public Ids_funcsContext ids_funcs() {
			return getRuleContext(Ids_funcsContext.class,0);
		}
		public Ids_funcs_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ids_funcs_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterIds_funcs_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitIds_funcs_(this);
		}
	}

	public final Ids_funcs_Context ids_funcs_() throws RecognitionException {
		Ids_funcs_Context _localctx = new Ids_funcs_Context(_ctx, getState());
		enterRule(_localctx, 24, RULE_ids_funcs_);
		try {
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				match(T__6);
				setState(154);
				ids_funcs();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class BodyContext extends ParserRuleContext {
		public Md_bodyContext md_body() {
			return getRuleContext(Md_bodyContext.class,0);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(T__14);
			setState(159);
			md_body();
			setState(160);
			match(T__15);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Md_bodyContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Md_body_Context md_body_() {
			return getRuleContext(Md_body_Context.class,0);
		}
		public Md_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_md_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterMd_body(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitMd_body(this);
		}
	}

	public final Md_bodyContext md_body() throws RecognitionException {
		Md_bodyContext _localctx = new Md_bodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_md_body);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
			case T__26:
			case T__28:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				statement();
				setState(163);
				md_body_();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Md_body_Context extends ParserRuleContext {
		public Md_bodyContext md_body() {
			return getRuleContext(Md_bodyContext.class,0);
		}
		public Md_body_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_md_body_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterMd_body_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitMd_body_(this);
		}
	}

	public final Md_body_Context md_body_() throws RecognitionException {
		Md_body_Context _localctx = new Md_body_Context(_ctx, getState());
		enterRule(_localctx, 30, RULE_md_body_);
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				md_body();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public CicleContext cicle() {
			return getRuleContext(CicleContext.class,0);
		}
		public F_callContext f_call() {
			return getRuleContext(F_callContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_statement);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				assign();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				condition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(174);
				cicle();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(175);
				f_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(176);
				print();
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public String tipo_id;
		public Token ID;
		public TerminalNode ID() { return getToken(litteDuckParser.ID, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			((AssignContext)_localctx).ID = match(ID);


			        TVariables _variable = new TVariables((((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null), null, null);
			        if(((ProgramaContext)getInvokingContext(0)).isLocalVar) {
			            if ( !((ProgramaContext)getInvokingContext(0)).globalVar.contains(_variable) && !((FuncsContext)getInvokingContext(8)).localVar.contains(_variable) ) {
			                System.err.println("ERROR: Local Variable "+(((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null)+" not exist" );
			            } else { ((AssignContext)getInvokingContext(17)).tipo_id =  ((ProgramaContext)getInvokingContext(0)).f.findTipoById(((FuncsContext)getInvokingContext(8)).localVar, (((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null)); }
			            
			        } else {
			            if ( !((ProgramaContext)getInvokingContext(0)).globalVar.contains(_variable) ) {
			                System.err.println("ERROR: Global variable "+(((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null)+" not exist" );
			            } else { ((AssignContext)getInvokingContext(17)).tipo_id =  ((ProgramaContext)getInvokingContext(0)).f.findTipoById(((ProgramaContext)getInvokingContext(0)).globalVar, (((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null)); }
			        }

			        
			setState(181);
			match(T__16);
			setState(182);
			expresion();
			setState(183);
			match(T__1);


			            if( ((ProgramaContext)getInvokingContext(0)).cuboSemantico.checkError(7, ((ProgramaContext)getInvokingContext(0)).cuboSemantico.getTipoId(((AssignContext)getInvokingContext(17)).tipo_id), ((ProgramaContext)getInvokingContext(0)).cuboSemantico.getTipoId(((ProgramaContext)getInvokingContext(0)).PilaT.peek())) != 4 ) {
			                Quad _quad = new Quad("=", ((ProgramaContext)getInvokingContext(0)).PilaO.pop(), null, (((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null));
			                ((ProgramaContext)getInvokingContext(0)).quads.add(_quad);
			                ((ProgramaContext)getInvokingContext(0)).quad_cont++;
			                System.out.println(_quad);
			            } else {
			                System.err.println("ERROR: Assign Type mismatch: " + (((AssignContext)_localctx).ID!=null?((AssignContext)_localctx).ID.getText():null) + ":" + ((AssignContext)getInvokingContext(17)).tipo_id + " & " + ((ProgramaContext)getInvokingContext(0)).PilaO.peek() + ":" + ((ProgramaContext)getInvokingContext(0)).PilaT.peek());
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Md_expContext md_exp() {
			return getRuleContext(Md_expContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_expresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			exp();
			setState(187);
			md_exp();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Md_expContext extends ParserRuleContext {
		public Expresion_opContext expresion_op;
		public Expresion_opContext expresion_op() {
			return getRuleContext(Expresion_opContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Md_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_md_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterMd_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitMd_exp(this);
		}
	}

	public final Md_expContext md_exp() throws RecognitionException {
		Md_expContext _localctx = new Md_expContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_md_exp);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__17:
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				((Md_expContext)_localctx).expresion_op = expresion_op();
				 ((ProgramaContext)getInvokingContext(0)).POper.push((((Md_expContext)_localctx).expresion_op!=null?_input.getText(((Md_expContext)_localctx).expresion_op.start,((Md_expContext)_localctx).expresion_op.stop):null)); 
				setState(191);
				exp();

				        if(!((ProgramaContext)getInvokingContext(0)).POper.empty()){
				            if("<".equals(((ProgramaContext)getInvokingContext(0)).POper.peek()) || ">".equals(((ProgramaContext)getInvokingContext(0)).POper.peek()) || "!=".equals(((ProgramaContext)getInvokingContext(0)).POper.peek())) {
				                String s_L_O = ((ProgramaContext)getInvokingContext(0)).PilaO.pop();
				                String s_L_O_T = ((ProgramaContext)getInvokingContext(0)).PilaT.pop();

				                String s_R_O = ((ProgramaContext)getInvokingContext(0)).PilaO.pop();
				                String s_R_O_T = ((ProgramaContext)getInvokingContext(0)).PilaT.pop();

				                String s_oper = ((ProgramaContext)getInvokingContext(0)).POper.pop();

				                int oper = ((ProgramaContext)getInvokingContext(0)).cuboSemantico.getOperId(s_oper);
				                int L_O_T = ((ProgramaContext)getInvokingContext(0)).cuboSemantico.getTipoId(s_L_O_T);
				                int R_O_T = ((ProgramaContext)getInvokingContext(0)).cuboSemantico.getTipoId(s_R_O_T);
				            

				                String res_type = ((ProgramaContext)getInvokingContext(0)).cuboSemantico.getTipo(oper, L_O_T, R_O_T);

				                if( ((ProgramaContext)getInvokingContext(0)).cuboSemantico.checkError(oper, L_O_T, R_O_T) != 4 ) {
				                    String _tvar_id = "t" + ((ProgramaContext)getInvokingContext(0)).avail;
				                    ((ProgramaContext)getInvokingContext(0)).avail++;
				                    TVariables _tvar = new TVariables(_tvar_id, res_type, null);
				                    ((ProgramaContext)getInvokingContext(0)).globalVar.add(_tvar);
				                    ((ProgramaContext)getInvokingContext(0)).PilaO.push(_tvar_id);
				                    ((ProgramaContext)getInvokingContext(0)).PilaT.push(res_type);
				                    Quad _quad = new Quad(s_oper, s_L_O, s_R_O, _tvar_id);
				                    ((ProgramaContext)getInvokingContext(0)).quads.add(_quad);
				                    ((ProgramaContext)getInvokingContext(0)).quad_cont++;
				                    System.out.println(_quad);

				                } else {
				                    System.err.println("ERROR: Type mismatch: " + s_L_O + ":" + s_L_O_T + " & " + s_R_O + ":" + s_R_O_T);
				                }
				            }
				        }
				     
				}
				break;
			case T__1:
			case T__6:
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Expresion_opContext extends ParserRuleContext {
		public Expresion_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterExpresion_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitExpresion_op(this);
		}
	}

	public final Expresion_opContext expresion_op() throws RecognitionException {
		Expresion_opContext _localctx = new Expresion_opContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expresion_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1835008L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpContext extends ParserRuleContext {
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public Termino_Context termino_() {
			return getRuleContext(Termino_Context.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitExp(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			termino();
			 
			        if(!((ProgramaContext)getInvokingContext(0)).POper.empty()){
			            if("+".equals(((ProgramaContext)getInvokingContext(0)).POper.peek()) || "-".equals(((ProgramaContext)getInvokingContext(0)).POper.peek()) ) {
			                String s_L_O = ((ProgramaContext)getInvokingContext(0)).PilaO.pop();
			                String s_L_O_T = ((ProgramaContext)getInvokingContext(0)).PilaT.pop();

			                String s_R_O = ((ProgramaContext)getInvokingContext(0)).PilaO.pop();
			                String s_R_O_T = ((ProgramaContext)getInvokingContext(0)).PilaT.pop();

			                String s_oper = ((ProgramaContext)getInvokingContext(0)).POper.pop();

			                int oper = ((ProgramaContext)getInvokingContext(0)).cuboSemantico.getOperId(s_oper);
			                int L_O_T = ((ProgramaContext)getInvokingContext(0)).cuboSemantico.getTipoId(s_L_O_T);
			                int R_O_T = ((ProgramaContext)getInvokingContext(0)).cuboSemantico.getTipoId(s_R_O_T);
			            

			                String res_type = ((ProgramaContext)getInvokingContext(0)).cuboSemantico.getTipo(oper, L_O_T, R_O_T);

			                if( ((ProgramaContext)getInvokingContext(0)).cuboSemantico.checkError(oper, L_O_T, R_O_T) != 4 ) {
			                    String _tvar_id = "t" + ((ProgramaContext)getInvokingContext(0)).avail;
			                    ((ProgramaContext)getInvokingContext(0)).avail++;
			                    TVariables _tvar = new TVariables(_tvar_id, res_type, null);
			                    ((ProgramaContext)getInvokingContext(0)).globalVar.add(_tvar);
			                    ((ProgramaContext)getInvokingContext(0)).PilaO.push(_tvar_id);
			                    ((ProgramaContext)getInvokingContext(0)).PilaT.push(res_type);
			                    Quad _quad = new Quad(s_oper, s_L_O, s_R_O, _tvar_id);
			                    ((ProgramaContext)getInvokingContext(0)).quads.add(_quad);
			                    ((ProgramaContext)getInvokingContext(0)).quad_cont++;
			                    System.out.println(_quad);

			                } else {
			                    System.err.println("ERROR: Type mismatch: " + s_L_O + ":" + s_L_O_T + " & " + s_R_O + ":" + s_R_O_T);
			                }
			            }
			        }
			    
			setState(201);
			termino_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Termino_Context extends ParserRuleContext {
		public Termino_opContext termino_op;
		public Termino_opContext termino_op() {
			return getRuleContext(Termino_opContext.class,0);
		}
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public Termino_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterTermino_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitTermino_(this);
		}
	}

	public final Termino_Context termino_() throws RecognitionException {
		Termino_Context _localctx = new Termino_Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_termino_);
		try {
			setState(208);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				((Termino_Context)_localctx).termino_op = termino_op();
				 ((ProgramaContext)getInvokingContext(0)).POper.push((((Termino_Context)_localctx).termino_op!=null?_input.getText(((Termino_Context)_localctx).termino_op.start,((Termino_Context)_localctx).termino_op.stop):null)); 
				setState(205);
				exp();
				}
				break;
			case T__1:
			case T__6:
			case T__11:
			case T__17:
			case T__18:
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Termino_opContext extends ParserRuleContext {
		public Termino_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterTermino_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitTermino_op(this);
		}
	}

	public final Termino_opContext termino_op() throws RecognitionException {
		Termino_opContext _localctx = new Termino_opContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_termino_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__21) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TerminoContext extends ParserRuleContext {
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public Factor_Context factor_() {
			return getRuleContext(Factor_Context.class,0);
		}
		public TerminoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termino; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterTermino(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitTermino(this);
		}
	}

	public final TerminoContext termino() throws RecognitionException {
		TerminoContext _localctx = new TerminoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_termino);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			factor();
			 
			        if(!((ProgramaContext)getInvokingContext(0)).POper.empty()){
			            if("*".equals(((ProgramaContext)getInvokingContext(0)).POper.peek()) || "/".equals(((ProgramaContext)getInvokingContext(0)).POper.peek()) ) {
			                String s_L_O = ((ProgramaContext)getInvokingContext(0)).PilaO.pop();
			                String s_L_O_T = ((ProgramaContext)getInvokingContext(0)).PilaT.pop();

			                String s_R_O = ((ProgramaContext)getInvokingContext(0)).PilaO.pop();
			                String s_R_O_T = ((ProgramaContext)getInvokingContext(0)).PilaT.pop();

			                String s_oper = ((ProgramaContext)getInvokingContext(0)).POper.pop();

			                int oper = ((ProgramaContext)getInvokingContext(0)).cuboSemantico.getOperId(s_oper);
			                int L_O_T = ((ProgramaContext)getInvokingContext(0)).cuboSemantico.getTipoId(s_L_O_T);
			                int R_O_T = ((ProgramaContext)getInvokingContext(0)).cuboSemantico.getTipoId(s_R_O_T);
			            

			                String res_type = ((ProgramaContext)getInvokingContext(0)).cuboSemantico.getTipo(oper, L_O_T, R_O_T);

			                if( ((ProgramaContext)getInvokingContext(0)).cuboSemantico.checkError(oper, L_O_T, R_O_T) != 4 ) {
			                    String _tvar_id = "t" + ((ProgramaContext)getInvokingContext(0)).avail;
			                    ((ProgramaContext)getInvokingContext(0)).avail++;
			                    TVariables _tvar = new TVariables(_tvar_id, res_type, null);
			                    ((ProgramaContext)getInvokingContext(0)).globalVar.add(_tvar);
			                    ((ProgramaContext)getInvokingContext(0)).PilaO.push(_tvar_id);
			                    ((ProgramaContext)getInvokingContext(0)).PilaT.push(res_type);
			                    Quad _quad = new Quad(s_oper, s_L_O, s_R_O, _tvar_id);
			                    ((ProgramaContext)getInvokingContext(0)).quads.add(_quad);
			                    ((ProgramaContext)getInvokingContext(0)).quad_cont++;
			                    System.out.println(_quad);
			 

			                } else {
			                    System.err.println("ERROR: Type mismatch: " + s_L_O + ":" + s_L_O_T + " & " + s_R_O + ":" + s_R_O_T);
			                }
			            }
			        }
			    
			    
			setState(214);
			factor_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Factor_Context extends ParserRuleContext {
		public Factor_opContext factor_op;
		public Factor_opContext factor_op() {
			return getRuleContext(Factor_opContext.class,0);
		}
		public TerminoContext termino() {
			return getRuleContext(TerminoContext.class,0);
		}
		public Factor_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterFactor_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitFactor_(this);
		}
	}

	public final Factor_Context factor_() throws RecognitionException {
		Factor_Context _localctx = new Factor_Context(_ctx, getState());
		enterRule(_localctx, 50, RULE_factor_);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				((Factor_Context)_localctx).factor_op = factor_op();
				 ((ProgramaContext)getInvokingContext(0)).POper.push((((Factor_Context)_localctx).factor_op!=null?_input.getText(((Factor_Context)_localctx).factor_op.start,((Factor_Context)_localctx).factor_op.stop):null)); 
				setState(218);
				termino();
				}
				break;
			case T__1:
			case T__6:
			case T__11:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Factor_opContext extends ParserRuleContext {
		public Factor_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterFactor_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitFactor_op(this);
		}
	}

	public final Factor_opContext factor_op() throws RecognitionException {
		Factor_opContext _localctx = new Factor_opContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_factor_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if ( !(_la==T__22 || _la==T__23) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public Factor_op_Context factor_op_;
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Factor_op_Context factor_op_() {
			return getRuleContext(Factor_op_Context.class,0);
		}
		public Factor_cteContext factor_cte() {
			return getRuleContext(Factor_cteContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitFactor(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_factor);
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(225);
				match(T__10);
				 ((ProgramaContext)getInvokingContext(0)).POper.push("#"); 
				setState(227);
				expresion();
				setState(228);
				match(T__11);
				 ((ProgramaContext)getInvokingContext(0)).POper.pop(); 
				}
				break;
			case T__20:
			case T__21:
			case ID:
			case CTE_INT:
			case CTE_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				((FactorContext)_localctx).factor_op_ = factor_op_();
				setState(232);
				factor_cte();

				        if ("-".equals((((FactorContext)_localctx).factor_op_!=null?_input.getText(((FactorContext)_localctx).factor_op_.start,((FactorContext)_localctx).factor_op_.stop):null))) {
				            String s_L_O = ((ProgramaContext)getInvokingContext(0)).PilaO.pop();
				            String s_L_O_T = ((ProgramaContext)getInvokingContext(0)).PilaT.pop();

				            
				            String _tvar_id = "t" + ((ProgramaContext)getInvokingContext(0)).avail;
				            ((ProgramaContext)getInvokingContext(0)).avail++;
				            TVariables _tvar = new TVariables(_tvar_id, s_L_O_T, null);
				            ((ProgramaContext)getInvokingContext(0)).globalVar.add(_tvar);
				            ((ProgramaContext)getInvokingContext(0)).PilaO.push(_tvar_id);
				            ((ProgramaContext)getInvokingContext(0)).PilaT.push(s_L_O_T);
				            Quad _quad = new Quad("*", s_L_O, "-1", _tvar_id);
				            ((ProgramaContext)getInvokingContext(0)).quads.add(_quad);
				            ((ProgramaContext)getInvokingContext(0)).quad_cont++;
				            System.out.println(_quad);

				        }
				    
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

	@SuppressWarnings("CheckReturnValue")
	public static class Factor_op_Context extends ParserRuleContext {
		public Termino_opContext termino_op() {
			return getRuleContext(Termino_opContext.class,0);
		}
		public Factor_op_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_op_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterFactor_op_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitFactor_op_(this);
		}
	}

	public final Factor_op_Context factor_op_() throws RecognitionException {
		Factor_op_Context _localctx = new Factor_op_Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_factor_op_);
		try {
			setState(239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__20:
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				termino_op();
				}
				break;
			case ID:
			case CTE_INT:
			case CTE_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Factor_cteContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(litteDuckParser.ID, 0); }
		public CteContext cte() {
			return getRuleContext(CteContext.class,0);
		}
		public Factor_cteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor_cte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterFactor_cte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitFactor_cte(this);
		}
	}

	public final Factor_cteContext factor_cte() throws RecognitionException {
		Factor_cteContext _localctx = new Factor_cteContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_factor_cte);
		try {
			setState(244);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				((Factor_cteContext)_localctx).ID = match(ID);

				  
				        TVariables _variable = new TVariables((((Factor_cteContext)_localctx).ID!=null?((Factor_cteContext)_localctx).ID.getText():null), null, null);
				        if(((ProgramaContext)getInvokingContext(0)).isLocalVar) {
				            if ( !((ProgramaContext)getInvokingContext(0)).globalVar.contains(_variable) && !((FuncsContext)getInvokingContext(8)).localVar.contains(_variable) ) {

				                System.err.println("ERROR: Local Variable "+(((Factor_cteContext)_localctx).ID!=null?((Factor_cteContext)_localctx).ID.getText():null)+" not exist" );
				            } else { 
				    
				                ((ProgramaContext)getInvokingContext(0)).PilaO.push((((Factor_cteContext)_localctx).ID!=null?((Factor_cteContext)_localctx).ID.getText():null)); 
				                ((ProgramaContext)getInvokingContext(0)).PilaT.push(((ProgramaContext)getInvokingContext(0)).f.findTipoById(((FuncsContext)getInvokingContext(8)).localVar, (((Factor_cteContext)_localctx).ID!=null?((Factor_cteContext)_localctx).ID.getText():null))); 
				      
				            }
				        } else {
				            if ( !((ProgramaContext)getInvokingContext(0)).globalVar.contains(_variable) ) {

				                System.err.println("ERROR: Global variable "+(((Factor_cteContext)_localctx).ID!=null?((Factor_cteContext)_localctx).ID.getText():null)+" not exist" );
				            } else { 
				          
				                ((ProgramaContext)getInvokingContext(0)).PilaO.push((((Factor_cteContext)_localctx).ID!=null?((Factor_cteContext)_localctx).ID.getText():null)); 
				                ((ProgramaContext)getInvokingContext(0)).PilaT.push(((ProgramaContext)getInvokingContext(0)).f.findTipoById(((ProgramaContext)getInvokingContext(0)).globalVar, (((Factor_cteContext)_localctx).ID!=null?((Factor_cteContext)_localctx).ID.getText():null))); 

				            }
				        }
				    
				}
				break;
			case CTE_INT:
			case CTE_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				cte();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CteContext extends ParserRuleContext {
		public Token CTE_INT;
		public Token CTE_FLOAT;
		public TerminalNode CTE_INT() { return getToken(litteDuckParser.CTE_INT, 0); }
		public TerminalNode CTE_FLOAT() { return getToken(litteDuckParser.CTE_FLOAT, 0); }
		public CteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cte; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterCte(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitCte(this);
		}
	}

	public final CteContext cte() throws RecognitionException {
		CteContext _localctx = new CteContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_cte);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CTE_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				((CteContext)_localctx).CTE_INT = match(CTE_INT);
				 ((ProgramaContext)getInvokingContext(0)).PilaO.push((((CteContext)_localctx).CTE_INT!=null?((CteContext)_localctx).CTE_INT.getText():null)); ((ProgramaContext)getInvokingContext(0)).PilaT.push("int"); 
				}
				break;
			case CTE_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				((CteContext)_localctx).CTE_FLOAT = match(CTE_FLOAT);
				 ((ProgramaContext)getInvokingContext(0)).PilaO.push((((CteContext)_localctx).CTE_FLOAT!=null?((CteContext)_localctx).CTE_FLOAT.getText():null)); ((ProgramaContext)getInvokingContext(0)).PilaT.push("float"); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public String exp_type;
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Condition_elseContext condition_else() {
			return getRuleContext(Condition_elseContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__24);
			setState(253);
			match(T__10);
			setState(254);
			expresion();
			setState(255);
			match(T__11);
			 
			        ((ConditionContext)getInvokingContext(31)).exp_type =  ((ProgramaContext)getInvokingContext(0)).PilaT.pop();
			        if ( !"bool".equals(((ConditionContext)getInvokingContext(31)).exp_type) ) {
			            System.err.println("ERROR: Type mismatch: if exprestion is not type bool: type: "+((ConditionContext)getInvokingContext(31)).exp_type);
			        } else {
			            Quad _quad = new Quad("GotoF", ((ProgramaContext)getInvokingContext(0)).PilaO.pop(), null, null);
			            ((ProgramaContext)getInvokingContext(0)).quads.add(_quad);
			            ((ProgramaContext)getInvokingContext(0)).quad_cont++;
			            System.out.println(_quad);
			            ((ProgramaContext)getInvokingContext(0)).PJumps.push(((ProgramaContext)getInvokingContext(0)).quad_cont-1);
			        }
			    
			setState(257);
			body();
			setState(258);
			condition_else();
			setState(259);
			match(T__1);

			        if ( "bool".equals(((ConditionContext)getInvokingContext(31)).exp_type) ) {
			            System.out.println("ENTRE FINAL");
			            ((ProgramaContext)getInvokingContext(0)).quads.get(((ProgramaContext)getInvokingContext(0)).PJumps.pop()).setRes(((ProgramaContext)getInvokingContext(0)).quad_cont);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Condition_elseContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public Condition_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterCondition_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitCondition_else(this);
		}
	}

	public final Condition_elseContext condition_else() throws RecognitionException {
		Condition_elseContext _localctx = new Condition_elseContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_condition_else);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				match(T__25);

				        if ( "bool".equals(((ConditionContext)getInvokingContext(31)).exp_type) ) {

				            System.out.println("ENTRE ELSE");
				            Quad _quad = new Quad("Goto", null, null, null);
				            ((ProgramaContext)getInvokingContext(0)).quads.add(_quad);
				            ((ProgramaContext)getInvokingContext(0)).quad_cont++;
				            System.out.println(_quad);
				            ((ProgramaContext)getInvokingContext(0)).quads.get(((ProgramaContext)getInvokingContext(0)).PJumps.pop()).setRes(((ProgramaContext)getInvokingContext(0)).quad_cont);
				            ((ProgramaContext)getInvokingContext(0)).PJumps.push(((ProgramaContext)getInvokingContext(0)).quad_cont-1);
				        }
				    
				setState(264);
				body();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class CicleContext extends ParserRuleContext {
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public CicleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cicle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterCicle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitCicle(this);
		}
	}

	public final CicleContext cicle() throws RecognitionException {
		CicleContext _localctx = new CicleContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_cicle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__26);
			 
			        ((ProgramaContext)getInvokingContext(0)).PJumps.push(((ProgramaContext)getInvokingContext(0)).quad_cont);
			        
			setState(270);
			body();
			setState(271);
			match(T__27);
			setState(272);
			match(T__10);
			setState(273);
			expresion();
			setState(274);
			match(T__11);

			            String exp_type = ((ProgramaContext)getInvokingContext(0)).PilaT.pop();
			            if ( !"bool".equals(exp_type) ) {
			                System.err.println("ERROR: Type mismatch: while exprestion is not type bool: type: "+exp_type);
			            } else {
			                Quad _quad = new Quad("GotoV", ((ProgramaContext)getInvokingContext(0)).PilaO.pop(), null, ((ProgramaContext)getInvokingContext(0)).PJumps.pop());
			                ((ProgramaContext)getInvokingContext(0)).quads.add(_quad);
			                ((ProgramaContext)getInvokingContext(0)).quad_cont++;
			                System.out.println(_quad);
			            }
			        
			setState(276);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class F_callContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(litteDuckParser.ID, 0); }
		public Md_f_callContext md_f_call() {
			return getRuleContext(Md_f_callContext.class,0);
		}
		public F_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_f_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterF_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitF_call(this);
		}
	}

	public final F_callContext f_call() throws RecognitionException {
		F_callContext _localctx = new F_callContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_f_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			((F_callContext)_localctx).ID = match(ID);

			        if ( !((ProgramaContext)getInvokingContext(0)).dirFunc.contains((((F_callContext)_localctx).ID!=null?((F_callContext)_localctx).ID.getText():null)) ) {
			            System.err.println("ERROR: Function "+(((F_callContext)_localctx).ID!=null?((F_callContext)_localctx).ID.getText():null)+" not exist" );
			        }
			        
			setState(280);
			match(T__10);
			setState(281);
			md_f_call();
			setState(282);
			match(T__11);
			setState(283);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Md_f_callContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Md_f_call_Context md_f_call_() {
			return getRuleContext(Md_f_call_Context.class,0);
		}
		public Md_f_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_md_f_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterMd_f_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitMd_f_call(this);
		}
	}

	public final Md_f_callContext md_f_call() throws RecognitionException {
		Md_f_callContext _localctx = new Md_f_callContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_md_f_call);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
			case T__20:
			case T__21:
			case ID:
			case CTE_INT:
			case CTE_FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				expresion();
				setState(286);
				md_f_call_();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class Md_f_call_Context extends ParserRuleContext {
		public Md_f_callContext md_f_call() {
			return getRuleContext(Md_f_callContext.class,0);
		}
		public Md_f_call_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_md_f_call_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterMd_f_call_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitMd_f_call_(this);
		}
	}

	public final Md_f_call_Context md_f_call_() throws RecognitionException {
		Md_f_call_Context _localctx = new Md_f_call_Context(_ctx, getState());
		enterRule(_localctx, 72, RULE_md_f_call_);
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(291);
				match(T__6);
				setState(292);
				md_f_call();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public Md_printContext md_print() {
			return getRuleContext(Md_printContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(T__28);
			setState(297);
			match(T__10);
			setState(298);
			md_print();
			setState(299);
			match(T__11);
			setState(300);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Md_printContext extends ParserRuleContext {
		public TerminalNode CTE_STRING() { return getToken(litteDuckParser.CTE_STRING, 0); }
		public Md_print_Context md_print_() {
			return getRuleContext(Md_print_Context.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Md_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_md_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterMd_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitMd_print(this);
		}
	}

	public final Md_printContext md_print() throws RecognitionException {
		Md_printContext _localctx = new Md_printContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_md_print);
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CTE_STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(CTE_STRING);
				setState(303);
				md_print_();
				}
				break;
			case T__10:
			case T__20:
			case T__21:
			case ID:
			case CTE_INT:
			case CTE_FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				expresion();
				setState(305);
				md_print_();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Md_print_Context extends ParserRuleContext {
		public Md_printContext md_print() {
			return getRuleContext(Md_printContext.class,0);
		}
		public Md_print_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_md_print_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).enterMd_print_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof litteDuckListener ) ((litteDuckListener)listener).exitMd_print_(this);
		}
	}

	public final Md_print_Context md_print_() throws RecognitionException {
		Md_print_Context _localctx = new Md_print_Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_md_print_);
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				match(T__6);
				setState(310);
				md_print();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
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

	public static final String _serializedATN =
		"\u0004\u0001#\u013b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0003\u0001^\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0003\u0004l\b\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006u\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u007f\b\b\u0001\t\u0001\t\u0003\t\u0083\b\t"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0098\b\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0003\f\u009d\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00a7\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0003\u000f\u00ab\b\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00b2\b\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00c4\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u00d1\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019\u00de"+
		"\b\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0003\u001b\u00ec\b\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u00f0"+
		"\b\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u00f5\b\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u00fb\b\u001e"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 "+
		"\u0001 \u0003 \u010b\b \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0003#\u0122\b#\u0001$\u0001$\u0001"+
		"$\u0003$\u0127\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001&\u0001"+
		"&\u0001&\u0001&\u0001&\u0003&\u0134\b&\u0001\'\u0001\'\u0001\'\u0003\'"+
		"\u0139\b\'\u0001\'\u0000\u0000(\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLN\u0000"+
		"\u0004\u0001\u0000\b\t\u0001\u0000\u0012\u0014\u0001\u0000\u0015\u0016"+
		"\u0001\u0000\u0017\u0018\u012b\u0000P\u0001\u0000\u0000\u0000\u0002]\u0001"+
		"\u0000\u0000\u0000\u0004_\u0001\u0000\u0000\u0000\u0006b\u0001\u0000\u0000"+
		"\u0000\bk\u0001\u0000\u0000\u0000\nm\u0001\u0000\u0000\u0000\ft\u0001"+
		"\u0000\u0000\u0000\u000ev\u0001\u0000\u0000\u0000\u0010~\u0001\u0000\u0000"+
		"\u0000\u0012\u0082\u0001\u0000\u0000\u0000\u0014\u0084\u0001\u0000\u0000"+
		"\u0000\u0016\u0097\u0001\u0000\u0000\u0000\u0018\u009c\u0001\u0000\u0000"+
		"\u0000\u001a\u009e\u0001\u0000\u0000\u0000\u001c\u00a6\u0001\u0000\u0000"+
		"\u0000\u001e\u00aa\u0001\u0000\u0000\u0000 \u00b1\u0001\u0000\u0000\u0000"+
		"\"\u00b3\u0001\u0000\u0000\u0000$\u00ba\u0001\u0000\u0000\u0000&\u00c3"+
		"\u0001\u0000\u0000\u0000(\u00c5\u0001\u0000\u0000\u0000*\u00c7\u0001\u0000"+
		"\u0000\u0000,\u00d0\u0001\u0000\u0000\u0000.\u00d2\u0001\u0000\u0000\u0000"+
		"0\u00d4\u0001\u0000\u0000\u00002\u00dd\u0001\u0000\u0000\u00004\u00df"+
		"\u0001\u0000\u0000\u00006\u00eb\u0001\u0000\u0000\u00008\u00ef\u0001\u0000"+
		"\u0000\u0000:\u00f4\u0001\u0000\u0000\u0000<\u00fa\u0001\u0000\u0000\u0000"+
		">\u00fc\u0001\u0000\u0000\u0000@\u010a\u0001\u0000\u0000\u0000B\u010c"+
		"\u0001\u0000\u0000\u0000D\u0116\u0001\u0000\u0000\u0000F\u0121\u0001\u0000"+
		"\u0000\u0000H\u0126\u0001\u0000\u0000\u0000J\u0128\u0001\u0000\u0000\u0000"+
		"L\u0133\u0001\u0000\u0000\u0000N\u0138\u0001\u0000\u0000\u0000PQ\u0005"+
		"\u0001\u0000\u0000QR\u0005\u001e\u0000\u0000RS\u0006\u0000\uffff\uffff"+
		"\u0000ST\u0005\u0002\u0000\u0000TU\u0003\u0002\u0001\u0000UV\u0003\u0010"+
		"\b\u0000VW\u0005\u0003\u0000\u0000WX\u0003\u001a\r\u0000XY\u0005\u0004"+
		"\u0000\u0000YZ\u0006\u0000\uffff\uffff\u0000Z\u0001\u0001\u0000\u0000"+
		"\u0000[^\u0003\u0004\u0002\u0000\\^\u0001\u0000\u0000\u0000][\u0001\u0000"+
		"\u0000\u0000]\\\u0001\u0000\u0000\u0000^\u0003\u0001\u0000\u0000\u0000"+
		"_`\u0005\u0005\u0000\u0000`a\u0003\u0006\u0003\u0000a\u0005\u0001\u0000"+
		"\u0000\u0000bc\u0003\n\u0005\u0000cd\u0005\u0006\u0000\u0000de\u0003\u000e"+
		"\u0007\u0000ef\u0006\u0003\uffff\uffff\u0000fg\u0005\u0002\u0000\u0000"+
		"gh\u0003\b\u0004\u0000h\u0007\u0001\u0000\u0000\u0000il\u0003\u0006\u0003"+
		"\u0000jl\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kj\u0001\u0000"+
		"\u0000\u0000l\t\u0001\u0000\u0000\u0000mn\u0005\u001e\u0000\u0000no\u0006"+
		"\u0005\uffff\uffff\u0000op\u0003\f\u0006\u0000p\u000b\u0001\u0000\u0000"+
		"\u0000qr\u0005\u0007\u0000\u0000ru\u0003\n\u0005\u0000su\u0001\u0000\u0000"+
		"\u0000tq\u0001\u0000\u0000\u0000ts\u0001\u0000\u0000\u0000u\r\u0001\u0000"+
		"\u0000\u0000vw\u0007\u0000\u0000\u0000w\u000f\u0001\u0000\u0000\u0000"+
		"xy\u0006\b\uffff\uffff\u0000yz\u0003\u0014\n\u0000z{\u0003\u0012\t\u0000"+
		"{|\u0006\b\uffff\uffff\u0000|\u007f\u0001\u0000\u0000\u0000}\u007f\u0001"+
		"\u0000\u0000\u0000~x\u0001\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000"+
		"\u007f\u0011\u0001\u0000\u0000\u0000\u0080\u0083\u0003\u0010\b\u0000\u0081"+
		"\u0083\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082"+
		"\u0081\u0001\u0000\u0000\u0000\u0083\u0013\u0001\u0000\u0000\u0000\u0084"+
		"\u0085\u0005\n\u0000\u0000\u0085\u0086\u0005\u001e\u0000\u0000\u0086\u0087"+
		"\u0006\n\uffff\uffff\u0000\u0087\u0088\u0005\u000b\u0000\u0000\u0088\u0089"+
		"\u0003\u0016\u000b\u0000\u0089\u008a\u0005\f\u0000\u0000\u008a\u008b\u0005"+
		"\r\u0000\u0000\u008b\u008c\u0003\u0002\u0001\u0000\u008c\u008d\u0003\u001a"+
		"\r\u0000\u008d\u008e\u0005\u000e\u0000\u0000\u008e\u008f\u0005\u0002\u0000"+
		"\u0000\u008f\u0015\u0001\u0000\u0000\u0000\u0090\u0091\u0005\u001e\u0000"+
		"\u0000\u0091\u0092\u0005\u0006\u0000\u0000\u0092\u0093\u0003\u000e\u0007"+
		"\u0000\u0093\u0094\u0006\u000b\uffff\uffff\u0000\u0094\u0095\u0003\u0018"+
		"\f\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0098\u0001\u0000\u0000"+
		"\u0000\u0097\u0090\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000"+
		"\u0000\u0098\u0017\u0001\u0000\u0000\u0000\u0099\u009a\u0005\u0007\u0000"+
		"\u0000\u009a\u009d\u0003\u0016\u000b\u0000\u009b\u009d\u0001\u0000\u0000"+
		"\u0000\u009c\u0099\u0001\u0000\u0000\u0000\u009c\u009b\u0001\u0000\u0000"+
		"\u0000\u009d\u0019\u0001\u0000\u0000\u0000\u009e\u009f\u0005\u000f\u0000"+
		"\u0000\u009f\u00a0\u0003\u001c\u000e\u0000\u00a0\u00a1\u0005\u0010\u0000"+
		"\u0000\u00a1\u001b\u0001\u0000\u0000\u0000\u00a2\u00a3\u0003 \u0010\u0000"+
		"\u00a3\u00a4\u0003\u001e\u000f\u0000\u00a4\u00a7\u0001\u0000\u0000\u0000"+
		"\u00a5\u00a7\u0001\u0000\u0000\u0000\u00a6\u00a2\u0001\u0000\u0000\u0000"+
		"\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7\u001d\u0001\u0000\u0000\u0000"+
		"\u00a8\u00ab\u0003\u001c\u000e\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000"+
		"\u00aa\u00a8\u0001\u0000\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ab\u001f\u0001\u0000\u0000\u0000\u00ac\u00b2\u0003\"\u0011\u0000\u00ad"+
		"\u00b2\u0003>\u001f\u0000\u00ae\u00b2\u0003B!\u0000\u00af\u00b2\u0003"+
		"D\"\u0000\u00b0\u00b2\u0003J%\u0000\u00b1\u00ac\u0001\u0000\u0000\u0000"+
		"\u00b1\u00ad\u0001\u0000\u0000\u0000\u00b1\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b2!\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u001e\u0000\u0000\u00b4"+
		"\u00b5\u0006\u0011\uffff\uffff\u0000\u00b5\u00b6\u0005\u0011\u0000\u0000"+
		"\u00b6\u00b7\u0003$\u0012\u0000\u00b7\u00b8\u0005\u0002\u0000\u0000\u00b8"+
		"\u00b9\u0006\u0011\uffff\uffff\u0000\u00b9#\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bb\u0003*\u0015\u0000\u00bb\u00bc\u0003&\u0013\u0000\u00bc%\u0001"+
		"\u0000\u0000\u0000\u00bd\u00be\u0003(\u0014\u0000\u00be\u00bf\u0006\u0013"+
		"\uffff\uffff\u0000\u00bf\u00c0\u0003*\u0015\u0000\u00c0\u00c1\u0006\u0013"+
		"\uffff\uffff\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c3\u00bd\u0001\u0000\u0000\u0000\u00c3\u00c2\u0001"+
		"\u0000\u0000\u0000\u00c4\'\u0001\u0000\u0000\u0000\u00c5\u00c6\u0007\u0001"+
		"\u0000\u0000\u00c6)\u0001\u0000\u0000\u0000\u00c7\u00c8\u00030\u0018\u0000"+
		"\u00c8\u00c9\u0006\u0015\uffff\uffff\u0000\u00c9\u00ca\u0003,\u0016\u0000"+
		"\u00ca+\u0001\u0000\u0000\u0000\u00cb\u00cc\u0003.\u0017\u0000\u00cc\u00cd"+
		"\u0006\u0016\uffff\uffff\u0000\u00cd\u00ce\u0003*\u0015\u0000\u00ce\u00d1"+
		"\u0001\u0000\u0000\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00cb"+
		"\u0001\u0000\u0000\u0000\u00d0\u00cf\u0001\u0000\u0000\u0000\u00d1-\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0007\u0002\u0000\u0000\u00d3/\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d5\u00036\u001b\u0000\u00d5\u00d6\u0006\u0018\uffff"+
		"\uffff\u0000\u00d6\u00d7\u00032\u0019\u0000\u00d71\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u00034\u001a\u0000\u00d9\u00da\u0006\u0019\uffff\uffff\u0000"+
		"\u00da\u00db\u00030\u0018\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc"+
		"\u00de\u0001\u0000\u0000\u0000\u00dd\u00d8\u0001\u0000\u0000\u0000\u00dd"+
		"\u00dc\u0001\u0000\u0000\u0000\u00de3\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0007\u0003\u0000\u0000\u00e05\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005"+
		"\u000b\u0000\u0000\u00e2\u00e3\u0006\u001b\uffff\uffff\u0000\u00e3\u00e4"+
		"\u0003$\u0012\u0000\u00e4\u00e5\u0005\f\u0000\u0000\u00e5\u00e6\u0006"+
		"\u001b\uffff\uffff\u0000\u00e6\u00ec\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u00038\u001c\u0000\u00e8\u00e9\u0003:\u001d\u0000\u00e9\u00ea\u0006\u001b"+
		"\uffff\uffff\u0000\u00ea\u00ec\u0001\u0000\u0000\u0000\u00eb\u00e1\u0001"+
		"\u0000\u0000\u0000\u00eb\u00e7\u0001\u0000\u0000\u0000\u00ec7\u0001\u0000"+
		"\u0000\u0000\u00ed\u00f0\u0003.\u0017\u0000\u00ee\u00f0\u0001\u0000\u0000"+
		"\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00ee\u0001\u0000\u0000"+
		"\u0000\u00f09\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\u001e\u0000\u0000"+
		"\u00f2\u00f5\u0006\u001d\uffff\uffff\u0000\u00f3\u00f5\u0003<\u001e\u0000"+
		"\u00f4\u00f1\u0001\u0000\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f5;\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005\u001f\u0000\u0000\u00f7"+
		"\u00fb\u0006\u001e\uffff\uffff\u0000\u00f8\u00f9\u0005 \u0000\u0000\u00f9"+
		"\u00fb\u0006\u001e\uffff\uffff\u0000\u00fa\u00f6\u0001\u0000\u0000\u0000"+
		"\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fb=\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0005\u0019\u0000\u0000\u00fd\u00fe\u0005\u000b\u0000\u0000\u00fe"+
		"\u00ff\u0003$\u0012\u0000\u00ff\u0100\u0005\f\u0000\u0000\u0100\u0101"+
		"\u0006\u001f\uffff\uffff\u0000\u0101\u0102\u0003\u001a\r\u0000\u0102\u0103"+
		"\u0003@ \u0000\u0103\u0104\u0005\u0002\u0000\u0000\u0104\u0105\u0006\u001f"+
		"\uffff\uffff\u0000\u0105?\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u001a"+
		"\u0000\u0000\u0107\u0108\u0006 \uffff\uffff\u0000\u0108\u010b\u0003\u001a"+
		"\r\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a\u0106\u0001\u0000\u0000"+
		"\u0000\u010a\u0109\u0001\u0000\u0000\u0000\u010bA\u0001\u0000\u0000\u0000"+
		"\u010c\u010d\u0005\u001b\u0000\u0000\u010d\u010e\u0006!\uffff\uffff\u0000"+
		"\u010e\u010f\u0003\u001a\r\u0000\u010f\u0110\u0005\u001c\u0000\u0000\u0110"+
		"\u0111\u0005\u000b\u0000\u0000\u0111\u0112\u0003$\u0012\u0000\u0112\u0113"+
		"\u0005\f\u0000\u0000\u0113\u0114\u0006!\uffff\uffff\u0000\u0114\u0115"+
		"\u0005\u0002\u0000\u0000\u0115C\u0001\u0000\u0000\u0000\u0116\u0117\u0005"+
		"\u001e\u0000\u0000\u0117\u0118\u0006\"\uffff\uffff\u0000\u0118\u0119\u0005"+
		"\u000b\u0000\u0000\u0119\u011a\u0003F#\u0000\u011a\u011b\u0005\f\u0000"+
		"\u0000\u011b\u011c\u0005\u0002\u0000\u0000\u011cE\u0001\u0000\u0000\u0000"+
		"\u011d\u011e\u0003$\u0012\u0000\u011e\u011f\u0003H$\u0000\u011f\u0122"+
		"\u0001\u0000\u0000\u0000\u0120\u0122\u0001\u0000\u0000\u0000\u0121\u011d"+
		"\u0001\u0000\u0000\u0000\u0121\u0120\u0001\u0000\u0000\u0000\u0122G\u0001"+
		"\u0000\u0000\u0000\u0123\u0124\u0005\u0007\u0000\u0000\u0124\u0127\u0003"+
		"F#\u0000\u0125\u0127\u0001\u0000\u0000\u0000\u0126\u0123\u0001\u0000\u0000"+
		"\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0127I\u0001\u0000\u0000\u0000"+
		"\u0128\u0129\u0005\u001d\u0000\u0000\u0129\u012a\u0005\u000b\u0000\u0000"+
		"\u012a\u012b\u0003L&\u0000\u012b\u012c\u0005\f\u0000\u0000\u012c\u012d"+
		"\u0005\u0002\u0000\u0000\u012dK\u0001\u0000\u0000\u0000\u012e\u012f\u0005"+
		"!\u0000\u0000\u012f\u0134\u0003N\'\u0000\u0130\u0131\u0003$\u0012\u0000"+
		"\u0131\u0132\u0003N\'\u0000\u0132\u0134\u0001\u0000\u0000\u0000\u0133"+
		"\u012e\u0001\u0000\u0000\u0000\u0133\u0130\u0001\u0000\u0000\u0000\u0134"+
		"M\u0001\u0000\u0000\u0000\u0135\u0136\u0005\u0007\u0000\u0000\u0136\u0139"+
		"\u0003L&\u0000\u0137\u0139\u0001\u0000\u0000\u0000\u0138\u0135\u0001\u0000"+
		"\u0000\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0139O\u0001\u0000\u0000"+
		"\u0000\u0016]kt~\u0082\u0097\u009c\u00a6\u00aa\u00b1\u00c3\u00d0\u00dd"+
		"\u00eb\u00ef\u00f4\u00fa\u010a\u0121\u0126\u0133\u0138";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}