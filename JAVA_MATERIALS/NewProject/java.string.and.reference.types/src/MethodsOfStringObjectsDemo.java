/**
 * Created by Rodion Baronov on 28-Jun-24.
 */
public class MethodsOfStringObjectsDemo {

    public static void main(String[] args) {
        String str = "  Hello, World!  ";

        // 1. length()
        System.out.println("Length of string: " + str.length());

        // 2. charAt()
        System.out.println("Character at index 7: " + str.charAt(7));

        // 3. substring()
        System.out.println("Substring from index 7 to 12: " + str.substring(7, 12));

        // 4. equals()
        System.out.println("Equals 'Hello, World!': " + str.equals("Hello, World!"));

        // 5. equalsIgnoreCase()
        System.out.println("Equals '  hello, world!  ' (ignore case): " + str.equalsIgnoreCase("  hello, world!  "));

        // 6. indexOf()
        System.out.println("Index of 'World': " + str.indexOf("World"));

        // 7. lastIndexOf()
        String repeatedStr = "Hello, Hello, Hello";
        System.out.println("Last index of 'Hello' in repeatedStr: " + repeatedStr.lastIndexOf("Hello"));

        // 8. toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // 9. toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // 10. trim()
        System.out.println("Trimmed: '" + str.trim() + "'");

        // 11. replace()
        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));

        // 12. split()
        String[] words = str.split(", ");
        System.out.println("Split by ', ': ");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
