package Sprint;

import Member.Member;
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
		observers = new ArrayList<>();
		members = new ArrayList<>();
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
		throw new UnsupportedOperationException();
	}

	public SprintState getState() {
		// TODO - implement Sprint.getState
		throw new UnsupportedOperationException();
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
//			observer.update(this.getState(), );
			//TODO: use member in here
		}
	}
}