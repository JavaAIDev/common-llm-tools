package io.github.llmagentbuilder.tool.writelocalfile

import io.github.llmagentbuilder.core.tool.ConfigurableAgentTool
import io.github.llmagentbuilder.core.tool.ToolExecutionException
import org.apache.commons.io.FileUtils
import org.apache.commons.lang3.StringUtils
import org.slf4j.LoggerFactory
import java.net.URI
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.nio.file.StandardOpenOption
import java.util.*

const val toolName = "writeLocalFile"

class WriteLocalFileTool(private val config: WriteLocalFileConfig) :
    ConfigurableAgentTool<WriteLocalFileRequest, WriteLocalFileResponse, WriteLocalFileConfig> {

    private val logger = LoggerFactory.getLogger(javaClass)

    init {
        logger.info("Created with config: $config")
    }

    override fun apply(request: WriteLocalFileRequest): WriteLocalFileResponse {
        logger.info("File to write: ${request.filename}")
        try {
            val savePath = calculateSavePath(request)
            if (StringUtils.isNotEmpty(request.content)) {
                Files.writeString(
                    savePath, request.content(), StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    if (request.append) StandardOpenOption.APPEND else StandardOpenOption.TRUNCATE_EXISTING
                )
            } else if (StringUtils.isNotEmpty(request.url)) {
                FileUtils.copyURLToFile(
                    URI(request.url()).toURL(),
                    savePath.toFile()
                )
            }
            return WriteLocalFileResponse(
                savePath.toAbsolutePath().toString()
            ).also {
                logger.info("Response: $it")
            }
        } catch (e: Exception) {
            throw ToolExecutionException(this, e)
        }
    }

    override fun description(): String {
        return "write content to a local file, or download content from a url then write to a local file"
    }

    override fun name(): String {
        return toolName
    }

    private fun calculateSavePath(request: WriteLocalFileRequest): Path {
        val basePath = StringUtils.trimToNull(config.basePath)
        val saveFileDir = basePath?.run {
            Paths.get(this)
        } ?: Files.createTempDirectory(
            "${toolName}_"
        )
        val filename = StringUtils.trimToNull(request.filename)
        return saveFileDir.resolve(filename ?: UUID.randomUUID().toString())
            .toAbsolutePath()
    }
}