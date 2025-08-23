package com.homework.superheroes;

public class BattleField {
    public static SuperHero battle(SuperHero hero1, SuperHero hero2) {
        int round = 1;
        while (hero1.isAlive() && hero2.isAlive()) {
            System.out.println("\nRound " + round + ":");
            hero1.attack(hero2);
            if (!hero2.isAlive()) break;

            hero2.attack(hero1);
            round++;
        }

        System.out.println("\nBattle ended!");
        if (hero1.isAlive() && !hero2.isAlive()) {
            System.out.println("Winner: " + hero1.name + "!");
            return hero1;
        } else if (!hero1.isAlive() && hero2.isAlive()) {
            System.out.println("Winner: " + hero2.name + "!");
            return hero2;
        } else {
            System.out.println("It's a draw! Both heroes fell in battle.");
            return new SuperHero("Nobody", 0, 0);
        }
    }
}