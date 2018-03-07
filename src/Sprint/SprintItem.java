package Sprint;

import Notification.Observer;
import Notification.Subject;

public class SprintItem implements Subject {

	private SprintItemState state;

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

    }

    @Override
    public void removeObserver(Observer o) {

    }

    @Override
	public void notifyObservers() {
		//TODO - implement function
		throw new UnsupportedOperationException();
	}
}