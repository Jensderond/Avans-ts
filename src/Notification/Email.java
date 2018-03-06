package Notification;

public class Email implements Service {

    @Override
    public void send() {
        System.out.println("Email message has been sent");
    }
}