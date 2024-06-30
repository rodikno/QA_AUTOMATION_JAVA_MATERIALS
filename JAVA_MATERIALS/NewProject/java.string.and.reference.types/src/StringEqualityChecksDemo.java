/**
 * Created by Rodion Baronov on 30-Jun-24.
 */
public class StringEqualityChecksDemo {
    public static void main(String[] args) {


        System.out.println("\n--- Additional Equality and Empty/Blank Checks ---");

        // 1. equals() vs ==
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");

        System.out.println("1. equals() vs ==:");
        System.out.println(s1.equals(s2));  // true
        System.out.println(s1 == s2);       // true (string pool)
        System.out.println(s1.equals(s3));  // true
        System.out.println(s1 == s3);       // false (different objects)

        // 2. equalsIgnoreCase()
        String s4 = "Hello";
        String s5 = "hElLo";

        System.out.println("\n2. equalsIgnoreCase():");
        System.out.println(s4.equals(s5));           // false
        System.out.println(s4.equalsIgnoreCase(s5)); // true

        // 3. isEmpty() vs isBlank()
        String empty = "";
        String blank = "   ";
        String notEmpty = "hi";

        System.out.println("\n3. isEmpty() vs isBlank():");
        System.out.println(empty.isEmpty());     // true
        System.out.println(empty.isBlank());     // true
        System.out.println(blank.isEmpty());     // false
        System.out.println(blank.isBlank());     // true
        System.out.println(notEmpty.isEmpty());  // false
        System.out.println(notEmpty.isBlank());  // false

        // 4. null check combined with isEmpty()
        String nullStr = null;
        String emptyStr = "";

        System.out.println("\n4. null check with isEmpty():");
        System.out.println(isNullOrEmpty(nullStr));   // true
        System.out.println(isNullOrEmpty(emptyStr));  // true
        System.out.println(isNullOrEmpty(notEmpty));  // false

        // 5. contentEquals() for StringBuilder comparison
        StringBuilder sb = new StringBuilder("hello");

        System.out.println("\n5. contentEquals() with StringBuilder:");
        System.out.println(s1.contentEquals(sb));  // true
        sb.append(" world");
        System.out.println(s1.contentEquals(sb));  // false
    }


    // Helper method for null and empty check
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }
}
