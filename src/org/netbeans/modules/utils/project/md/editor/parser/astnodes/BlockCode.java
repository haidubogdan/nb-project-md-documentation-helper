package org.netbeans.modules.utils.project.md.editor.parser.astnodes;

import org.netbeans.modules.utils.project.md.editor.parser.astnodes.visitors.Visitor;

/**
 *
 * @author bhaidu
 */
public class BlockCode extends MdElement {

    String content;
    String lang;

    public BlockCode(int start, int end, String content, String lang) {
        super(start, end);
        this.content = content;
    }

    @Override
    public String toString() {
        if (content.length() < 6){
            return "";
        }

        String langClass = "";
        
        if (lang != null){
            langClass = " class=\"md-" + langClass + "\"";
        }
        return "<pre><code" + langClass + ">" + content.substring(3, content.length() - 3) + "</code></pre>";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
