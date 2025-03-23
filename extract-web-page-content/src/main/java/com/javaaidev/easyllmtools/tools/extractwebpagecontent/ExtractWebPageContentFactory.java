package com.javaaidev.easyllmtools.tools.extractwebpagecontent;

import com.javaaidev.easyllmtools.llmtoolspec.ConfigurableToolFactory;
import com.javaaidev.easyllmtools.tools.extractwebpagecontent.model.ExtractWebPageContentConfiguration;
import com.javaaidev.easyllmtools.tools.extractwebpagecontent.model.ExtractWebPageContentParameters;
import com.javaaidev.easyllmtools.tools.extractwebpagecontent.model.ExtractWebPageContentReturnType;

public class ExtractWebPageContentFactory implements ConfigurableToolFactory<ExtractWebPageContentParameters, ExtractWebPageContentReturnType, ExtractWebPageContent, ExtractWebPageContentConfiguration> {

    @Override
    public ExtractWebPageContent create(final ExtractWebPageContentConfiguration config) {
        return new ExtractWebPageContent(config);
    }

    @Override
    public String toolId() {
        return "common.ExtractWebPageContent";
    }
}
