/**
 * Created by Rodion Baronov on 30-Jun-24.
 */
public class StringIdentityAndHashCodesDemo {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = "Hello";

        System.out.println("str1 identity: " + System.identityHashCode(str1));
        System.out.println("str2 identity: " + System.identityHashCode(str2));
        System.out.println("str3 identity: " + System.identityHashCode(str3));

        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));
    }
}
