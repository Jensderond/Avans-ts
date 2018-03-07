package Sprint;

import Member.*;

import java.util.ArrayList;
import java.util.List;

public class BacklogItem extends Sprint {

	private String title;
	private String description;
	private List<Activity> listActivity;

	public BacklogItem(){
		this.listActivity = new ArrayList<>();
	}

	public void addActivity(Activity activity) {
		listActivity.add(activity);
	}

	/**
	 * Assign member to BacklogItem
	 * @param member
	 */
	public void assignMember(Member member) {
		// TODO - implement BacklogItem.assignMember
		throw new UnsupportedOperationException();
	}

	/**
	 * Assign member to activity
	 * @param member
	 */
	public void assignMember(Member member, Activity activity) {
		// TODO - implement BacklogItem.assignMember
		throw new UnsupportedOperationException();
	}

	public List getActivities() {
		return this.listActivity;
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