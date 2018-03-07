package Sprint;

public class Cancelled extends SprintState {
    private SprintContext context;

    Cancelled(SprintContext context){
        this.context = context;
    }

    public void setCanceled(SprintContext context){
        System.out.println("Sprint is in de cancel state");
    }

    public void addBacklogItem(SprintContext sprintContext){
        System.out.println("In de cancel state is het niet mogelijk om bakclog items toe te voegen");
        sprintContext.setState(this);
    }
}