package edu.example.animals;

public class WalkingAnimal extends Animal {

    int legsCount;

    public WalkingAnimal(int age, String name, int legsCount) {
        super(age, name);
        this.legsCount = legsCount;
    }


    public void walk() {
        System.out.println("Walking!");
    }


}
