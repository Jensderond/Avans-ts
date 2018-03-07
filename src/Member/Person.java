package Member;

public class Person {

	private String name;
	private String emailAddress;
	private String prefferedMessageMedium;

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAdress() {
		return this.emailAddress;
	}

	/**
	 * 
	 * @param emailAddress
	 */
	public void setEmailAdress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPrefferedMessageMedium() {
		return prefferedMessageMedium;
	}

	public void setPrefferedMessageMedium(String prefferedMessageMedium) {
		this.prefferedMessageMedium = prefferedMessageMedium.toUpperCase();
	}
}