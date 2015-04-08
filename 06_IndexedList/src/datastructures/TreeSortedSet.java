/**
 * TreeSortedSet.java
 * @author Gabriel Rivera Per-ossenkopp
 * Student ID: 841-11-6930
 * May 14, 2014
 * Description: This implements the interface Sorted Set as a TreeSortedSet data structure.
 */
package datastructures;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TreeSortedSet<E extends Comparable<E>> implements SortedSet<E> {
	
	// Field for the root node of this Set
	private TreeNode<E> root;
	// Field for the size of this Set
	private int size;
	//Field for success if elements are added or removed
	private boolean success;
	
	// Adds the specified element to this set and returns true.
    // Returns false if this set already contains the element.
	@Override
	public boolean add(E element) {
		root = addHelper(element, root);
		return success;
	}
	
	//Helper method to add element into TreeSet
	private TreeNode<E> addHelper(E element, TreeNode<E> current) {
		if(current == null){
			current = new TreeNode<>(element, null, null);
			size++;
			success = true;
		}else{
			if(element.compareTo(current.data) < 0)
				current.left = addHelper(element, current.left);
			else if(element.compareTo(current.data) > 0)
				current.right = addHelper(element, current.right);
			else
				success = false;
		}
		return current;
	}

	// Removes the specified element from this set and returns true.
    // Returns false if this set does not contain the element.
	@Override
	public boolean remove(E element) {
		root = removeHelper(element, root);
		return success;
	}
	
	//Helper Method to Remove an element in TreeSet
	private TreeNode<E> removeHelper(E element, TreeNode<E> current) {
		if(current == null){
			success = false;
			return null;
		}else{
			if(element.compareTo(current.data) < 0)
				current.left = removeHelper(element, current.left);
			else if(element.compareTo(current.data) > 0)
				current.right = removeHelper(element, current.right);
			else{
				current = deleteNode(current);
				size--;
				success = true;
			}
		}
		return current;
	}
	
	//deletes the node while retaining order
	private TreeNode<E> deleteNode(TreeNode<E> node) {
		if (node.right == null)         // node with left child or leaf
			node = node.left;
		else if (node.left == null)     // node with right child or leaf
			node = node.right;
		else {                          // node with two children
			TreeNode<E> successor = getSuccessor(node);
			node.data = successor.data;
			node.right = removeHelper(node.data, node.right);
		}
		return node;
	}
	
	//looks for lefternmost node from node.right
	private TreeNode<E> getSuccessor(TreeNode<E> node) {
		TreeNode<E> current = node.right;
		while (current.left != null)
			current = current.left;
		return current;
	}

	// Returns the first (lowest) element in this set.
	@Override
	public E first() {
		return findLowest(root);
	}
	
	//returns lefternmost element in set
	private E findLowest(TreeNode<E> current) {
		while(current.left != null)
			current = current.left;
		return current.data;
	}

	// Returns the last (highest) element in this set.
	@Override
	public E last() {
		return findHighest(root);
	}
	
	//return rightermost element in the set
	private E findHighest(TreeNode<E> current) {
		while(current.right != null)
			current = current.right;
		return current.data;
	}

	// Returns true if the set contains the specified element.
	@Override
	public boolean contains(E element) {
		return get(element, root) != null;
	}
	
	//returns specified element
	private E get(E element, TreeNode<E> current) {
		if(current == null)
			return null;
		else{
			if(element.compareTo(current.data) < 0)
				return get(element, current.left);
			else if(element.compareTo(current.data) > 0)
				return get(element, current.right);
			else
				return current.data;
		}
	}

	// Removes all elements from this set.
	@Override
	public void clear() {
		root = null;
		size = 0;
	}
	
	// Returns the number of elements in this set.
	@Override
	public int size() {
		return size;
	}
	
	// Returns true only if this set has no elements.
	@Override
	public boolean isEmpty() {
		return size == 0;
	}
	
	// Returns the string representation of this set.
	@Override
	public String toString(){
		String str = "[";
		Iterator<E> it = iterator();
		
		if (it.hasNext()) {
			str += it.next();
			
			while (it.hasNext())
				str += ", " + it.next();
		}
		return str + "]";
	}
	
	// Returns an iterator for this set.
	@Override
	public Iterator<E> iterator() {
		return new TreeSortedSetIterator();
	}
	
	// Iterator private class
	private class TreeSortedSetIterator implements Iterator<E> {

		// Reference to a queue with the contents of the tree
		private Queue<E> contents = new LinkedQueue<>();

		// Creates a new iterator using an inorder traversal.
		public TreeSortedSetIterator() {
			inorder(root);
		}

		// Populates the contents queue by traversing the tree.
		private void inorder(TreeNode<E> current) {
			if(current != null){
				inorder(current.left);
				contents.enqueue(current.data);
				inorder(current.right);
			}
		}

		// Returns true only if this iterator has another element.
		@Override
		public boolean hasNext() {
			return !contents.isEmpty();
		}

		// Returns the next element in this iterator.
		@Override
		public E next() {
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
