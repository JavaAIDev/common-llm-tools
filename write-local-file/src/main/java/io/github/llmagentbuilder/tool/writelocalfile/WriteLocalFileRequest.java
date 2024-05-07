package io.github.llmagentbuilder.tool.writelocalfile;

public record WriteLocalFileRequest(String filename,
                                    String url,
                                    String content,
                                    boolean append) {

}