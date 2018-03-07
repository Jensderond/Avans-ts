package Sprint;

public class Progress extends SprintState {

    private SprintContext context;

    Progress(SprintContext context){
        this.context = context;
    }

    public void setProgress(SprintContext context){
        System.out.println("Sprint staat in de progress state");
    }

    public void setFinished(SprintContext context){
        System.out.println("Sprint wordt in de finished state gezet");
        context.setState(context.finishedState);
    }

    public void addBacklogItem(SprintContext sprintContext){
        System.out.println("In de progress state is het niet mogelijk om backlog items toe te voegen");
        sprintContext.setState(this);
    }
}