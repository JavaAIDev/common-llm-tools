package com.javaaidev.easyllmtools.tools.writelocalfile;

import java.io.IOException;
import java.lang.reflect.Type;
import com.javaaidev.easyllmtools.tools.writelocalfile.model.WriteLocalFileConfiguration;
import com.javaaidev.easyllmtools.tools.writelocalfile.model.WriteLocalFileParameters;
import com.javaaidev.easyllmtools.tools.writelocalfile.model.WriteLocalFileReturnType;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Optional;
import java.util.UUID;
import org.apache.commons.lang3.StringUtils;

public class WriteLocalFile extends AbstractWriteLocalFile {

    public WriteLocalFile(final WriteLocalFileConfiguration config) {
        super(config);
    }

    @Override
    public Type getRequestType() {
        return WriteLocalFileParameters.class;
    }

    @Override
    public WriteLocalFileReturnType call(final WriteLocalFileParameters parameters) {
      try {
        Path savePath = getSaveFilePath(parameters);
        Files.write(savePath,
            parameters.getContent().getBytes(getCharset()),
            StandardOpenOption.CREATE,
            parameters.getAppend() ? StandardOpenOption.APPEND : StandardOpenOption.TRUNCATE_EXISTING);
          return new WriteLocalFileReturnType(
              savePath.toAbsolutePath().toString(),
              ""
          );
      } catch (IOException e) {
        return new WriteLocalFileReturnType("", e.getMessage());
      }
    }

    private Path getSaveFilePath(WriteLocalFileParameters parameters) throws IOException {
        Path basePath = Paths.get(Optional.ofNullable(config).map(WriteLocalFileConfiguration::getBasePath)
            .flatMap(v -> Optional.ofNullable(StringUtils.trimToNull(v)))
            .orElse("."));
        Files.createDirectories(basePath);
        String filename = Optional.ofNullable(StringUtils.trimToNull(parameters.getFilename()))
            .orElseGet(() -> UUID.randomUUID().toString());
        return basePath.resolve(filename).toAbsolutePath();
    }

    private String getCharset() {
        return Optional.ofNullable(config)
            .map(WriteLocalFileConfiguration::getCharset)
            .orElse("UTF-8");
    }
}
