package com.homework.superheroes;

public class SuperHero {

    String name;
    int attackPower;
    int defensePower;
    int health = 100;

    public SuperHero(String name, int attackPower, int defensePower) {
        this.name = name;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
    }

    public void attack(SuperHero opponent) {
        int damage = this.attackPower - opponent.defensePower;
        if (damage < 0) damage = 0;

        System.out.println(this.name + " attacks " + opponent.name + " and deals " + damage + " damage.");
        opponent.takeDamage(damage);
    }

    public void takeDamage(int damage) {
        this.health -= damage;

        int inflictedDamage = damage - this.defensePower;
        if (inflictedDamage > 0) {
            this.health -= inflictedDamage;
        }
            /*if (this.health < 0) this.health = 0;
            System.out.println(this.name + " health remaining: " + this.health + ".");*/

        if (this.health == 0) {
            System.out.println(this.name + " Burned out at work!");
        }
    }
    public boolean isAlive() {
        return this.health > 0;
    }

    public void showStats() {
        System.out.println(name + " — Attack: " + attackPower + ", Defense: " + defensePower + ", Health: " + health);
    }
    public void restoreHealth() {
        this.health = 100;
        System.out.println(this.name + " is fully healed and ready for the next battle!");
    }
}