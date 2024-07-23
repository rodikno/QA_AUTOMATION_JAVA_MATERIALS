import java.io.FileNotFoundException;
import java.io.FileReader;


public class Main {
    public static void main(String[] args)  {
        validateAge(-3);

    }


    public static void validateAge(int age) {
        if (age < 0) {
            System.out.println("Age is invalid");
            throwException();
        }

    }

    public static void throwException() {
        try {
            throw new Exception("HAHA I did intentionally!");
        } catch (Exception e) {
            System.out.println("Ok I did bu I handled it in place. Don't worry");
        }
    }

}