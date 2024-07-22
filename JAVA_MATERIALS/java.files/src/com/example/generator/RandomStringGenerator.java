package com.example.generator;

import java.util.Random;

public class RandomStringGenerator {
    public static String generateRandomString(int length) {
        StringBuilder builder = new StringBuilder(length);
        Random rnd = new Random();

        for (int i = 0; i < length; i++) {
            // Generate a random alphanumeric character (a-z, A-Z, 0-9)
            int c = rnd.nextInt(62);
            if (c <= 9) {
                builder.append((char) (c + '0'));
            } else if (c <= 35) {
                builder.append((char) (c + 'A' - 10));
            } else {
                builder.append((char) (c + 'a' - 36));
            }
        }
        return builder.toString();
    }
}
