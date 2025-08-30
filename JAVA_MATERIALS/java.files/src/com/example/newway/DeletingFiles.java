package com.example.newway;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeletingFiles {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("moved_example.txt");

        // Delete the file
        Files.delete(path);
        System.out.println("File deleted successfully.");

    }
}
