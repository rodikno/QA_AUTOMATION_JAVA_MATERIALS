package com.example.thrw;

import java.security.InvalidParameterException;

public class Main {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("Dude, You can't divide by zero like that");
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e);
            throw new InvalidParameterException("The divisor can't be zero or otherwise everything burns");
        }
    }
}