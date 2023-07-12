package com.epam.ld.module2.testing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TemporaryFolderRuleTest {

    @TempDir
    File temporaryFolder;

    @BeforeEach
    public void setUp() {
        // Optional setup steps before each test
    }

    @Test
    public void newFile_CreatesFile_Success() throws IOException {
        // Arrange
        String fileName = "test.txt";
        File file = new File(temporaryFolder, fileName);

        // Act
        boolean created = file.createNewFile();

        // Assert
        assertTrue(created);
        assertTrue(file.exists());
    }

    @Test
    public void newFolder_CreatesFolder_Success() {
        // Arrange
        String folderName = "test";
        File folder = new File(temporaryFolder, folderName);

        // Act
        boolean created = folder.mkdirs();

        // Assert
        assertTrue(created);
        assertTrue(folder.exists());
    }

    @AfterEach
    public void tearDown() {
        // Optional tear-down steps after each test
    }
}
