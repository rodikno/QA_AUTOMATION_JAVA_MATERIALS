package com.example.oldway;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFileOldWay {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("file.txt");
             BufferedReader bufferedReader = new BufferedReader(reader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Помилка: " + e.getMessage());
        }

    }
}
