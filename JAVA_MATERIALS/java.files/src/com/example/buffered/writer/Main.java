package com.example.buffered.writer;

import java.io.*;

public class Main {


    public static void main(String[] args) throws IOException {
        String filename = "myexample.txt";

//        File myfile = FilePathHelper.returnFileByRelativePath(filename);
//        System.out.println("Absolute path to the file is: " + myfile.getAbsolutePath().toString());

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filename));
            writer.write("Hello Auto QA 1.0!");
            writer.write("\nHello Auto QA 1.0!");
            writer.write("\nHello Auto QA 1.0!");
            writer.write("\nHello Auto QA 1.0!");
            writer.write("\nHello Auto QA 1.0!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            writer.close();
        }
    }


}
