package Sprint;

public class Done extends SprintItemState {
    public void setTodo(SprintItem sprintItem){
        System.out.println("Item is in done state, wordt naar todo gezet ");
        sprintItem.setState(this);
    }

    public void setDoing(SprintItem sprintItem){
        System.out.println("item kan niet vanuit de done state naar de doing state gezet worden");
        sprintItem.setState(this);
    }

    public void setDone(SprintItem sprintItem){
        System.out.println("Item staat in de done state");
        sprintItem.setState(this);
    }

    public void assignMember(SprintItem sprintItem){
        System.out.println("Het is niet  mogelijk om een member toe te voegen of te veranderen");
        sprintItem.setState(this);
    }
}