package Sprint;

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
	public void registerObserver() {
		//TODO - implement function
		throw new UnsupportedOperationException();
	}

	@Override
	public void removeObserver() {
		//TODO - implement function
		throw new UnsupportedOperationException();
	}

	@Override
	public void notifyObservers() {
		//TODO - implement function
		throw new UnsupportedOperationException();
	}
}