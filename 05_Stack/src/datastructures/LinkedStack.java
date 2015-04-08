package datastructures;

public class LinkedStack<E> implements Stack<E> {
	
	private Node<E> top;
	private int count;
	
	@Override
	public void push(E elem) {
		top = new Node<>(elem,top);
		count++;
	}

	@Override
	public E pop() {
		if(isEmpty())
			throw new ElementNotFoundException();
		E elem = top.data;
		top = top.next;
		count--;
		return elem;
	}

	@Override
	public E peek() {
		if(isEmpty())
			throw new ElementNotFoundException();
		return top.data;
	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public boolean isEmpty() {
		return count == 0;
	}

	@Override
	public void clear() {
		top = null;
		count = 0;
	}
	
	@Override
	public String toString(){
		String str = "[";
		if(!isEmpty()){
			str += top.data;
			for(Node<E> curr = top.next; curr != null; curr = curr.next)
				str += ", " + curr.data;
		}
		return str + "]";
	}
}
