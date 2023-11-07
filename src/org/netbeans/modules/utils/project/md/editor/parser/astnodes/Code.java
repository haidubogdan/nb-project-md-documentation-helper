package org.netbeans.modules.utils.project.md.editor.parser.astnodes;

import org.netbeans.modules.utils.project.md.editor.parser.astnodes.visitors.Visitor;

/**
 *
 * @author bhaidu
 */
public class Code extends MdElement {

    String content;

    public Code(int start, int end, String content) {
        super(start, end);
        this.content = content;
    }

    @Override
    public String toString() {
        if (content == null || content.isEmpty()){
            return "";
        }
        if (content.length() < 2){
            return "";
        }

        int trimLength = 1;
        if (content.substring(0, 2).equals("``")){
            if (content.length() < 4){
                return "";
            }
            trimLength = 2;
        }

        return "<code>" + content.substring(trimLength, content.length() - trimLength) + "</code>";
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
