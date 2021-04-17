public class User implements Observer {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void updateFeed(FeedObject feedObject) {
        System.out.println(this.name + " has the message:\n " + feedObject.getContent() + "\n");
    }
}
