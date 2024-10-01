package io.github.llmagentbuilder.tool.writelocalfile

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Path

class WriteLocalFileToolTest {
    @Test
    @Throws(IOException::class)
    fun testWriteContent() {
        val tool = WriteLocalFileToolFactory().create()
        val content = "world"
        val request = WriteLocalFileRequest("hello.txt", null, content, false)
        val response = tool.apply(request)
        assertNotNull(response.path)
        assertEquals(content, Files.readString(Path.of(response.path)))
    }

    @Test
    fun testDownload() {
        val tool = WriteLocalFileToolFactory().create()
        val request = WriteLocalFileRequest(
            "hello.txt", "http://www.baidu.com",
            null,
            false
        )
        val response = tool.apply(request)
        assertNotNull(response.path)
    }
}