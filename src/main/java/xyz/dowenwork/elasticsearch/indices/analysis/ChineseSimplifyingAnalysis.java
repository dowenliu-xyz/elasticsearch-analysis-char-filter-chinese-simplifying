package xyz.dowenwork.elasticsearch.indices.analysis;

import org.elasticsearch.common.component.AbstractComponent;
import org.elasticsearch.common.inject.Inject;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.index.analysis.CharFilterFactory;
import org.elasticsearch.index.analysis.PreBuiltCharFilterFactoryFactory;
import org.elasticsearch.indices.analysis.IndicesAnalysisService;
import xyz.dowenwork.lucene.analyzer.ChineseSimplifyingCharFilter;

import java.io.Reader;

/**
 * <p>create at 16-6-2</p>
 *
 * @author liufl
 * @since 2.3.3.0
 */
public class ChineseSimplifyingAnalysis extends AbstractComponent {
    @Inject
    public ChineseSimplifyingAnalysis(Settings settings, IndicesAnalysisService indicesAnalysisService) {
        super(settings);
        indicesAnalysisService.charFilterFactories().put("chinese-simplifying", new PreBuiltCharFilterFactoryFactory(
                new CharFilterFactory() {
                    @Override
                    public String name() {
                        return "chinese-simplifying";
                    }

                    @Override
                    public Reader create(Reader tokenStream) {
                        return new ChineseSimplifyingCharFilter(tokenStream);
                    }
                }));
    }
}
