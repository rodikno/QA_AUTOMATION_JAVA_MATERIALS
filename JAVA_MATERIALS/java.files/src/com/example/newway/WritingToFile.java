package com.example.newway;

import java.io.FileWriter;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.List;

public class WritingToFile {

    public static void main(String[] args) {

        try {
            Path pathToFile = Path.of("file.txt");

            
            // Перевірка існування
            if (Files.exists(pathToFile)) {
                System.out.println("Файл існує!");
            } else {
                System.out.println("Файлу не існує");
            }

//            // Читання всього файлу одразу
//            List<String> lines = Files.readAllLines(pathToFile);
//            
//            lines.forEach(line -> System.out.println(line));


            // Запис списку рядків
            List<String> data = List.of("Там, там, там", "Тільки там,", "Де нас нема");


            Files.write(pathToFile, data, StandardOpenOption.TRUNCATE_EXISTING);


        } catch (IOException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

    }
}
