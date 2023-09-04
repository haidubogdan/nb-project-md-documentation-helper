package org.netbeans.modules.utils.project.md.editor.parser.astnodes.visitors;

import org.netbeans.modules.utils.project.md.editor.parser.astnodes.*;

/**
 *
 * @author bhaidu
 */
public interface Visitor {

    public void visit(MarkdownFile program);

    public void visit(ASTNode node);
    
    public void visit(Header node);
    
    public void visit(MdList node);
    
    public void visit(HtmlElement node);
}
