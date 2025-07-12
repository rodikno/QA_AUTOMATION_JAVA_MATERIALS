package edu.example.animals;

public class CatPrinter extends AnimalPrinter {

    public static void printCat(Cat cat) {
        System.out.println("PRINTING CAT:");
        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println(cat.legsCount);
        System.out.println(cat.whiskersLength);

    }

}
