package datastructures;

import java.util.Random;

/*
 * ArrayBag.java
 * By Gabriel Rivera Per-ossenkopp
 * Student number: 841-11-6930
 * April 2, 2014
 * Description: This implements the data structure Bag with an array
 */

public class ArrayBag<E> implements Bag<E>{
	
	private static final int DEFAULT_INITIAL_CAPACITY = 10;
	private static final int GROWTH_FACTOR = 2;
	
	private E[] data;
	private int count;
	
	@SuppressWarnings("unchecked")
	public ArrayBag(int initCapacity){
		if(initCapacity < 0)
			throw new InvalidCapacityException("Negative Capacity");
		data = (E[]) new Object[initCapacity];
	}
	
	public ArrayBag(){
		this(DEFAULT_INITIAL_CAPACITY);
	}
	
	@Override
	public void add(E elem) {
		ensureCapacity();
		data[count++] = elem;
		
	}

	@SuppressWarnings("unchecked")
	private void ensureCapacity() {
		if(count == data.length){
			E[]	temp = (E[]) new Object[count * GROWTH_FACTOR];
			for(int curr = 0; curr < count; curr++)
				temp[curr] = data[curr];
			data = temp;
		}
	}

	@Override
	public void remove(E elem) {
		int curr = positionOf(elem);
		if(curr == -1)
			throw new ElementNotFoundException();
		data[curr] = data[--count];
		data[count]	= null;
	}

	@Override
	public boolean contains(E elem) {
		return positionOf(elem) != -1;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void clear() {
		data = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
		count = 0;
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	@Override
	public int size() {
		return count;
	}
	
	@Override
	public String toString(){
		String str = "[";
		if(!isEmpty()){
			str+=data[0];
			for(int curr = 1; curr < count; curr++)
				str+= ", " + data[curr];
		}
		return str + "]";
	}
	
	private int positionOf(E elem){
		for(int curr = 0; curr < count; curr++)
			if(elem.equals(data[curr]))
				return curr;
		return -1; // not found
	}

	@Override
	public E remove() {
		if(isEmpty())
			throw new ElementNotFoundException();
		Random r = new Random();
		int curr = r.nextInt(count); //generates random number from 0-count
		E elem = data[curr];
		data[curr] = data[--count];
		data[count] = null;
		return elem; //returns removed element
	}
	//Returns an array of the Bag
	@SuppressWarnings("unchecked")
	@Override
	public E[] toArray() {
		E[] array = (E[]) new Object[count];
		for(int curr = 0; curr < count; curr++)
			array[curr] = data[curr];
		return array;
	}
	
}
