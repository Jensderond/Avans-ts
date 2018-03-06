package Notification;

import java.util.List;

public class EmailCommand implements NotificationCommand {

    private Service email;
    private List messageQueue;

    public EmailCommand(Service email, List messageQueue) {
        this.email = email;
        this.messageQueue = messageQueue;
    }

    @Override
    public void execute() {
        for (int i = 0; i < messageQueue.size(); i++) {
            this.email.send();
        }
    }
}