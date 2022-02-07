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

        if (this.hasNext()) {
            this.position++;
            nextObject = this.exercises[position];
        }

        return nextObject;
    }

}
