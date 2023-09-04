// Generated from MdAntlrParser.g4 by ANTLR 4.13.0

  package org.antlr.parser.markdown;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MdAntlrParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TOKEN_REF=1, RULE_REF=2, LEXER_CHAR_SET=3, LI_PRE_WS=4, BLOCK_CODE=5, 
		TriBacktip=6, HTML=7, NL=8, WS=9, HEADER=10, BREAK_LINE=11, BOLD=12, ITALIC=13, 
		CODE=14, RAW_TEXT=15;
	public static final int
		RULE_file = 0, RULE_element = 1, RULE_list = 2, RULE_header = 3, RULE_breakLine = 4, 
		RULE_textEffect = 5, RULE_html = 6, RULE_rawText = 7, RULE_listItem = 8, 
		RULE_code = 9, RULE_blockCode = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "element", "list", "header", "breakLine", "textEffect", "html", 
			"rawText", "listItem", "code", "blockCode"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'```'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TOKEN_REF", "RULE_REF", "LEXER_CHAR_SET", "LI_PRE_WS", "BLOCK_CODE", 
			"TriBacktip", "HTML", "NL", "WS", "HEADER", "BREAK_LINE", "BOLD", "ITALIC", 
			"CODE", "RAW_TEXT"
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
	public String getGrammarFileName() { return "MdAntlrParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MdAntlrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MdAntlrParser.EOF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).exitFile(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				element();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 48528L) != 0) );
			setState(27);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElementContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public BreakLineContext breakLine() {
			return getRuleContext(BreakLineContext.class,0);
		}
		public TextEffectContext textEffect() {
			return getRuleContext(TextEffectContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public HtmlContext html() {
			return getRuleContext(HtmlContext.class,0);
		}
		public RawTextContext rawText() {
			return getRuleContext(RawTextContext.class,0);
		}
		public TerminalNode NL() { return getToken(MdAntlrParser.NL, 0); }
		public ElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).enterElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).exitElement(this);
		}
	}

	public final ElementContext element() throws RecognitionException {
		ElementContext _localctx = new ElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_element);
		try {
			setState(36);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEADER:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				header();
				}
				break;
			case BREAK_LINE:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				breakLine();
				}
				break;
			case BOLD:
			case ITALIC:
				enterOuterAlt(_localctx, 3);
				{
				setState(31);
				textEffect();
				}
				break;
			case LI_PRE_WS:
				enterOuterAlt(_localctx, 4);
				{
				setState(32);
				list();
				}
				break;
			case HTML:
				enterOuterAlt(_localctx, 5);
				{
				setState(33);
				html();
				}
				break;
			case RAW_TEXT:
				enterOuterAlt(_localctx, 6);
				{
				setState(34);
				rawText();
				}
				break;
			case NL:
				enterOuterAlt(_localctx, 7);
				{
				setState(35);
				match(NL);
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
	public static class ListContext extends ParserRuleContext {
		public List<ListItemContext> listItem() {
			return getRuleContexts(ListItemContext.class);
		}
		public ListItemContext listItem(int i) {
			return getRuleContext(ListItemContext.class,i);
		}
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(38);
					listItem();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(41); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
	public static class HeaderContext extends ParserRuleContext {
		public TerminalNode HEADER() { return getToken(MdAntlrParser.HEADER, 0); }
		public HeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_header; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).enterHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).exitHeader(this);
		}
	}

	public final HeaderContext header() throws RecognitionException {
		HeaderContext _localctx = new HeaderContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(HEADER);
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
	public static class BreakLineContext extends ParserRuleContext {
		public TerminalNode BREAK_LINE() { return getToken(MdAntlrParser.BREAK_LINE, 0); }
		public TerminalNode NL() { return getToken(MdAntlrParser.NL, 0); }
		public BreakLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).enterBreakLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).exitBreakLine(this);
		}
	}

	public final BreakLineContext breakLine() throws RecognitionException {
		BreakLineContext _localctx = new BreakLineContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_breakLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(BREAK_LINE);
			setState(46);
			match(NL);
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
	public static class TextEffectContext extends ParserRuleContext {
		public TerminalNode BOLD() { return getToken(MdAntlrParser.BOLD, 0); }
		public TerminalNode ITALIC() { return getToken(MdAntlrParser.ITALIC, 0); }
		public TextEffectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textEffect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).enterTextEffect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).exitTextEffect(this);
		}
	}

	public final TextEffectContext textEffect() throws RecognitionException {
		TextEffectContext _localctx = new TextEffectContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_textEffect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			_la = _input.LA(1);
			if ( !(_la==BOLD || _la==ITALIC) ) {
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
	public static class HtmlContext extends ParserRuleContext {
		public TerminalNode HTML() { return getToken(MdAntlrParser.HTML, 0); }
		public HtmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).enterHtml(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).exitHtml(this);
		}
	}

	public final HtmlContext html() throws RecognitionException {
		HtmlContext _localctx = new HtmlContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_html);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(HTML);
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
	public static class RawTextContext extends ParserRuleContext {
		public TerminalNode RAW_TEXT() { return getToken(MdAntlrParser.RAW_TEXT, 0); }
		public RawTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).enterRawText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).exitRawText(this);
		}
	}

	public final RawTextContext rawText() throws RecognitionException {
		RawTextContext _localctx = new RawTextContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_rawText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(RAW_TEXT);
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
	public static class ListItemContext extends ParserRuleContext {
		public TerminalNode LI_PRE_WS() { return getToken(MdAntlrParser.LI_PRE_WS, 0); }
		public ListItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).enterListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).exitListItem(this);
		}
	}

	public final ListItemContext listItem() throws RecognitionException {
		ListItemContext _localctx = new ListItemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_listItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(LI_PRE_WS);
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
	public static class CodeContext extends ParserRuleContext {
		public TerminalNode CODE() { return getToken(MdAntlrParser.CODE, 0); }
		public CodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_code; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).enterCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).exitCode(this);
		}
	}

	public final CodeContext code() throws RecognitionException {
		CodeContext _localctx = new CodeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(CODE);
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
	public static class BlockCodeContext extends ParserRuleContext {
		public TerminalNode BLOCK_CODE() { return getToken(MdAntlrParser.BLOCK_CODE, 0); }
		public BlockCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).enterBlockCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).exitBlockCode(this);
		}
	}

	public final BlockCodeContext blockCode() throws RecognitionException {
		BlockCodeContext _localctx = new BlockCodeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_blockCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(BLOCK_CODE);
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
		"\u0004\u0001\u000f=\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0004\u0000\u0018"+
		"\b\u0000\u000b\u0000\f\u0000\u0019\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001%\b\u0001\u0001\u0002\u0004\u0002(\b\u0002\u000b\u0002\f\u0002"+
		")\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0000\u0000\u000b\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0001\u0001\u0000\f\r"+
		"9\u0000\u0017\u0001\u0000\u0000\u0000\u0002$\u0001\u0000\u0000\u0000\u0004"+
		"\'\u0001\u0000\u0000\u0000\u0006+\u0001\u0000\u0000\u0000\b-\u0001\u0000"+
		"\u0000\u0000\n0\u0001\u0000\u0000\u0000\f2\u0001\u0000\u0000\u0000\u000e"+
		"4\u0001\u0000\u0000\u0000\u00106\u0001\u0000\u0000\u0000\u00128\u0001"+
		"\u0000\u0000\u0000\u0014:\u0001\u0000\u0000\u0000\u0016\u0018\u0003\u0002"+
		"\u0001\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u0019\u0001\u0000"+
		"\u0000\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000"+
		"\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0000"+
		"\u0000\u0001\u001c\u0001\u0001\u0000\u0000\u0000\u001d%\u0003\u0006\u0003"+
		"\u0000\u001e%\u0003\b\u0004\u0000\u001f%\u0003\n\u0005\u0000 %\u0003\u0004"+
		"\u0002\u0000!%\u0003\f\u0006\u0000\"%\u0003\u000e\u0007\u0000#%\u0005"+
		"\b\u0000\u0000$\u001d\u0001\u0000\u0000\u0000$\u001e\u0001\u0000\u0000"+
		"\u0000$\u001f\u0001\u0000\u0000\u0000$ \u0001\u0000\u0000\u0000$!\u0001"+
		"\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000$#\u0001\u0000\u0000\u0000"+
		"%\u0003\u0001\u0000\u0000\u0000&(\u0003\u0010\b\u0000\'&\u0001\u0000\u0000"+
		"\u0000()\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000"+
		"\u0000\u0000*\u0005\u0001\u0000\u0000\u0000+,\u0005\n\u0000\u0000,\u0007"+
		"\u0001\u0000\u0000\u0000-.\u0005\u000b\u0000\u0000./\u0005\b\u0000\u0000"+
		"/\t\u0001\u0000\u0000\u000001\u0007\u0000\u0000\u00001\u000b\u0001\u0000"+
		"\u0000\u000023\u0005\u0007\u0000\u00003\r\u0001\u0000\u0000\u000045\u0005"+
		"\u000f\u0000\u00005\u000f\u0001\u0000\u0000\u000067\u0005\u0004\u0000"+
		"\u00007\u0011\u0001\u0000\u0000\u000089\u0005\u000e\u0000\u00009\u0013"+
		"\u0001\u0000\u0000\u0000:;\u0005\u0005\u0000\u0000;\u0015\u0001\u0000"+
		"\u0000\u0000\u0003\u0019$)";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}