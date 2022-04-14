package state;

import java.util.ArrayList;

/**
 * FrenchState class
 * @author rleboeuf
 * @version 1.0.0
 */
public class FrenchState implements State {

    // fields
    private ArrayList<String> twinkle;
    private ArrayList<String> happy;
    private MusicBox box;

    /**
     * Constructor
     * @param box MusicBox
     */
    public FrenchState(MusicBox box) {
        this.twinkle = new ArrayList<String>();
        this.happy = new ArrayList<String>();
        this.box = box;

        // populate twinkle
        this.twinkle.add("Petite étoile scintillante scintillante");
        this.twinkle.add("Comment je me demande ce que vous êtes");
        this.twinkle.add("Au-dessus du monde si haut");
        this.twinkle.add("Comme un diamant dans le ciel");
        this.twinkle.add("Petite étoile scintillante scintillante");
        this.twinkle.add("Comment je me demande ce que vous êtes");

        // populate happy
        for (int i = 0; i < 4; ++i) {
            this.happy.add("Si tu as d' la joie au coeur, Frappe des mains");
        }
    }

    @Override
    public void pressStarButton() {
        this.box.playSong("Petite étoile scintillante scintillante", this.twinkle);
    }

    @Override
    public void pressHappyButton() {
        this.box.playSong("Si tu as d' la joie au coeur", this.happy);
        
    }

    @Override
    public void pressEnglishButton() {
        System.out.println("passer en mode anglais");
        this.box.setState(this.box.getEnglishState());
    }

    @Override
    public void pressFrenchButton() {
        System.out.println("vous êtes déjà en mode français");
    }

    @Override
    public void pressSpanishButton() {
        System.out.println("passer en mode espagnol");
        this.box.setState(this.box.getSpanishState());
    }
    
}
