package Sprint;

public class Done extends SprintItemState {

    private SprintItem sprintItem;

    public Done(SprintItem sprintItem){
        this.sprintItem = sprintItem;
    }

    public void setTodo(SprintItem sprintItem){
        System.out.println("Item is in done state, wordt naar todo gezet ");
        sprintItem.setState(sprintItem.toDoState);
        sprintItem.notifyObservers();
    }

    public void setDone(SprintItem sprintItem){
        System.out.println("Item staat in de done state");
    }
}