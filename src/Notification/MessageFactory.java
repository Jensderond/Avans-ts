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

	    switch (type) {
            case "EMAIL":
                return new Email();
            case "SLACK":
                return new Slack();
            default:
                return null;
        }

	}

	public static MessageFactory getInstance() {
		if ( instance == null ) {
			instance = new MessageFactory();
		}
		return instance;
	}

}