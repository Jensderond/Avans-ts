package Notification;


import Sprint.Sprint;
import Sprint.SprintItem;

public interface Observer {

	void update(Sprint s);
	void update(SprintItem s);

}