package com.example.newway;

import java.nio.file.Path;
import java.nio.file.Paths;

public class WorkingWithPaths {

    public static void main(String[] args) {


        // Створення Path
        Path path1 = Path.of("folder", "file.txt");  // Java 11+
        Path path2 = Paths.get("folder/file.txt");         // альтернативний спосіб

        // Корисні методи
        System.out.println(path1.getFileName());          // file.txt
        System.out.println(path1.getParent());            // folder
        System.out.println(path1.toAbsolutePath());       // повний шлях

    }
}
