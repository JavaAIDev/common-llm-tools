package com.javaaidev.easyllmtools.tools.readlocalfile;

import com.javaaidev.easyllmtools.llmtoolspec.ConfigurableToolFactory;
import com.javaaidev.easyllmtools.tools.readlocalfile.model.ReadLocalFileConfiguration;
import com.javaaidev.easyllmtools.tools.readlocalfile.model.ReadLocalFileParameters;
import com.javaaidev.easyllmtools.tools.readlocalfile.model.ReadLocalFileReturnType;

public class ReadLocalFileFactory implements ConfigurableToolFactory<ReadLocalFileParameters, ReadLocalFileReturnType, ReadLocalFile, ReadLocalFileConfiguration> {

    @Override
    public ReadLocalFile create(final ReadLocalFileConfiguration config) {
        return new ReadLocalFile(config);
    }

    @Override
    public String toolId() {
        return "common.ReadLocalFile";
    }
}
