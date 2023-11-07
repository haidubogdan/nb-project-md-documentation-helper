package org.antlr.parser.markdown;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import org.antlr.v4.runtime.*;
import org.antlr.parser.markdown.MdAntlrLexer;

/**
 *
 * @author bhaidu
 */
public class MdUtils {

    public static String getFileContent(File file) throws Exception {
        StringBuffer sb = new StringBuffer();
        String lineSep = "\n";//NOI18N
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
        String line = br.readLine();
        while (line != null) {
            sb.append(line);
            sb.append(lineSep);
            line = br.readLine();
        }
        br.close();
        return sb.toString();
    }

    public static CommonTokenStream getTokenStream(String content) {
        CharStream stream = new ANTLRInputStream(content);
        MdAntlrLexer lexer = new MdAntlrLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill();
        return tokens;
    }
}
