package com.example.custom;

import javax.management.InvalidAttributeValueException;
import java.util.IllegalFormatException;

public class AgeLessThanZeroException extends Throwable {


    public AgeLessThanZeroException(String message) {
        super(message);
    }
}
