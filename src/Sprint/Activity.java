package Sprint;

import Member.*;

public class Activity extends SprintItem {

	private String name;
	private String description;

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param Name
	 */
	public void setName(String Name) {
		this.name = Name;
	}

	public String getDescription() {
		return this.description;
	}

	/**
	 * 
	 * @param Description
	 */
	public void setDescription(String Description) {
		this.description = Description;
	}

	/**
	 * 
	 * @param member
	 */
	public boolean addMemberToActivity(Member member) {
		// TODO - implement Activity.addMemberToActivity
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param member
	 */
	public boolean removeFromActivity(Member member) {
		// TODO - implement Activity.removeFromActivity
		throw new UnsupportedOperationException();
	}

}