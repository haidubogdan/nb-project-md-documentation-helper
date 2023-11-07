/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 2016 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 *
 * Contributor(s):
 *
 * Portions Copyrighted 2016 Sun Microsystems, Inc.
 */
package org.netbeans.modules.utils.project.md.editor.lexer;

import org.antlr.parser.markdown.MdColoringAntlrLexer;
import org.netbeans.api.lexer.Token;
import static org.netbeans.modules.utils.project.md.editor.lexer.MdTokenId.*;
import org.netbeans.spi.lexer.LexerRestartInfo;

import org.netbeans.spi.lexer.antlr4.AbstractAntlrLexerBridge;

/**
 *
 * @author bogdan
 */
public class MdLexer extends AbstractAntlrLexerBridge<MdColoringAntlrLexer, MdTokenId> {

    public MdLexer(LexerRestartInfo<MdTokenId> info) {
        super(info, MdColoringAntlrLexer::new);
    }

    @Override
    public Object state() {
        return new State(lexer);
    }

    @Override
    protected Token<MdTokenId> mapToken(org.antlr.v4.runtime.Token antlrToken) {
        //debug text
        String text = antlrToken.getText();
        int type = antlrToken.getType();
        switch (type) {
            case MdColoringAntlrLexer.HTML:
                return token(HTML);
            case MdColoringAntlrLexer.HEADER:
                return token(HEADER);
            case MdColoringAntlrLexer.BREAK_LINE:
                return token(BREAK_LINE);
            case MdColoringAntlrLexer.BOLD_START:
            case MdColoringAntlrLexer.BOLD_END:   
            case MdColoringAntlrLexer.BOLD:
                return token(BOLD);
            case MdColoringAntlrLexer.ITALIC:
                return token(ITALIC);
            case MdColoringAntlrLexer.BLOCK_CODE:
                return token(BLOCK_CODE);    
            case MdColoringAntlrLexer.CODE:
                return token(CODE);
            case MdColoringAntlrLexer.LI_PRE_WS:
                return token(LI);
            case MdColoringAntlrLexer.HYPER_LINK_LABEL:
                return token(HYPER_LINK_LABEL);
            case MdColoringAntlrLexer.HYPER_LINK:
                return token(HYPER_LINK); 
            case MdColoringAntlrLexer.NL:
                return token(NEWLINE);
            case MdColoringAntlrLexer.RAW_TEXT:
                return token(RAW_TEXT);    
            default:
                return token(ERROR);
        }
    }

    private static class State extends AbstractAntlrLexerBridge.LexerState<MdColoringAntlrLexer> {

        final int currentRuleType;

        public State(MdColoringAntlrLexer lexer) {
            super(lexer);
            this.currentRuleType = lexer.getCurrentRuleType();
        }

        @Override
        public void restore(MdColoringAntlrLexer lexer) {
            super.restore(lexer);
            lexer.setCurrentRuleType(currentRuleType);
        }

    }

}
