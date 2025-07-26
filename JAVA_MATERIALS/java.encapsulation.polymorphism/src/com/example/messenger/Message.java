package com.example.messenger;

public class Message {
    User sender;
    User recepient;
    String content;
    boolean isReceived = false;
    boolean isRead = false;

    public Message(User sender, User recepient, String content) {
        this.sender = sender;
        this.recepient = recepient;
        this.content = content;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getRecepient() {
        return recepient;
    }

    public void setRecepient(User recepient) {
        this.recepient = recepient;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isReceived() {
        return isReceived;
    }

    public void setReceived(boolean received) {
        isReceived = received;
    }

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }
}
