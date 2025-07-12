package edu.example.polymorphism;

public class Executor {
    public static void main(String[] args) {

        Shape shape = new Shape();


        double areaOfASquare = shape.calculateArea(10);
        double areaOfARectangle = shape.calculateArea(10, 20);
        double areaOfACircle = shape.calculateArea(5, true);

        System.out.println(areaOfASquare);
        System.out.println(areaOfARectangle);
        System.out.println(areaOfACircle);

    }
}
