public class Main {

    public static void main (String[] args) {
        runner();
    }

    public static void runner() {
        // runs main program
        // create 3 users
        User u1 = new User("Daniel");
        User u2 = new User("Jenny");
        User u3 = new User("Mike");

        //create news feed
        Subject feed = new NewsFeed();

        // all three users subscribe
        feed.subscribe(u1);
        feed.subscribe(u2);
        feed.subscribe(u3);

        // a message is sent
        FeedObject message1 = new FeedObject("hello world!");
        feed.notifyNewFeedObject(message1);

        // one user unsubscribes
        feed.unsubscribe(u2);

        //only the two remaining users get the last message
        FeedObject message2 = new FeedObject("hello again");
        feed.notifyNewFeedObject(message2);
    }
}
