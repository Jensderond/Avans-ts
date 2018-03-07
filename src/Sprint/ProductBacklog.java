package Sprint;

import java.util.ArrayList;
import java.util.List;

public class ProductBacklog {

	private List<BacklogItem> listBacklogItems;

	public ProductBacklog() {
	    this.listBacklogItems = new ArrayList<>();
    }

	public boolean addToList(BacklogItem b) {
	    this.listBacklogItems.add(b);
	    return true;
	}

	public List getList() {
	    return this.listBacklogItems;
	}

}