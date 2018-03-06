package Notification;

import Sprint.SprintState;
import Member.Member;

public interface Observer {

	void update(SprintState s, Member m);

}