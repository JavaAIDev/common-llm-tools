package com.javaaidev.easyllmtools.tools.extractwebpagecontent;

import io.github.llmagentbuilder.webscraper.WebScraper;
import java.lang.reflect.Type;
import com.javaaidev.easyllmtools.tools.extractwebpagecontent.model.ExtractWebPageContentConfiguration;
import com.javaaidev.easyllmtools.tools.extractwebpagecontent.model.ExtractWebPageContentParameters;
import com.javaaidev.easyllmtools.tools.extractwebpagecontent.model.ExtractWebPageContentReturnType;

public class ExtractWebPageContent extends AbstractExtractWebPageContent {

    public ExtractWebPageContent(final ExtractWebPageContentConfiguration config) {
        super(config);
    }

    @Override
    public Type getRequestType() {
        return ExtractWebPageContentParameters.class;
    }

    @Override
    public ExtractWebPageContentReturnType call(final ExtractWebPageContentParameters parameters) {
        try {
            String content = WebScraper.INSTANCE.allText(parameters.getUrl());
            if (config != null && config.getSizeLimit() != null) {
                content = content.substring(0,
                    Math.max(0, Math.min(config.getSizeLimit(), content.length())));
            }
            return new ExtractWebPageContentReturnType(content, "");
        } catch (Exception e) {
            return new ExtractWebPageContentReturnType("", e.getMessage());
        }
    }
}
