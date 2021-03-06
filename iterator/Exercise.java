package iterator;

import java.util.ArrayList;

/**
 * Class to represent an Exercise
 * @author rleboeu
 * @version 1.0.0
 */
public class Exercise {
    
    // fields
    private String title;
    private ArrayList<String> targetMuscles;
    private ArrayList<String> directions;

    /**
     * Primary constructor
     * @param title title (or name) of the exercise
     */
    public Exercise(String title) {
        this(title, new ArrayList<String>(), new ArrayList<String>());
    }

    /**
     * Secondary constructor
     * @param title title (or name) of the exercise
     * @param targetMuscles ArrayList of the muscles that the exercise targets
     * @param directions ArrayList of the directions (step-by-step) for the exercise
     */
    public Exercise(String title, ArrayList<String> targetMuscles, ArrayList<String> directions) {
        this.title = title;
        this.targetMuscles = targetMuscles;
        this.directions = directions;
    }

    /**
     * Adds the muscle to the ArrayList of targetMuscles
     * @param muscle muscle to add to the ArrayList
     */
    public void addTargetMuscle(String muscle) {
        this.targetMuscles.add(muscle);
    }

    /**
     * Removes the muscle from the ArrayList of targetMuscles
     * @param muscle muscle to remove from the ArrayList
     */
    public void removeTargetMuscle(String muscle) {
        this.targetMuscles.remove(muscle);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append("\n... " + this.title + " ...\n");

        // append the muscles as a comma-separated list
        sb.append("Muscles: ");
        for (int i = 0; i < this.targetMuscles.size(); ++i) {
            sb.append(this.targetMuscles.get(i));

            // only print a comma if there is another muscle to be printed 
            if (i < this.targetMuscles.size()-1) {
                sb.append(", ");
            }
        }

        sb.append("\n");    // formatting

        // append directions as a bulleted list
        sb.append("Directions:\n");
        for (String direction : this.directions) {
            sb.append("- " + direction + "\n");
        }

        return sb.toString();
    }

}
