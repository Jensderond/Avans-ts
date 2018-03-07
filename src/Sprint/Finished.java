package Sprint;
//TODO add een state die de pipeline start

public class Finished extends SprintState {
    private SprintContext context;

    Finished(SprintContext context){
        this.context = context;
    }

    public void setFinished(SprintContext context){
        System.out.println("Sprint is in de create state");
    }

    public void setCanceled(SprintContext context){
        System.out.println("Sprint wordt in de canceled state gezet");
        context.setState(context.canceledState);
    }

    public void addBacklogItem(SprintContext sprintContext){
        System.out.println("In de finished state is het niet mogelijk om backlog items toe te voegen");
        sprintContext.setState(this);
    }
}