package Sprint;

import java.util.Date;

public class Sprint {

	SprintState sprintState;
	private String name;
	private Date endDate;
	private Date startDate;

	public int getTimeLeft() {
		// TODO - implement Sprint.getTimeLeft
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sprintState
	 */
	public void setState(SprintState sprintState) {
		// TODO - implement Sprint.setState
		throw new UnsupportedOperationException();
	}

	public SprintState getState() {
		// TODO - implement Sprint.getState
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	/**
	 * 
	 * @param endDate
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	/**
	 * 
	 * @param startDate
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}