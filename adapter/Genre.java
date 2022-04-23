package adapter;

/**
 * Genre enum
 * @author rleboeu
 * @version 1.0.0
 */
public enum Genre {
    
    ROCK("Rock"), POP("Pop"), HIPHOP("Hip-Hop"), JAZZ("Jazz"), COUNTRY("Country"), OTHER("Other");

    private String name;

    private Genre(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

}
