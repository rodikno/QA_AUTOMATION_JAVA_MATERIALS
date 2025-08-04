package com.example.abstrct.animals;

public class AnimalKeeper {



    public void feed(AbstractAnimal animal){
        animal.eat();
        System.out.println("Heey my cutie you're fed now");
    }

}
