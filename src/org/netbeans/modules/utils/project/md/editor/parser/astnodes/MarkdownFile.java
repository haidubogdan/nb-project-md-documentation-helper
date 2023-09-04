package org.netbeans.modules.utils.project.md.editor.parser.astnodes;

import java.util.ArrayList;
import java.util.List;
import org.netbeans.modules.utils.project.md.editor.parser.astnodes.visitors.Visitor;

/**
 *
 * @author bhaidu
 */
public class MarkdownFile extends ASTNode {
    private final ArrayList<MdElement> mdElements = new ArrayList<>();

    public MarkdownFile(int start, int end) {
        super(start, end);
    }

    public void addMdElement(MdElement mdElement){
        this.mdElements.add(mdElement);
    }
    
    /**
     * Retrieves the statement list of this program.
     *
     * @return statement parts of this program
     */
    public List<MdElement> getMdElements() {
        return this.mdElements;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public String toString() {
        return "Markdown FIle";
    }
}
