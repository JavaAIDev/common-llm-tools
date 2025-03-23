package com.javaaidev.easyllmtools.tools.extractwebpagecontent;

import com.javaaidev.easyllmtools.llmtoolspec.Tool;
import com.javaaidev.easyllmtools.tools.extractwebpagecontent.model.ExtractWebPageContentConfiguration;
import com.javaaidev.easyllmtools.tools.extractwebpagecontent.model.ExtractWebPageContentParameters;
import com.javaaidev.easyllmtools.tools.extractwebpagecontent.model.ExtractWebPageContentReturnType;

public abstract class AbstractExtractWebPageContent implements Tool<ExtractWebPageContentParameters, ExtractWebPageContentReturnType> {

    protected ExtractWebPageContentConfiguration config;

    protected AbstractExtractWebPageContent(final ExtractWebPageContentConfiguration config) {
        this.config = config;
    }

    @Override
    public String getId() {
        return "common.ExtractWebPageContent";
    }

    @Override
    public String getName() {
        return "ExtractWebPageContent";
    }

    @Override
    public String getDescription() {
        return "Extract web page content from given url";
    }

    @Override
    public String getParametersSchema() {
        return "{\"type\":\"object\",\"properties\":{\"url\":{\"type\":\"string\",\"description\":\"Url of the web page to extract content\"}}}";
    }

    @Override
    public String getReturnTypeSchema() {
        return "{\"type\":\"object\",\"properties\":{\"content\":{\"type\":\"string\",\"description\":\"Content of the web page\"},\"error\":{\"type\":\"string\",\"description\":\"Error message when this web page cannot be loaded\"}}}";
    }

    @Override
    public String getExamples() {
        return "{}";
    }
}
