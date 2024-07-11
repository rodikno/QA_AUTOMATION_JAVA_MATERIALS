package com.example.overloading;

public class Main {
    public static void main(String[] args) {
        Artist artist = new Artist();

        Shape circle = new Circle();
        Shape square = new Square();
        Shape triangle = new Triangle();

        // Викликаємо методи draw для різних об'єктів
        artist.drawShape(circle);    // Drawing a Circle
        artist.drawShape(square);    // Drawing a Square
        artist.drawShape(triangle);  // Drawing a Triangle
    }
}
