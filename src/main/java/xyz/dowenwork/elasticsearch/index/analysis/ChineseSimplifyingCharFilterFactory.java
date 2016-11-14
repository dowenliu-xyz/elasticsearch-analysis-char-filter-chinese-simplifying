package xyz.dowenwork.elasticsearch.index.analysis;

import org.elasticsearch.index.IndexSettings;
import org.elasticsearch.index.analysis.AbstractCharFilterFactory;
import xyz.dowenwork.lucene.analyzer.ChineseSimplifyingCharFilter;

import java.io.Reader;

/**
 * <p>create at 16-6-2</p>
 *
 * @author liufl
 * @since 2.3.3.0
 */
public class ChineseSimplifyingCharFilterFactory extends AbstractCharFilterFactory {
    public ChineseSimplifyingCharFilterFactory(IndexSettings indexSettings, String name) {
        super(indexSettings, name);
    }

    @Override
    public Reader create(Reader tokenStream) {
        return new ChineseSimplifyingCharFilter(tokenStream);
    }
}
