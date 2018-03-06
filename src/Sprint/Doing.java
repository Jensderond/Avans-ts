package Sprint;

public class Doing extends SprintItemState {
    public void update(SprintItem sprintItem){
        System.out.println("Item is in doing state");
        sprintItem.setState(this);
    }

    public void assignMember(SprintItem sprintItem){
        System.out.println("Het is niet mogelijk om een member toe te voegen of te veranderen");
        sprintItem.setState(this);
    }
}