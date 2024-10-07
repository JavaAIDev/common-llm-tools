package io.github.llmagentbuilder.tool.javacodeexecution

data class JavaCodeExecutionConfig(
    val executable: String? = null,
    val workingDirectory: String? = null,
)

data class JavaCodeExecutionRequest(val code: String)

data class JavaCodeExecutionResponse(val result: String? = null)
