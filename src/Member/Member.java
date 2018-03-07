package Member;

public abstract class Member {

	private Person person;

	public Member(Person person){
		this.person = person;
	}

	public Member setRole() {
		// TODO - implement Member.setRole
		throw new UnsupportedOperationException();
	}

	public Person getPerson() {
		return this.person;
	}

}