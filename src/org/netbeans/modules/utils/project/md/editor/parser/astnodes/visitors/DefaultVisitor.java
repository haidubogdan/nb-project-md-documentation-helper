package org.netbeans.modules.utils.project.md.editor.parser.astnodes.visitors;

import org.netbeans.modules.utils.project.md.editor.parser.astnodes.ASTNode;
import org.netbeans.modules.utils.project.md.editor.parser.astnodes.Header;
import org.netbeans.modules.utils.project.md.editor.parser.astnodes.HtmlElement;
import org.netbeans.modules.utils.project.md.editor.parser.astnodes.MarkdownFile;
import org.netbeans.modules.utils.project.md.editor.parser.astnodes.MdList;

/**
 *
 * @author bhaidu
 */
public class DefaultVisitor implements Visitor {

    public void scan(ASTNode node) {
        if (node != null) {
            node.accept(this);
        }
    }
    
    public void scan(Iterable<? extends ASTNode> nodes) {
        if (nodes != null) {
            for (ASTNode n : nodes) {
                scan(n);
            }
        }
    }

    @Override
    public void visit(MarkdownFile program) {
        scan(program.getMdElements());
    }

    @Override
    public void visit(ASTNode node) {

    }

    @Override
    public void visit(Header node) {
        
    }

    @Override
    public void visit(MdList node) {
        
    }

    @Override
    public void visit(HtmlElement node) {

    }
    

}
