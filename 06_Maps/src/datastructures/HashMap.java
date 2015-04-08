/*
 * HashMap.java
 * By Antonio Huertas
 * Class that implements a map using a hash table.
 * Note: Collisions are resolved by separate chaining.
 */

package datastructures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class HashMap<K, V> implements Map<K, V> {

	/** Field for the default capacity of this map (a prime number) */
	private static final int DEFAULT_CAPACITY = 11;
	
	/** Field for the maximum load percentage */
	private static final double MAX_LOAD = 0.75;
	
	// Field for the data of this map
	private LinkedMap<K, V>[] data;
	
	// Field for the size of this map
	private int size;

	/** Creates a new map with the given initial capacity. */
	@SuppressWarnings("unchecked")
	public HashMap(int initialCapacity) {
		if (initialCapacity < 1)
			throw new InvalidCapacityException("capacity is less than one");
		data = (LinkedMap<K, V>[])new LinkedMap[initialCapacity];
		for (int bucket = 0; bucket < data.length; bucket++)
			data[bucket] = new LinkedMap<>();
	}

	// Creates a new map with the default initial capacity.
	public HashMap() {
		this(DEFAULT_CAPACITY);
	}

	/** Returns the corresponding bucket for a given key. 
	 * @param Key value 
	 * */
	private int findBucket(K key) {
		return key.hashCode() % data.length;
	}
		
	/** Returns the value associated with the given key. */
	@Override
	public V get(K key) {
		int bucket = findBucket(key);
		return data[bucket].get(key);
	}

	/** Adds or modifies the value associated with the given key. */
	@Override
	public void put(K key, V value) {
		ensureCapacity();

		int bucket = findBucket(key);
		
		if (data[bucket].get(key) == null)
			size++;
		data[bucket].put(key, value);
	}

	// Ensures that this map has the capacity for adding more data.
	private void ensureCapacity() {
		if ((double)size / data.length > MAX_LOAD) {
			HashMap<K, V> temp = new HashMap<>(2 * data.length + 1);
			for (int bucket = 0; bucket < data.length; bucket++)
				for (Entry<K, V> element : data[bucket])
					temp.put(element.getKey(), element.getValue());
			this.data = temp.data;
		}
	}

	// Removes and returns the value associated with the given key.
	@Override
	public V removeKey(K key) {
		int bucket = findBucket(key);
		V value = data[bucket].removeKey(key);
		
		if (value != null)
			size--;
		
		return value;
	}

	// Returns true if the map contains the given key.
	@Override
	public boolean containsKey(K key) {
		return get(key) != null;
	}

	// Removes all elements from this map.
	@SuppressWarnings("unchecked")
	@Override
	public void clear() {
		data = (LinkedMap<K, V>[])new LinkedMap[DEFAULT_CAPACITY];
		for (int bucket = 0; bucket < data.length; bucket++)
			data[bucket] = new LinkedMap<>();
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
		Iterator<Entry<K, V>> it = iterator();
		
		if (it.hasNext()) {
			str += it.next();
			
			while (it.hasNext())
				str += ", " + it.next();
		}
		return str + "]";
	}
	
	// Returns an iterator for this map.
	@Override
	public Iterator<Entry<K, V>> iterator() {
		return new HashMapIterator();
	}

	// Iterator private class
	private class HashMapIterator implements Iterator<Entry<K, V>> {

		// Reference to a queue with the contents of the hash table
		private Queue<Entry<K, V>> contents = new LinkedQueue<>();

		// Creates a new iterator by visiting each bucket and its chain.
		public HashMapIterator() {
			for (int bucket = 0; bucket < data.length; bucket++)
				for (Entry<K, V> element : data[bucket])
					contents.enqueue(element);
		}

		// Returns true only if this iterator has another element.
		@Override
		public boolean hasNext() {
			return !contents.isEmpty();
		}

		// Returns the next element in this iterator.
		@Override
		public Entry<K, V> next() {
			if (! hasNext())
				throw new NoSuchElementException();
			return contents.dequeue();
		}

		// Unsupported: Removes the current element from this iterator.
		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}

	}

}
