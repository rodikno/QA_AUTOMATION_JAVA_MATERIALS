import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        User anotherUser = new User();
        User thirdUser = new User();

        user.setName("Aleks");
        anotherUser.setName("Rodion");
        thirdUser.setName("Marta");

        user.addContact(anotherUser);
        user.addContact(thirdUser);


        ArrayList<User> users = new ArrayList<>();
        users.add(user);
        users.add(anotherUser);
        users.add(thirdUser);

        users.forEach(printableUser -> System.out.println(printableUser));


    }
}