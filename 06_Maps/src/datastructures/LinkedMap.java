/*
 * LinkedMap.java
 * By Antonio Huertas
 * Class that implements a map using links.
 */

package datastructures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedMap<K, V> implements Map<K, V> {
	
	// Field for the head node of this map
	private Node<Entry<K, V>> head = null;

	// Field for the size of this map
	private int size = 0;

	// Returns the value associated with the given key.
	@Override
	public V get(K key) {
		Node<Entry<K, V>> curr = head;
		while(curr != null){
			if(key.equals(curr.data.getKey()))
				return curr.data.getValue();
			curr = curr.next;
		}
		return null; //not found
	}

	// Adds or modifies the value associated with the given key.
	@Override
	public void put(K key, V value) {
		Node<Entry<K, V>> curr = head;
		while(curr != null){
			if(key.equals(curr.data.getKey())){
				curr.data.setValue(value); //modifying value
				return; 
			}
			curr = curr.next;
		}
		//adding new entry
		head = new Node<>(new Entry<>(key, value), head);
		size++; 
	}

	// Removes and returns the value associated with the given key.
	@Override
	public V removeKey(K key) {
		Node<Entry<K,V>> prev = null, curr = head;
		while(curr != null && !key.equals(curr.data.getKey())){
			prev = curr;
			curr = curr.next;
		}
		if(curr == null)
			return null; //not found
		V value = curr.data.getValue();
		if(curr == head) //removing first
			head = curr.next;
		else
			prev.next = curr.next;
		size--;
		return value;
	}

	// Returns true if the map contains the given key.
	@Override
	public boolean containsKey(K key) {
		return get(key) != null;
	}

	// Removes all elements from this map.
	@Override
	public void clear() {
		head = null;
		size = 0;
	}

	// Returns the number of elements in this stack.
	public int size() {
		return size;
	}

	// Returns true only if this map has no elements.
	public boolean isEmpty() {
		return size == 0;
	}

	// Returns the string representation of this object.
	@Override
	public String toString() {
		String str = "[";

		if (! isEmpty()) {
			str += head.data;
			for (Node<Entry<K, V>> current = head.next; current != null; current = current.next)
				str += ", " + current.data;
		}
		return str + "]";
	}

	// Returns an iterator for this map.
	public Iterator<Entry<K, V>> iterator() {
		return new LinkedMapIterator();
	}
	
	private class LinkedMapIterator implements Iterator<Entry<K, V>> {
		
		private Node<Entry<K, V>> curr = head;
		
		@Override
		public boolean hasNext() {
			return curr != null;
		}

		@Override
		public Entry<K, V> next() {
			if(!hasNext())
				throw new NoSuchElementException();
			Entry<K,V> entry = curr.data;
			curr = curr.next;
			return entry;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();

		}

	}

}

