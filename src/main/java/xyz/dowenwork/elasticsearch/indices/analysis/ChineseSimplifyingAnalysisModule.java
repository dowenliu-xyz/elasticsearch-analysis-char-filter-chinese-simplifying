package xyz.dowenwork.elasticsearch.indices.analysis;

import org.elasticsearch.common.inject.AbstractModule;

/**
 * <p>create at 16-6-2</p>
 *
 * @author liufl
 * @since 2.3.3.0
 */
public class ChineseSimplifyingAnalysisModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(ChineseSimplifyingAnalysis.class).asEagerSingleton();
    }
}
