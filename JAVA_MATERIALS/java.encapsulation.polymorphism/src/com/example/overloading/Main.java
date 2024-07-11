package com.example.overloading;

public class Main {
    public static void main(String[] args) {
        Artist artist = new Artist();

        Shape circle = new Circle();
//        Shape square = new Square();
//        Triangle triangle = new Triangle();
//        Shape shape = new Shape();

//        // Викликаємо методи draw для різних об'єктів
//        artist.drawShape(circle);    // Drawing a Circle
//        artist.drawShape(square);    // Drawing a Square
//        artist.drawShape(triangle);  // Drawing a Triangle
//        artist.drawShape(shape);


        artist.drawShape(circle);
        artist.drawShape("CIRCLE");
    }
}
