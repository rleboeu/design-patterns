package adapter;

/**
 * Song class
 * @author rleboeu
 * @version 1.0.0
 */
public abstract class Song {
    
    /**
     * Returns the title of the Song
     * @return String
     */
    public abstract String getTitle();
    
    /**
     * Returns the album name of the Song
     * @return String
     */
    public abstract String getAlbum();
    
    /**
     * Returns the song artist's first name
     * @return String
     */
    public abstract String getArtistFirstName();
    
    /**
     * Returns the song artist's last name
     * @return
     */
    public abstract String getArtistLastName();
    
    /**
     * Returns the genre of the song
     * @return String
     */
    public abstract String getGenre();
    
    @Override
    public String toString() {
        String output = "";

        output += getTitle() + "\n";
        output += "Album: " + getAlbum() + "\n";
        output += "By: " + getArtistFirstName() + " " + getArtistLastName() + "\n";
        output += "Genre: " + getGenre() + "\n";

        return output;
    }
}
