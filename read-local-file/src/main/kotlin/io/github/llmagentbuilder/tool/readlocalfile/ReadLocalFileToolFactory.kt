package io.github.llmagentbuilder.tool.readlocalfile

import io.github.llmagentbuilder.core.tool.ConfigurableAgentToolFactory

class ReadLocalFileToolFactory :
    ConfigurableAgentToolFactory<ReadLocalFileConfig, ReadLocalFileTool> {
    override fun create(config: ReadLocalFileConfig?): ReadLocalFileTool {
        return ReadLocalFileTool(config)
    }

    override fun toolId(): String {
        return toolId
    }
}