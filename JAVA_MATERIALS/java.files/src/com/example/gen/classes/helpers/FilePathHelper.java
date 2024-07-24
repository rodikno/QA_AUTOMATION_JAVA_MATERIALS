package com.example.gen.classes.helpers;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePathHelper {

    public static File returnFileByRelativePath(String relativePath) {
        Path relPath = Paths.get(relativePath);
        System.out.println("Relative path to the file is: " + relPath.toString());
        System.out.println("Absolute path to the file will be: " + relPath.toAbsolutePath().toString());

        System.out.println(relPath.toString());
        return relPath.toAbsolutePath().toFile();
    }
}
