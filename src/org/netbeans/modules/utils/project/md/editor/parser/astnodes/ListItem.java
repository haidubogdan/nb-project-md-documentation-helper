package org.netbeans.modules.utils.project.md.editor.parser.astnodes;

import java.util.ArrayList;
import org.netbeans.modules.utils.project.md.editor.parser.astnodes.visitors.Visitor;

/**
 *
 * @author bhaidu
 */
public class ListItem extends MdElement {

    ArrayList<ASTNode> contentItems;

    public ListItem(int start, int end, ArrayList<ASTNode> contentItems) {
        super(start, end);
        this.contentItems = contentItems;
    }

    public void addContentItem(ASTNode item) {
        contentItems.add(item);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("<li>");
        for (ASTNode item : contentItems) {
            sb.append(item.toString());
        }
        sb.append("</li>");
        return sb.toString();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
