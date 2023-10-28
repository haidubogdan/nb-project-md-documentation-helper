package org.netbeans.modules.utils.project.md.editor.parser.astnodes;

import org.netbeans.modules.utils.project.md.editor.parser.astnodes.visitors.Visitor;

/**
 *
 * @author bhaidu
 */
public class Scalar extends MdElement {
        String content;

    public Scalar(int start, int end, String content) {
        super(start, end);
        this.content = content;
    }

    @Override
    public String toString() {
       return content;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
