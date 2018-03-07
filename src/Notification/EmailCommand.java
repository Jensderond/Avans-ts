package Notification;

import Member.Member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import Member.Member;

public class EmailCommand implements NotificationCommand {

    private Service email;
    private HashMap<Member, String> messageQueue;

    public EmailCommand(Service email, HashMap<Member, String> messageQueue) {
        this.email = email;
        this.messageQueue = messageQueue;
    }

    @Override
    public void execute() {
        for (Object o : messageQueue.entrySet()) {
            Map.Entry pair = (Map.Entry) o;
            Member member = (Member) pair.getKey();
            String message = pair.getValue().toString();
            if (member.getPerson().getPrefferedMessageMedium().equals("EMAIL")){
                this.email.send(member, message);
            }
        }
    }
}