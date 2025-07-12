package edu.example.vehicles;

public class Vehicle {

//    public
//    protected
//    default (package-private)
//    private

    String name;
    int maxSpeed;
    int currentSpeed;

    void accelerate() {
        System.out.println("Accelerating");
        if ((currentSpeed + 10) > maxSpeed) {
            currentSpeed = maxSpeed;
        } else {
            currentSpeed += 10;
        }
    }
}
