package Sprint;

import Member.*;

public class Activity extends SprintItem {

	private String name;
	private String description;
	private Member member;

	public Activity(Sprint sprint) {
		super(sprint);
	}

	public String getTitle() {
		return this.name;
	}

	/**
	 * 
	 * @param Name
	 */
	@Override
	public void setTitle(String Name) {
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
	public boolean assingMember(Member member) {
		this.member = member;
		return true;
	}

	public boolean removeMember() {

		notifyObservers();
		// TODO - implement Activity.removeFromActivity
		throw new UnsupportedOperationException();
	}

}