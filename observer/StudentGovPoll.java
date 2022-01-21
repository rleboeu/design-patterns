package observer;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Student Government Poll class
 * Structure for taking a poll on the next student government official
 * @author rleboeuf
 * @version 1.0.0
 */
public class StudentGovPoll implements Subject {

    // fields
    private ArrayList<Observer> observers;
    private HashMap<String, Integer> votes;
    private String school;
    private int numUpdates;

    /**
     * Constructor
     * @param school String school where the poll is taking place
     */
    public StudentGovPoll(String school) {
        this.school = school;
        this.numUpdates = 0;
        this.observers = new ArrayList<Observer>();
        this.votes = new HashMap<String, Integer>();
    }

    /**
     * Add candidate to the poll
     * @param president candidate to add 
     */
    public void addCandidate(String president) {
        this.votes.put(president, 0);
    }

    /**
     * Add num votes to the tally for the president
     * @param president candidate to add votes to
     * @param num number of votes to add
     */
    public void enterVotes(String president, int num) {
        this.votes.put(president, this.votes.get(president) + num);
        this.numUpdates++;  // increment the number of updates

        // notify the observers after 4 updates
        if (this.numUpdates / 4 == 1) {
            this.numUpdates = 0;
            this.notifyObservers();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : this.observers) {
            o.update(this.votes);
        }
    }

    /**
     * Accessor for the name of the school
     * @return String
     */
    public String getSchool() {
        return this.school;
    }
    
}
