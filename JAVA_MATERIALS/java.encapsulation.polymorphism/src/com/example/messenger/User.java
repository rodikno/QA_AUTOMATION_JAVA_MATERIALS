package com.example.messenger;

import java.util.ArrayList;

public class User {

    private String username;
    private String password;
    private String phoneNumber;
    private ArrayList<Message> messageHistory;
    private ArrayList<User> contactsList;


    public User(String username, String password, String phoneNumber) {
        this.username = username;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.messageHistory = new ArrayList<>();
        this.contactsList = new ArrayList<>();
    }

    public void sendMessage(String content, User receiver) {
        if (receiver != null && content != null && !content.isEmpty()) {
            if (contactsList.contains(receiver)) {
                Message message = new Message(this, receiver, content);
                System.out.println(this.getUsername() + " sent a message to " + receiver.getUsername() + ":");
                System.out.println(">" + content + "<");
                receiver.receiveMessage(message);
                addMessageToHistory(message);
            } else {
                System.out.println("Recepient " + receiver.getUsername() + " is not a contact of " + this.username);
                System.out.println("Please first add him/her as a contact before sending a message");
            }
        } else {
            System.out.println("Either such receiver doesn't exist or you're trying to send an empty message");
        }


    }

    public void addContact(User contact) {
        if (contact != null) {
            contactsList.add(contact);
            System.out.println("Contact " + contact.getUsername() + " has been added to contacts of: " + this.username);
        } else {
            System.out.println("Please choose a valid contact to add");
        }
     }

    public void removeContact(User contact) {
        if (contact != null) {
            contactsList.remove(contact);
            System.out.println("Contact " + contact.getUsername() + " has been removed from contacts of: " + this.username);
        } else {
            System.out.println("Please choose a valid contact to remove");
        }
    }

    private void addMessageToHistory(Message message) {
        if (message != null) {
            this.messageHistory.add(message);
        }
    }

    private void receiveMessage(Message message) {
        if (message != null) {
            System.out.println("User " + this.username +" has received a message from " + message.getSender().getUsername() + ":");
            System.out.println(">" + message.getContent() + "<");
            message.setReceived(true);
            addMessageToHistory(message);
        }
    }

    private void readMessage(Message message) {
        if (message != null) {
            message.setRead(true);
        }
    }

    public void showMessageHistory() {
        System.out.println("--------------------------------");
        System.out.println("Message history of " + this.username + ":");
        this.messageHistory.forEach(message -> {
            System.out.println(message.getContent());
        });
        System.out.println("--------------------------------");
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void setPassword(String password) {
        if (password == null || password.isEmpty()) {
            this.password = password.trim();
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username == null || username.isEmpty()) {
            this.username = username.trim();
        }
    }





}
