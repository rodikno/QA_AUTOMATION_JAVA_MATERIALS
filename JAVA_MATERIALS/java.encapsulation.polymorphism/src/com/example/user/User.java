package com.example.user;

public class User {
    // Private fields
    private String username;
    private String email;
    private int age;

    // Constructor
    public User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        setAge(age); // Use setter to apply validation
    }

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Setter for username with additional processing (e.g., trimming)
    public void setUsername(String username) {
        if (username != null) {
            this.username = username.trim();
        }
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email with validation
    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Invalid email address");
        }
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }
}
