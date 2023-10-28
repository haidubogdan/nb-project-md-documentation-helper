package org.netbeans.modules.utils.project.md.editor.parser.astnodes;

import org.netbeans.modules.utils.project.md.editor.parser.astnodes.visitors.Visitor;

/**
 *
 * @author bhaidu
 */
public class TextEffect extends MdElement {

    String content;
    Type type;

    public static enum Type {
        BOLD,
        ITALIC;
    }

    public TextEffect(int start, int end, Type type, String content) {
        super(start, end);
        this.content = content;
        this.type = type;
    }

    @Override
    public String toString() {
        String htmlName = "";
        if (type.equals(Type.BOLD)){
            htmlName = "b";
        } else if (type.equals(Type.ITALIC)){
            htmlName = "i";
        }

        if (htmlName.isEmpty()){
            return content;
        }

        return "<" + htmlName + ">" + content + "</" + htmlName + ">";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
