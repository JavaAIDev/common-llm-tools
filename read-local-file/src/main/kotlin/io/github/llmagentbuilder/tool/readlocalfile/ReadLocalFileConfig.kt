package io.github.llmagentbuilder.tool.readlocalfile

data class ReadLocalFileConfig(
    val basePath: String,
    val charset: String?
)

data class ReadLocalFileRequest(val filePath: String)

data class ReadLocalFileResponse(val content: String)