package com.example.buffered.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String filename = "myexample.txt";

        BufferedReader reader = new BufferedReader(new FileReader(filename));

        String line = null;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
    }

}
