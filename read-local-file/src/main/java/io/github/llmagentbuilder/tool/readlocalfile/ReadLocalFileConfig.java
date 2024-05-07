package io.github.llmagentbuilder.tool.readlocalfile;

public class ReadLocalFileConfig {

  private String basePath;

  private String charset;

  public String getBasePath() {
    return basePath;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getCharset() {
    return charset;
  }

  public void setCharset(String charset) {
    this.charset = charset;
  }

  @Override
  public String toString() {
    return "ReadLocalFileConfig{" +
        "basePath='" + basePath + '\'' +
        ", charset='" + charset + '\'' +
        '}';
  }
}
