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
        this.score = 0;
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
                if (this.playRound()) {
                    score++;
                }
            } else if (userInput.equals("q")) {
                running = false;
            }
        }// end main loop

        System.out.println("You won " + this.score + " games!");
        System.out.println("Goodbye...");

        this.reader.close();
    }

    /**
     * Play one round of the math game 
     * @return boolean
     */
    private boolean playRound() {
        double firstNum, secondNum;
        double result = 0d;
        int operatorIndex;
        String operator;
        String userInput;
        double userInputDouble = 0d;

        // pick a random operator from the operands array
        operatorIndex = rand.nextInt(this.operands.length);
        operator = this.operands[operatorIndex];

        // generate two numbers, each between [0, 100)
        firstNum = this.rand.nextInt(100);
        secondNum = this.rand.nextInt(100);

        System.out.println("Round answer to 1 decimal place");

        // calculate the correct answer
        if (operator.equals("+")) {
            result = firstNum + secondNum;
        } else if (operator.equals("-")) {
            result = firstNum - secondNum;
        } else if (operator.equals("*")) {
            result = firstNum * secondNum;
        } else if (operator.equals("/")) {
            result = firstNum / secondNum;
        }

        // round the result to the tenths place
        result *= 10;
        result = Math.round(result);
        result /= 10;

        // loop until the user enters a decimal or integer
        boolean validInput = false;
        while (!validInput) {

            // prompt the user with the equation
            System.out.println(firstNum + " " + operator + " " + secondNum + " = ");
            userInput = reader.next();
    
            // check to see that the user gave correct input
            try {
                userInputDouble = Double.parseDouble(userInput);
                validInput = true;
            } catch (NumberFormatException nfe) {
                System.out.println("Whoops! That's not a number!");
                continue;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                continue;
            }
        }

        boolean isUserCorrect = result == userInputDouble;

        // inform the user of the correct answer
        if (isUserCorrect) {
            System.out.println("You got it!\n");
        } else {
            System.out.println("The correct answer is: " + result + "\n");
        }

        return isUserCorrect;
    }

}
