package password;

import java.util.Random;

/**
 * EasyPassword class 
 * @author rlebouef
 * @version 1.0.0
 */
public class EasyPassword extends Password {

    /**
     * Constructor
     * @param phrase starting phrase
     */
    public EasyPassword(String phrase) {
        this.password = phrase;
    }

    @Override
    public String getPassword() {
        StringBuffer sb = new StringBuffer(); 
        Random random = new Random();
        String[] tokens = this.password.split(" ");     // delineate based on whitespace
        
        for (String token : tokens) {
            sb.append(token);
        }

        // append a random number between 0 (inclusive) and 100 (exclusive)
        sb.append(random.nextInt(100));

        this.password = sb.toString();  // update the password
        return this.password;
    }
    
}
