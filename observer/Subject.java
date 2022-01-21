package observer;

/**
 * Subject interface
 * @author rleboeuf
 * @version 1.0.0
 */
public interface Subject {

    /**
     * Add an observer to the Subject
     * @param observer Observer to be added
     */
    public void registerObserver(Observer observer);

    /**
     * Remove an observer from the Subject
     * @param observer Observer to be removed
     */
    public void removeObserver(Observer observer);

    /**
     * Notify observers that changes have been made
     */
    public void notifyObservers();

}