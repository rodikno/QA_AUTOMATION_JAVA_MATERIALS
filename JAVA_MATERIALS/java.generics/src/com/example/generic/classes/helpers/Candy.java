package com.example.generic.classes.helpers;

public class Candy extends SweetThing {
    private String title;
    private Taste taste;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Taste getTaste() {
        return taste;
    }

    public void setTaste(Taste taste) {
        this.taste = taste;
    }
}
