/*
 * Bag.java
 * By Antonio F. Huertas
 * Edited By Gabriel Rivera Per-ossenkopp
 * Student Number: 841-11-6930
 * April 2, 2014
 * Interface that represents a bag.
 */

package datastructures;

public interface Bag<E> {
	
	// Adds a new element to this bag.
	void add(E elem);
	
	// Removes the specified element from this bag.
	void remove(E elem);
		
	// Returns true if this bag contains the specified element.
	boolean contains(E elem);
	
	// Removes all elements from this bag.
	void clear();
	
	// Returns true if this bag contains no elements.
	boolean isEmpty();
	
	// Returns the number of elements in this bag.
	int size();
	
	// Removes an element at random from the bag
	E remove();
	
	//Returns the bag as an array
	E[] toArray();

}