package observer;

import java.util.HashMap;

/**
 * An Observer 'observes' the results of a Subject (or poll).
 * @author rleboeuf
 * @version 1.0.0
 */
public interface Observer {
    
    /**
     * Update the HashMap data
     * @param votes HashMap to be updated
     */
    public void update(HashMap<String, Integer> votes);

}
