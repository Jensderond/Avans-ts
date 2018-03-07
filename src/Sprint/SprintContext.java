package Sprint;

import java.security.PrivateKey;

public class SprintContext {
    private SprintState state;
    private Sprint sprint;
    private SprintState createState;
    public SprintState progressState;
    public SprintState finishedState;
    public SprintState canceledState;

    public SprintContext(Sprint sprint){
        this.sprint = sprint;
        this.createState = new Create(this);
        this.progressState = new Progress(this);
        this.finishedState = new Finished(this);
        this.canceledState = new Cancelled(this);
        state = null;
    }

    public SprintState getState(){
        return this.state;
    }

    public void setState(SprintState state) {

        this.state = state;
    }

}
