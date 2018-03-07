package Member;

public class ProductOwner extends Member {

    public ProductOwner(Person person) {
        super(person);
    }

    public Member setRole() {
        return this;
    }
}