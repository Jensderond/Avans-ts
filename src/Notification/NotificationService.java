package Notification;

import Sprint.SprintState;
import Member.Member;

import java.util.ArrayList;
import java.util.List;

public class NotificationService implements Observer {

	private List<String> messageQueue;

	public NotificationService() {
		messageQueue = new ArrayList<>();
		MessageFactory messageFactory = new MessageFactory();
		messageFactory.getMessageService("SLACK");
		NotificationCommand slackCommand = new SlackCommand(messageFactory.getMessageService("SLACK"), getMessageQueue());
		NotificationCommand emailCommand = new EmailCommand(messageFactory.getMessageService("EMAIL"), getMessageQueue());
	}

	public void addMessage(String m) {
		messageQueue.add(m);
	}

	public List<String> getMessageQueue() {
		return this.messageQueue;
	}

	public void sendMessage() {
		// TODO - implement NotificationService.sendMessage
		throw new UnsupportedOperationException();
	}

	@Override
	public void update(SprintState s, Member m) {

	}
}