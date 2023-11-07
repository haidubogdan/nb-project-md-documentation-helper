package org.netbeans.modules.utils.project.md.editor.parser.astnodes;

import org.netbeans.modules.utils.project.md.editor.parser.astnodes.visitors.Visitor;

/**
 *
 * @author bhaidu
 */
public class HyperLink extends MdElement {
    private final String hrefAttribute;
    private final String label;
    private TextEffect.Type textEffect = null;

    public HyperLink(int start, int end, String hrefAttribute, String label) {
        super(start, end);
        this.hrefAttribute = hrefAttribute;
        this.label = label;
    }

    public HyperLink(int start, int end, String hrefAttribute, String label, TextEffect.Type textEffect) {
        super(start, end);
        this.hrefAttribute = hrefAttribute;
        this.label = label;
        this.textEffect = textEffect;
    }
        
    @Override
    public String toString() {
        
        String link =  "<a href=\\\"" + hrefAttribute + "\\\">" + label + "</a>";
        if (textEffect != null && textEffect.equals(TextEffect.Type.BOLD)){
            link = "<b>" + link + "</b>";
        }
        return link;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
