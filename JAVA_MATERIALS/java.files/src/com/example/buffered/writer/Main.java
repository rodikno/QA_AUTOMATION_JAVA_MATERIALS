package com.example.buffered.writer;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        String filename = "myexample.txt";

        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
        writer.write("Hello Auto QA 1.0!");
        writer.close();
    }


}
