/**
 * LinkedQueue2.java
 * @author Gabriel Rivera Per-ossenkopp
 * Student ID: 841-11-6930
 * Date: May 7, 2014
 * Description: This class implements the Circular Linked List data structure for Queue.
 */
package datastructures;

public class LinkedQueue2<E> implements Queue<E> {
	
	//Initializes Node to null & count to 0
	private Node<E> rear;
	private int count;
	
	//Puts a new element at the rear of queue
	@Override
	public void enqueue(E element) {
		if(rear == null){
			rear = new Node<>(element, null);
			rear.next = rear; //make rear point to itself
		}else
			rear = rear.next = new Node<>(element, rear.next); 
		count++;	
	}
	
	//Removes the front element of the queue
	@Override
	public E dequeue() {
		if(isEmpty())
			throw new ElementNotFoundException();
		E elem = rear.next.data;
		if(rear.next == rear) //checks if rear.next points to itself
			rear = null; 
		else
			rear.next = rear.next.next;
		count--;
		return elem;
	}
	
	//returns the front element of the queue
	@Override
	public E peek() {
		if(isEmpty())
			throw new ElementNotFoundException();
		return rear.next.data;
	}
	
	//removes every element and resets the queue to 0.
	@Override
	public void clear() {
		rear = null;
		count = 0;
	}
	
	//returns how many element elements are in the queue
	@Override
	public int size() {
		return count;
	}
	
	//returns true if there are no elements else it returns false
	@Override
	public boolean isEmpty() {
		return rear == null;
	}
	
	//returns a string representation of the queue
	@Override
	public String toString(){
		String str = "[";
		if(!isEmpty()){
			str += rear.next.data;
			for(Node<E> curr = rear.next.next; curr != rear.next; curr = curr.next)
				str += ", " + curr.data;
		}
		return str + "]";
	}
}
