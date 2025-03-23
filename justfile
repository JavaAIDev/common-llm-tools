#!/usr/bin/env just --justfile

downloadCodeGeneratorCli:
    mvn dependency:copy -Dartifact=com.javaaidev.easyllmtools:code-generator-cli:0.1.5 -DoutputDirectory=target -Dmdep.stripVersion=true

generateCodeReadLocalFile: downloadCodeGeneratorCli
    java -jar target/code-generator-cli.jar simple \
      --output=read-local-file \
      --tool-id-prefix=common. \
      --parent-group-id=com.javaaidev.easyllmtools \
      --parent-artifact-id=common-llm-tools \
      --parent-artifact-version=0.5.0 \
      --group-id=com.javaaidev.easyllmtools.tools \
      --artifact-id=read-local-file --artifact-version=0.5.0 \
      --package-name=com.javaaidev.easyllmtools.tools.readlocalfile \
      read-local-file/read-local-file.json

generateCodeWriteLocalFile: downloadCodeGeneratorCli
    java -jar target/code-generator-cli.jar simple \
      --output=write-local-file \
      --tool-id-prefix=common. \
      --parent-group-id=com.javaaidev.easyllmtools \
      --parent-artifact-id=common-llm-tools \
      --parent-artifact-version=0.5.0 \
      --group-id=com.javaaidev.easyllmtools.tools \
      --artifact-id=write-local-file --artifact-version=0.5.0 \
      --package-name=com.javaaidev.easyllmtools.tools.writelocalfile \
      write-local-file/write-local-file.json

generateCodeExtractWebPageContent: downloadCodeGeneratorCli
    java -jar target/code-generator-cli.jar simple \
      --output=extract-web-page-content \
      --tool-id-prefix=common. \
      --parent-group-id=com.javaaidev.easyllmtools \
      --parent-artifact-id=common-llm-tools \
      --parent-artifact-version=0.5.0 \
      --group-id=com.javaaidev.easyllmtools.tools \
      --artifact-id=extract-web-page-content --artifact-version=0.5.0 \
      --package-name=com.javaaidev.easyllmtools.tools.extractwebpagecontent \
      extract-web-page-content/extract-web-page-content.json
