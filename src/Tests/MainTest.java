package Tests;

import Member.*;
import Notification.NotificationService;
import Notification.Observer;
import Sprint.*;
import org.junit.Before;

import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class MainTest {

    private Person person1 = new Person();
    private Sprint sprint1 = new Sprint();
    private ProductBacklog productBacklog = new ProductBacklog();
    private SprintItem backlogItem1;

    @Before
    public void setUp() throws Exception {
        person1.setName("Jens");
        person1.setEmailAdress("jens@jens.nl");
        person1.setPrefferedMessageMedium("EMAIL");
        Member member1 = new ScrumMaster(person1);

        sprint1.setName("Test sprint");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2018, Calendar.MARCH,7);
        Date startDate = calendar.getTime();

        calendar.set(2018, Calendar.MARCH,26);
        Date endDate = calendar.getTime();

        sprint1.setStartDate( startDate );
        sprint1.setEndDate( endDate );
        sprint1.addMember(member1);

        backlogItem1 = new BacklogItem(sprint1);
        backlogItem1.setTitle("Fix bugs");


        /*
          Add activities to the backlog item
        */
        SprintItem activity1 = new Activity(sprint1);
        activity1.setTitle("Git does not work when images are added");
        SprintItem activity2 = new Activity(sprint1);
        activity2.setTitle("VCS Bug when pressing button X too long");

        backlogItem1.addActivity((Activity) activity1);
        backlogItem1.addActivity((Activity) activity2);

        productBacklog.addToList((BacklogItem) backlogItem1);

        Observer notificationService = new NotificationService();
        sprint1.registerObserver(notificationService);

    }

    @org.junit.Test(expected = UnsupportedOperationException.class)
    public void cannotHaveMultipleScrumMasters() {

        Person person2 = new Person();
        person2.setName("Antonie");
        Member member2 = new ScrumMaster(person2);
        this.sprint1.addMember(member2);
    }

    @org.junit.Test(expected = UnsupportedOperationException.class)
    public void cannotHaveMultipleProductOwners() {

        Person person2 = new Person();
        person2.setName("Antonie");
        Member member2 = new ProductOwner(person2);
        Person person3 = new Person();
        person3.setName("Gerard");
        Member member3 = new ProductOwner(person2);
        this.sprint1.addMember(member2);
        this.sprint1.addMember(member3);
    }

    @org.junit.Test(expected = UnsupportedOperationException.class)
    public void toDoStateToDoneState() {
        backlogItem1.setTodo();
        backlogItem1.setDone();
    }

    @org.junit.Test(expected = UnsupportedOperationException.class)
    public void doneStateToDoingState() {
        backlogItem1.setTodo();
        backlogItem1.setDoing();
        backlogItem1.setDone();
        backlogItem1.setDoing();
    }

    @org.junit.Test(expected = UnsupportedOperationException.class)
    public void cannotChangeNameInDoneState() {
        backlogItem1.setTodo();
        backlogItem1.setTitle("Bugfix");
        backlogItem1.setDoing();
        backlogItem1.setDone();
        backlogItem1.setTitle("Stiekem gehackt");
    }
}