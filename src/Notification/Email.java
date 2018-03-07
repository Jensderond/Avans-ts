package Notification;

import Member.Member;

public class Email implements Service {

    @Override
    public void send(Member m, String s) {
        System.out.println("Email message: " + s + " has been sent to: " + m.getPerson().getEmailAdress() );
    }
}