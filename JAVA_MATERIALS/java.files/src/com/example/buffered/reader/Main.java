package com.example.buffered.reader;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        String filename = "safaf.txt";

        BufferedReader reader = new BufferedReader(new FileReader(filename));

        String line = null;

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();


    }

}
