package com.example.newway;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class WritingToFile {

    public static void main(String[] args) {

        try {
            Path pathToFile = Path.of("file.txt").toAbsolutePath();

            // Перевірка існування
            if (Files.exists(pathToFile)) {
                System.out.println("Файл існує!");
            }

            // Читання всього файлу одразу
            List<String> lines = Files.readAllLines(pathToFile);

            // Запис списку рядків
            List<String> data = List.of("Там, там, там", "Тільки там,", "Де нас нема");
            Files.write(Path.of("output.txt"), data);

        } catch (IOException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

    }
}
