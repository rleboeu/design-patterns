package observer;

import java.text.DecimalFormat;
import java.util.HashMap;

/**
 * Display for a percentage representation of votes
 */
public class PercentageDisplay implements Observer {

    // fields
    private Subject poll;
    private HashMap<String, Integer> votes;
    private int numVotes;

    /**
     * Constructor
     * @param poll Subject of the PercentageDisplay
     */
    public PercentageDisplay(Subject poll) {
        this.poll = poll;
        this.poll.registerObserver(this);
        this.votes = new HashMap<String, Integer>();
        this.numVotes = 0;
    }

    @Override
    public void update(HashMap<String, Integer> votes) {
        this.votes = votes;
        this.display();
    }

    /**
     * Display the current vote count to the screen
     */
    private void display() {
        DecimalFormat df = new DecimalFormat("#.#");
        double percentage = 0d;
        
        // re-calculate total number of votes
        this.numVotes = 0;
        for (Integer i : this.votes.values()) {
            this.numVotes += i;
        }

        System.out.println("\nCurrent Percentages");

        // print the percentages of each candidate
        for (String key : this.votes.keySet()) {
            percentage = (double)this.votes.get(key) / (double)this.numVotes;
            percentage *= 100;

            System.out.println(key + " : " + df.format(percentage) + "%");
        }

    }
    
}
