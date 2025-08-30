package com.example.serialization;

import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializeExample {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20);
        Path path = Paths.get("student.ser"); // Path for the serialized file

        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))) {
            oos.writeObject(student); // Serialize the object
            System.out.println("Object serialized to file: " + path.toAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}