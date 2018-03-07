import Member.*;
import Member.ScrumMaster;
import Notification.*;
import Sprint.*;


import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        /*
          At first let's create some people.
        */
        Person person1 = new Person();
        person1.setName("Jens");
        person1.setEmailAdress("jens@jens.nl");
        person1.setPrefferedMessageMedium("Email");
        Member member1 = new ScrumMaster(person1);

        Person person2 = new Person();
        person2.setName("Antonie");
        Member member2 = new ProductOwner(person2);

        /*
          Now create a sprint or two.
        */
        Sprint sprint1 = new Sprint();
        sprint1.setName("First Sprint");
        Calendar calendar = Calendar.getInstance();
        calendar.set(2018, Calendar.MARCH,7);
        Date startDate = calendar.getTime();

        calendar.set(2018, Calendar.MARCH,26);
        Date endDate = calendar.getTime();

        sprint1.setStartDate( startDate );
        sprint1.setEndDate( endDate );
        sprint1.addMember(member1);
        sprint1.addMember(member2);
        ProductBacklog productBacklog = new ProductBacklog();

        /*
          And create a backlog item and add it to the product backlog
        */
        SprintItem backlogItem1 = new BacklogItem(sprint1);
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
        sprint1.notifyObservers();

        /*
          At first let's create some people.
        */
        SprintItem item = new BacklogItem(sprint1);
        item.registerObserver(notificationService);
        //todoState.setDoing(item);
        item.setTodo();
        item.setDoing();
        item.setDone();

        System.out.println(item.getState().toString());

    }
}
