package Sprint;

import Notification.Observer;
import Notification.Subject;

import java.util.ArrayList;

public class SprintItem implements Subject {

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