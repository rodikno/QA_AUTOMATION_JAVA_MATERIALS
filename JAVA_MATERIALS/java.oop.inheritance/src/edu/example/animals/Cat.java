package edu.example.animals;

public class Cat extends WalkingAnimal {

    double whiskersLength;

    // Animal -> WalkingAnimal -> Cat
    public Cat(int age, String name, double whiskersLength) {
        super(age, name, 4);
        this.whiskersLength = whiskersLength;
    }

    public void makeSound() {
        super.makeSound();
        System.out.println("Miau!");
    }


    public void liveAWonderfulDay() {
        this.
        eat();
        sleep();
        walk();
    }

}
