package Notification;

import java.util.List;

public class SlackCommand implements NotificationCommand {

    private Service slack;
    private List messageQueue;

    public SlackCommand(Service slack, List messageQueue) {
        this.slack = slack;
        this.messageQueue = messageQueue;
    }

    @Override
    public void execute() {
        for (int i = 0; i < messageQueue.size(); i++) {
            this.slack.send();
        }
    }
}