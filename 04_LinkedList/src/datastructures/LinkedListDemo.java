package datastructures;


public class LinkedListDemo {

	public static void main(String[] args) {
		
		Node<Character> list = new Node<>('a',
									new Node<>('b',
											new Node<>('c',null)));
		
		System.out.println("First Value is: " + list.getData() + "\n");
		System.out.println("Second Value is " + list.getNext().getData() + "\n");
		addFinal(list, 'd');
		PrintList(list);
		System.out.println();
		System.out.println("End of Demo");
		System.exit(0);
		

	}
	private static void PrintList(Node<Character> list){
		Node<Character> temp=list;
		System.out.print("Full List is: ");
		while(temp!=null){
			System.out.print(temp.getData() + " ");
			temp=temp.getNext();
		}
	
	}
	private static void addFinal(Node<Character> list, char elem){
		Node<Character> curr = list;
		while(curr.getNext() != null){
			curr= curr.getNext();
		}
		
		curr.next = new Node<>(elem,curr);
	}

}
