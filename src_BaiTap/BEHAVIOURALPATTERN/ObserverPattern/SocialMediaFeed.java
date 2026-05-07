package BEHAVIOURALPATTERN.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class SocialMediaFeed implements Observer{
    private List<String> statuses = new ArrayList<>();

    @Override
    public void update(String connectionName, String status) {
        statuses.add(connectionName + ": " + status);
    }

    public void showFeed() {
        if (statuses.isEmpty()) {
            System.out.println("Feed is empty.");
            return;
        }

        for (String s : statuses) {
            System.out.println(s);
        }
    }
}
