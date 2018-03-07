package Sprint;

import Member.Member;
import Notification.Observer;
import Notification.Subject;

import java.util.ArrayList;
import java.util.List;

public abstract class SprintItem implements Subject {

	private SprintItemState state;
	private ArrayList<Observer> observers;

	public SprintItem(){
		state = null;
	}

	public SprintItemState getState() {

		return this.state;
	}

	public void setState(SprintItemState state) {
		this.state = state;
		notifyObservers();
	}

	public void setTitle(String name){
		throw new UnsupportedOperationException();
	}
	public String getTitle(){
		throw new UnsupportedOperationException();
	}
	public void setDescription(String description) {
		throw new UnsupportedOperationException();
	}
	public String getDescription() {
		throw new UnsupportedOperationException();
	}
	public void addActivity(Activity activity) {
		throw new UnsupportedOperationException();
	}
	public List getActivities() {
		throw new UnsupportedOperationException();
	}
	public void assignMember(Member member){
		throw new UnsupportedOperationException();
	}
	public boolean removeMember(){
		throw new UnsupportedOperationException();
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
}