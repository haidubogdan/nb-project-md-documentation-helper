package org.netbeans.modules.utils.project.md.editor.parser.astnodes;

import org.netbeans.modules.utils.project.md.editor.parser.astnodes.visitors.Visitor;

/**
 *
 * @author bhaidu
 */
public class Code extends MdElement {

    String content;

    public Code(int start, int end, String content) {
        super(start, end);
        this.content = content;
    }

    @Override
    public String toString() {
        if (content.length() < 4){
            return "";
        }
        return "<code>" + content.substring(2, content.length() - 2) + "</code>";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
