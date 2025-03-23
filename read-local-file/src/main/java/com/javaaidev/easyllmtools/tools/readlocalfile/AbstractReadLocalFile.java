package com.javaaidev.easyllmtools.tools.readlocalfile;

import com.javaaidev.easyllmtools.llmtoolspec.Tool;
import com.javaaidev.easyllmtools.tools.readlocalfile.model.ReadLocalFileConfiguration;
import com.javaaidev.easyllmtools.tools.readlocalfile.model.ReadLocalFileParameters;
import com.javaaidev.easyllmtools.tools.readlocalfile.model.ReadLocalFileReturnType;

public abstract class AbstractReadLocalFile implements Tool<ReadLocalFileParameters, ReadLocalFileReturnType> {

    protected ReadLocalFileConfiguration config;

    protected AbstractReadLocalFile(final ReadLocalFileConfiguration config) {
        this.config = config;
    }

    @Override
    public String getId() {
        return "common.ReadLocalFile";
    }

    @Override
    public String getName() {
        return "ReadLocalFile";
    }

    @Override
    public String getDescription() {
        return "Read a local file";
    }

    @Override
    public String getParametersSchema() {
        return "{\"type\":\"object\",\"properties\":{\"filePath\":{\"type\":\"string\",\"description\":\"Path of the file to read\"}}}";
    }

    @Override
    public String getReturnTypeSchema() {
        return "{\"type\":\"object\",\"properties\":{\"content\":{\"type\":\"string\",\"description\":\"Content of this file\"},\"error\":{\"type\":\"string\",\"description\":\"Error message when this file cannot be read\"}}}";
    }

    @Override
    public String getExamples() {
        return "{}";
    }
}
