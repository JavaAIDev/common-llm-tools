package io.github.llmagentbuilder.tool.writelocalfile;

public class WriteLocalFileConfig {

  private String basePath;

  public String getBasePath() {
    return basePath;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  @Override
  public String toString() {
    return "WriteLocalFileConfig{" +
        "basePath='" + basePath + '\'' +
        '}';
  }
}
