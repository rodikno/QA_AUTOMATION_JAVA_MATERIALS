package com.example.custom;

public class CustomException extends Exception {
    private int errorCode;

    CustomException(int errorCode) {
        this.errorCode = errorCode;
    }

    public String toString() {
        return "MyCustomException[" + errorCode + "]";
    }
}