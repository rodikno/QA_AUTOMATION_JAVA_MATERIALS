package com.example.enumdemo;

public class Main {
    public static void main(String[] args) {


        PizzaSize mySize = PizzaSize.MEDIUM;

        System.out.println("Я замовив піцу " + mySize.name().toLowerCase() + ".");
        System.out.println(mySize.getDescription());
    }
}
