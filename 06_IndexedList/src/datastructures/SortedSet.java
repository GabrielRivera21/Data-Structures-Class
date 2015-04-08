package datastructures;

public interface SortedSet<E> extends Iterable<E> {

    // Adds the specified element to this set and returns true.
    // Returns false if this set already contains the element.
    boolean add(E element);

    // Removes the specified element from this set and returns true.
    // Returns false if this set does not contain the element.
    boolean remove(E element);

    // Returns the first (lowest) element in this set.
    E first();

    // Returns the last (highest) element in this set.
    E last();

    // Returns true if the set contains the specified element.
    boolean contains(E element);
 
    // Removes all elements from this set.
    void clear();

    // Returns the number of elements in this set.
    int size();

    // Returns true only if this set has no elements.
    boolean isEmpty();

    // Returns the string representation of this set.
    String toString();
}

