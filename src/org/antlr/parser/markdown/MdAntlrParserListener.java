// Generated from MdAntlrParser.g4 by ANTLR 4.13.0

  package org.antlr.parser.markdown;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MdAntlrParser}.
 */
public interface MdAntlrParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MdAntlrParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(MdAntlrParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link MdAntlrParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(MdAntlrParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MdAntlrParser#main_element}.
	 * @param ctx the parse tree
	 */
	void enterMain_element(MdAntlrParser.Main_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MdAntlrParser#main_element}.
	 * @param ctx the parse tree
	 */
	void exitMain_element(MdAntlrParser.Main_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MdAntlrParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(MdAntlrParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MdAntlrParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(MdAntlrParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MdAntlrParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(MdAntlrParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MdAntlrParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(MdAntlrParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MdAntlrParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(MdAntlrParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MdAntlrParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(MdAntlrParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MdAntlrParser#listItem}.
	 * @param ctx the parse tree
	 */
	void enterListItem(MdAntlrParser.ListItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MdAntlrParser#listItem}.
	 * @param ctx the parse tree
	 */
	void exitListItem(MdAntlrParser.ListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MdAntlrParser#header}.
	 * @param ctx the parse tree
	 */
	void enterHeader(MdAntlrParser.HeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link MdAntlrParser#header}.
	 * @param ctx the parse tree
	 */
	void exitHeader(MdAntlrParser.HeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link MdAntlrParser#breakLine}.
	 * @param ctx the parse tree
	 */
	void enterBreakLine(MdAntlrParser.BreakLineContext ctx);
	/**
	 * Exit a parse tree produced by {@link MdAntlrParser#breakLine}.
	 * @param ctx the parse tree
	 */
	void exitBreakLine(MdAntlrParser.BreakLineContext ctx);
	/**
	 * Enter a parse tree produced by {@link MdAntlrParser#boldLink}.
	 * @param ctx the parse tree
	 */
	void enterBoldLink(MdAntlrParser.BoldLinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MdAntlrParser#boldLink}.
	 * @param ctx the parse tree
	 */
	void exitBoldLink(MdAntlrParser.BoldLinkContext ctx);
	/**
	 * Enter a parse tree produced by {@link MdAntlrParser#textEffect}.
	 * @param ctx the parse tree
	 */
	void enterTextEffect(MdAntlrParser.TextEffectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MdAntlrParser#textEffect}.
	 * @param ctx the parse tree
	 */
	void exitTextEffect(MdAntlrParser.TextEffectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MdAntlrParser#html}.
	 * @param ctx the parse tree
	 */
	void enterHtml(MdAntlrParser.HtmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MdAntlrParser#html}.
	 * @param ctx the parse tree
	 */
	void exitHtml(MdAntlrParser.HtmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link MdAntlrParser#rawText}.
	 * @param ctx the parse tree
	 */
	void enterRawText(MdAntlrParser.RawTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link MdAntlrParser#rawText}.
	 * @param ctx the parse tree
	 */
	void exitRawText(MdAntlrParser.RawTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link MdAntlrParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(MdAntlrParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MdAntlrParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(MdAntlrParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MdAntlrParser#blockCode}.
	 * @param ctx the parse tree
	 */
	void enterBlockCode(MdAntlrParser.BlockCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MdAntlrParser#blockCode}.
	 * @param ctx the parse tree
	 */
	void exitBlockCode(MdAntlrParser.BlockCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MdAntlrParser#link}.
	 * @param ctx the parse tree
	 */
	void enterLink(MdAntlrParser.LinkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MdAntlrParser#link}.
	 * @param ctx the parse tree
	 */
	void exitLink(MdAntlrParser.LinkContext ctx);
}