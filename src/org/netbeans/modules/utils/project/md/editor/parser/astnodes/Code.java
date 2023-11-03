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
        if (content.length() < 2){
            return "";
        }
        return "<code>" + content.substring(1, content.length() - 1) + "</code>";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
