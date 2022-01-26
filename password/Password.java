package password;

/**
 * Abstract Password class for the Password Decorator program
 * @author rleboeuf
 * @version 1.0.0
 */
public abstract class Password {
    
    // fields
    protected String password;

    /**
     * Return a String of a newly generated password
     * @return String
     */
    public abstract String getPassword();

}
