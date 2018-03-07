package Notification;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Member.Member;

public class SlackCommand implements NotificationCommand {

    private Service slack;
    private HashMap<Member, String> messageQueue;

    public SlackCommand(Service slack, HashMap<Member, String> messageQueue) {
        this.slack = slack;
        this.messageQueue = messageQueue;
    }

    @Override
    public void execute() {
        for (Object o : messageQueue.entrySet()) {
            Map.Entry pair = (Map.Entry) o;
            Member member = (Member) pair.getKey();
            String message = pair.getValue().toString();
            if (member.getPerson().getPrefferedMessageMedium().equals("SLACK")){
                this.slack.send(member, message);
            }
        }
    }
}