package org.netbeans.modules.utils.project.md.editor.parser.astnodes;

import org.netbeans.modules.utils.project.md.editor.parser.astnodes.visitors.Visitor;

/**
 *
 * @author bhaidu
 */
public class HyperLink extends MdElement {
    private final String hrefAttribute;
    private final String label;

    public HyperLink(int start, int end, String hrefAttribute, String label) {
        super(start, end);
        this.hrefAttribute = hrefAttribute;
        this.label = label;
    }

    @Override
    public String toString() {
        return "<a href=\\\"" + hrefAttribute + "\\\">" + label + "</a>";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
