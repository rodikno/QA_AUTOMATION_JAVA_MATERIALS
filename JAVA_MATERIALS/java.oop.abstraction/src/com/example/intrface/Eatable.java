package com.example.intrface;

interface Eatable {
    String DEFAULT_TASTE = "SWEET";
    int DEFAULT_MASS = 300;

    void eat();
    void taste();

    default int getDefaultMass() {
     return DEFAULT_MASS;
    }

    static String getDefaultTaste() {
        return DEFAULT_TASTE;
    }
}
