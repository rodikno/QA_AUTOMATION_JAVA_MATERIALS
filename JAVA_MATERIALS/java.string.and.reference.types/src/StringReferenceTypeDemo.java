public class StringReferenceTypeDemo {
    public static void main(String[] args) {

        String greeting = "Привіт, AUTO QA 1.0!";
        String name = new String("Іван");


        String ping = "Ping";
        String pong = "Pong";

        String concat = ping + pong; // Returns "PingPong"


        String myString = "Hello, World!";
        System.out.println("String: " + myString);
        System.out.println("Hash code: " + System.identityHashCode(myString));

        // Creating another reference variable to the same object to see no difference in HashCodes
        String whatShouldLookLikeAnotherString = "Hello, World!";
        System.out.println("Another String: " + whatShouldLookLikeAnotherString);
        System.out.println("Hash code: " + System.identityHashCode(whatShouldLookLikeAnotherString));


        // Creating another String object to see the difference in hash codes
        String forciblyNewString = new String("Hello, World!");
        System.out.println("Another String: " + forciblyNewString);
        System.out.println("Hash code: " + System.identityHashCode(forciblyNewString));

    }
}