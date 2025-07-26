package com.example.abstrct.cls;

public abstract class AbstractAnimal extends AbstractLivingCreature {
    String name;
    int age;

    AbstractAnimal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    protected abstract void makeSound();


    void sleep() {
        System.out.println("Zzz...");
    }


    public void displayInfo() {
        System.out.println(this.name + ", " + this.age);
    }
}
