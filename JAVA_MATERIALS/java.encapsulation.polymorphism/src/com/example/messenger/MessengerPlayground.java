package com.example.messenger;

public class MessengerPlayground {
    public static void main(String[] args) {

        User violetta = new User("viola777", "1234qazWSX!", "+380981111111");
        User ivan = new User("ivanTheBest888", "qwerty123", "+380114349090");

        ivan.addContact(violetta);
        ivan.sendMessage("Hello beautiful!", violetta);

        violetta.addContact(ivan);
        violetta.sendMessage("Hello, Ivan! Do we know each other?", ivan);

        ivan.sendMessage("No, We don't", violetta);
        ivan.sendMessage("Wanted to ask you out for a coffee", violetta);

        violetta.sendMessage("Sorry, I have a boyfriend", ivan);
        violetta.removeContact(ivan);
        ivan.removeContact(violetta);
        ivan.sendMessage("I'm so sad...", violetta);

        ivan.showMessageHistory();


    }
}
