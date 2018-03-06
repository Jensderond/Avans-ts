package Forum;

public class Thread {

	private String title;
	private Comment listComment;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Comment getListComment() {
		return listComment;
	}

	public void setListComment(Comment listComment) {
		this.listComment = listComment;
	}
}