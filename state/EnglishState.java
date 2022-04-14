package state;

import java.util.ArrayList;

public class EnglishState implements State {

    // fields
    private ArrayList<String> twinkle;
    private ArrayList<String> happy;
    private MusicBox box;

    /**
     * Constructor 
     * @param box MusicBox parent
     */
    public EnglishState(MusicBox box) {
        this.box = box;
        this.twinkle = new ArrayList<String>();
        this.happy = new ArrayList<String>();

        // Populate twinkle arraylist
        this.twinkle.add("Twinkle twinkle little star");
        this.twinkle.add("How I wonder what you are");
        this.twinkle.add("Up above the world so high");
        this.twinkle.add("Like a dimond in the sky");
        this.twinkle.add("Twinkle twinkle little star");
        this.twinkle.add("How I wonder what you are");

        // Populate happy arraylist
        for (int i = 0; i < 4; ++i) {
            this.happy.add("If you're happy and you know it, clap your hands");
        }

    }

    @Override
    public void pressStarButton() {
        this.box.playSong("Twinkle Twinkle Little Star", this.twinkle);
    }

    @Override
    public void pressHappyButton() {
        this.box.playSong("If You're Happy and You Know It", this.happy);
    }

    @Override
    public void pressEnglishButton() {
        System.out.println("You are already in English mode");
    }

    @Override
    public void pressFrenchButton() {
        System.out.println("Switching to French");
        this.box.setState(this.box.getFrenchState());
    }

    @Override
    public void pressSpanishButton() {
        System.out.println("Switching to Spanish");
        this.box.setState(this.box.getSpanishState());
    }
    
}
