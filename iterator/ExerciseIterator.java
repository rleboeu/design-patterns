package iterator;

/**
 * Iterator class for Exercises
 * @author rleboeu
 * @version 1.0.0
 */
public class ExerciseIterator implements Iterator {
    
    // fields
    private Exercise[] exercises;
    private int position;

    /**
     * Constructor
     * @param exercises exercises to add to the ExerciseIterator
     */
    public ExerciseIterator(Exercise[] exercises) {
        this.exercises = exercises;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < (this.exercises.length - 1);
    }

    @Override
    public Object next() {
        Object nextObject = null;

        // if the iterator has a next node, increment position and return it.
        // otherwise, set the position to 0 and return null.
        if (this.hasNext()) {
            this.position++;
            nextObject = this.exercises[position];
        } else {
            this.position = 0;
        }

        return nextObject;
    }

}
