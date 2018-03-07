package Sprint;

import java.sql.SQLOutput;

public class Create extends SprintState {

    private SprintContext context;

    Create(SprintContext context){
        this.context = context;
    }

    public void setCreate(SprintContext context){
        System.out.println("Sprint is in de create state");
    }

    public void setProgress(SprintContext context){
        System.out.println("Sprint wordt in de progress state gezet");
        context.setState(context.progressState);
    }

    public void addBacklogItem(SprintContext sprintContext){
        System.out.println("In de create state is het mogelijk om bakclog items toe te voegen");
        sprintContext.setState(this);
    }
}