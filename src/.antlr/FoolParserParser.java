// Generated from /Users/ningyuheng/workspace/FOOL_compiler/src/FoolParser.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class FoolParserParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, LPAREN=17, 
		RPAREN=18, LBRACE=19, RBRACE=20, LBRACK=21, RBRACK=22, COMMENT1=23, COMMENT2=24, 
		COMMENT3=25, COMMENT4=26, IGNORE_NEWLINE=27, NEWLINE=28, WS=29, LINE_ESCAPE=30, 
		CLASS=31, IF=32, ELSE=33, WHEN=34, WHILE=35, VAR=36, VAL=37, DEF=38, NOT=39, 
		NIL=40, IS=41, NEW=42, BREAK=43, CONTINUE=44, THIS=45, RETURN=46, READ=47, 
		WRITE=48, OPENFILE=49, IMPORT=50, ASSERT=51, SUPER=52, BOOL=53, INT=54, 
		EXP=55, NUMBER=56, ID=57, TYPE=58, STRING=59;
	public static final int
		RULE_program = 0, RULE_importDec = 1, RULE_classDec = 2, RULE_declaration = 3, 
		RULE_type = 4, RULE_typelist = 5, RULE_functype = 6, RULE_parameter = 7, 
		RULE_parameterlist = 8, RULE_exprlist = 9, RULE_exprblock = 10, RULE_expr = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "importDec", "classDec", "declaration", "type", "typelist", 
			"functype", "parameter", "parameterlist", "exprlist", "exprblock", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "'='", "','", "'->'", "'.'", "'*'", "'\\'", "'+'", "'-'", 
			"'<'", "'>'", "'<='", "'>='", "'=='", "'&&'", "'||'", "'('", "')'", "'{'", 
			"'}'", "'['", "']'", null, null, null, null, null, null, null, null, 
			"'class'", "'if'", "'else'", "'when'", "'while'", "'var'", "'val'", "'def'", 
			"'not'", "'NIL'", "'is'", "'new'", "'break'", "'continue'", "'this'", 
			"'return'", "'read'", "'write'", "'open'", "'import'", "'assert'", "'super'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
			"LBRACK", "RBRACK", "COMMENT1", "COMMENT2", "COMMENT3", "COMMENT4", "IGNORE_NEWLINE", 
			"NEWLINE", "WS", "LINE_ESCAPE", "CLASS", "IF", "ELSE", "WHEN", "WHILE", 
			"VAR", "VAL", "DEF", "NOT", "NIL", "IS", "NEW", "BREAK", "CONTINUE", 
			"THIS", "RETURN", "READ", "WRITE", "OPENFILE", "IMPORT", "ASSERT", "SUPER", 
			"BOOL", "INT", "EXP", "NUMBER", "ID", "TYPE", "STRING"
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
	public String getGrammarFileName() { return "FoolParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FoolParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(FoolParserParser.EOF, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(FoolParserParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FoolParserParser.NEWLINE, i);
		}
		public List<ImportDecContext> importDec() {
			return getRuleContexts(ImportDecContext.class);
		}
		public ImportDecContext importDec(int i) {
			return getRuleContext(ImportDecContext.class,i);
		}
		public List<ClassDecContext> classDec() {
			return getRuleContexts(ClassDecContext.class);
		}
		public ClassDecContext classDec(int i) {
			return getRuleContext(ClassDecContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(24);
				match(NEWLINE);
				}
				}
				setState(29);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(30);
				importDec();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CLASS) {
				{
				{
				setState(36);
				classDec();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			match(EOF);
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

	public static class ImportDecContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(FoolParserParser.IMPORT, 0); }
		public TerminalNode STRING() { return getToken(FoolParserParser.STRING, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(FoolParserParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FoolParserParser.NEWLINE, i);
		}
		public ImportDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDec; }
	}

	public final ImportDecContext importDec() throws RecognitionException {
		ImportDecContext _localctx = new ImportDecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(IMPORT);
			setState(45);
			match(STRING);
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				match(NEWLINE);
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class ClassDecContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(FoolParserParser.CLASS, 0); }
		public List<TerminalNode> TYPE() { return getTokens(FoolParserParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(FoolParserParser.TYPE, i);
		}
		public TerminalNode LBRACE() { return getToken(FoolParserParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FoolParserParser.RBRACE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(FoolParserParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FoolParserParser.NEWLINE, i);
		}
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public ClassDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDec; }
	}

	public final ClassDecContext classDec() throws RecognitionException {
		ClassDecContext _localctx = new ClassDecContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(CLASS);
			setState(52);
			match(TYPE);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(53);
				match(T__0);
				setState(54);
				match(TYPE);
				}
			}

			setState(57);
			match(LBRACE);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(58);
				match(NEWLINE);
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VAR) | (1L << VAL) | (1L << DEF) | (1L << NEW))) != 0)) {
				{
				{
				setState(64);
				declaration();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(RBRACE);
			setState(72); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(71);
				match(NEWLINE);
				}
				}
				setState(74); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NEWLINE );
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(FoolParserParser.DEF, 0); }
		public TerminalNode ID() { return getToken(FoolParserParser.ID, 0); }
		public TerminalNode LPAREN() { return getToken(FoolParserParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FoolParserParser.RPAREN, 0); }
		public ExprblockContext exprblock() {
			return getRuleContext(ExprblockContext.class,0);
		}
		public ParameterlistContext parameterlist() {
			return getRuleContext(ParameterlistContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(FoolParserParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FoolParserParser.NEWLINE, i);
		}
		public TerminalNode NEW() { return getToken(FoolParserParser.NEW, 0); }
		public TerminalNode VAR() { return getToken(FoolParserParser.VAR, 0); }
		public TerminalNode VAL() { return getToken(FoolParserParser.VAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			setState(120);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DEF:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(DEF);
				setState(77);
				match(ID);
				setState(78);
				match(LPAREN);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(79);
					parameterlist();
					}
				}

				setState(82);
				match(RPAREN);
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(83);
					match(T__0);
					setState(84);
					type();
					}
				}

				setState(87);
				exprblock();
				setState(89); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(88);
					match(NEWLINE);
					}
					}
					setState(91); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case NEW:
				enterOuterAlt(_localctx, 2);
				{
				setState(93);
				match(NEW);
				setState(94);
				match(LPAREN);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(95);
					parameterlist();
					}
				}

				setState(98);
				match(RPAREN);
				setState(99);
				exprblock();
				setState(101); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(100);
					match(NEWLINE);
					}
					}
					setState(103); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				break;
			case VAR:
			case VAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(105);
				_la = _input.LA(1);
				if ( !(_la==VAR || _la==VAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(106);
				match(ID);
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(107);
					match(T__0);
					setState(108);
					type();
					}
				}

				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(111);
					match(T__1);
					setState(112);
					expr(0);
					}
				}

				setState(116); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(115);
					match(NEWLINE);
					}
					}
					setState(118); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(FoolParserParser.TYPE, 0); }
		public FunctypeContext functype() {
			return getRuleContext(FunctypeContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TYPE:
				{
				setState(122);
				match(TYPE);
				}
				break;
			case LPAREN:
				{
				setState(123);
				functype();
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

	public static class TypelistContext extends ParserRuleContext {
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TypelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typelist; }
	}

	public final TypelistContext typelist() throws RecognitionException {
		TypelistContext _localctx = new TypelistContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typelist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			type();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(127);
				match(T__2);
				setState(128);
				type();
				}
				}
				setState(133);
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

	public static class FunctypeContext extends ParserRuleContext {
		public TerminalNode LPAREN() { return getToken(FoolParserParser.LPAREN, 0); }
		public TypelistContext typelist() {
			return getRuleContext(TypelistContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(FoolParserParser.RPAREN, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public FunctypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functype; }
	}

	public final FunctypeContext functype() throws RecognitionException {
		FunctypeContext _localctx = new FunctypeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(LPAREN);
			setState(135);
			typelist();
			setState(136);
			match(RPAREN);
			setState(137);
			match(T__3);
			setState(138);
			type();
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

	public static class ParameterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(FoolParserParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(ID);
			setState(141);
			match(T__0);
			setState(142);
			type();
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

	public static class ParameterlistContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterlist; }
	}

	public final ParameterlistContext parameterlist() throws RecognitionException {
		ParameterlistContext _localctx = new ParameterlistContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parameterlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			parameter();
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(145);
				match(T__2);
				setState(146);
				parameter();
				}
				}
				setState(151);
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

	public static class ExprlistContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprlist; }
	}

	public final ExprlistContext exprlist() throws RecognitionException {
		ExprlistContext _localctx = new ExprlistContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exprlist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			expr(0);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(153);
				match(T__2);
				setState(154);
				expr(0);
				}
				}
				setState(159);
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

	public static class ExprblockContext extends ParserRuleContext {
		public TerminalNode LBRACE() { return getToken(FoolParserParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FoolParserParser.RBRACE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(FoolParserParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FoolParserParser.NEWLINE, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ExprblockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprblock; }
	}

	public final ExprblockContext exprblock() throws RecognitionException {
		ExprblockContext _localctx = new ExprblockContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_exprblock);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(160);
				match(NEWLINE);
				}
				}
				setState(165);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(166);
			match(LBRACE);
			setState(170);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(167);
					match(NEWLINE);
					}
					} 
				}
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			}
			setState(181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NEWLINE) | (1L << IF) | (1L << WHEN) | (1L << WHILE) | (1L << VAR) | (1L << VAL) | (1L << NOT) | (1L << NIL) | (1L << THIS) | (1L << RETURN) | (1L << READ) | (1L << WRITE) | (1L << SUPER) | (1L << BOOL) | (1L << INT) | (1L << NUMBER) | (1L << ID) | (1L << TYPE) | (1L << STRING))) != 0)) {
				{
				{
				setState(173);
				expr(0);
				setState(175); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(174);
						match(NEWLINE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(177); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				}
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(184);
			match(RBRACE);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode BOOL() { return getToken(FoolParserParser.BOOL, 0); }
		public TerminalNode INT() { return getToken(FoolParserParser.INT, 0); }
		public TerminalNode NUMBER() { return getToken(FoolParserParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(FoolParserParser.STRING, 0); }
		public TerminalNode NIL() { return getToken(FoolParserParser.NIL, 0); }
		public TerminalNode THIS() { return getToken(FoolParserParser.THIS, 0); }
		public TerminalNode SUPER() { return getToken(FoolParserParser.SUPER, 0); }
		public TerminalNode WRITE() { return getToken(FoolParserParser.WRITE, 0); }
		public TerminalNode READ() { return getToken(FoolParserParser.READ, 0); }
		public TerminalNode VAR() { return getToken(FoolParserParser.VAR, 0); }
		public TerminalNode ID() { return getToken(FoolParserParser.ID, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode VAL() { return getToken(FoolParserParser.VAL, 0); }
		public TerminalNode NOT() { return getToken(FoolParserParser.NOT, 0); }
		public List<TerminalNode> TYPE() { return getTokens(FoolParserParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(FoolParserParser.TYPE, i);
		}
		public TerminalNode LPAREN() { return getToken(FoolParserParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(FoolParserParser.RPAREN, 0); }
		public ExprlistContext exprlist() {
			return getRuleContext(ExprlistContext.class,0);
		}
		public TerminalNode WHILE() { return getToken(FoolParserParser.WHILE, 0); }
		public List<ExprblockContext> exprblock() {
			return getRuleContexts(ExprblockContext.class);
		}
		public ExprblockContext exprblock(int i) {
			return getRuleContext(ExprblockContext.class,i);
		}
		public TerminalNode WHEN() { return getToken(FoolParserParser.WHEN, 0); }
		public TerminalNode LBRACE() { return getToken(FoolParserParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(FoolParserParser.RBRACE, 0); }
		public TerminalNode ELSE() { return getToken(FoolParserParser.ELSE, 0); }
		public List<TerminalNode> NEWLINE() { return getTokens(FoolParserParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(FoolParserParser.NEWLINE, i);
		}
		public List<TerminalNode> IS() { return getTokens(FoolParserParser.IS); }
		public TerminalNode IS(int i) {
			return getToken(FoolParserParser.IS, i);
		}
		public TerminalNode IF() { return getToken(FoolParserParser.IF, 0); }
		public ParameterlistContext parameterlist() {
			return getRuleContext(ParameterlistContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(FoolParserParser.RETURN, 0); }
		public TerminalNode LBRACK() { return getToken(FoolParserParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(FoolParserParser.RBRACK, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(187);
				match(BOOL);
				}
				break;
			case 2:
				{
				setState(188);
				match(INT);
				}
				break;
			case 3:
				{
				setState(189);
				match(NUMBER);
				}
				break;
			case 4:
				{
				setState(190);
				match(STRING);
				}
				break;
			case 5:
				{
				setState(191);
				match(NIL);
				}
				break;
			case 6:
				{
				setState(192);
				match(THIS);
				}
				break;
			case 7:
				{
				setState(193);
				match(SUPER);
				}
				break;
			case 8:
				{
				setState(194);
				match(WRITE);
				}
				break;
			case 9:
				{
				setState(195);
				match(READ);
				}
				break;
			case 10:
				{
				setState(196);
				match(VAR);
				setState(197);
				match(ID);
				setState(198);
				match(T__0);
				setState(199);
				type();
				}
				break;
			case 11:
				{
				setState(200);
				_la = _input.LA(1);
				if ( !(_la==VAR || _la==VAL) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(201);
				match(ID);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(202);
					match(T__0);
					setState(203);
					type();
					}
				}

				setState(206);
				match(T__1);
				setState(207);
				expr(22);
				}
				break;
			case 12:
				{
				setState(208);
				match(NOT);
				setState(209);
				expr(20);
				}
				break;
			case 13:
				{
				setState(210);
				match(TYPE);
				{
				setState(211);
				match(LPAREN);
				setState(213);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NEWLINE) | (1L << IF) | (1L << WHEN) | (1L << WHILE) | (1L << VAR) | (1L << VAL) | (1L << NOT) | (1L << NIL) | (1L << THIS) | (1L << RETURN) | (1L << READ) | (1L << WRITE) | (1L << SUPER) | (1L << BOOL) | (1L << INT) | (1L << NUMBER) | (1L << ID) | (1L << TYPE) | (1L << STRING))) != 0)) {
					{
					setState(212);
					exprlist();
					}
				}

				setState(215);
				match(RPAREN);
				}
				}
				break;
			case 14:
				{
				setState(216);
				match(WHILE);
				setState(217);
				match(LPAREN);
				setState(218);
				expr(0);
				setState(219);
				match(RPAREN);
				setState(220);
				exprblock();
				}
				break;
			case 15:
				{
				setState(222);
				match(WHEN);
				setState(223);
				match(LPAREN);
				setState(224);
				expr(0);
				setState(225);
				match(RPAREN);
				setState(226);
				match(LBRACE);
				setState(230);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(227);
						match(NEWLINE);
						}
						} 
					}
					setState(232);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
				}
				setState(245); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(236);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case LPAREN:
					case LBRACE:
					case LBRACK:
					case NEWLINE:
					case IF:
					case WHEN:
					case WHILE:
					case VAR:
					case VAL:
					case NOT:
					case NIL:
					case THIS:
					case RETURN:
					case READ:
					case WRITE:
					case SUPER:
					case BOOL:
					case INT:
					case NUMBER:
					case ID:
					case TYPE:
					case STRING:
						{
						setState(233);
						expr(0);
						}
						break;
					case IS:
						{
						{
						setState(234);
						match(IS);
						setState(235);
						match(TYPE);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(238);
					match(T__3);
					setState(239);
					expr(0);
					setState(241); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(240);
							match(NEWLINE);
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(243); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					}
					setState(247); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NEWLINE) | (1L << IF) | (1L << WHEN) | (1L << WHILE) | (1L << VAR) | (1L << VAL) | (1L << NOT) | (1L << NIL) | (1L << IS) | (1L << THIS) | (1L << RETURN) | (1L << READ) | (1L << WRITE) | (1L << SUPER) | (1L << BOOL) | (1L << INT) | (1L << NUMBER) | (1L << ID) | (1L << TYPE) | (1L << STRING))) != 0) );
				{
				setState(249);
				match(ELSE);
				setState(250);
				match(T__3);
				setState(251);
				expr(0);
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(252);
					match(NEWLINE);
					}
					}
					setState(255); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==NEWLINE );
				}
				setState(257);
				match(RBRACE);
				}
				break;
			case 16:
				{
				setState(259);
				match(IF);
				setState(260);
				match(LPAREN);
				setState(261);
				expr(0);
				setState(262);
				match(RPAREN);
				setState(263);
				exprblock();
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NEWLINE) {
					{
					setState(264);
					match(NEWLINE);
					}
				}

				{
				setState(267);
				match(ELSE);
				setState(268);
				exprblock();
				}
				}
				break;
			case 17:
				{
				setState(270);
				match(LBRACE);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(271);
					match(NEWLINE);
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(277);
				match(LPAREN);
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(278);
					parameterlist();
					}
				}

				setState(281);
				match(RPAREN);
				setState(282);
				match(T__3);
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(283);
						match(NEWLINE);
						}
						} 
					}
					setState(288);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(291);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(289);
					exprblock();
					}
					break;
				case 2:
					{
					setState(290);
					expr(0);
					}
					break;
				}
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NEWLINE) {
					{
					{
					setState(293);
					match(NEWLINE);
					}
					}
					setState(298);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(299);
				match(RBRACE);
				}
				break;
			case 18:
				{
				setState(301);
				match(RETURN);
				setState(302);
				expr(5);
				}
				break;
			case 19:
				{
				setState(303);
				match(ID);
				}
				break;
			case 20:
				{
				setState(304);
				match(LPAREN);
				setState(305);
				expr(0);
				setState(306);
				match(RPAREN);
				}
				break;
			case 21:
				{
				setState(308);
				match(LBRACK);
				setState(309);
				exprlist();
				setState(310);
				match(RBRACK);
				}
				break;
			case 22:
				{
				setState(312);
				match(NEWLINE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(352);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(350);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(315);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(316);
						_la = _input.LA(1);
						if ( !(_la==T__5 || _la==T__6) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(317);
						expr(17);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(318);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(319);
						_la = _input.LA(1);
						if ( !(_la==T__7 || _la==T__8) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(320);
						expr(16);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(321);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(322);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(323);
						expr(15);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(324);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(325);
						match(T__13);
						setState(326);
						expr(14);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(327);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(328);
						match(T__14);
						setState(329);
						expr(13);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(330);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(331);
						match(T__15);
						setState(332);
						expr(12);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(333);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(334);
						match(T__1);
						setState(335);
						expr(11);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(336);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(337);
						match(T__4);
						setState(338);
						match(ID);
						}
						break;
					case 9:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(339);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(340);
						match(LBRACK);
						setState(341);
						expr(0);
						setState(342);
						match(RBRACK);
						}
						break;
					case 10:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(344);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						{
						setState(345);
						match(LPAREN);
						setState(347);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LPAREN) | (1L << LBRACE) | (1L << LBRACK) | (1L << NEWLINE) | (1L << IF) | (1L << WHEN) | (1L << WHILE) | (1L << VAR) | (1L << VAL) | (1L << NOT) | (1L << NIL) | (1L << THIS) | (1L << RETURN) | (1L << READ) | (1L << WRITE) | (1L << SUPER) | (1L << BOOL) | (1L << INT) | (1L << NUMBER) | (1L << ID) | (1L << TYPE) | (1L << STRING))) != 0)) {
							{
							setState(346);
							exprlist();
							}
						}

						setState(349);
						match(RPAREN);
						}
						}
						break;
					}
					} 
				}
				setState(354);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 16);
		case 1:
			return precpred(_ctx, 15);
		case 2:
			return precpred(_ctx, 14);
		case 3:
			return precpred(_ctx, 13);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 21);
		case 8:
			return precpred(_ctx, 19);
		case 9:
			return precpred(_ctx, 17);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3=\u0166\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\7\2\34\n\2\f\2\16\2\37\13\2\3\2\7\2\"\n\2\f\2"+
		"\16\2%\13\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\3\3\3\3\3\6\3\62\n\3"+
		"\r\3\16\3\63\3\4\3\4\3\4\3\4\5\4:\n\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4"+
		"\3\4\7\4D\n\4\f\4\16\4G\13\4\3\4\3\4\6\4K\n\4\r\4\16\4L\3\5\3\5\3\5\3"+
		"\5\5\5S\n\5\3\5\3\5\3\5\5\5X\n\5\3\5\3\5\6\5\\\n\5\r\5\16\5]\3\5\3\5\3"+
		"\5\5\5c\n\5\3\5\3\5\3\5\6\5h\n\5\r\5\16\5i\3\5\3\5\3\5\3\5\5\5p\n\5\3"+
		"\5\3\5\5\5t\n\5\3\5\6\5w\n\5\r\5\16\5x\5\5{\n\5\3\6\3\6\5\6\177\n\6\3"+
		"\7\3\7\3\7\7\7\u0084\n\7\f\7\16\7\u0087\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\7\n\u0096\n\n\f\n\16\n\u0099\13\n\3\13\3\13"+
		"\3\13\7\13\u009e\n\13\f\13\16\13\u00a1\13\13\3\f\7\f\u00a4\n\f\f\f\16"+
		"\f\u00a7\13\f\3\f\3\f\7\f\u00ab\n\f\f\f\16\f\u00ae\13\f\3\f\3\f\6\f\u00b2"+
		"\n\f\r\f\16\f\u00b3\7\f\u00b6\n\f\f\f\16\f\u00b9\13\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00cf"+
		"\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d8\n\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\7\r\u00e7\n\r\f\r\16\r\u00ea\13\r\3\r\3\r"+
		"\3\r\5\r\u00ef\n\r\3\r\3\r\3\r\6\r\u00f4\n\r\r\r\16\r\u00f5\6\r\u00f8"+
		"\n\r\r\r\16\r\u00f9\3\r\3\r\3\r\3\r\6\r\u0100\n\r\r\r\16\r\u0101\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u010c\n\r\3\r\3\r\3\r\3\r\3\r\7\r\u0113"+
		"\n\r\f\r\16\r\u0116\13\r\3\r\3\r\5\r\u011a\n\r\3\r\3\r\3\r\7\r\u011f\n"+
		"\r\f\r\16\r\u0122\13\r\3\r\3\r\5\r\u0126\n\r\3\r\7\r\u0129\n\r\f\r\16"+
		"\r\u012c\13\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u013c\n\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u015e\n\r\3\r\7\r\u0161\n\r\f\r\16\r\u0164\13\r\3\r\2\3\30\16\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\2\6\3\2&\'\3\2\b\t\3\2\n\13\3\2\f\17\2\u01a0"+
		"\2\35\3\2\2\2\4.\3\2\2\2\6\65\3\2\2\2\bz\3\2\2\2\n~\3\2\2\2\f\u0080\3"+
		"\2\2\2\16\u0088\3\2\2\2\20\u008e\3\2\2\2\22\u0092\3\2\2\2\24\u009a\3\2"+
		"\2\2\26\u00a5\3\2\2\2\30\u013b\3\2\2\2\32\34\7\36\2\2\33\32\3\2\2\2\34"+
		"\37\3\2\2\2\35\33\3\2\2\2\35\36\3\2\2\2\36#\3\2\2\2\37\35\3\2\2\2 \"\5"+
		"\4\3\2! \3\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$)\3\2\2\2%#\3\2\2\2&("+
		"\5\6\4\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2\2\2+)\3\2\2\2"+
		",-\7\2\2\3-\3\3\2\2\2./\7\64\2\2/\61\7=\2\2\60\62\7\36\2\2\61\60\3\2\2"+
		"\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\5\3\2\2\2\65\66\7!\2\2"+
		"\669\7<\2\2\678\7\3\2\28:\7<\2\29\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;?\7\25"+
		"\2\2<>\7\36\2\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@E\3\2\2\2A?\3"+
		"\2\2\2BD\5\b\5\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3"+
		"\2\2\2HJ\7\26\2\2IK\7\36\2\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M"+
		"\7\3\2\2\2NO\7(\2\2OP\7;\2\2PR\7\23\2\2QS\5\22\n\2RQ\3\2\2\2RS\3\2\2\2"+
		"ST\3\2\2\2TW\7\24\2\2UV\7\3\2\2VX\5\n\6\2WU\3\2\2\2WX\3\2\2\2XY\3\2\2"+
		"\2Y[\5\26\f\2Z\\\7\36\2\2[Z\3\2\2\2\\]\3\2\2\2][\3\2\2\2]^\3\2\2\2^{\3"+
		"\2\2\2_`\7,\2\2`b\7\23\2\2ac\5\22\n\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2\2de"+
		"\7\24\2\2eg\5\26\f\2fh\7\36\2\2gf\3\2\2\2hi\3\2\2\2ig\3\2\2\2ij\3\2\2"+
		"\2j{\3\2\2\2kl\t\2\2\2lo\7;\2\2mn\7\3\2\2np\5\n\6\2om\3\2\2\2op\3\2\2"+
		"\2ps\3\2\2\2qr\7\4\2\2rt\5\30\r\2sq\3\2\2\2st\3\2\2\2tv\3\2\2\2uw\7\36"+
		"\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y{\3\2\2\2zN\3\2\2\2z_\3\2"+
		"\2\2zk\3\2\2\2{\t\3\2\2\2|\177\7<\2\2}\177\5\16\b\2~|\3\2\2\2~}\3\2\2"+
		"\2\177\13\3\2\2\2\u0080\u0085\5\n\6\2\u0081\u0082\7\5\2\2\u0082\u0084"+
		"\5\n\6\2\u0083\u0081\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085"+
		"\u0086\3\2\2\2\u0086\r\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u0089\7\23\2"+
		"\2\u0089\u008a\5\f\7\2\u008a\u008b\7\24\2\2\u008b\u008c\7\6\2\2\u008c"+
		"\u008d\5\n\6\2\u008d\17\3\2\2\2\u008e\u008f\7;\2\2\u008f\u0090\7\3\2\2"+
		"\u0090\u0091\5\n\6\2\u0091\21\3\2\2\2\u0092\u0097\5\20\t\2\u0093\u0094"+
		"\7\5\2\2\u0094\u0096\5\20\t\2\u0095\u0093\3\2\2\2\u0096\u0099\3\2\2\2"+
		"\u0097\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\23\3\2\2\2\u0099\u0097"+
		"\3\2\2\2\u009a\u009f\5\30\r\2\u009b\u009c\7\5\2\2\u009c\u009e\5\30\r\2"+
		"\u009d\u009b\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0"+
		"\3\2\2\2\u00a0\25\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a4\7\36\2\2\u00a3"+
		"\u00a2\3\2\2\2\u00a4\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2"+
		"\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00ac\7\25\2\2\u00a9"+
		"\u00ab\7\36\2\2\u00aa\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3"+
		"\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00b7\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af"+
		"\u00b1\5\30\r\2\u00b0\u00b2\7\36\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b3\3"+
		"\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00af\3\2\2\2\u00b6\u00b9\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b7\3\2\2\2\u00ba\u00bb\7\26\2\2\u00bb"+
		"\27\3\2\2\2\u00bc\u00bd\b\r\1\2\u00bd\u013c\7\67\2\2\u00be\u013c\78\2"+
		"\2\u00bf\u013c\7:\2\2\u00c0\u013c\7=\2\2\u00c1\u013c\7*\2\2\u00c2\u013c"+
		"\7/\2\2\u00c3\u013c\7\66\2\2\u00c4\u013c\7\62\2\2\u00c5\u013c\7\61\2\2"+
		"\u00c6\u00c7\7&\2\2\u00c7\u00c8\7;\2\2\u00c8\u00c9\7\3\2\2\u00c9\u013c"+
		"\5\n\6\2\u00ca\u00cb\t\2\2\2\u00cb\u00ce\7;\2\2\u00cc\u00cd\7\3\2\2\u00cd"+
		"\u00cf\5\n\6\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d1\7\4\2\2\u00d1\u013c\5\30\r\30\u00d2\u00d3\7)\2\2\u00d3"+
		"\u013c\5\30\r\26\u00d4\u00d5\7<\2\2\u00d5\u00d7\7\23\2\2\u00d6\u00d8\5"+
		"\24\13\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u013c\7\24\2\2\u00da\u00db\7%\2\2\u00db\u00dc\7\23\2\2\u00dc\u00dd\5"+
		"\30\r\2\u00dd\u00de\7\24\2\2\u00de\u00df\5\26\f\2\u00df\u013c\3\2\2\2"+
		"\u00e0\u00e1\7$\2\2\u00e1\u00e2\7\23\2\2\u00e2\u00e3\5\30\r\2\u00e3\u00e4"+
		"\7\24\2\2\u00e4\u00e8\7\25\2\2\u00e5\u00e7\7\36\2\2\u00e6\u00e5\3\2\2"+
		"\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00f7"+
		"\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ef\5\30\r\2\u00ec\u00ed\7+\2\2\u00ed"+
		"\u00ef\7<\2\2\u00ee\u00eb\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\3\2"+
		"\2\2\u00f0\u00f1\7\6\2\2\u00f1\u00f3\5\30\r\2\u00f2\u00f4\7\36\2\2\u00f3"+
		"\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f5\u00f6\3\2"+
		"\2\2\u00f6\u00f8\3\2\2\2\u00f7\u00ee\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7#"+
		"\2\2\u00fc\u00fd\7\6\2\2\u00fd\u00ff\5\30\r\2\u00fe\u0100\7\36\2\2\u00ff"+
		"\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0103\3\2\2\2\u0103\u0104\7\26\2\2\u0104\u013c\3\2\2\2\u0105"+
		"\u0106\7\"\2\2\u0106\u0107\7\23\2\2\u0107\u0108\5\30\r\2\u0108\u0109\7"+
		"\24\2\2\u0109\u010b\5\26\f\2\u010a\u010c\7\36\2\2\u010b\u010a\3\2\2\2"+
		"\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010e\7#\2\2\u010e\u010f"+
		"\5\26\f\2\u010f\u013c\3\2\2\2\u0110\u0114\7\25\2\2\u0111\u0113\7\36\2"+
		"\2\u0112\u0111\3\2\2\2\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115"+
		"\3\2\2\2\u0115\u0117\3\2\2\2\u0116\u0114\3\2\2\2\u0117\u0119\7\23\2\2"+
		"\u0118\u011a\5\22\n\2\u0119\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b"+
		"\3\2\2\2\u011b\u011c\7\24\2\2\u011c\u0120\7\6\2\2\u011d\u011f\7\36\2\2"+
		"\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121"+
		"\3\2\2\2\u0121\u0125\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0126\5\26\f\2"+
		"\u0124\u0126\5\30\r\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2\2\2\u0126\u012a"+
		"\3\2\2\2\u0127\u0129\7\36\2\2\u0128\u0127\3\2\2\2\u0129\u012c\3\2\2\2"+
		"\u012a\u0128\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d\3\2\2\2\u012c\u012a"+
		"\3\2\2\2\u012d\u012e\7\26\2\2\u012e\u013c\3\2\2\2\u012f\u0130\7\60\2\2"+
		"\u0130\u013c\5\30\r\7\u0131\u013c\7;\2\2\u0132\u0133\7\23\2\2\u0133\u0134"+
		"\5\30\r\2\u0134\u0135\7\24\2\2\u0135\u013c\3\2\2\2\u0136\u0137\7\27\2"+
		"\2\u0137\u0138\5\24\13\2\u0138\u0139\7\30\2\2\u0139\u013c\3\2\2\2\u013a"+
		"\u013c\7\36\2\2\u013b\u00bc\3\2\2\2\u013b\u00be\3\2\2\2\u013b\u00bf\3"+
		"\2\2\2\u013b\u00c0\3\2\2\2\u013b\u00c1\3\2\2\2\u013b\u00c2\3\2\2\2\u013b"+
		"\u00c3\3\2\2\2\u013b\u00c4\3\2\2\2\u013b\u00c5\3\2\2\2\u013b\u00c6\3\2"+
		"\2\2\u013b\u00ca\3\2\2\2\u013b\u00d2\3\2\2\2\u013b\u00d4\3\2\2\2\u013b"+
		"\u00da\3\2\2\2\u013b\u00e0\3\2\2\2\u013b\u0105\3\2\2\2\u013b\u0110\3\2"+
		"\2\2\u013b\u012f\3\2\2\2\u013b\u0131\3\2\2\2\u013b\u0132\3\2\2\2\u013b"+
		"\u0136\3\2\2\2\u013b\u013a\3\2\2\2\u013c\u0162\3\2\2\2\u013d\u013e\f\22"+
		"\2\2\u013e\u013f\t\3\2\2\u013f\u0161\5\30\r\23\u0140\u0141\f\21\2\2\u0141"+
		"\u0142\t\4\2\2\u0142\u0161\5\30\r\22\u0143\u0144\f\20\2\2\u0144\u0145"+
		"\t\5\2\2\u0145\u0161\5\30\r\21\u0146\u0147\f\17\2\2\u0147\u0148\7\20\2"+
		"\2\u0148\u0161\5\30\r\20\u0149\u014a\f\16\2\2\u014a\u014b\7\21\2\2\u014b"+
		"\u0161\5\30\r\17\u014c\u014d\f\r\2\2\u014d\u014e\7\22\2\2\u014e\u0161"+
		"\5\30\r\16\u014f\u0150\f\f\2\2\u0150\u0151\7\4\2\2\u0151\u0161\5\30\r"+
		"\r\u0152\u0153\f\27\2\2\u0153\u0154\7\7\2\2\u0154\u0161\7;\2\2\u0155\u0156"+
		"\f\25\2\2\u0156\u0157\7\27\2\2\u0157\u0158\5\30\r\2\u0158\u0159\7\30\2"+
		"\2\u0159\u0161\3\2\2\2\u015a\u015b\f\23\2\2\u015b\u015d\7\23\2\2\u015c"+
		"\u015e\5\24\13\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3"+
		"\2\2\2\u015f\u0161\7\24\2\2\u0160\u013d\3\2\2\2\u0160\u0140\3\2\2\2\u0160"+
		"\u0143\3\2\2\2\u0160\u0146\3\2\2\2\u0160\u0149\3\2\2\2\u0160\u014c\3\2"+
		"\2\2\u0160\u014f\3\2\2\2\u0160\u0152\3\2\2\2\u0160\u0155\3\2\2\2\u0160"+
		"\u015a\3\2\2\2\u0161\u0164\3\2\2\2\u0162\u0160\3\2\2\2\u0162\u0163\3\2"+
		"\2\2\u0163\31\3\2\2\2\u0164\u0162\3\2\2\2,\35#)\639?ELRW]biosxz~\u0085"+
		"\u0097\u009f\u00a5\u00ac\u00b3\u00b7\u00ce\u00d7\u00e8\u00ee\u00f5\u00f9"+
		"\u0101\u010b\u0114\u0119\u0120\u0125\u012a\u013b\u015d\u0160\u0162";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}