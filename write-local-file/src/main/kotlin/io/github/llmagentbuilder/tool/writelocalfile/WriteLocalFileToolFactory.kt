package io.github.llmagentbuilder.tool.writelocalfile

import io.github.llmagentbuilder.core.tool.ConfigurableAgentToolFactory

class WriteLocalFileToolFactory :
    ConfigurableAgentToolFactory<WriteLocalFileConfig, WriteLocalFileTool> {
    override fun create(config: WriteLocalFileConfig?): WriteLocalFileTool {
        return WriteLocalFileTool(config)
    }

    override fun toolId(): String {
        return toolId
    }
}