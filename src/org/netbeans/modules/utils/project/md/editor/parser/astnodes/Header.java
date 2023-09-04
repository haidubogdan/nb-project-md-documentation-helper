package org.netbeans.modules.utils.project.md.editor.parser.astnodes;

import org.netbeans.modules.utils.project.md.editor.parser.astnodes.visitors.Visitor;

/**
 *
 * @author bhaidu
 */
public class Header extends MdElement {

    String content;

    public Header(int start, int end, String content) {
        super(start, end);
        this.content = content;
    }

    @Override
    public String toString() {
        int pos = content.indexOf("# ") + 1;
        String hType = String.valueOf(pos);
        return "<h" + hType + ">" + content.substring(pos) + hType + "</h" + hType + ">";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
