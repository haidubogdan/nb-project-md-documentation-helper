package org.netbeans.modules.utils.project.md.editor.parser.astnodes;

import java.util.ArrayList;
import org.netbeans.modules.utils.project.md.editor.parser.astnodes.visitors.Visitor;

/**
 *
 * @author bhaidu
 */
public class MdList extends MdElement {

    private ArrayList<ListItem> children;

    public MdList(int start, int end, ArrayList<ListItem> children) {
        super(start, end);
        this.children = children;
    }

    @Override
    public String toString() {
        String ul = "<ul>";
        for (ListItem li : children) {
            ul += li.toString();
        }
        ul += "</ul>";
        return ul;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
