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

import java.util.Collection;
import java.util.EnumSet;
import org.netbeans.api.lexer.InputAttributes;
import org.netbeans.api.lexer.Language;
import org.netbeans.api.lexer.LanguagePath;
import org.netbeans.api.lexer.Token;
import org.netbeans.api.lexer.TokenId;
import org.netbeans.spi.lexer.LanguageEmbedding;
import org.netbeans.spi.lexer.LanguageHierarchy;
import org.netbeans.spi.lexer.LanguageProvider;
import org.openide.util.Lookup;

/**
 *
 * @author bogdan
 */
public enum MdTokenId implements TokenId {
    HTML("html"),
    HEADER("header"),
    BREAK_LINE("break_line"),
    BOLD("bold"),
    BLOCK_CODE("code"),
    CODE("code"),
    ITALIC("italic"),
    LI("li_item"),
    NEWLINE("whitespace"),
    WHITESPACE("whitespace"),
    HYPER_LINK_LABEL("link_label"),
    HYPER_LINK("link"),
    RAW_TEXT("html"),
    ERROR("error");

    private final String category;

    MdTokenId(String category) {
        this.category = category;
    }

    @Override
    public String primaryCategory() {
        return category;
    }

    public static abstract class MdLanguageHierarchy extends LanguageHierarchy<MdTokenId> {

        @Override
        protected Collection<MdTokenId> createTokenIds() {
            return EnumSet.allOf(MdTokenId.class);
        }

        @Override
        protected LanguageEmbedding<? extends TokenId> embedding(Token<MdTokenId> token,
                LanguagePath languagePath, InputAttributes inputAttributes) {
            switch (token.id()) {
                case HTML:
                    Language<? extends TokenId> htmlLanguage = null;

                    @SuppressWarnings("unchecked") Collection<LanguageProvider> providers = (Collection<LanguageProvider>) Lookup.getDefault().lookupAll(LanguageProvider.class);
                    for (LanguageProvider provider : providers) {
                        htmlLanguage = (Language<? extends TokenId>) provider.findLanguage("text/html"); //NOI18N
                        if (htmlLanguage != null) {
                            break;
                        }
                    }

                    return htmlLanguage != null ? LanguageEmbedding.create(htmlLanguage, 0, 0, false) : null;
                default:
                    return null;
            }
        }
    }

}
