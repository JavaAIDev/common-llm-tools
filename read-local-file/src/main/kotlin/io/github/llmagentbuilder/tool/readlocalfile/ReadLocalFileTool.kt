package io.github.llmagentbuilder.tool.readlocalfile

import io.github.llmagentbuilder.core.tool.ConfigurableAgentTool
import org.apache.commons.io.FileUtils
import org.apache.commons.lang3.StringUtils
import org.slf4j.LoggerFactory
import java.nio.file.Path
import java.nio.file.Paths

const val toolId = "readLocalFile"

class ReadLocalFileTool(private val config: ReadLocalFileConfig?) :
    ConfigurableAgentTool<ReadLocalFileRequest, ReadLocalFileResponse, ReadLocalFileConfig> {

    private val logger = LoggerFactory.getLogger(javaClass)

    init {
        logger.info("Created with config: $config")
    }

    override fun apply(request: ReadLocalFileRequest): ReadLocalFileResponse {
        return ReadLocalFileResponse(
            FileUtils.readFileToString(
                getFilePath(
                    request
                ).toFile(), config?.charset ?: "UTF-8"
            )
        )
    }

    override fun id(): String {
        return toolId
    }

    override fun description(): String {
        return "read content of a local file"
    }

    override fun name(): String {
        return toolId
    }

    private fun getFilePath(request: ReadLocalFileRequest): Path {
        val basePath =
            StringUtils.trimToNull(config?.basePath)?.let { Paths.get(it) }
                ?: Paths.get(".")
        return basePath.resolve(request.filePath).toAbsolutePath()
    }
}