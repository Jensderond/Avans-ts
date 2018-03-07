package Sprint;
//TODO add een state die de pipeline start

public class Finished extends SprintState {
    public void update(SprintContext sprintContext){
        System.out.println("Sprint is in de finished state");
        sprintContext.setState(this);
    }

    public void addBacklogItem(SprintContext sprintContext){
        System.out.println("In de finished state is het niet mogelijk om backlog items toe te voegen");
        sprintContext.setState(this);
    }
}