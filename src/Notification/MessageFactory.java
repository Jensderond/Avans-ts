package Notification;

public class MessageFactory {

	private static MessageFactory instance;


	protected MessageFactory(){
		// Exists to defeat instantiation
	}

	/**
	 * 
	 * @param type
	 */
	public Service getMessageService(String type) {
		// TODO - implement MessageFactory.getMessageService
		throw new UnsupportedOperationException();
	}

	public static MessageFactory getInstance() {
		if ( instance == null ) {
			instance = new MessageFactory();
		}
		return instance;
	}

}