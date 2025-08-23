package com.example.newway;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class ReadingFromFile {

    public static void main(String[] args) throws IOException {

        // Спосіб 1: весь файл одразу (для малих файлів)
        List<String> lines = Files.readAllLines(Path.of("file.txt"));

        // Спосіб 2: по рядках (для великих файлів)
        try (Stream<String> stream = Files.lines(Path.of("file.txt"))) {
            stream.forEach(System.out::println);
        }

        // Спосіб 3: весь вміст як рядок
        String content = Files.readString(Path.of("file.txt"));

        // Спосіб 4: як байти
        byte[] bytes = Files.readAllBytes(Path.of("file.txt"));

    }
}
