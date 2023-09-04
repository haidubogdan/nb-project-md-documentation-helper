package org.netbeans.modules.utils.project.md.preview;

import org.netbeans.modules.utils.project.md.editor.parser.astnodes.Header;
import org.netbeans.modules.utils.project.md.editor.parser.astnodes.HtmlElement;
import org.netbeans.modules.utils.project.md.editor.parser.astnodes.MdList;
import org.netbeans.modules.utils.project.md.editor.parser.astnodes.visitors.DefaultVisitor;

/**
 *
 * @author bhaidu
 */
public class ViewerVisitor extends DefaultVisitor {

    private String html = "";

    @Override
    public void visit(Header node) {
        if (node != null) {
            html += node.toString();
        }
    }

    public String getHtmlOutput() {
        return html;
    }

    @Override
    public void visit(MdList node) {
        if (node != null) {
            html += node.toString();
        }
    }

    @Override
    public void visit(HtmlElement node) {
        if (node != null) {
            html += node.toString();
        }
    }
}
