/**
 * Created by Rodion Baronov on 30-Jun-24.
 */
public class StringEmptyVsBlankDemo {
    public static void main(String[] args) {

        String s1 = "";
        String s2 = " ";
        String s3 = "\t\n";
        String s4 = "Hello";
        String s5 = null;

        System.out.println("Is NULL? " + (s1 == null));
        System.out.println("Is NULL? " + (s2 == null));
        System.out.println("Is NULL? " + (s3 == null));
        System.out.println("Is NULL? " + (s4 == null));
        System.out.println("Is NULL? " + (s5 == null));

        System.out.println(s1.isEmpty());  // true
        System.out.println(s1.isBlank());  // true

        System.out.println(s2.isEmpty());  // false
        System.out.println(s2.isBlank());  // true

        System.out.println(s3.isEmpty());  // false
        System.out.println(s3.isBlank());  // true

        System.out.println(s4.isEmpty());  // false
        System.out.println(s4.isBlank());  // false

    }
}
