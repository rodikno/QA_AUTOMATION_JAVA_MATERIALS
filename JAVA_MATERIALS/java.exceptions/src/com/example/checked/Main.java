package com.example.checked;

import java.io.*;

public class Main {
    public static void main(String args[]) {

        String str = "Hello";




        try {
           throw new IOException("Some IO exception");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("THIS IS GETTING EXECUTED IN ANY CASE");
        }

//        try {
//            FileInputStream fileStream = new FileInputStream("myfile.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }


//        FileInputStream fis = null;
//        try {
//            fis = new FileInputStream("myfile.txt");
//        } catch (FileNotFoundException fnfe) {
//            System.out.println("The specified file not found" + fnfe);
//        }
    }

    public static void doSomething() throws IOException {
        throw new IOException("Some IO exception");
    }
}