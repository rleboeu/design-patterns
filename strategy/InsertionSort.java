package strategy;

import java.util.ArrayList;

/**
 * The defined SortBehavior of InsertionSort
 * @author rleboeuf
 * @version 1.0.0
 */
public class InsertionSort implements SortBehavior {

    /**
     * Return the insertion-sorted ArrayList
     */
    public ArrayList<String> sort(ArrayList<String> data) {
        ArrayList<String> dataCopy = new ArrayList<String>();

        for (String s : data) {
            dataCopy.add(s);
        }

        for (int i = 1; i < dataCopy.size(); i++) {
            String key = dataCopy.get(i);
            int j = i - 1;

            while (j >= 0 && dataCopy.get(j).compareTo(key) > 0) {
                dataCopy.set(j+1, dataCopy.get(j));
                j = j - 1;
            }
            dataCopy.set(j+1, key);
        }

        return dataCopy;
    }

}