package edu.example.polymorphism;

public class Shape {

    public double calculateArea(double sideLength) {
        return sideLength * sideLength;
    }

    public double calculateArea(double sideLength1, double sideLength2) {
        return sideLength1 * sideLength2;
    }

    public double calculateArea(double radius, boolean isCircle) {
        return isCircle ? Math.PI * radius * radius : 0;
    }

}
