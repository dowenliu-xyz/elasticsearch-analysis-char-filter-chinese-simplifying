package xyz.dowenwork.elasticsearch.plugin;

import org.elasticsearch.index.analysis.CharFilterFactory;
import org.elasticsearch.indices.analysis.AnalysisModule;
import org.elasticsearch.plugins.AnalysisPlugin;
import org.elasticsearch.plugins.Plugin;
import xyz.dowenwork.elasticsearch.index.analysis.ChineseSimplifyingCharFilterFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>create at 16-6-2</p>
 *
 * @author liufl
 * @since 2.3.3.0
 */
@SuppressWarnings("unused")
public class AnalysisChineseSimplifyingPlugin extends Plugin implements AnalysisPlugin {
    public static final String PLUGIN_NAME = "analysis-sbc2dbc";

    @Override
    public Map<String, AnalysisModule.AnalysisProvider<CharFilterFactory>> getCharFilters() {
        Map<String, AnalysisModule.AnalysisProvider<CharFilterFactory>> factories = new HashMap<>();

        factories.put("chinese-simplifying",
                (indexSettings, environment, name, settings) ->
                        new ChineseSimplifyingCharFilterFactory(indexSettings, name));

        return factories;
    }
}
