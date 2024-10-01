package io.github.llmagentbuilder.tool.readlocalfile

data class ReadLocalFileConfig(
    val basePath: String? = null,
    val charset: String? = null,
)

data class ReadLocalFileRequest(val filePath: String)

data class ReadLocalFileResponse(val content: String)