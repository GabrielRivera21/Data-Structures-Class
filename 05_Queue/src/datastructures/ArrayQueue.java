package datastructures;

public class ArrayQueue<E> implements Queue<E> {
	
	private static final int DEFAULT_INITIAL_CAPACITY = 10;
	private static final int GROWTH_FACTOR = 2;
	
	private E[] data;
	private int front, rear, count;
	
	@SuppressWarnings("unchecked")
	public ArrayQueue(int initCapacity){
		if(initCapacity < 1)
			throw new InvalidCapacityException();
		data = (E[]) new Object[initCapacity];
		front = 0;
		rear = data.length - 1;
	}
	
	public ArrayQueue(){
		this(DEFAULT_INITIAL_CAPACITY);
	}
	
	@Override
	public void enqueue(E element) {
		ensureCapacity();
		rear = (rear + 1) % data.length;
		data[rear] = element;
		count++;
	}

	@SuppressWarnings("unchecked")
	private void ensureCapacity() {
		if(count == data.length){
			E[] temp = (E[]) new Object[data.length * GROWTH_FACTOR];
			for(int curr = 0; curr < count; curr++){
				temp[curr] = data[(front + curr) % data.length];
			}
			data = temp;
			front = 0;
			rear = count - 1;
		}
		
	}

	@Override
	public E dequeue() {
		if(isEmpty())
			throw new ElementNotFoundException();
		E elem = data[front];
		data[front] = null;
		front = (front + 1) % data.length;
		count--;
		return elem;
	}

	@Override
	public E peek() {
		if(isEmpty())
			throw new ElementNotFoundException();
		return data[front];
	}

	@SuppressWarnings("unchecked")
	@Override
	public void clear() {
		data = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
		front = 0;
		rear = data.length - 1;
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
	
	@Override
	public String toString(){
		String str = "[";
		if(!isEmpty()){
			str += data[front];
			for(int curr = 1; curr < count; curr++){
				str += ", " + data[(front + curr) % data.length];
			}
		}
		return str + "]";
		
	}

}
