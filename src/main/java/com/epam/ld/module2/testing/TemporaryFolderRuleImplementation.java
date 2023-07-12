package com.epam.ld.module2.testing;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;

public class TemporaryFolderRuleImplementation {

    private File temporaryFolder;

    public File newFile(String fileName) throws IOException {
        createTemporaryFolder();
        File file = new File(temporaryFolder, fileName);
        file.createNewFile();
        return file;
    }

    public File newFolder(String folderName) throws IOException {
        createTemporaryFolder();
        File folder = new File(temporaryFolder, folderName);
        folder.mkdir();
        return folder;
    }

    public void delete() {
        if (temporaryFolder != null) {
            deleteRecursive(temporaryFolder.toPath());
        }
    }

    private void createTemporaryFolder() throws IOException {
        if (temporaryFolder == null) {
            temporaryFolder = Files.createTempDirectory("temp-folder").toFile();
        }
    }

    private void deleteRecursive(Path path) {
        try {
            Files.walk(path)
                    .sorted((p1, p2) -> -p1.compareTo(p2))
                    .forEach(p -> {
                        try {
                            Files.deleteIfExists(p);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
