package Sprint;

import Member.Member;
import Member.ScrumMaster;
import Member.ProductOwner;
import Member.Developer;
import Notification.Observer;
import Notification.Subject;

import java.util.ArrayList;
import java.util.Date;

public class Sprint implements Subject {

	private SprintState sprintState;
	private ArrayList<Observer> observers;
	private ArrayList<Member> members;
	private String name;
	private Date endDate;
	private Date startDate;

	public Sprint() {
		this.observers = new ArrayList<>();
		this.members = new ArrayList<>();
		this.sprintState = new Create();
	}

	public int getTimeLeft() {
		// TODO - implement Sprint.getTimeLeft
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sprintState
	 */
	public void setState(SprintState sprintState) {
		// TODO - implement Sprint.setState
//		throw new UnsupportedOperationException();
		notifyObservers();
	}

	public SprintState getState() {
		return this.sprintState;
	}

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

	public Date getEndDate() {
		return this.endDate;
	}

	/**
	 * 
	 * @param endDate
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	/**
	 * 
	 * @param startDate
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}

	public ArrayList<Member> getMembers() {
		return members;
	}

	public Member getScrumMaster() {
		for (Member member: members){
			if (member.getClass().equals(ScrumMaster.class)){
				return member;
			}
		}
		return null;
	}

	public void addMember(Member member) {
		int scrumMaster = 0;
		int productOwner =0;
		for (Member m: members) {
			if ( m.getClass().equals(ScrumMaster.class) ) {
				scrumMaster++;
			}
			if ( m.getClass().equals(ProductOwner.class) ) {
				productOwner++;
			}
		}

		if (member.getClass().equals(ScrumMaster.class)) {
			if ( scrumMaster < 1 ){
				members.add(member);
				System.out.println("ScrumMaster added.");
			}
			else {
				System.out.println("ScrumMaster already set");
				throw new UnsupportedOperationException();
			}
		}
		else if (member.getClass().equals(ProductOwner.class)) {
			if ( productOwner < 1 ){
				members.add(member);
				System.out.println("ProductOwner added.");
			}
			else {
				System.out.println("ProductOwner already set");
				throw new UnsupportedOperationException();
			}
		}
		else if (member.getClass().equals(Developer.class)) {
			this.members.add(member);
			System.out.println("Developer added.");
		}
	}
}