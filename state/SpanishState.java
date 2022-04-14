package state;

import java.util.ArrayList;

/**
 * SpanishState class
 * @author rleboeuf
 * @version 1.0.0
 */
public class SpanishState implements State {

    private ArrayList<String> twinkle;
    private ArrayList<String> happy;

    /**
     * Constructor
     * @param box MusicBox
     */
    public SpanishState(MusicBox box) {
        this.twinkle = new ArrayList<String>();
        this.happy = new ArrayList<String>();
        this.box = box;

        // populate twinkle
        this.twinkle.add("Estrellita, ¿dónde estás?");
        this.twinkle.add("Quiero verte cintilar");
        this.twinkle.add("En el cielo, sobre el mar.");
        this.twinkle.add("Un diamante de verdad.");
        this.twinkle.add("Estrellita, ¿dónde estás?");
        this.twinkle.add("Quiero verte cintilar.");

        // populate happy
        for (int i = 0; i < 4; ++i) {
            this.happy.add("si eres feliz y lo sabes, aplaude");
        }
    }

    @Override
    public void pressStarButton() {
        this.box.playSong("Estrellita, ¿dónde estás?", this.twinkle);
    }

    @Override
    public void pressHappyButton() {
        this.box.playSong("si estás contento y lo sabes", this.happy);
    }

    @Override
    public void pressEnglishButton() {
        System.out.println("cambiar al modo inglés");
        this.box.setState(this.box.getEnglishState());
    }

    @Override
    public void pressFrenchButton() {
        System.out.println("cambiar al modo francés");
        this.box.setState(this.box.getFrenchState());
    }

    @Override
    public void pressSpanishButton() {
        System.out.println("ya en modo español");
    }
    
}
