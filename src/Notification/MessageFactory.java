package Notification;

public class MessageFactory {

	private static MessageFactory instance;

	/**
	 * 
	 * @param type
	 */
	public Service getMessageService(String type) {
		// TODO - implement MessageFactory.getMessageService
		throw new UnsupportedOperationException();
	}

	public MessageFactory getInstance() {
		return this.instance;
	}

}