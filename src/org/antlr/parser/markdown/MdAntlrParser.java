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
		TriBacktip=6, HTML=7, NL=8, HEADER=9, BREAK_LINE=10, BOLD_START=11, ITALIC=12, 
		CODE=13, FENCED_CODEBLOCK=14, HYPER_LINK_LABEL=15, HYPER_LINK=16, RAW_TEXT=17, 
		BOLD_END=18, BOLD=19;
	public static final int
		RULE_file = 0, RULE_main_element = 1, RULE_line = 2, RULE_element = 3, 
		RULE_list = 4, RULE_listItem = 5, RULE_header = 6, RULE_breakLine = 7, 
		RULE_boldLink = 8, RULE_textEffect = 9, RULE_html = 10, RULE_rawText = 11, 
		RULE_code = 12, RULE_blockCode = 13, RULE_link = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "main_element", "line", "element", "list", "listItem", "header", 
			"breakLine", "boldLink", "textEffect", "html", "rawText", "code", "blockCode", 
			"link"
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
			"TriBacktip", "HTML", "NL", "HEADER", "BREAK_LINE", "BOLD_START", "ITALIC", 
			"CODE", "FENCED_CODEBLOCK", "HYPER_LINK_LABEL", "HYPER_LINK", "RAW_TEXT", 
			"BOLD_END", "BOLD"
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
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				main_element();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 180112L) != 0) );
			setState(35);
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
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public TerminalNode NL() { return getToken(MdAntlrParser.NL, 0); }
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
			setState(40);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HEADER:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				header();
				}
				break;
			case LI_PRE_WS:
			case HTML:
			case BREAK_LINE:
			case BOLD_START:
			case ITALIC:
			case CODE:
			case HYPER_LINK_LABEL:
			case RAW_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				line();
				}
				break;
			case NL:
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
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
	public static class LineContext extends ParserRuleContext {
		public TerminalNode NL() { return getToken(MdAntlrParser.NL, 0); }
		public TerminalNode EOF() { return getToken(MdAntlrParser.EOF, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_line);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(42);
				element();
				}
				}
				setState(45); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 179344L) != 0) );
			setState(47);
			_la = _input.LA(1);
			if ( !(_la==EOF || _la==NL) ) {
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
	public static class ElementContext extends ParserRuleContext {
		public BreakLineContext breakLine() {
			return getRuleContext(BreakLineContext.class,0);
		}
		public BoldLinkContext boldLink() {
			return getRuleContext(BoldLinkContext.class,0);
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
		enterRule(_localctx, 6, RULE_element);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				breakLine();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				boldLink();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				textEffect();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				link();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				code();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				list();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(55);
				html();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(56);
				rawText();
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
		enterRule(_localctx, 8, RULE_list);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(60); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(59);
					listItem();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(62); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		public TerminalNode NL() { return getToken(MdAntlrParser.NL, 0); }
		public List<ElementContext> element() {
			return getRuleContexts(ElementContext.class);
		}
		public ElementContext element(int i) {
			return getRuleContext(ElementContext.class,i);
		}
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
		enterRule(_localctx, 10, RULE_listItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(LI_PRE_WS);
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				element();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 179344L) != 0) );
			setState(70);
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
		enterRule(_localctx, 12, RULE_header);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
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
		enterRule(_localctx, 14, RULE_breakLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(BREAK_LINE);
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
	public static class BoldLinkContext extends ParserRuleContext {
		public TerminalNode BOLD_START() { return getToken(MdAntlrParser.BOLD_START, 0); }
		public TerminalNode HYPER_LINK_LABEL() { return getToken(MdAntlrParser.HYPER_LINK_LABEL, 0); }
		public TerminalNode HYPER_LINK() { return getToken(MdAntlrParser.HYPER_LINK, 0); }
		public TerminalNode BOLD_END() { return getToken(MdAntlrParser.BOLD_END, 0); }
		public BoldLinkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boldLink; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).enterBoldLink(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MdAntlrParserListener ) ((MdAntlrParserListener)listener).exitBoldLink(this);
		}
	}

	public final BoldLinkContext boldLink() throws RecognitionException {
		BoldLinkContext _localctx = new BoldLinkContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_boldLink);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(BOLD_START);
			setState(77);
			match(HYPER_LINK_LABEL);
			setState(78);
			match(HYPER_LINK);
			setState(79);
			match(BOLD_END);
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
		public TerminalNode BOLD_START() { return getToken(MdAntlrParser.BOLD_START, 0); }
		public TerminalNode BOLD_END() { return getToken(MdAntlrParser.BOLD_END, 0); }
		public List<TerminalNode> BOLD() { return getTokens(MdAntlrParser.BOLD); }
		public TerminalNode BOLD(int i) {
			return getToken(MdAntlrParser.BOLD, i);
		}
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
		enterRule(_localctx, 18, RULE_textEffect);
		int _la;
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BOLD_START:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(BOLD_START);
				setState(83); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(82);
					match(BOLD);
					}
					}
					setState(85); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==BOLD );
				setState(87);
				match(BOLD_END);
				}
				break;
			case ITALIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(ITALIC);
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
		enterRule(_localctx, 20, RULE_html);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
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
		enterRule(_localctx, 22, RULE_rawText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
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
		enterRule(_localctx, 24, RULE_code);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
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
		enterRule(_localctx, 26, RULE_blockCode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
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
		enterRule(_localctx, 28, RULE_link);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(HYPER_LINK_LABEL);
			setState(100);
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
		"\u0004\u0001\u0013g\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0001\u0000\u0004\u0000"+
		" \b\u0000\u000b\u0000\f\u0000!\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001)\b\u0001\u0001\u0002\u0004\u0002,\b\u0002"+
		"\u000b\u0002\f\u0002-\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003:\b\u0003\u0001\u0004\u0004\u0004=\b\u0004\u000b\u0004\f\u0004"+
		">\u0001\u0005\u0001\u0005\u0004\u0005C\b\u0005\u000b\u0005\f\u0005D\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0004\tT\b\t\u000b"+
		"\t\f\tU\u0001\t\u0001\t\u0003\tZ\b\t\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0000\u0000\u000f\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u0000\u0001\u0001\u0001\b\bf\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0002(\u0001\u0000\u0000\u0000\u0004+\u0001"+
		"\u0000\u0000\u0000\u00069\u0001\u0000\u0000\u0000\b<\u0001\u0000\u0000"+
		"\u0000\n@\u0001\u0000\u0000\u0000\fH\u0001\u0000\u0000\u0000\u000eJ\u0001"+
		"\u0000\u0000\u0000\u0010L\u0001\u0000\u0000\u0000\u0012Y\u0001\u0000\u0000"+
		"\u0000\u0014[\u0001\u0000\u0000\u0000\u0016]\u0001\u0000\u0000\u0000\u0018"+
		"_\u0001\u0000\u0000\u0000\u001aa\u0001\u0000\u0000\u0000\u001cc\u0001"+
		"\u0000\u0000\u0000\u001e \u0003\u0002\u0001\u0000\u001f\u001e\u0001\u0000"+
		"\u0000\u0000 !\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000\u0000"+
		"!\"\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#$\u0005\u0000\u0000"+
		"\u0001$\u0001\u0001\u0000\u0000\u0000%)\u0003\f\u0006\u0000&)\u0003\u0004"+
		"\u0002\u0000\')\u0005\b\u0000\u0000(%\u0001\u0000\u0000\u0000(&\u0001"+
		"\u0000\u0000\u0000(\'\u0001\u0000\u0000\u0000)\u0003\u0001\u0000\u0000"+
		"\u0000*,\u0003\u0006\u0003\u0000+*\u0001\u0000\u0000\u0000,-\u0001\u0000"+
		"\u0000\u0000-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000./\u0001"+
		"\u0000\u0000\u0000/0\u0007\u0000\u0000\u00000\u0005\u0001\u0000\u0000"+
		"\u00001:\u0003\u000e\u0007\u00002:\u0003\u0010\b\u00003:\u0003\u0012\t"+
		"\u00004:\u0003\u001c\u000e\u00005:\u0003\u0018\f\u00006:\u0003\b\u0004"+
		"\u00007:\u0003\u0014\n\u00008:\u0003\u0016\u000b\u000091\u0001\u0000\u0000"+
		"\u000092\u0001\u0000\u0000\u000093\u0001\u0000\u0000\u000094\u0001\u0000"+
		"\u0000\u000095\u0001\u0000\u0000\u000096\u0001\u0000\u0000\u000097\u0001"+
		"\u0000\u0000\u000098\u0001\u0000\u0000\u0000:\u0007\u0001\u0000\u0000"+
		"\u0000;=\u0003\n\u0005\u0000<;\u0001\u0000\u0000\u0000=>\u0001\u0000\u0000"+
		"\u0000><\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?\t\u0001\u0000"+
		"\u0000\u0000@B\u0005\u0004\u0000\u0000AC\u0003\u0006\u0003\u0000BA\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000"+
		"DE\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0005\b\u0000\u0000"+
		"G\u000b\u0001\u0000\u0000\u0000HI\u0005\t\u0000\u0000I\r\u0001\u0000\u0000"+
		"\u0000JK\u0005\n\u0000\u0000K\u000f\u0001\u0000\u0000\u0000LM\u0005\u000b"+
		"\u0000\u0000MN\u0005\u000f\u0000\u0000NO\u0005\u0010\u0000\u0000OP\u0005"+
		"\u0012\u0000\u0000P\u0011\u0001\u0000\u0000\u0000QS\u0005\u000b\u0000"+
		"\u0000RT\u0005\u0013\u0000\u0000SR\u0001\u0000\u0000\u0000TU\u0001\u0000"+
		"\u0000\u0000US\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0001"+
		"\u0000\u0000\u0000WZ\u0005\u0012\u0000\u0000XZ\u0005\f\u0000\u0000YQ\u0001"+
		"\u0000\u0000\u0000YX\u0001\u0000\u0000\u0000Z\u0013\u0001\u0000\u0000"+
		"\u0000[\\\u0005\u0007\u0000\u0000\\\u0015\u0001\u0000\u0000\u0000]^\u0005"+
		"\u0011\u0000\u0000^\u0017\u0001\u0000\u0000\u0000_`\u0005\r\u0000\u0000"+
		"`\u0019\u0001\u0000\u0000\u0000ab\u0005\u0005\u0000\u0000b\u001b\u0001"+
		"\u0000\u0000\u0000cd\u0005\u000f\u0000\u0000de\u0005\u0010\u0000\u0000"+
		"e\u001d\u0001\u0000\u0000\u0000\b!(-9>DUY";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}