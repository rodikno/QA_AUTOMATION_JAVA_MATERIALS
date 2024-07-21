package com.example.multicatch;

import java.io.*;
import java.util.*;

public class MyProgram {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String filename = "nonexistent.txt";

        try {
            // Triggering a FileNotFoundException
            BufferedReader reader = new BufferedReader(new FileReader(filename));

            // Triggering a NoSuchElementException
            String item = list.get(0);

        } catch (FileNotFoundException | NoSuchElementException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}