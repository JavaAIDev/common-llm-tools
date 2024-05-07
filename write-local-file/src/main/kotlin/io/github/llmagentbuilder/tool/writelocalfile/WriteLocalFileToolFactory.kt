package io.github.llmagentbuilder.tool.writelocalfile

import io.github.llmagentbuilder.core.tool.EnvironmentVariableConfigurableAgentToolFactory

class WriteLocalFileToolFactory :
    EnvironmentVariableConfigurableAgentToolFactory<WriteLocalFileTool, WriteLocalFileConfig>(
        WriteLocalFileConfig::class.java, "${toolName}_"
    ) {
    override fun create(config: WriteLocalFileConfig): WriteLocalFileTool {
        return WriteLocalFileTool(config)
    }

    override fun configName(): String {
        return toolName
    }
}