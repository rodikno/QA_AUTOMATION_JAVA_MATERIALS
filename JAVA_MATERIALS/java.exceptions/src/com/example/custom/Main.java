package com.example.custom;

import java.security.InvalidParameterException;

public class Main {
    public static void main(String args[]) {

        try {
            validateAge(-56);
        } catch (AgeLessThanZeroException e) {
            throw new RuntimeException(e);
        }

    }

    public static void validateAge(int age) throws AgeLessThanZeroException {
        if (age >= 0) {
            System.out.println("The age is valid");
        } else {
            throw new AgeLessThanZeroException("Sorry age can't be less than zero");
        }

    }
}
