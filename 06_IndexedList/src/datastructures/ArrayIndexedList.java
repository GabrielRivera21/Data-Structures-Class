/**
 * LinkedIndexedList.java
 * @author Gabriel Rivera Per-ossenkopp
 * Student ID: 841-11-6930
 * May 14, 2014
 * Description: Implements an IndexedList ADT as an Array List data structure
 */
package datastructures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIndexedList<T> implements IndexedList<T> {
	
	//Default Capacity and Growth Factor of List
	private static final int DEFAULT_INIT_CAPACITY = 10;
	private static final int GROWTH_FACTOR = 2;
	
	//Field for the data of the List
	private T[] data;
	//Field for the size of the List
	private int size;
	
	@SuppressWarnings("unchecked")
	public ArrayIndexedList(int initCapacity){
		if(initCapacity < 1)
			throw new InvalidCapacityException();
		data = (T[]) new Object[initCapacity];
	}
	
	public ArrayIndexedList(){
		this(DEFAULT_INIT_CAPACITY);
	}
	
	// Adds the specified element at the end of this list.
	@Override
	public void add(T element) {
		ensureCapacity();
		data[size++] = element;
	}
	
	//Makes sure array is not full
	@SuppressWarnings("unchecked")
	private void ensureCapacity() {
		if(size == data.length){
			T[] temp = (T[]) new Object[size * GROWTH_FACTOR];
			for(int idx = 0; idx < data.length; idx++)
				temp[idx] = data[idx];
			data = temp;
		}
	}
	
	// Removes the first occurrence of the specified element in this list.
    // Throws NoSuchElementException if element is not found.
	@Override
	public void remove(T element) {
		int index = indexOf(element);
		if(index < 0)
			throw new NoSuchElementException();
		size--;
		for(int curr = index; curr < size; curr++)
			data[curr] = data[curr + 1];
		data[size] = null;
	}
	
	 // Inserts the specified element at the specified position in this list.
    // Throws IndexOutOfBoundsException if index < 0 || index > size().
	@Override
	public void add(int index, T element) {
		if(index < 0 || index > size)
			throw new IndexOutOfBoundsException();
		ensureCapacity();
		for(int curr = size; curr > index; curr--)
			data[curr] = data[curr - 1];
		data[index] = element;
		size++;
	}
	
	// Removes and returns the element at the specified position in 
    // this list.
    // Throws IndexOutOfBoundsException if index < 0 || index >= size().
	@Override
	public T remove(int index) {
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException();
		T element = data[index];
		size--;
		for(int curr = index; curr < size;curr++)
			data[curr] = data[curr + 1];
		data[size] = null;
		return element;
	}
	
	// Replaces the element at the specified position in this list with the 
    // specified element.
    // Throws IndexOutOfBoundsException if index < 0 || index >= size().
	@Override
	public void set(int index, T element) {
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException();
		data[index] = element;
	}
	
	// Returns the element at the specified position in this list.
    // Throws IndexOutOfBoundsException if index < 0 || index >= size().
	@Override
	public T get(int index) {
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException();
		return data[index];
	}
	
	// Returns the index of the first occurrence of the specified element in 
    // this list, or -1 if this list does not contain the element.
	@Override
	public int indexOf(T element) {
		for(int idx = 0; idx < size; idx++)
			if(data[idx].equals(element))
				return idx;
		return -1;
	}
	
	// Returns true if the list contains the specified element.
	@Override
	public boolean contains(T element) {
		return indexOf(element) != -1;
	}
	
	// Removes all elements from this list.
	@SuppressWarnings("unchecked")
	@Override
	public void clear() {
		data = (T[]) new Object[DEFAULT_INIT_CAPACITY];
		size = 0;
	}
	
	// Returns the number of elements in this list.
	@Override
	public int size() {
		return size;
	}
	
	// Returns true only if this list has no elements.
	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	
	//Returns a String representation of the IndexedList
	@Override
	public String toString(){
		String str = "[";
		if(!isEmpty()){
			str += data[0];
			for(int curr = 1; curr < size; curr++)
				str += ", " + data[curr];
		}
		return str + "]";
	}
	
	//Iterator method to iterate through Indexed List
	@Override
	public Iterator<T> iterator() {
		return new ArrayIndexedListIterator();
	}
	
	private class ArrayIndexedListIterator implements Iterator<T> {
		
		private int curr = 0;
		
		@Override
		public boolean hasNext() {
			return curr < size;
		}

		@Override
		public T next() {
			if(!hasNext())
				throw new NoSuchElementException();
			return data[curr++];
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}

	}

}
