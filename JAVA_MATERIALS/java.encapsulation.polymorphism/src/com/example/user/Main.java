package com.example.user;

public class Main {
    public static void main(String[] args) {
        // Create a User object
        User user = new User("JohnDoe", "john.doe@example.com", 25);
        InactiveUser inactive = new InactiveUser();

        inactive.setUsername("RODION");

        // Access and modify fields using getters and setters
        System.out.println("Username: " + user.getUsername());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Age: " + user.getAge());

        // Modify the fields with additional processing
        user.setUsername("    Rodion    "); // Will be trimmed
        user.setEmail("john.doeatexample.com"); // Invalid email
        user.setAge(-5); // Invalid age

        System.out.println("Updated Username: " + user.getUsername());
        System.out.println("Updated Email: " + user.getEmail());
        System.out.println("Updated Age: " + user.getAge());
    }
}