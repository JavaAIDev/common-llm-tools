package com.javaaidev.easyllmtools.tools.writelocalfile;

import com.javaaidev.easyllmtools.llmtoolspec.Tool;
import com.javaaidev.easyllmtools.tools.writelocalfile.model.WriteLocalFileConfiguration;
import com.javaaidev.easyllmtools.tools.writelocalfile.model.WriteLocalFileParameters;
import com.javaaidev.easyllmtools.tools.writelocalfile.model.WriteLocalFileReturnType;

public abstract class AbstractWriteLocalFile implements Tool<WriteLocalFileParameters, WriteLocalFileReturnType> {

    protected WriteLocalFileConfiguration config;

    protected AbstractWriteLocalFile(final WriteLocalFileConfiguration config) {
        this.config = config;
    }

    @Override
    public String getId() {
        return "common.WriteLocalFile";
    }

    @Override
    public String getName() {
        return "WriteLocalFile";
    }

    @Override
    public String getDescription() {
        return "Write content to a local file";
    }

    @Override
    public String getParametersSchema() {
        return "{\"type\":\"object\",\"properties\":{\"filename\":{\"type\":\"string\",\"description\":\"Name of the file to write\"},\"content\":{\"type\":\"string\",\"description\":\"Content of the file\"},\"append\":{\"type\":\"boolean\",\"description\":\"Should the content be appended to the file\"}},\"required\":[\"content\"]}";
    }

    @Override
    public String getReturnTypeSchema() {
        return "{\"type\":\"object\",\"properties\":{\"path\":{\"type\":\"string\",\"description\":\"Path of the file when succeeded\"},\"error\":{\"type\":\"string\",\"description\":\"Error message when this file cannot be written\"}}}";
    }

    @Override
    public String getExamples() {
        return "{}";
    }
}
