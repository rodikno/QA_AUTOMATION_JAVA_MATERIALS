package com.example.animals;

import com.example.foods.Food;

public class Cat extends Animal {
    String breed;
    int pawsSoftness;
    int furLength;
    boolean isShortLegged;


    public Cat(String name, int age) {
        super(name, age);
        System.out.println("HI I'M a com.example.animals.Cat, PURRR!");
    }

    protected static void printSmth() {
        System.out.println("SOMETHING");
    }

    public void playWith(Food food) {
        String nickname1 = nickname;
        eatenFoods.add(food);
    }

    public void makeSound() {
        super.makeSound();
        System.out.println("PURRRRR!!!");
    }



}
