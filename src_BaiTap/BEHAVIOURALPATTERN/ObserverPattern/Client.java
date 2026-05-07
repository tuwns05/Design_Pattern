package BEHAVIOURALPATTERN.ObserverPattern;

public class Client {
    public static void main(String[] args) {
        Connection alice = new Connection("Alice");
        Connection bob = new Connection("Bob");

        SocialMediaFeed feed = new SocialMediaFeed();

        System.out.println("Before observing:");
        feed.showFeed();

        alice.attach(feed);
        bob.attach(feed);

        alice.setStatus("I just had coffee!");
        bob.setStatus("Learning Observer Pattern!");
        alice.setStatus("Going to the gym.");

        System.out.println("\nAfter updates:");
        feed.showFeed();
    }
}
