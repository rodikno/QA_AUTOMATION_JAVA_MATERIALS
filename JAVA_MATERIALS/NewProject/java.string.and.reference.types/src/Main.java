/**
 * Created by Rodion Baronov on 30-Jun-24.
 */
public class Main {
    public static void main(String[] args) {

        String myName = "MaRIe";

        String upperCaseName = myName.toUpperCase(); // "MARIE"
        String lowerCaseName = myName.toLowerCase(); // "marie"


        String someStringWithSpaces = "   Hello   ";
        String trimmedString = someStringWithSpaces.trim(); // "Hello"

        String cityName = "Dnipro";
        String substringWithStartAndEndIndex = cityName.substring(0, 3); // "Dni"
        String substringWithStartIndexOnly = cityName.substring(3); // "pro"


        String s1 = "";
        String s2 = " ";
        String s3 = "\t\n";
        String s4 = "Hello";

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
