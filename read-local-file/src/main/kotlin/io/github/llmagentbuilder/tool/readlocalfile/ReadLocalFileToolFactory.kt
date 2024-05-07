package io.github.llmagentbuilder.tool.readlocalfile

import io.github.llmagentbuilder.core.tool.EnvironmentVariableConfigurableAgentToolFactory

class ReadLocalFileToolFactory :
    EnvironmentVariableConfigurableAgentToolFactory<ReadLocalFileTool, ReadLocalFileConfig>(
        ReadLocalFileConfig::class.java, "${toolName}_"
    ) {
    override fun create(config: ReadLocalFileConfig): ReadLocalFileTool {
        return ReadLocalFileTool(config)
    }

    override fun configName(): String {
        return toolName
    }
}