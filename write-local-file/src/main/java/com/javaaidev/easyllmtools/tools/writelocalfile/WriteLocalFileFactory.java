package com.javaaidev.easyllmtools.tools.writelocalfile;

import com.javaaidev.easyllmtools.llmtoolspec.ConfigurableToolFactory;
import com.javaaidev.easyllmtools.tools.writelocalfile.model.WriteLocalFileConfiguration;
import com.javaaidev.easyllmtools.tools.writelocalfile.model.WriteLocalFileParameters;
import com.javaaidev.easyllmtools.tools.writelocalfile.model.WriteLocalFileReturnType;

public class WriteLocalFileFactory implements ConfigurableToolFactory<WriteLocalFileParameters, WriteLocalFileReturnType, WriteLocalFile, WriteLocalFileConfiguration> {

    @Override
    public WriteLocalFile create(final WriteLocalFileConfiguration config) {
        return new WriteLocalFile(config);
    }

    @Override
    public String toolId() {
        return "common.WriteLocalFile";
    }
}
