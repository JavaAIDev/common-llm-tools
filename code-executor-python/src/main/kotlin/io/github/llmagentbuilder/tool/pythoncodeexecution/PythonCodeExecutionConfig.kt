package io.github.llmagentbuilder.tool.pythoncodeexecution

data class PythonCodeExecutionConfig(
    val executable: String? = null,
    val workingDirectory: String? = null,
)

data class PythonCodeExecutionRequest(val code: String)

data class PythonCodeExecutionResponse(val result: String? = null)
