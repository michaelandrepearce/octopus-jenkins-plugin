package hudson.plugins.octopusdeploy.services;


import hudson.FilePath;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.List;

/**
 * Defines a service that is used to work with files and dirs
 */
public interface FileService {
    /**
     * @param workingDir The directory from which to start matching files
     * @param pattern    The ant pattern used to match files
     * @return A list of matching files
     */
    @NotNull
    List<File> getMatchingFile(@NotNull FilePath workingDir, @NotNull String pattern);
}
