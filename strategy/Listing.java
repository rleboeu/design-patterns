package strategy;

import java.util.ArrayList;

/**
 * The Listing class contains a list of items, a SortBehavior, and a title of the Listing
 * @author rleboeuf
 * @version 1.0.0
 */
public class Listing {
    
    // fields
    private String title;
    private ArrayList<String> items;
    private SortBehavior sortBehavior;

    /**
     * Constructor
     * @param title
     */
    public Listing(String title) {
        this.title = title;
        this.items = new ArrayList<String>();
        this.sortBehavior = new BubbleSort();
    }

    /**
     * Add an item to the Listing
     * @param item
     */
    public void add(String item) {
        this.items.add(item);
    }

    /**
     * Remove an item from the Listing
     * @param item
     */
    public void remove(String item) {
        this.items.remove(item);
    }

    /**
     * Returns the title of the Listing
     * @return String
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Change the SortBehavior of the Listing
     * @param sortBehavior
     */
    public void setSortBehavior(SortBehavior sortBehavior) {
        this.sortBehavior = sortBehavior;
    }

    /**
     * Returns the items of the Listing (sorted).
     * @return ArrayList<String>
     */
    public ArrayList<String> getSortedList() {
        return this.sortBehavior.sort(items);
    }

    /**
     * Return the items of the Listing (unsorted)
     * @return
     */
    public ArrayList<String> getUnSortedList() {
        return this.items;
    }

}
