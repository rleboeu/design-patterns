package password;

/**
 * RandomCasing class for decorating password with random upper and lowercase character
 * @author rleboeuf
 * @version 1.0.0
 */
public class RandomCasing extends PasswordDecorator {

    /**
     * Constructor
     * @param passwordBeginning String starting password
     */
    public RandomCasing(Password passwordBeginning) {
        super(passwordBeginning);
    }

    @Override
    public String getPassword() {
        StringBuffer sb = new StringBuffer();
        char[] passwordCharacters = this.password.toCharArray();

        double casingProbability;           // random double, compared to lowercaseFrequency to determine casing
        double lowercaseFrequency = 0.5;    // how often a character should be lowercase
        int charIntValue;                   // int representation of the current character
        int difference = 32;                // the int ASCII difference between an uppercase letter and lowercase letter
        boolean isLowercase;                // is the current character lowercase
        
        // loop through each character of the passwordCharacters array
        for (int i = 0; i < passwordCharacters.length; ++i) {
            charIntValue = passwordCharacters[i];

            // if the character is a letter of the alphabet (uppercase or lowercase)
            // (uses ASCII int values for alphabetical characters)
            if ((charIntValue >= 65 && charIntValue <= 90) || (charIntValue >= 97 && charIntValue <= 122)) {
                isLowercase = charIntValue >= 97;

                // should the character be lowercase or uppercase
                casingProbability = Math.random();
                if (casingProbability < lowercaseFrequency) {
                    if (!isLowercase) {     // make lowercase if not already
                        passwordCharacters[i] += difference;
                    }
                } else {
                    if (isLowercase) {      // make uppercase if not already
                        passwordCharacters[i] -= difference;
                    }
                }
            }

            sb.append(passwordCharacters[i]);
        }

        this.password = sb.toString();
        return this.password;
    }
    
}
