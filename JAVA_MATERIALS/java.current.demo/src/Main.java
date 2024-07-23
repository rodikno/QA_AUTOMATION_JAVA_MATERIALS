import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User alex = new User();
        User marta = new User();
        User yulia = new User();

        alex.setName("Alex");
        marta.setName("Marta");
        yulia.setName("Yulia");

        alex.addContact(marta);
        alex.addContact(yulia);

        marta.addContact(alex);
        marta.addContact(yulia);

        yulia.addContact(alex);
        yulia.addContact(marta);


        System.out.println(alex);
        System.out.println(yulia);
        System.out.println(marta);

    }
}