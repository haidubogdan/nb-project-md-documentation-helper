package org.netbeans.modules.utils.project.md.editor.parser.astnodes;

import org.netbeans.modules.utils.project.md.editor.parser.astnodes.visitors.Visitor;

/**
 *
 * @author bhaidu
 */
public class ListItem extends MdElement {

    String content;

    public ListItem(int start, int end, String content) {
        super(start, end);
        this.content = content;
    }

    @Override
    public String toString() {
        return "<li>" + content + "</li>";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
