package Notification;

import Member.Member;

public class Slack implements Service {
    @Override
    public void send(Member m, String s) {
        System.out.println("Slack message "+ s + ". \n Has been sent to: " + m.getPerson().getEmailAdress() );
    }
}