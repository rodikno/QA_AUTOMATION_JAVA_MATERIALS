package example.equalshashcode;

import java.util.HashSet;

public class ProblematicUserDemo {

    public static void main(String[] args) {

        HashSet<ProblematicUser> set = new HashSet<>();
        ProblematicUser p1 = new ProblematicUser("Alex");
        ProblematicUser p2 = new ProblematicUser("Alex");

        set.add(p1);
        System.out.println(set.contains(p2)); // false, хоча ім’я однакове

    }
}
