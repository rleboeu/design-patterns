package state;

import java.util.ArrayList;

/**
 * MusicBox class
 * @author rleboeuf
 * @version 1.0.0
 */
public class MusicBox {
    
    // fields
    private State englishState;
    private State frenchState;
    private State spanishState;
    private State state;

    /**
     * Constructor
     */
    public MusicBox() {
        this.englishState = new EnglishState(this);
        this.spanishState = new SpanishState(this);
        this.frenchState = new FrenchState(this);
        this.state = this.englishState;
    }

    /**
     * Press the Star button on the MusicBox
     */
    public void pressStarButton() {
        this.state.pressStarButton();
    }

    /**
     * Press the Happy button on the MusicBox
     */
    public void pressHappyButton() {
        this.state.pressHappyButton();
    }

    /**
     * Press the Happy button on the MusicBox
     */
    public void pressEnglishButton() {
        this.state.pressEnglishButton();
        this.state = this.englishState;
    }

    /**
     * Press the French button on the MusicBox
     */
    public void pressFrenchButton() {
        this.state.pressFrenchButton();
        this.state = this.frenchState;
    }

    /**
     * Press the Spanish button on the MusicBox
     */
    public void pressSpanishButton() {
        this.state.pressSpanishButton();
        this.state = this.spanishState;
    }

    /**
     * Mutator for current state of MusicBox
     * @param state State
     */
    public void setState(State state) {
        this.state = state;
    }

    /**
     * Accessor for English state
     * @return State
     */
    public State getEnglishState() {
        return this.englishState;
    }

    /**
     * Accessor for French state
     * @return State
     */
    public State getFrenchState() {
        return this.frenchState;
    }

    /**
     * Accessor for Spanish state
     * @return State
     */
    public State getSpanishState() {
        return this.spanishState;
    }

    /**
     * Play a song with a title and lyrics
     * @param songName String
     * @param lyrics ArrayList<String>
     */
    public void playSong(String songName, ArrayList<String> lyrics) {
        System.out.println("\nPlaying: " + songName);
        for (String line : lyrics) {
            System.out.println(line);
        }
        System.out.println();
    }

}
