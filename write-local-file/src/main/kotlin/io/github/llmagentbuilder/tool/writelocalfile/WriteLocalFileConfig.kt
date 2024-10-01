package io.github.llmagentbuilder.tool.writelocalfile

data class WriteLocalFileConfig(val basePath: String? = null)

data class WriteLocalFileRequest(
    val filename: String,
    val url: String?,
    val content: String?,
    val append: Boolean?,
)

data class WriteLocalFileResponse(
    val path: String,
)