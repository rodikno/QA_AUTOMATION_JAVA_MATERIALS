package com.example.tr.with.rsrc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String filename = "myexample.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            System.out.println(br.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
