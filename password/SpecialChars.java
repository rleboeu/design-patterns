package password;

import java.util.Random;

/**
 * SpecialChars class for decorating a password with special characters
 * @author rleboeuf
 * @version 1.0.0
 */
public class SpecialChars extends PasswordDecorator {

    /**
     * Constructor
     * @param passwordBeginning String starting password
     */
    public SpecialChars(Password passwordBeginning) {
        super(passwordBeginning);
    }

    @Override
    public String getPassword() {
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        final char[] specialCharacters = { '*', '!', '%', '+', '.', '{', '}' };
        char[] passwordCharacters = this.password.toCharArray();
        
        int randIndex;                          // random int, index of the character to add
        double randProbability;                 // random double, determines if we add special character
        double percentAddCharacter = 0.3d;      // the percentage of the time we want to add a special character

        // for each character in passwordCharacters array
        for (int i = 0; i < passwordCharacters.length; ++i) {
            sb.append(passwordCharacters[i]);

            // should we add a special character after the current character?
            randProbability = random.nextDouble();
            
            if (randProbability < percentAddCharacter) {

                // add a random character from the specialCharacters to StringBuffer
                randIndex = random.nextInt(specialCharacters.length);
                sb.append(specialCharacters[randIndex]);
            }
        }

        this.password = sb.toString();
        return this.password;
    }
    
}
