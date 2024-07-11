package com.example.user;

public class InactiveUser extends User {


    public InactiveUser() {
        super("INACTIVE", "UNKNOWN", -1);
    }

    @Override
    public void setUsername(String username) {
        System.out.println("YOU CANNOT SET USERNAME FOR INACTIVE USER");
    }

}
