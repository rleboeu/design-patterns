package password;

/**
 * Abstract PasswordDecorator class
 * @author rleboeuf
 * @version 1.0.0
 */
public abstract class PasswordDecorator extends Password {
    
    // fields
    protected Password passwordBeginning;

    /**
     * Constructor
     * @param passwordBeginning beginning password for the decorator
     */
    public PasswordDecorator(Password passwordBeginning) {
        this.passwordBeginning = passwordBeginning;
        this.password = passwordBeginning.password;
    }

    /**
     * Returns a String representation of the generated password
     * @return String
     */
    public abstract String getPassword();
}
