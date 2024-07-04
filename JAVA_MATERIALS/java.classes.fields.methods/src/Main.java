public class Main {
    public static void main(String[] args) {

        Apple myApple = new Apple();
        Human rodion = new Human();

        myApple.weight = 0.3;

        System.out.println("WEIGHT BEFORE IT WAS BITTEN: " + myApple.weight);

        Apple bittenApple = rodion.bite(myApple);

        System.out.println("WEIGHT AFTER IT WAS BITTEN: " + myApple.weight);





    }



}