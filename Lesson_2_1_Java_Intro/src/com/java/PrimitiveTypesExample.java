package com.java;


//Primitive Data types
//INTEGERS
//Byte (-128..127)
//short 16 bits/2 bytes (-32768..32767)
//int 32 bits/4 bytes (-2 147 483 648..2,147,483,647)
//long 64 bits/8 bytes (-9,223,372,036,854,775,808..9,223,372,036,854,775,807
//Floating point numbers
//float 32bits/4bytes від 1.4e-45 до 3.4e+38  (7 знаків точності)
//double 64bits/8bytes від 4.9e-324 до 1.8e+308 (15 знаків точності)
//Symbols
//char 16bit/2bytes (0..65535)
//Boolean
//true/false (1 bit)

public class PrimitiveTypesExample {

    public static void main(String[] args) {
        // Declaration and initialization of primitive type variables
        byte myByte = 127;
        short myShort = 32000;
        int myInt = 1234567890;
        long myLong = 123456789012345L;
        float myFloat = 3.14159265358979323846f;
        double myDouble = 3.14159265358979323846;
        boolean myBoolean = true;
        char myChar = 'A';

        // Printing out the values
        System.out.println("byte: " + myByte);
        System.out.println("short: " + myShort);
        System.out.println("int: " + myInt);
        System.out.println("long: " + myLong);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("boolean: " + myBoolean);
        System.out.println("char: " + myChar);
    }
}

