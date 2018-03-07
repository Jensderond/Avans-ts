package Sprint;

public class Doing extends SprintItemState {

    private SprintItem sprintItem;

    public Doing(SprintItem sprintItem){
        this.sprintItem = sprintItem;
    }

    public void setDoing(SprintItem sprintItem){
        System.out.println("item staat in de doing state");
    }

    public void setDone(SprintItem sprintItem){
        System.out.println("Item wordt in de done state gezet");
        sprintItem.setState(sprintItem.doneState);
        sprintItem.notifyObservers();
    }

}