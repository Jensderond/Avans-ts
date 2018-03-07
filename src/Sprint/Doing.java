package Sprint;

public class Doing extends SprintItemState {
    public void setTodo(SprintItem sprintItem){
        System.out.println("Item is in doing state en kan niet naar todo gezet worden.");
        sprintItem.setState(this);
    }

    public void setDoing(SprintItem sprintItem){
        System.out.println("item staat in de doing state");
        sprintItem.setState(this);
    }

    public void setDone(SprintItem sprintItem){
        System.out.println("Item wordt in de done state gezet");
        sprintItem.setState(this);
    }
    public void assignMember(SprintItem sprintItem){
        System.out.println("Het is niet mogelijk om een member toe te voegen of te veranderen");
        sprintItem.setState(this);
    }
}