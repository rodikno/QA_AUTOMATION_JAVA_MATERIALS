package com.example.checked;

import java.io.*;

public class Main {
    public static void main(String args[]) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("myfile.txt");
        } catch (FileNotFoundException fnfe) {
            System.out.println("The specified file not found" + fnfe);
        }
    }
}