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
package org.netbeans.modules.utils.project.md.editor;

import org.netbeans.api.lexer.Language;
import org.netbeans.core.spi.multiview.MultiViewElement;
import org.netbeans.modules.parsing.spi.Parser;
import org.netbeans.modules.csl.spi.DefaultLanguageConfig;
import org.netbeans.modules.csl.spi.LanguageRegistration;
import org.netbeans.modules.utils.project.md.editor.lexer.MdLexer;
import org.netbeans.modules.utils.project.md.editor.lexer.MdTokenId;
import org.netbeans.modules.utils.project.md.editor.lexer.MdTokenId.MdLanguageHierarchy;
import org.netbeans.spi.lexer.Lexer;
import org.netbeans.spi.lexer.LexerRestartInfo;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.filesystems.MIMEResolver;
import org.openide.util.Lookup;
import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;
import org.netbeans.core.spi.multiview.MultiViewElement;
import org.netbeans.core.spi.multiview.text.MultiViewEditorElement;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.utils.project.md.editor.parser.MdParser;
import org.netbeans.modules.utils.project.md.editor.parser.MdParserResult;

/**
 *
 * @author bogdan
 */
@NbBundle.Messages(
        "MdLanguageResolver=Markdown"
)
@MIMEResolver.ExtensionRegistration(displayName = "#MdLanguageResolver",
        extension = "md",
        mimeType = MdLanguage.MIME_TYPE,
        position = 320
)

@ActionReferences({
    @ActionReference(
            path = "Loaders/text/x-markdown/Actions",
            id = @ActionID(category = "System", id = "org.openide.actions.OpenAction"),
            position = 100,
            separatorAfter = 200
    ),
    @ActionReference(
            path = "Loaders/text/x-markdown/Actions",
            id = @ActionID(category = "Edit", id = "org.openide.actions.CutAction"),
            position = 300
    ),
    @ActionReference(
            path = "Loaders/text/x-markdown/Actions",
            id = @ActionID(category = "Edit", id = "org.openide.actions.CopyAction"),
            position = 400
    ),
    @ActionReference(
            path = "Loaders/text/x-markdown/Actions",
            id = @ActionID(category = "Edit", id = "org.openide.actions.PasteAction"),
            position = 500,
            separatorAfter = 600
    ),
    @ActionReference(
            path = "Loaders/text/x-markdown/Actions",
            id = @ActionID(category = "Edit", id = "org.openide.actions.DeleteAction"),
            position = 700
    ),
    @ActionReference(
            path = "Loaders/text/x-markdown/Actions",
            id = @ActionID(category = "System", id = "org.openide.actions.RenameAction"),
            position = 800,
            separatorAfter = 900
    ),
    @ActionReference(
            path = "Loaders/text/x-markdown/Actions",
            id = @ActionID(category = "System", id = "org.openide.actions.SaveAsTemplateAction"),
            position = 1000,
            separatorAfter = 1100
    ),
    @ActionReference(
            path = "Loaders/text/x-markdown/Actions",
            id = @ActionID(category = "System", id = "org.openide.actions.FileSystemAction"),
            position = 1200,
            separatorAfter = 1300
    ),
    @ActionReference(
            path = "Loaders/text/x-markdown/Actions",
            id = @ActionID(category = "System", id = "org.openide.actions.ToolsAction"),
            position = 1400
    ),
    @ActionReference(
            path = "Loaders/text/x-markdown/Actions",
            id = @ActionID(category = "System", id = "org.openide.actions.PropertiesAction"),
            position = 1500
    ),
    @ActionReference(
            path = "Editors/text/x-markdown/Popup",
            id = @ActionID(category = "Refactoring", id = "org.netbeans.modules.refactoring.api.ui.WhereUsedAction"),
            position = 1600
    ),
})

@LanguageRegistration(mimeType = MdLanguage.MIME_TYPE, useMultiview = true)
public final class MdLanguage extends DefaultLanguageConfig {

    public static final String MIME_TYPE = "text/x-markdown";

    @Override
    public Language getLexerLanguage() {
        return language;
    }

    @Override
    public String getDisplayName() {
        return Bundle.MdLanguageResolver();
    }

//    @Override
//    public Formatter getFormatter() {
//        return new Antlr4Formatter();
//    }

    @Override
    public boolean hasFormatter() {
        return true;
    }

    @Override
    public String getPreferredExtension() {
        return "md";
    }

    @Override
    public Parser getParser() {
        return new MdParser();
    }

//    @Override
//    public String getLineCommentPrefix() {
//        return "//"; // NOI18N
//    }

//    @Override
//    public DeclarationFinder getDeclarationFinder() {
//        return new AntlrDeclarationFinder();
//    }

//    @Override
//    public StructureScanner getStructureScanner() {
//        return new AntlrStructureScanner();
//    }
//
//    @Override
//    public boolean hasStructureScanner() {
//        return true;
//    }
//
//    @Override
//    public OccurrencesFinder getOccurrencesFinder() {
//        return new AntlrOccurrencesFinder();
//    }
//
//    @Override
//    public boolean hasOccurrencesFinder() {
//        return true;
//    }
    private static final Language<MdTokenId> language
            = new MdLanguageHierarchy() {

                @Override
                protected String mimeType() {
                    return MdLanguage.MIME_TYPE;
                }

                @Override
                protected Lexer<MdTokenId> createLexer(LexerRestartInfo<MdTokenId> info) {
                    return  new MdLexer(info);
                }

    }.language();

    @NbBundle.Messages("Source=&Source Markdown")
    @MultiViewElement.Registration(
            displayName = "#Source",
            persistenceType = TopComponent.PERSISTENCE_ONLY_OPENED,
            mimeType = MdLanguage.MIME_TYPE,
            preferredID = "md.source",
            position = 100
    )
    public static MultiViewEditorElement createMultiViewEditorElement(Lookup context) {
        return new MultiViewEditorElement(context);
    }

}
