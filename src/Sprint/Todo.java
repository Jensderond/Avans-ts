package Sprint;

public class Todo extends SprintItemState {
    //
    public void update(SprintItem sprintItem){
        System.out.println("Item is in todo state");
        sprintItem.setState(this);
    }

    public void assignMember(SprintItem sprintItem){
        System.out.println("Het is mogelijk om een member toe te voegen");
        sprintItem.setState(this);
    }
}