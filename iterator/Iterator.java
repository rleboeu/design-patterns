package iterator;

/**
 * Iterator interface
 * @author rleboeu
 * @version 1.0.0
 */
public interface Iterator {
    
    /**
     * Returns true iff the Iterator has a next node, false otherwise
     * @return if there is a next node in Iterator, returns true. Else, returns false.
     */
    public boolean hasNext();

    /**
     * Returns a reference of the next object in the Iterator
     * @return reference of the next objet in the Iterator
     */
    public Object next();

}
