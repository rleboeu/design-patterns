package design_patterns.strategy;

import java.util.ArrayList;

/**
 * The defined SortBehavior of BubbleSort
 * @author rleboeuf
 * @version 1.0.0
 */
public class BubbleSort implements SortBehavior {
    
    /**
     * Return the bubble-sorted ArrayList
     */
    public ArrayList<String> sort(ArrayList<String> data) {
        ArrayList<String> dataCopy = new ArrayList<String>();

        // copy contents of data into dataCopy
        for (String s : data) {
            dataCopy.add(s);
        }

        int dataCopyLength = dataCopy.size();
        String temp = "";
        for (int i = 0; i < dataCopyLength; i++) {
            for (int j = 0; j <= dataCopyLength - 2; j++) {
                if (dataCopy.get(j).compareTo(dataCopy.get(j+1)) > 0) {
                    temp = dataCopy.get(j+1);
                    dataCopy.set(j+1, dataCopy.get(j));
                    dataCopy.set(j, temp);
                }
            }
        }

        return dataCopy;
    }

}
