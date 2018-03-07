package Notification;

import Sprint.Sprint;
import Sprint.SprintItem;
import Sprint.SprintState;
import Member.Member;

import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotificationService implements Observer {

	private HashMap<Member, String> messageQueue;
	private MessageFactory messageFactory = new MessageFactory();

	public NotificationService() {
		messageQueue = new HashMap<>();

	}

	public void addMessage(Member m, String s) {
		messageQueue.put(m, s);
	}

	public HashMap<Member, String> getMessageQueue() {
		return this.messageQueue;
	}

	public void sendMessage() {
		NotificationCommand slackCommand = new SlackCommand(this.messageFactory.getMessageService("SLACK"), getMessageQueue());
		slackCommand.execute();

		NotificationCommand emailCommand = new EmailCommand(this.messageFactory.getMessageService("EMAIL"), getMessageQueue());
		emailCommand.execute();
	}


	@Override
	public void update(Sprint s) {
		addMessage(s.getScrumMaster(), "State changed to: " + s.getState().getClass().getName());
		sendMessage();
	}

	@Override
	public void update(SprintItem s) {
//		addMessage(s.getScrumMaster(), "State changed to: " + s.getState());
	}
}