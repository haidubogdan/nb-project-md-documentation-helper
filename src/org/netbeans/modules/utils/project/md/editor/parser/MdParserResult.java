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
    
    public MarkdownFile getAstnMarkdownFile(){
        return astMarkdownfile;
    }

    protected ParseTreeListener createElementsListener() {
        astMarkdownfile = new MarkdownFile(0, getSnapshot().getText().length());
        return new MdAntlrParserBaseListener() {
            
            @Override
            public void enterFile(MdAntlrParser.FileContext ctx) {
                int x = 1;
            }
            
            @Override
            public void exitElement(MdAntlrParser.ElementContext ctx) {
                int x = 1;
            }

            @Override
            public void exitHeader(MdAntlrParser.HeaderContext ctx) {

                if (ctx.HEADER() == null || ctx.HEADER().getSymbol()== null){
                    return;
                }

                Token token = ctx.HEADER().getSymbol();
                astMarkdownfile.addMdElement(new Header(token.getStartIndex(), token.getStopIndex() + 1, token.getText()));
            }
            
            @Override
            public void exitList(MdAntlrParser.ListContext ctx) {
                   Token token = ctx.getStart();
                
                ArrayList<ListItem> listItems = new ArrayList<>();
                
                for (ParseTree child : ctx.children){
                    MdAntlrParser.ListItemContext listItemContext = (MdAntlrParser.ListItemContext) child;
                    Token liItemToken = listItemContext.getStart();
                    int start = liItemToken.getStartIndex();
                    int stop = liItemToken.getStopIndex() + 1;
                    listItems.add(new ListItem(start, stop, liItemToken.getText()));
                }
                
                MdList MdList = new MdList(token.getStartIndex(), token.getStopIndex() + 1, listItems);
                astMarkdownfile.addMdElement(MdList);
            }
            
            @Override
            public void exitHtml(MdAntlrParser.HtmlContext ctx) {
               if (ctx.HTML() == null || ctx.HTML().getSymbol()== null){
                    return;
                }

                Token token = ctx.HTML().getSymbol();
                astMarkdownfile.addMdElement(new HtmlElement(token.getStartIndex(), token.getStopIndex() + 1, token.getText()));
            }
            
            @Override
            public void exitBreakLine(MdAntlrParser.BreakLineContext ctx){
                
            }
            
            public void addReference(ReferenceType type, Token token) {
                OffsetRange range = new OffsetRange(token.getStartIndex(), token.getStopIndex() + 1);
                String name = token.getText();
                Reference ref = new Reference(type, name, range);
                references.put(ref.name, ref);
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
