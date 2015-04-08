package datastructures;

public interface IndexedList<E> extends Iterable<E> {

    // Adds the specified element at the end of this list.
    void add(E element);

    // Removes the first occurrence of the specified element in this list.
    // Throws NoSuchElementException if element is not found.
    void remove(E element);

    // Inserts the specified element at the specified position in this list.
    // Throws IndexOutOfBoundsException if index < 0 || index > size().
    void add(int index, E element);
	
    // Removes and returns the element at the specified position in 
    // this list.
    // Throws IndexOutOfBoundsException if index < 0 || index >= size().
    E remove(int index);
	
    // Replaces the element at the specified position in this list with the 
    // specified element.
    // Throws IndexOutOfBoundsException if index < 0 || index >= size().
    void set(int index, E element);
	
    // Returns the element at the specified position in this list.
    // Throws IndexOutOfBoundsException if index < 0 || index >= size().
    E get(int index);
	
    // Returns the index of the first occurrence of the specified element in 
    // this list, or -1 if this list does not contain the element.
    int indexOf(E element);

    // Returns true if the list contains the specified element.
    boolean contains(E element);
 
    // Removes all elements from this list.
    void clear();

    // Returns the number of elements in this list.
    int size();

    // Returns true only if this list has no elements.
    boolean isEmpty();
	
}
