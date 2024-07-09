package com.example.animals;

import com.example.foods.Food;

import java.util.ArrayList;

public class Animal {

    public String name;
    public int age;
    public boolean isPredator;
    protected int weight;
    public ArrayList<Food> eatenFoods = new ArrayList<>();
    public static String nickname;

    public int getWeight() {
        return this.weight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void doSmth() {
        System.out.println("DOING SOMETHING");
    }


    public void eat(Food food) {
        eatenFoods.add(food);
    }

    public void makeSound() {
        System.out.println("HEY I'M AN ANIMAL!");
    }

    public void viewStomackContent() {
        eatenFoods.forEach(food -> System.out.println(food.name));
    }

    private void makeSomething() {
        System.out.println("THIS IS NOT VISIBLE TO ANYBODY");
    }

}
