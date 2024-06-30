/**
 * Created by Rodion Baronov on 30-Jun-24.
 */
public class MethodsOfStringDemo {
    public static void main(String[] args) {

        String str = "Hello, World!";
        String spacedStr = "   Java Programming   ";

        // 1. length() - Returns the length of the string
        System.out.println("1. length():");
        System.out.println(str.length());

        // 2. charAt(int index) - Returns the character at the specified index
        System.out.println("\n2. charAt(7):");
        System.out.println(str.charAt(7));

        // 3. substring(int beginIndex, int endIndex) - Returns a substring
        System.out.println("\n3. substring(7, 12):");
        System.out.println(str.substring(7, 12));

        // 4. toLowerCase() and toUpperCase() - Convert case
        System.out.println("\n4. toLowerCase() and toUpperCase():");
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        // 5. trim() - Removes leading and trailing whitespaces
        System.out.println("\n5. trim():");
        System.out.println(spacedStr);
        System.out.println(spacedStr.trim());

        // 6. replace(char oldChar, char newChar) - Replaces characters
        System.out.println("\n6. replace('l', 'x'):");
        System.out.println(str.replace('l', 'x'));

        // 7. contains(CharSequence sequence) - Checks for a sequence
        System.out.println("\n7. contains(\"World\"):");
        System.out.println(str.contains("World"));

        // 8. equals(Object another) - Compares two strings
        System.out.println("\n8. equals():");
        System.out.println(str.equals("Hello, World!"));
        System.out.println(str.equals("hello, world!"));

        // 9. split(String regex) - Splits the string
        System.out.println("\n9. split(\",\"):");
        String[] parts = "Java,Python,C++".split(",");
        for (String part : parts) {
            System.out.println(part);
        }

        // 10. startsWith(String prefix) and endsWith(String suffix)
        System.out.println("\n10. startsWith(\"Hello\") and endsWith(\"!\"):");
        System.out.println(str.startsWith("Hello"));
        System.out.println(str.endsWith("!"));

    }
}
