package Sprint;

public class Progress extends SprintState {

    public void update(SprintContext sprintContext){
        System.out.println("Sprint is in de progress state");
        sprintContext.setState(this);
    }

    public void addBacklogItem(SprintContext sprintContext){
        System.out.println("In de progress state is het niet mogelijk om backlog items toe te voegen");
        sprintContext.setState(this);
    }
}