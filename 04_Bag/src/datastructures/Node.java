package datastructures;

public class Node<E> {
	
	 E data;
	 Node<E> next;
	
	public Node(E data, Node<E> next){
		this.data=data;
		this.next=next;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public Node<E> getNext() {
		return next;
	}

	public void setNext(Node<E> next) {
		this.next = next;
	}
	
	@Override
	public String toString(){
		return data + "--> " + next;
	}

}
