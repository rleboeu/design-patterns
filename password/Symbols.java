package password;

/**
 * Symbols class for decorating password with symbols
 * @author rleboeuf
 * @version 1.0.0
 */
public class Symbols extends PasswordDecorator {

    /**
     * Constructor
     * @param passwordBeginning String starting password
     */
    public Symbols(Password passwordBeginning) {
        super(passwordBeginning);
    }

    @Override
    public String getPassword() {
        StringBuffer sb = new StringBuffer();
        char[] chars = this.password.toCharArray();

        // for each character in array, replace some if necessary
        for (int i = 0; i < chars.length; ++i) {

            // replace the values of certain characters
            if (chars[i] == 'a') {
                chars[i] = '@';
            } else if (chars[i] == 'b') {
                chars[i] = '8';
            } else if (chars[i] == 'e') {
                chars[i] = '3';
            } else if (chars[i] == 'g') {
                chars[i] = '9';
            } else if (chars[i] == 'i') {
                chars[i] = '!';
            } else if (chars[i] == 'o') {
                chars[i] = '0';
            } else if (chars[i] == 's') {
                chars[i] = '$';
            } else if (chars[i] == 't') {
                chars[i] = '7';
            }

            sb.append(chars[i]);    // append the (new) char to the StringBuffer
        }

        this.password = sb.toString();
        return this.password;
    }
    
}
