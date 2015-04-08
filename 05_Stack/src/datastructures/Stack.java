package datastructures;

public interface Stack<E> {
	
	void push(E elem);
	
	E pop();
	
	E peek();
	
	int size();
	
	boolean isEmpty();

	void clear();
}
