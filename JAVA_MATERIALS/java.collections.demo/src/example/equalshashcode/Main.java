package example.equalshashcode;


import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        UserRecord john = new UserRecord("John", "Doe", 32);


        HashSet<UserRecord> people = new HashSet<>();
        people.add(new UserRecord("John", "Doe", 32));


    }

}
