package adapter;

import java.util.HashMap;

/**
 * JukeBox class
 * @author rleboeu
 * @version 1.0.0
 */
public class JukeBox {
    
    private HashMap<String, Song> songs;
    private int currentSong;

    /**
     * Constructor
     */
    public JukeBox() {
        currentSong = 0;
        songs = new HashMap<String, Song>();
    }

    /**
     * Add a song to the JukeBox
     * @param song Song
     */
    public void addSong(Song song) {
        this.songs.put(song.getTitle().toLowerCase(), song);
    }

    /**
     * Play the song
     * @param songName String
     */
    public void play(String songName) {
        if (this.songs.keySet().contains(songName.toLowerCase())) {
            System.out.println(this.songs.get(songName.toLowerCase()).toString());
        } else {
            System.out.println("Sorry, the jukebox doesn't have that song...");
        }
    }

}
