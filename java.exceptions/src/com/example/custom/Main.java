package com.example.custom;

public class Main {
    public static void main(String args[]) {
        try {
            throw new CustomException(10);
        } catch(CustomException ce) {
            System.out.println("Caught CustomException: " + ce);
        }
    }
}
