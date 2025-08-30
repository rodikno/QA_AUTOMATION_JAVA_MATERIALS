package com.example.serialization;

import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeserializeExample {
    public static void main(String[] args) {
        Path path = Paths.get("student.ser"); // Path to the serialized file

        try (ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(path))) {
            Student student = (Student) ois.readObject(); // Deserialize the object
            System.out.println("Object deserialized: " + student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}