package Sprint;

public abstract class SprintState {

	public void addBacklogItem(BacklogItem BacklogItem) { throw new UnsupportedOperationException(); }

	public void setCreate(SprintContext sprintContext){ throw new UnsupportedOperationException();}

	public void setProgress(SprintContext sprintContext){throw new UnsupportedOperationException();}

	public void setFinished(SprintContext sprintContext){throw new UnsupportedOperationException();}

	public void setCanceled(SprintContext sprintContext){throw new UnsupportedOperationException();}


}