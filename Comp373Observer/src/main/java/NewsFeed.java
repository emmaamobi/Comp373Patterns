import java.util.ArrayList;
import java.util.List;


public class NewsFeed implements Subject{
    //list of observers
    private List<Observer> observers;

    public NewsFeed() {
        this.observers = new ArrayList<Observer>();
    }

    @Override
    public void subscribe(Observer o) {
        //an object subscribes to the the subject
        observers.add(o);
    }

    @Override
    public void unsubscribe(Observer o) {
        //an object unsubscribes to the the subject
        observers.remove(o);
    }

    @Override
    public void notifyNewFeedObject(FeedObject feedObject) {
        // Sends a new message to all of the subscribed users
        System.out.println("=============================");
        for (Observer o : this.observers) {
            o.updateFeed(feedObject);
        }
        System.out.println("=============================");
    }
}
