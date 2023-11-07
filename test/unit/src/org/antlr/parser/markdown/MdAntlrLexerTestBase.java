package org.antlr.parser.markdown;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.netbeans.junit.NbTestCase;

/**
 *
 * @author bhaidu
 */
public class MdAntlrLexerTestBase extends NbTestCase {

    public MdAntlrLexerTestBase(String testName) {
        super(testName);
    }

    public File getDataDir() {
        URL codebase = getClass().getProtectionDomain().getCodeSource().getLocation();
        File dataDir = null;
        try {
            dataDir = new File(new File(codebase.toURI()), "data");
        } catch (URISyntaxException x) {
            throw new Error(x);
        }
        return dataDir;
    }

    protected void performTest(String filename) throws Exception {
        performTest(filename, null);
    }

    protected String getTestResult(String filename, String caretLine) throws Exception {
        return getTestResult(filename);
    }

    protected void performTest(String filename, String caretLine) throws Exception {
        // parse the file
        String result = getTestResult(filename, caretLine);
        System.out.print(result);
    }

    protected String getTestResult(String filename) throws Exception {
        String content = MdUtils.getFileContent(new File(getDataDir(), "testfiles/" + filename));
        CommonTokenStream tokenStream = MdUtils.getTokenStream(content);
        System.out.print("\n---Lexer scan for <<" + filename + ">>\n\n");
        return createResult(tokenStream);
    }

    protected String createResult(CommonTokenStream tokenStream) throws Exception {
        StringBuilder result = new StringBuilder();

        for (Token token : tokenStream.getTokens()) {
            switch(token.getType()){
                case MdAntlrLexer.RAW_TEXT:
                    result.append("RAW_TEXT ");
                break;
                case MdAntlrLexer.BLOCK_CODE_START:
                    result.append("BLOCK_CODE_START ");
                break;
                case MdAntlrLexer.LANG_TYPE:
                    result.append("LANG_TYPE ");
                break;
                case MdAntlrLexer.BLOCK_CODE:
                    result.append("BLOCK_CODE ");
                break;
                case MdAntlrLexer.BLOCK_CODE_END:
                    result.append("BLOCK_CODE_END ");
                break;
                case MdAntlrLexer.HEADER:
                    result.append("HEADER ");
                break;
            }
            result.append(token.getText());
            result.append("\n");
        }

        return result.toString();
    }
}
