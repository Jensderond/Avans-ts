package Sprint;

import Member.*;

import java.util.List;

public class BacklogItem extends Sprint {

	private String title;
	private String description;
	private List listActivity;

	public void addActivity() {
		// TODO - implement BacklogItem.addActivity
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param member
	 */
	public void assignMember(Member member) {
		// TODO - implement BacklogItem.assignMember
		throw new UnsupportedOperationException();
	}

	public List getActivities() {
		// TODO - implement BacklogItem.getActivities
		throw new UnsupportedOperationException();
	}

	public String getTitle() {
		return this.title;
	}

	/**
	 * 
	 * @param title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return this.description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}