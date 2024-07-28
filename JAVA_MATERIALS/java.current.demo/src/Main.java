import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        writeToFile("rodion.txt", "Hello world!");

    }


    public static void writeToFile(String filename, String content) throws IOException {

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(filename));
            writer.write(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            writer.close();
        }

    }

}