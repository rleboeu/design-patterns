package singleton;

import java.util.Random;
import java.util.Scanner;

/**
 * MathGame class
 * @author rleboeu
 * @version 1.0.0
 */
public class MathGame {
    
    // static fields 
    private static MathGame mathGame = null;
    
    // private fields
    private int score;
    private Random rand;
    private Scanner reader;
    private String[] operands = { "+", "-", "*", "/" };


    /**
     * Constructor
     */
    private MathGame() {
        this.rand = new Random();
        this.reader = new Scanner(System.in);
        System.out.println("Let's have fun with Math!");
    }
    
    /**
     * Returns the instance of MathGame
     * @return MathGame instance of MathGame
     */
    public static MathGame getInstance() {
        if (MathGame.mathGame == null) {
            MathGame.mathGame = new MathGame();
        }

        return MathGame.mathGame;
    }

    /**
     * Play the math game (main loop)
     */
    public void play() {
        String userInput = "";
        boolean validInput;

        // main loop
        boolean running = true;
        while (running) {

            // user-input loop
            validInput = false;
            while (!validInput) {
                // take in the user's input with a prompt
                System.out.print("(P)lay or (Q)uit: ");
                userInput = reader.next().trim();
                userInput = userInput.toLowerCase();

                // check if the user's input is valid
                if (userInput.equals("p") || userInput.equals("q")) { 
                    validInput = true;
                } else {
                    System.out.println("Sorry, you must enter p or q");
                }
            }

            if (userInput.equals("p")) {
                this.playRound();
            } else if (userInput.equals("q")) {
                running = false;
            }
        }// end main loop

        System.out.println("You won " + this.score + " games!");
        System.out.println("Goodbye...");

    }

    /**
     * Play one round of the math game 
     * @return boolean
     */
    private boolean playRound() {
        System.out.println("Round played");
        return false;
    }

}
