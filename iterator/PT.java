package iterator;

import java.util.ArrayList;

/**
 * PT (personal trainer) class
 * @author rleboeu
 * @version 1.0.0
 */
public class PT {

    // fields
    private String firstName;
    private String lastName;
    private String bio;
    private Exercise[] exercises;
    private int numExercises;

    /**
     * Constructor
     * @param firstName first name of the PT
     * @param lastName last name of the PT
     * @param bio biography of the PT
     */
    public PT(String firstName, String lastName, String bio) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.bio = bio;

        this.exercises = new Exercise[1];
        this.numExercises = 0;
    }

    /**
     * Add an Exercise to the PT's list 
     * @param title title (or name) of the exercise
     * @param muscleGroups muscle groups that the exercise works out
     * @param directions directions for the exercise
     */
    public void addExercise(String title, ArrayList<String> muscleGroups, ArrayList<String> directions) {
        Exercise newExercise = new Exercise(title, muscleGroups, directions);

        /*  If there are no exercises present, increment the number of exercises
            and put the newExercise into the 0th position.
            
            Otherwise, grow the array by 1 space and put the newExercise into
            the last position of the exercises array. */
        if (this.numExercises == 0 && this.exercises.length == 1) {
            numExercises++;
            this.exercises[0] = newExercise;
        } else {
            this.exercises = this.growArray(this.exercises);
            this.exercises[this.exercises.length-1] = newExercise;
        }

    }

    /**
     * Grows the given array by one, preserving the data previously stored
     * @param exercises array to increase the size of 
     * @return size-increased array that contains the same elements as before with the last being null
     */
    private Exercise[] growArray(Exercise[] exercises) {
        Exercise[] grownArray = new Exercise[exercises.length+1];

        // copy the contents of the smaller array into the larger one
        for (int i = 0; i < exercises.length; ++i) {
            grownArray[i] = exercises[i];
        }

        return grownArray;
    }

    /**
     * Returns an ExerciseIterator
     * @return
     */
    public ExerciseIterator createIterator() {
        ExerciseIterator iterator = new ExerciseIterator(this.exercises);
        return iterator;
    }

    /**
     * Accessor for the PT's first name
     * @return first name of the PT
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Accessor for the PT's last name
     * @return last name of the PT
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Accessor for PT's biography
     * @return biography of the PT
     */
    public String getBio() {
        return this.bio;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();

        sb.append(firstName);
        sb.append(" ");
        sb.append(lastName);
        sb.append("\n");

        sb.append(bio);
        sb.append("\n");

        return sb.toString();
    }

}