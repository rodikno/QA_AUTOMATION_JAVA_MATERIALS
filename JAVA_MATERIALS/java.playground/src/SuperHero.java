import java.util.Random;

public class SuperHero {

    // Тут мають бути властивості і поведінка Супергероя

    public Random random = new Random();
    String name;
    int attackPower;
    int deffencePower;
    int health = 100;
    boolean isAlive = true;

    public void attack(SuperHero opponent, int attackStrength) {
        System.out.println("SuperHero " + name + " attacks ");
        int event = random.nextInt(3) + 1;
        if (event == 1) {
            int bonusAttack = random.nextInt(6) + 1;
            System.out.println("SuperHero " + name + " recives bonus to the attack " + bonusAttack);
            attackStrength += bonusAttack;
        } else {
            int bonusDefence;
            bonusDefence = random.nextInt(6) + 1;
            opponent.protectionUsed(bonusDefence);
        }
        opponent.getDamaged(attackStrength);
    }

    public void getDamaged(int attackPower) {
        System.out.println("SuperHero " + name + " recives " + attackPower + " of damage ");
        health -= attackPower;

        if (health <= 0) {
            health = 0;
            isAlive = false;
            System.out.println("SuperHero " + name + " is dead. The game is over ");
        } else {
            showStats();
        }
    }

    public boolean isAlive() {
        return health > 0;
    }


    public void protectionUsed(int deffencePower) {
        System.out.println("SuperHero " + name + " revices " + deffencePower + " protection bonus ");
        health += deffencePower;
    }


    public void showStats() {
        System.out.println("SuperHero " + name + " has " + health + " points left ");
    }


}