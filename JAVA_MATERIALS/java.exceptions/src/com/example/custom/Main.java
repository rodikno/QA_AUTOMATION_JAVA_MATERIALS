package com.example.custom;

import java.security.InvalidParameterException;

public class Main {
    public static void main(String args[]) throws AgeLessThanZeroException {

        validateAge(0);

    }

    public static void validateAge(int age) throws AgeLessThanZeroException {
        if (age > 0) {
            System.out.println("The age is valid");
        } else {
            throw new AgeLessThanZeroException(new InvalidParameterException());
        }

    }
}
