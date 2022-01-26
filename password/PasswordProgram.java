package password;

import java.util.Scanner;

/**
 * Driver class for the Password Decorator program
 */
public class PasswordProgram {
    private Scanner reader;

    /**
     * Constructor
     */
    public PasswordProgram() {
        reader = new Scanner(System.in);
    }

    /**
     * Runs our Password Decorator program
     */
    public void run() {
        System.out.println("Welcome to our password generator program");
        System.out.println("Enter a phrase: ");
        String phrase = reader.nextLine();

        Password easyPassword = new EasyPassword(phrase);
        String password = easyPassword.getPassword();
        System.out.println("A good password for you may be: " + password);

        Password betterPassword = new Symbols(easyPassword);
        password = betterPassword.getPassword();
        System.out.println("A stronger password for you may be: " + password);

        Password evenBetterPassword = new RandomCasing(betterPassword);
        password = evenBetterPassword.getPassword();
        System.out.println("An even stronger password for you may be: " + password);

        Password bestPassword = new SpecialChars(evenBetterPassword);
        password = bestPassword.getPassword();
        System.out.println("An even even stronger password for you may be: " + password);
    }
    
    public static void main(String[] args){
        PasswordProgram program = new PasswordProgram();
        program.run();
    }
}
