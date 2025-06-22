package com.example.foods;

import com.example.animals.Animal;

/**
 * Created by Rodion Baronov on 09-Jul-24.
 */
public class Food extends Animal {

    public String name;
    int calories;

    public Food(String name, int age) {
        super(name, age);
    }


    public void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Calories: " + calories);

        Animal cat = new Animal("dsdsd", 43);

    }

}
