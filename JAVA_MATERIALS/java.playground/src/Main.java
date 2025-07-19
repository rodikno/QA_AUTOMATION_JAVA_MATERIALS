public class Main {
    public static void main(String[] args) {

        // Тут має розгортатися епічна битва між Супергероями

        SuperHero flash = new SuperHero();
        SuperHero ironMan = new SuperHero();
        SuperHero jackieChan = new SuperHero();

        flash.name ="flash";
        flash.attackPower=20;
        flash.deffencePower=10;
        flash.health=100;
        flash.isAlive=true;

        ironMan.name="ironMan";
        ironMan.attackPower=15;
        ironMan.deffencePower=5;
        ironMan.health=100;
        ironMan.isAlive=true;

        jackieChan.name="Jackie";
        jackieChan.attackPower=15;
        jackieChan.deffencePower=10;
        jackieChan.health=100;
        jackieChan.isAlive=true;

        System.out.println("Let's the game begin");

        // If both alive - no problem - fight continues
        // Hero will get to know when he's dead (it's included inside .getDamage method
        // So the only thing to check here is if the second hero is still alive to cause some damage
        while (flash.isAlive() && ironMan.isAlive()){
            flash.attack(ironMan, 25);
            if (ironMan.isAlive()) {
                ironMan.attack(flash, 10);
            }
        }

        System.out.println("Let's the game begin");
        while (flash.isAlive() && jackieChan.isAlive()){
            flash.attack(jackieChan, 15);
            if (!jackieChan.isAlive()) break;
            jackieChan.attack(flash, 25);
            if (!flash.isAlive()) break;
        }




    }
}