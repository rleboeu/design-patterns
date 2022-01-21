package observer;

import java.util.HashMap;

/**
 * Display the number of votes for the presidents
 * @author rleboeuf
 * @version 1.0.0
 */
public class TallyDisplay implements Observer {
    
    // fields
    private Subject poll;
    private HashMap<String, Integer> votes;

    /**
     * Constructor
     * @param poll Subject of the TallyDisplay
     */
    public TallyDisplay(Subject poll) {
        this.poll = poll;
        this.poll.registerObserver(this);
        this.votes = new HashMap<String, Integer>();
    }

    @Override
    public void update(HashMap<String, Integer> votes) {
        this.votes = votes;
        this.display();
    }

    /**
     * Display the number of votes for each candidate
     */
    private void display() {
        System.out.println("\nCurrent Tallies");

        // Print the total tallies for each candidate
        for (String key : this.votes.keySet()) {
            System.out.println(key + " : " + this.votes.get(key));
        }
    }

}
