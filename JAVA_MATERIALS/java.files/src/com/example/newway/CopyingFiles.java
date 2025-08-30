package com.example.newway;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyingFiles {
    public static void main(String[] args) throws IOException {
        Path source = Paths.get("example.txt");
        Path destination = Paths.get("copy_example.txt");

        // Copy the file
        Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File copied successfully.");

    }
}
