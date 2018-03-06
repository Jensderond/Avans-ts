package Notification;

public class Slack implements Service {
    @Override
    public void send() {
        System.out.println("Slack message has been sent");
    }
}