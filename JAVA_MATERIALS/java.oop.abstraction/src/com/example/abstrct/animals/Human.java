package com.example.abstrct.animals;

import com.example.abstrct.cls.AbstractLivingCreature;

public class Human extends AbstractLivingCreature implements Hunter, Walker {
    @Override
    public void eat() {
        System.out.println("Human eats");
    }


    @Override
    public void hunt() {
        System.out.println("Human hunts");
    }

    @Override
    public void catchPrey() {
        System.out.printf("Human catches prey");
    }

    @Override
    public void walk() {
        System.out.println( "Human walks");
    }
}
