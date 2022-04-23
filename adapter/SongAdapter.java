package adapter;

/**
 * SongAdapter class
 * @author rleboeu
 * @version 1.0.0
 */
public class SongAdapter extends Song {

    private Tune tune;

    /**
     * Constructor
     * @param tune Tune
     */
    public SongAdapter(Tune tune) {
        this.tune = tune;
    }

    @Override
    public String getTitle() {
        return this.tune.getDisplayTitle().split(":")[0].trim();
    }

    @Override
    public String getAlbum() {
        return this.tune.getDisplayTitle().split(":")[1].trim();
    }

    @Override
    public String getArtistFirstName() {
        return this.tune.getArtistName().split(" ")[0];
    }

    @Override
    public String getArtistLastName() {
        return this.tune.getArtistName().split(" ")[1];
    }

    @Override
    public String getGenre() {
        return this.tune.getCategory();
    }
    
}
