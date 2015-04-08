package datastructures;

public class LinkedQueue<E> implements Queue<E> {
	
	private Node<E> front, rear;
	private int count;
	
	@Override
	public void enqueue(E element) {
		Node<E> temp = new Node<>(element, null);
		if(front == null)
			rear = front = temp;
		else
			rear = rear.next = temp;
		count++;
	}

	@Override
	public E dequeue() {
		if(isEmpty())
			throw new ElementNotFoundException();
		E elem = front.data;
		front = front.next;
		if(front == null)
			rear = null;
		count--;
		return elem;
	}

	@Override
	public E peek() {
		if(isEmpty())
			throw new ElementNotFoundException();
		return front.data;
	}

	@Override
	public void clear() {
		front = rear = null;
		count = 0;

	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}
	
	public String toString(){
		String str = "[";
		if(!isEmpty()){
			str += front.data;
			for(Node<E> curr = front.next; curr != null; curr = curr.next)
				str += ", " + curr.data;
		}
		return str + "]";
	}
}
