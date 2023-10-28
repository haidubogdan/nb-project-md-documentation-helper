package org.netbeans.modules.utils.project.md.editor.parser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.antlr.parser.markdown.MdAntlrLexer;
import org.antlr.parser.markdown.MdAntlrParser;
import org.antlr.parser.markdown.MdAntlrParserBaseListener;
import org.netbeans.modules.csl.spi.DefaultError;
import org.netbeans.modules.csl.api.Error;
import org.netbeans.modules.csl.api.OffsetRange;
import org.netbeans.modules.csl.spi.ParserResult;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.spi.Parser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.netbeans.modules.utils.project.md.editor.parser.astnodes.*;

/**
 *
 * @author bhaidu
 */
public class MdParserResult<T extends Parser> extends ParserResult {

    public final List<DefaultError> errors = new ArrayList<>();
    public final Map<String, Reference> references = new TreeMap<>();
    public MarkdownFile astMarkdownfile = null;
    public static final Reference EOF = new Reference(ReferenceType.TOKEN, "EOF", OffsetRange.NONE); //NOI18N
    volatile boolean finished = false;

    public MdParserResult(Snapshot snapshot) {
        super(snapshot);
        references.put(EOF.name, EOF);

    }

    protected MdAntlrParser createParser(Snapshot snapshot) {
        CharStream cs = CharStreams.fromString(String.valueOf(snapshot.getText()));
        MdAntlrLexer lexer = new MdAntlrLexer(cs);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MdAntlrParser ret = new MdAntlrParser(tokens);
        ret.removeErrorListener(ConsoleErrorListener.INSTANCE);
        return ret;
    }

    public MdParserResult get() {
        if (!finished) {
            MdAntlrParser parser = createParser(getSnapshot());

            int x = 1;
//            parser.addErrorListener(createErrorListener());
//            parser.addParseListener(createFoldListener());
            parser.addParseListener(createElementsListener());
//            parser.addParseListener(createImportListener());
//            parser.addParseListener(createStructureListener());
//            parser.addParseListener(createOccurancesListener());
            evaluateParser(parser);

            finished = true;
        }
        return this;
    }

    protected void evaluateParser(MdAntlrParser parser) {
        parser.file();
    }

    public MarkdownFile getAstnMarkdownFile() {
        return astMarkdownfile;
    }

    protected ParseTreeListener createElementsListener() {
        astMarkdownfile = new MarkdownFile(0, getSnapshot().getText().length());

        return new MdAntlrParserBaseListener() {
            ArrayList<ListItem> mdListItems = new ArrayList<>();
            ListItem bufferListItem = null;

            @Override
            public void exitHeader(MdAntlrParser.HeaderContext context) {

                if (context.HEADER() == null || context.HEADER().getSymbol() == null) {
                    return;
                }

                Token token = context.HEADER().getSymbol();
                astMarkdownfile.addMdElement(new Header(token.getStartIndex(), token.getStopIndex() + 1, token.getText()));
            }

            @Override
            public void exitHtml(MdAntlrParser.HtmlContext context) {
                if (context.HTML() == null || context.HTML().getSymbol() == null) {
                    return;
                }

                Token token = context.HTML().getSymbol();
                Scalar element = new Scalar(token.getStartIndex(), token.getStopIndex() + 1, token.getText());
                addNodeToAST(element);
            }

            @Override
            public void exitRawText(MdAntlrParser.RawTextContext context) {
                if (context.RAW_TEXT() == null || context.RAW_TEXT().getSymbol() == null) {
                    return;
                }

                Token token = context.RAW_TEXT().getSymbol();
                Scalar element = new Scalar(token.getStartIndex(), token.getStopIndex() + 1, token.getText());
                addNodeToAST(element);
            }

            @Override
            public void exitCode(MdAntlrParser.CodeContext context) {
                if (context.CODE() == null || context.CODE().getSymbol() == null) {
                    return;
                }

                Token token = context.CODE().getSymbol();
                Code element = new Code(token.getStartIndex(), token.getStopIndex() + 1, token.getText());
                addNodeToAST(element);
            }

            @Override
            public void exitTextEffect(MdAntlrParser.TextEffectContext context) {
                if (context.BOLD() != null) {
                    Token token = context.BOLD().getSymbol();
                    if (token.getText().length() < 4) {
                        return;
                    }
                    String text = token.getText().substring(2, token.getText().length() - 2);
                    addNodeToAST(new TextEffect(token.getStartIndex(),
                            token.getStopIndex(), TextEffect.Type.BOLD, text));
                } else if (context.ITALIC() != null) {
                    Token token = context.BOLD().getSymbol();
                    if (token.getText().length() < 2) {
                        return;
                    }
                    String text = token.getText().substring(1, token.getText().length() - 1);
                    addNodeToAST(new TextEffect(token.getStartIndex(),
                            token.getStopIndex(), TextEffect.Type.ITALIC, text));
                }
            }

            @Override
            public void exitLink(MdAntlrParser.LinkContext context) {
                if (context.HYPER_LINK_LABEL() == null || context.HYPER_LINK_LABEL().getSymbol() == null) {
                    return;
                }

                Token label = context.HYPER_LINK_LABEL().getSymbol();
                Token link = context.HYPER_LINK().getSymbol();
                String labelText = label.getText().substring(1, label.getText().length() - 1);
                int start = link.getStartIndex();
                String linkText = link.getText().substring(1, link.getText().length() - 1);
                int end = label.getStopIndex() + 1;
                HyperLink linkElement = new HyperLink(start, end, linkText, labelText);
                addNodeToAST(linkElement);
            }

            @Override
            public void enterList(MdAntlrParser.ListContext context) {
                this.mdListItems = new ArrayList<>();
            }

            @Override
            public void exitList(MdAntlrParser.ListContext context) {
                Token token = context.getStart();
                MdList MdList = new MdList(token.getStartIndex(), token.getStopIndex() + 1, this.mdListItems);
                addNodeToAST(MdList);
            }

            @Override
            public void enterListItem(MdAntlrParser.ListItemContext context) {
                Token token = context.getStart();
                bufferListItem = new ListItem(token.getStartIndex(), token.getStopIndex() + 1, new ArrayList<>());
            }

            @Override
            public void exitListItem(MdAntlrParser.ListItemContext context) {
                this.mdListItems.add(bufferListItem);
                bufferListItem = null;
            }

            public void addReference(ReferenceType type, Token token) {
                OffsetRange range = new OffsetRange(token.getStartIndex(), token.getStopIndex() + 1);
                String name = token.getText();
                Reference ref = new Reference(type, name, range);
                references.put(ref.name, ref);
            }

            private void addNodeToAST(MdElement element) {
                if (bufferListItem != null) {
                    bufferListItem.addContentItem(element);
                } else {
                    astMarkdownfile.addMdElement(element);
                }
            }
        };
    }

    private void checkReferences() {

    }

    @Override
    protected boolean processingFinished() {
        return finished;
    }

    @Override
    public List<? extends Error> getDiagnostics() {
        return errors;
    }

    @Override
    protected void invalidate() {
        //references.clear();
    }

    public enum ReferenceType {
        FRAGMENT, TOKEN, RULE, CHANNEL, MODE
    }

    public static class Reference {

        public final ReferenceType type;
        public final String name;
        public final OffsetRange defOffset;

        public Reference(ReferenceType type, String name, OffsetRange defOffset) {
            this.type = type;
            this.name = name;
            this.defOffset = defOffset;
        }
    }
}
