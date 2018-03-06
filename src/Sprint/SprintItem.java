package Sprint;

public class SprintItem {

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

}