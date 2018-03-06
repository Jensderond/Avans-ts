package Sprint;

import java.sql.SQLOutput;

public class Create extends SprintState {

    public void update(SprintContext sprintContext){
        System.out.println("Sprint is in de create state");
        sprintContext.setState(this);
    }

    public void addBacklogItem(SprintContext sprintContext){
        System.out.println("In de create state is het mogelijk om bakclog items toe te voegen");
        sprintContext.setState(this);
    }

}