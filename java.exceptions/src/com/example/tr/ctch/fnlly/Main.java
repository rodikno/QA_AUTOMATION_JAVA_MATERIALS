package com.example.tr.ctch.fnlly;

public class Main {
    public static void main(String[] args) {
        try {
            int divideByZero = 5 / 0;
            System.out.println(divideByZero);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException\n" + e.getMessage());
        }
        finally {
            System.out.println("This line is always executed, regardless of whether exception occurred or not");
        }
    }
}
