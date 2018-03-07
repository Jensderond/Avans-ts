package Sprint;

import Member.*;

import java.util.ArrayList;
import java.util.List;

public class BacklogItem extends SprintItem {

	private String title;
	private String description;
	private List<Activity> listActivity;
	private Member member;

	public BacklogItem(Sprint sprint){
		super(sprint);
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
		if ( getState().getClass().equals(Todo.class)){
			this.member = member;
		}
		if ( getState().getClass().equals(Doing.class)){
			throw new UnsupportedOperationException();
		}
		if ( getState().getClass().equals(Done.class)){
			throw new UnsupportedOperationException();
		}
	}

	/**
	 * Assign member to activity
	 * @param member
	 */
	public void assignMember(Member member, Activity activity) {
		// TODO - implement BacklogItem.assignMember
		throw new UnsupportedOperationException();
	}

	@Override
	public List getActivities() {
		return this.listActivity;
	}

	@Override
	public String getTitle() {
		return this.title;
	}

	/**
	 * 
	 * @param title
	 */
	@Override
	public void setTitle(String title) {
		if ( getState().getClass().equals(Todo.class)){
			this.title = title;
		}
		if ( getState().getClass().equals(Doing.class)){
			throw new UnsupportedOperationException();
		}
		if ( getState().getClass().equals(Done.class)){
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public String getDescription() {
		return this.description;
	}

	/**
	 * 
	 * @param description
	 */
	@Override
	public void setDescription(String description) {

		if ( getState().getClass().equals(Todo.class)){
			this.description = description;
		}
		if ( getState().getClass().equals(Doing.class)){
			this.description = description;
		}
		if ( getState().getClass().equals(Done.class)){
			throw new UnsupportedOperationException();
		}
	}

}