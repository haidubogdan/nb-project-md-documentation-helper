package org.netbeans.modules.utils.project.md.editor.parser;

import javax.swing.event.ChangeListener;
import org.netbeans.modules.parsing.api.Snapshot;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.WeakHashMap;
import javax.swing.event.ChangeListener;
import org.netbeans.modules.parsing.api.ParserManager;
import org.netbeans.modules.parsing.api.ResultIterator;
import org.netbeans.modules.parsing.api.Snapshot;
import org.netbeans.modules.parsing.api.Source;
import org.netbeans.modules.parsing.api.Task;
import org.netbeans.modules.parsing.api.UserTask;
import org.netbeans.modules.parsing.spi.ParseException;
import org.netbeans.modules.parsing.spi.SourceModificationEvent;
import org.openide.filesystems.FileObject;
import org.openide.util.Exceptions;

/**
 *
 * @author bhaidu
 */
public class MdParser extends org.netbeans.modules.parsing.spi.Parser {

    MdParserResult lastResult;
    private static final WeakHashMap<FileObject, Reference<MdParserResult>> CACHE = new WeakHashMap<>();

    @Override
    public void parse(Snapshot snapshot, Task task, SourceModificationEvent event) throws ParseException {
        MdParserResult<?> parserResult = createParserResult(snapshot);

        MdParserResult<?> parsed = parserResult.get();
        cacheResult(snapshot.getSource().getFileObject(), parsed);
        lastResult = parsed;
    }
    
    private static void cacheResult(FileObject fo, MdParserResult<?> result) {
        synchronized (CACHE) {
            CACHE.put(fo, new WeakReference<>(result));
        }
    }
    
    @Override
    public Result getResult(Task task) throws ParseException {
        assert lastResult != null;
        return lastResult;
    }

    @Override
    public void addChangeListener(ChangeListener changeListener) {
    }

    @Override
    public void removeChangeListener(ChangeListener changeListener) {
    }

    protected MdParserResult<?> createParserResult(Snapshot snapshot) {
        return new MdParserResult(snapshot);
    }

    public static MdParserResult<?> getParserResult(FileObject fo) {
        MdParserResult<?> result = null;
        java.lang.ref.Reference<MdParserResult> ceReference;
        synchronized (CACHE) {
            ceReference = CACHE.get(fo);
        }
        if (ceReference != null) {
            result = ceReference.get();
        }

        if (result == null) {
            try {
                MdParserResult<?>[] parserResult = new MdParserResult<?>[1];
                ParserManager.parse(Collections.singleton(Source.create(fo)), new UserTask() {
                    @Override
                    public void run(ResultIterator resultIterator) throws Exception {
                        org.netbeans.modules.parsing.spi.Parser.Result result = resultIterator.getParserResult();
                        if (result instanceof MdParserResult) {
                            parserResult[0] = (MdParserResult) result;
                        }
                    }
                });
                if (parserResult[0] != null) {
                    result = parserResult[0];
                }
            } catch (ParseException ex) {
                Exceptions.printStackTrace(ex);
            }
        }

        return result;
    }
}
