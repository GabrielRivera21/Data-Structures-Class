package datastructures;

import java.util.Random;

/*
 * LinkedBag.java
 * By Gabriel Rivera Per-ossenkopp
 * Student Number: 841-11-6930
 * April 2, 2014
 * Description: This is a bag implemented with a Linked List.
 */
public class LinkedBag<E> implements Bag<E> {
	
	private Node<E> head;
	private int count;

	@Override
	public void add(E elem) {
		head = new Node<>(elem, head);
		count++;
	}

	@Override
	public void remove(E elem) {
		Node<E> curr = positionOf(elem);
		if(curr == null)
			throw new ElementNotFoundException();
		curr.data = head.data;
		head = head.next;
		count--;
	}

	@Override
	public boolean contains(E elem) {
		return positionOf(elem) != null;
	}

	@Override
	public void clear() {
		head = null;
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
			str += head.data;
			for(Node<E> curr = head.next; curr != null; curr = curr.next)
				str += ", " + curr.data;
		}
		return str + "]";
	}
	private Node<E> positionOf(E elem){
		for(Node<E> curr = head; curr != null; curr = curr.next)
			if(elem.equals(curr.data))
				return curr;
		return null;
	}

	@Override
	public E remove() {
		if(isEmpty())
			throw new ElementNotFoundException();
		Random r = new Random();
		int random = r.nextInt(count); //generates random number from 0-count
		Node<E> curr = head;
		for(int x = 0; x != random; x++){
			curr = curr.next; //Continues until X is the random number
		}
		E elem = curr.data;
		curr.data = head.data;
		head =  head.next;
		count--;
		return elem; //Returns the removed Element
	}
	//Converts this bag into an array
	@SuppressWarnings("unchecked")
	@Override
	public E[] toArray() {
		E[] array = (E[]) new Object[count];
		Node<E> curr = head;
		for(int idx = 0; idx < count; idx++){
			array[idx] = curr.data;
			curr = curr.next;
		}
		return array;
	}
}
