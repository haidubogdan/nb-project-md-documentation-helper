package org.netbeans.modules.utils.project.md.editor.parser.astnodes;

import java.util.ArrayList;
import org.netbeans.modules.utils.project.md.editor.parser.astnodes.visitors.Visitor;

/**
 *
 * @author bhaidu
 */
public class MdLine extends MdElement {

    ArrayList<ASTNode> contentItems;

    public MdLine(int start, int end, ArrayList<ASTNode> contentItems) {
        super(start, end);
        this.contentItems = contentItems;
    }

    public void addContentItem(ASTNode item) {
        contentItems.add(item);
    }

    @Override
    public String toString() {
        if (contentItems.isEmpty()) {
            return "<p></p>";
        }

        boolean surroundInParagraph = true;
        ASTNode firstItem = contentItems.get(0);

        if (firstItem instanceof MdList ||
                firstItem instanceof Code) {
            surroundInParagraph = false;
        }

        StringBuilder sb = new StringBuilder();

        if (surroundInParagraph) {
            sb.append("<p>");
        }
        for (ASTNode item : contentItems) {
            sb.append(item.toString());
        }
        if (surroundInParagraph) {
            sb.append("</p>");
        }
        return sb.toString();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
