package Notification;

public interface NotificationCommand {

	NotificationService getNotificationService();

	void execute();

}