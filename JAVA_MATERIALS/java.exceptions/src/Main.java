import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

        String filename = "file.txt";

        readFile(filename);

    }

    public static void readFile(String filename) {

        try {
            FileReader file = new FileReader(filename);
        } catch (FileNotFoundException e) {
            System.out.println("The specified file doesn't exist");
        }
    }
}