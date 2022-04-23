package adapter;

/**
 * Tune interface
 * @author rleboeu
 * @version 1.0.0
 */
public interface Tune {
    
    /**
     * Returns the name of the Tune's artist
     * @return String
     */
    public String getArtistName();

    /**
     * Returns the title of the Tune
     * @return String
     */
    public String getDisplayTitle();
    
    /**
     * Returns the category of the tune
     * @return String
     */
    public String getCategory();

}
