package state;

/**
 * State interface
 * @author rleboeuf
 * @version 1.0.0
 */
public interface State {

    /**
     * Event handler for pressing the Star button
     */
    public void pressStarButton();
    
    /**
     * Event handler for pressing the Happy button
     */
    public void pressHappyButton();
    
    /**
     * Event handler for pressing the English button
     */
    public void pressEnglishButton();
    
    /**
     * Event handler for pressing the French button
     */
    public void pressFrenchButton();
    
    /**
     * Event handler for pressing the French button
     */
    public void pressSpanishButton();
}
