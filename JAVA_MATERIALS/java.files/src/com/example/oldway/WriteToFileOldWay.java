package com.example.oldway;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileOldWay {

    public static void main(String[] args) {

        // Запис у файл
        try {
            FileWriter writer = new FileWriter("output.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Привіт, QA Automation!");
            bufferedWriter.newLine();
            bufferedWriter.write("Це другий рядок");

            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Помилка: " + e.getMessage());
        }


    }
}
