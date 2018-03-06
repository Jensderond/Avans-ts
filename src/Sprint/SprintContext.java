package Sprint;

public class SprintContext {
    private SprintState state;

    public SprintContext(){
        state = null;
    }

    public SprintState getState(){
        return this.state;
    }

    public void setState(SprintState state) {
        this.state = state;
    }

}
