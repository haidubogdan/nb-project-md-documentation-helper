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
    private boolean isImage = false;

    public HyperLink(int start, int end, String hrefAttribute, String label,
            boolean isImage) {
        super(start, end);
        this.hrefAttribute = hrefAttribute;
        this.label = label;
        this.isImage = isImage;
    }

    public HyperLink(int start, int end, String hrefAttribute, String label,
            TextEffect.Type textEffect, boolean isImage) {
        super(start, end);
        this.hrefAttribute = hrefAttribute;
        this.label = label;
        this.textEffect = textEffect;
        this.isImage = isImage;
    }
        
    @Override
    public String toString() {
        String link;

        if (isImage){
            //image
            link =  "<img  src=\"" + hrefAttribute + "\" alt=\"" + label + "\"/>";
        } else {
            link =  "<a href=\"" + hrefAttribute + "\">" + label + "</a>";
        }

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
