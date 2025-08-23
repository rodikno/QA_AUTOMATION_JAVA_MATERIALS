package com.example.serialization;

import java.io.*;

public class ObjectSerializationExample {
    public static void main(String[] args) {

        Student student = new Student("John", 25);

        // Збереження об'єкта
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("student.dat"))) {
            oos.writeObject(student);
        } catch (FileNotFoundException e) {
            System.out.println("File not found:");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Читання об'єкта
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("student.dat"))) {
            Student student2 = (Student) ois.readObject();
            System.out.println(student2);
        } catch (FileNotFoundException e) {
            System.out.println("File not found:");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
