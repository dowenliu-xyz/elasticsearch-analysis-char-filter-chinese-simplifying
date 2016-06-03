package xyz.dowenwork.elasticsearch.plugin;

import org.elasticsearch.common.inject.Module;
import org.elasticsearch.index.analysis.AnalysisModule;
import org.elasticsearch.plugins.Plugin;
import xyz.dowenwork.elasticsearch.index.analysis.ChineseSimplifyingAnalysisBinderProcessor;
import xyz.dowenwork.elasticsearch.indices.analysis.ChineseSimplifyingAnalysisModule;

import java.util.Collection;
import java.util.Collections;

/**
 * <p>create at 16-6-2</p>
 *
 * @author liufl
 * @since 2.3.3.0
 */
@SuppressWarnings("unused")
public class AnalysisChineseSimplifyingPlugin extends Plugin {
    @Override
    public String name() {
        return "analysis-sbc2dbc";
    }

    @Override
    public String description() {
        return "全角字符转半角字符";
    }

    @Override
    public Collection<Module> nodeModules() {
        return Collections.<Module>singletonList(new ChineseSimplifyingAnalysisModule());
    }

    /**
     * Automatically called with the analysis module.
     */
    public void onModule(AnalysisModule module) {
        module.addProcessor(new ChineseSimplifyingAnalysisBinderProcessor());
    }
}
