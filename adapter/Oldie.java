package adapter;

/**
 * Oldie class
 * @author rleboeu
 * @version 1.0.0
 */
public class Oldie implements Tune {

    private String artistName;
    private String songTitle;
    private String recordTitle;
    private String category;

    /**
     * Constructor
     * @param artistName String
     * @param songTitle String
     * @param recordTitle String
     * @param category String
     */
    public Oldie(String artistName, String songTitle, String recordTitle, String category) {
        this.artistName = artistName;
        this.songTitle = songTitle;
        this.recordTitle = recordTitle;
        this.category = category;
    }

    @Override
    public String getArtistName() {
        return this.artistName;
    }

    @Override
    public String getDisplayTitle() {
        return this.songTitle + " : " + this.recordTitle;
    }

    @Override
    public String getCategory() {
        return this.category;
    }
    
}
