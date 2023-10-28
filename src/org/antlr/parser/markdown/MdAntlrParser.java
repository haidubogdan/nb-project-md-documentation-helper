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
		TriBacktip=6, HTML=7, NL=8, HEADER=9, BREAK_LINE=10, BOLD=11, ITALIC=12, 
		CODE=13, HYPER_LINK_LABEL=14, HYPER_LINK=15, RAW_TEXT=16;
	public static final int
		RULE_file = 0, RULE_main_element = 1, RULE_element = 2, RULE_list = 3, 
		RULE_listItem = 4, RULE_header = 5, RULE_breakLine = 6, RULE_textEffect = 7, 
		RULE_html = 8, RULE_rawText = 9, RULE_code = 10, RULE_blockCode = 11, 
		RULE_link = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "main_element", "element", "list", "listItem", "header", "breakLine", 
			"textEffect", "html", "rawText", "code", "blockCode", "link"
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
			"TriBacktip", "HTML", "NL", "HEADER", "BREAK_LINE", "BOLD", "ITALIC", 
			"CODE", "HYPER_LINK_LABEL", "HYPER_LINK", "RAW_TEXT"
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
		public List<Main_elementContext> main_element() {
			return getRuleContexts(Main_elementContext.class);
		}
		public Main_elementContext main_element(int i) {
			return getRuleContext(Main_elementContext.class,i);
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
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26);
				main_element();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 98192L) != 0) );
			setState(31);
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
	public static class Main_elementContext extends ParserRuleContext {
		public HeaderContext header() {
			return getRuleContext(HeaderContext.class,0);
		}
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public Main_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main_element; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).enterMain_element(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).exitMain_element(this);
		}
	}

	public final Main_elementContext main_element() throws RecognitionException {
		Main_elementContext _localctx = new Main_elementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_main_element);
		try {
			setState(35);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEADER:
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				header();
				}
				break;
			case LI_PRE_WS:
			case HTML:
			case NL:
			case BREAK_LINE:
			case BOLD:
			case ITALIC:
			case CODE:
			case HYPER_LINK_LABEL:
			case RAW_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				element();
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
	public static class ElementContext extends ParserRuleContext {
		public BreakLineContext breakLine() {
			return getRuleContext(BreakLineContext.class,0);
		}
		public TextEffectContext textEffect() {
			return getRuleContext(TextEffectContext.class,0);
		}
		public LinkContext link() {
			return getRuleContext(LinkContext.class,0);
		}
		public CodeContext code() {
			return getRuleContext(CodeContext.class,0);
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
		enterRule(_localctx, 4, RULE_element);
		try {
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK_LINE:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				breakLine();
				}
				break;
			case BOLD:
			case ITALIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				textEffect();
				}
				break;
			case HYPER_LINK_LABEL:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				link();
				}
				break;
			case CODE:
				enterOuterAlt(_localctx, 4);
				{
				setState(40);
				code();
				}
				break;
			case LI_PRE_WS:
				enterOuterAlt(_localctx, 5);
				{
				setState(41);
				list();
				}
				break;
			case HTML:
				enterOuterAlt(_localctx, 6);
				{
				setState(42);
				html();
				}
				break;
			case RAW_TEXT:
				enterOuterAlt(_localctx, 7);
				{
				setState(43);
				rawText();
				}
				break;
			case NL:
				enterOuterAlt(_localctx, 8);
				{
				setState(44);
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
		enterRule(_localctx, 6, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(48); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(47);
					listItem();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(50); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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
	public static class ListItemContext extends ParserRuleContext {
		public TerminalNode LI_PRE_WS() { return getToken(MdAntlrParser.LI_PRE_WS, 0); }
		public ElementContext element() {
			return getRuleContext(ElementContext.class,0);
		}
		public TerminalNode NL() { return getToken(MdAntlrParser.NL, 0); }
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
		enterRule(_localctx, 8, RULE_listItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(LI_PRE_WS);
			setState(53);
			element();
			setState(54);
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
		enterRule(_localctx, 10, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
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
		enterRule(_localctx, 12, RULE_breakLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(BREAK_LINE);
			setState(59);
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
		enterRule(_localctx, 14, RULE_textEffect);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
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
		enterRule(_localctx, 16, RULE_html);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
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
		enterRule(_localctx, 18, RULE_rawText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
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
		enterRule(_localctx, 20, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
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
		enterRule(_localctx, 22, RULE_blockCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LinkContext extends ParserRuleContext {
		public TerminalNode HYPER_LINK_LABEL() { return getToken(MdAntlrParser.HYPER_LINK_LABEL, 0); }
		public TerminalNode HYPER_LINK() { return getToken(MdAntlrParser.HYPER_LINK, 0); }
		public LinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_link; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).enterLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).exitLink(this);
		}
	}

	public final LinkContext link() throws RecognitionException {
		LinkContext _localctx = new LinkContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(HYPER_LINK_LABEL);
			setState(72);
			match(HYPER_LINK);
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
		"\u0004\u0001\u0010K\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0004\u0000\u001c\b\u0000\u000b\u0000\f\u0000\u001d"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001$\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002.\b\u0002\u0001\u0003\u0004\u0003"+
		"1\b\u0003\u000b\u0003\f\u00032\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0000\u0000\r\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000\u0001"+
		"\u0001\u0000\u000b\fG\u0000\u001b\u0001\u0000\u0000\u0000\u0002#\u0001"+
		"\u0000\u0000\u0000\u0004-\u0001\u0000\u0000\u0000\u00060\u0001\u0000\u0000"+
		"\u0000\b4\u0001\u0000\u0000\u0000\n8\u0001\u0000\u0000\u0000\f:\u0001"+
		"\u0000\u0000\u0000\u000e=\u0001\u0000\u0000\u0000\u0010?\u0001\u0000\u0000"+
		"\u0000\u0012A\u0001\u0000\u0000\u0000\u0014C\u0001\u0000\u0000\u0000\u0016"+
		"E\u0001\u0000\u0000\u0000\u0018G\u0001\u0000\u0000\u0000\u001a\u001c\u0003"+
		"\u0002\u0001\u0000\u001b\u001a\u0001\u0000\u0000\u0000\u001c\u001d\u0001"+
		"\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000\u0000\u001d\u001e\u0001"+
		"\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0005\u0000"+
		"\u0000\u0001 \u0001\u0001\u0000\u0000\u0000!$\u0003\n\u0005\u0000\"$\u0003"+
		"\u0004\u0002\u0000#!\u0001\u0000\u0000\u0000#\"\u0001\u0000\u0000\u0000"+
		"$\u0003\u0001\u0000\u0000\u0000%.\u0003\f\u0006\u0000&.\u0003\u000e\u0007"+
		"\u0000\'.\u0003\u0018\f\u0000(.\u0003\u0014\n\u0000).\u0003\u0006\u0003"+
		"\u0000*.\u0003\u0010\b\u0000+.\u0003\u0012\t\u0000,.\u0005\b\u0000\u0000"+
		"-%\u0001\u0000\u0000\u0000-&\u0001\u0000\u0000\u0000-\'\u0001\u0000\u0000"+
		"\u0000-(\u0001\u0000\u0000\u0000-)\u0001\u0000\u0000\u0000-*\u0001\u0000"+
		"\u0000\u0000-+\u0001\u0000\u0000\u0000-,\u0001\u0000\u0000\u0000.\u0005"+
		"\u0001\u0000\u0000\u0000/1\u0003\b\u0004\u00000/\u0001\u0000\u0000\u0000"+
		"12\u0001\u0000\u0000\u000020\u0001\u0000\u0000\u000023\u0001\u0000\u0000"+
		"\u00003\u0007\u0001\u0000\u0000\u000045\u0005\u0004\u0000\u000056\u0003"+
		"\u0004\u0002\u000067\u0005\b\u0000\u00007\t\u0001\u0000\u0000\u000089"+
		"\u0005\t\u0000\u00009\u000b\u0001\u0000\u0000\u0000:;\u0005\n\u0000\u0000"+
		";<\u0005\b\u0000\u0000<\r\u0001\u0000\u0000\u0000=>\u0007\u0000\u0000"+
		"\u0000>\u000f\u0001\u0000\u0000\u0000?@\u0005\u0007\u0000\u0000@\u0011"+
		"\u0001\u0000\u0000\u0000AB\u0005\u0010\u0000\u0000B\u0013\u0001\u0000"+
		"\u0000\u0000CD\u0005\r\u0000\u0000D\u0015\u0001\u0000\u0000\u0000EF\u0005"+
		"\u0005\u0000\u0000F\u0017\u0001\u0000\u0000\u0000GH\u0005\u000e\u0000"+
		"\u0000HI\u0005\u000f\u0000\u0000I\u0019\u0001\u0000\u0000\u0000\u0004"+
		"\u001d#-2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}