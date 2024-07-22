package com.example.buffered.writer;

import com.example.helpers.FilePathHelper;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        String filename = "myexample.txt";
        File myfile = FilePathHelper.returnFileByRelativePath(filename);
        System.out.println("Absolute path to the file is: " + myfile.toString());

        BufferedWriter writer = new BufferedWriter(new FileWriter(myfile));
        writer.write("Hello Auto QA 1.0!");
        writer.close();
    }


}
