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
        ITALIC,
        STRIKETHROUGH;
    }

    public TextEffect(int start, int end, Type type, String content) {
        super(start, end);
        this.content = content;
        this.type = type;
    }

    @Override
    public String toString() {
        String htmlName = "";
        
        switch(type){
            case BOLD:
               htmlName = "b";
               break;
            case ITALIC:
                htmlName = "i";
                break;
            case STRIKETHROUGH:
                htmlName = "s";
                break;
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
