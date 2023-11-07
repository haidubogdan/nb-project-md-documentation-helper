package org.antlr.parser.markdown;

import org.junit.Test;
import org.netbeans.junit.NbTestCase;

/**
 *
 * @author bhaidu
 */
public class MdAntrlLexerTest extends MdAntlrLexerTestBase {

    public MdAntrlLexerTest(String testName) {
        super(testName);
    }

    @Test
    public void test1() throws Exception {
        performTest("lexer/block_code.md");
    }
}
