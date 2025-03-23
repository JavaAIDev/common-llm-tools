package com.javaaidev.easyllmtools.tools.readlocalfile;

import java.io.IOException;
import java.lang.reflect.Type;
import com.javaaidev.easyllmtools.tools.readlocalfile.model.ReadLocalFileConfiguration;
import com.javaaidev.easyllmtools.tools.readlocalfile.model.ReadLocalFileParameters;
import com.javaaidev.easyllmtools.tools.readlocalfile.model.ReadLocalFileReturnType;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

public class ReadLocalFile extends AbstractReadLocalFile {

    public ReadLocalFile(final ReadLocalFileConfiguration config) {
        super(config);
    }

    @Override
    public Type getRequestType() {
        return ReadLocalFileParameters.class;
    }

    @Override
    public ReadLocalFileReturnType call(final ReadLocalFileParameters parameters) {
        String content = "", error = "";
        try {
            content = FileUtils.readFileToString(getFilePath(parameters).toFile(), getCharset());
        } catch (IOException e) {
            error = e.getMessage();
        }
        return new ReadLocalFileReturnType(content, error);
    }

    private Path getFilePath(ReadLocalFileParameters parameters) {
        Path basePath = Paths.get(Optional.ofNullable(config).map(ReadLocalFileConfiguration::getBasePath)
            .flatMap(v -> Optional.ofNullable(StringUtils.trimToNull(v)))
            .orElse("."));
        return basePath.resolve(parameters.getFilePath()).toAbsolutePath();
    }

    private String getCharset() {
        return Optional.ofNullable(config)
            .map(ReadLocalFileConfiguration::getCharset)
            .orElse("UTF-8");
    }
}
