package datastructures;

public class ArrayStack<E> implements Stack<E> {
	
	private static final int DEFAULT_INITIAL_CAPACITY = 10;
	private static final int GROWTH_FACTOR = 2;
	
	private E[] data;
	private int top = -1;
	
	@SuppressWarnings("unchecked")
	public ArrayStack(int initCapacity){
		if(initCapacity < 1)
			throw new InvalidCapacityException();
		data = (E[]) new Object[initCapacity];
	}
	
	public ArrayStack(){
		this(DEFAULT_INITIAL_CAPACITY);
	}
	
	@Override
	public void push(E elem) {
		ensureCapacity();
		data[++top] = elem;
		
	}

	@SuppressWarnings("unchecked")
	private void ensureCapacity() {
		if(size() == data.length){
			E[] temp = (E[]) new Object[data.length * GROWTH_FACTOR];
			for(int curr = top; curr >= 0; curr--)
				temp[curr] = data[curr];
			data = temp;
		}
	}

	@Override
	public E pop() {
		if(isEmpty())
			throw new ElementNotFoundException();
		E elem = data[top];
		data[top--] = null;
		return elem;
	}

	@Override
	public E peek() {
		if(isEmpty())
			throw new ElementNotFoundException();
		return data[top];
	}

	@Override
	public int size() {
		return top + 1;
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void clear() {
		data = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
		top = -1;
	}
	
	@Override
	public String toString(){
		String str = "[";
		if(!isEmpty()){
			str += data[top];
			for(int index = top-1; index >= 0; index--)
				str += ", " + data[index];
		}
		return str + "]";
	}
}
