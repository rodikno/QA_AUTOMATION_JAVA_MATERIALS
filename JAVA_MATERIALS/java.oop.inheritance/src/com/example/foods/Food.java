package com.example.foods;

import com.example.animals.Animal;


public class Food extends Animal {

    public String name;
    int calories;

    public Food(String name, int age) {
        super(name, age);
    }


    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Calories: " + calories);

    }

}
