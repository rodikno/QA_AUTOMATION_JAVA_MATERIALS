package com.example.tr.ctch.fnlly;

public class Main {
    public static void main(String[] args) {
        System.out.println(getNumber());
    }


    public static int getNumber() {
        try {
            throw new Error("bdsff");
        } catch (Exception e) {
            return 5;
        } finally {
            return 99;
        }

    }
}
