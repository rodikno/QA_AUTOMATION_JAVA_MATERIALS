package com.example.generic.methods;

public class Main {
    public static void main(String[] args) {
        shout(34);
        shout(34.5);
        shout("Hello");

    }

    public static <T> void shout (T thingToShout) {
        System.out.println(thingToShout + "!!!!!!!!");
    }

    public static <T, V> void shoutTwoThings(T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "!!!!!!!!");
        System.out.println(otherThingToShout + "!!!!!!!!");
    }

    public static <T> T shoutAndReturnTheSameThing (T thingToShout) {
        System.out.println(thingToShout + "!!!!!!!!");

        return thingToShout;
    }

}
