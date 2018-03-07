package Sprint;

public class Todo extends SprintItemState {

    private SprintItem sprintItem;

    public Todo(SprintItem sprintItem){
        this.sprintItem = sprintItem;
    }

    public void setTodo(SprintItem sprintItem){
        System.out.println("Item is in todo state.");
    }

    public void setDoing(SprintItem sprintItem){
        System.out.println("item staat in de doing state");
        sprintItem.setState(sprintItem.doingState);
    }

}