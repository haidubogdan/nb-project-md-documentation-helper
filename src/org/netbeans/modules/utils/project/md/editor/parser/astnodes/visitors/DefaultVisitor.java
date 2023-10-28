package org.netbeans.modules.utils.project.md.editor.parser.astnodes.visitors;

import org.netbeans.modules.utils.project.md.editor.parser.astnodes.*;

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

    @Override
    public void visit(Code node) {
    }

    @Override
    public void visit(Scalar node) {
    }
    
    @Override
    public void visit(HyperLink node) {
    }
    
    @Override
    public void visit(TextEffect node) {
    }
}
