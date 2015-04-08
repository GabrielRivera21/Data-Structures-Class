/**
 * LinkedIndexedList.java
 * @author Gabriel Rivera Per-ossenkopp
 * Student ID: 841-11-6930
 * May 14, 2014
 * Description: Implements an IndexedList ADT as a LinkedList data structure.
 */
package datastructures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedIndexedList<E> implements IndexedList<E> {
	
	//Fields for the first, last and size of the List.
	private Node<E> head = null,tail = null;
	private int size;
	
	// Adds the specified element at the end of this list.
	@Override
	public void add(E element) {
		if(head == null)
			tail = head = new Node<>(element, null);
		else
			tail = tail.next = new Node<>(element, null);
		size++;
	}
	
	// Removes the first occurrence of the specified element in this list.
    // Throws NoSuchElementException if element is not found.
	@Override
	public void remove(E element) {
		Node<E> prev = null, curr = head;
		while(curr != null && !element.equals(curr.data)){
			prev = curr;
			curr = curr.next;
		}
		if(curr == null)
			throw new NoSuchElementException(); //not found
		if(curr == head){ //removing first
			head = curr.next;
			if(head == null)
				tail = null;
		}else 
			if(curr == tail){
				tail = prev; //removing last
				tail.next = null;
			}
			else
				prev.next = curr.next; //removing in between
		size--;	
	}
	
	// Inserts the specified element at the specified position in this list.
    // Throws IndexOutOfBoundsException if index < 0 || index > size().
	@Override
	public void add(int index, E element) {
		if(index < 0 || index > size)
			throw new IndexOutOfBoundsException();
		Node<E> prev = null, currNode = head;
		for(int curr = 0; curr < index; curr++){
			prev = currNode;
			currNode = currNode.next;
		}
		if(prev == null){
			head = new Node<>(element, head); //insert at front of list
		}else
			if(index == size)
				tail = tail.next = new Node<>(element, null); //insert at end of list
			else
				prev.next = new Node<>(element,currNode); //insert at index in between nodes
		size++;
	}
	
	 // Removes and returns the element at the specified position in 
    // this list.
    // Throws IndexOutOfBoundsException if index < 0 || index >= size().
	@Override
	public E remove(int index) {
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException();
		Node<E> prev = null, curr = head;
		for(int idx = 0; idx < index; idx++){
			prev = curr;
			curr = curr.next;
		}
		E elem = curr.data;
		if(curr == head){ //removing first
			head = curr.next;
			if(head == null)
				tail = null;
		}
		else {
			if(index == size - 1){
				tail = prev; // removing last
				tail.next = null;
			}else
				prev.next = curr.next; //removing in between
		}
		size--;	
		return elem;
	}
	
	// Replaces the element at the specified position in this list with the 
    // specified element.
    // Throws IndexOutOfBoundsException if index < 0 || index >= size().
	@Override
	public void set(int index, E element) {
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException();
		Node<E> curr = head;
		for(int currIdx = 0; currIdx < index; currIdx++)
			curr = curr.next;
		curr.data = element;
	}
	
	// Returns the element at the specified position in this list.
    // Throws IndexOutOfBoundsException if index < 0 || index >= size().
	@Override
	public E get(int index) {
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException();
		Node<E> currNode = head;
		for(int curr = 0; curr < index; curr++)
			currNode = currNode.next;
		return currNode.data;
	}
	
	// Returns the index of the first occurrence of the specified element in 
    // this list, or -1 if this list does not contain the element.
	@Override
	public int indexOf(E element) {
		Node<E> curr = head;
		for(int idx = 0; idx < size; idx++){
			if(curr.data.equals(element))
				return idx;
			curr = curr.next;
		}
		return -1;
	}
	
	// Returns true if the list contains the specified element.
	@Override
	public boolean contains(E element) {
		return indexOf(element) != -1;
	}
	
	// Removes all elements from this list.
	@Override
	public void clear() {
		head = tail = null;
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
		return head == null;
	}
	
	//Returns a String representation of the List.
	@Override
	public String toString() {
		String str = "[";

		if (! isEmpty()) {
			str += head.data;
			for (Node<E> current = head.next; current != null; current = current.next)
				str += ", " + current.data;
		}
		return str + "]";
	}
	
	//Iterator method to iterate through Indexed List
	@Override
	public Iterator<E> iterator() {
		return new LinkedIndexedListIterator();
	}
	
	private class LinkedIndexedListIterator implements Iterator<E> {
		
		private Node<E> curr = head;
		
		@Override
		public boolean hasNext() {
			return curr != null;
		}

		@Override
		public E next() {
			if(!hasNext())
				throw new NoSuchElementException();
			E element = curr.data;
			curr = curr.next;
			return element;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}

	}
}
