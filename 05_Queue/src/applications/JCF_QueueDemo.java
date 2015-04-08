/*
 * JCF_QueueDemo.java
 * This source file contains a class that demonstrates the Queue interface
 * from the Java Collections Framework.
 * NOTE: The Queue interface is implemented in JCF by the LinkedList class.
 */

package applications;

import java.util.LinkedList;
import java.util.Queue;

public class JCF_QueueDemo {

	// Serves as the entry point for this application.
	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>();
		
		System.out.println("After creating a new queue...");
		print(que);
		System.out.println();
		
		que.add("cat");
		que.add("dog");
		que.add("tree");
		que.add("house");
		que.add("boat");
		que.add("woman");
		que.add("man");
		
		System.out.println("After adding some elements...");
		print(que);
		System.out.println();
		
		System.out.println("The front element is " + que.peek());
		System.out.println();
				
		System.out.println("Removing: " + que.remove());
		System.out.println("Removing: " + que.remove());
		
		System.out.println("After removing the two front elements...");
		print(que);
		System.out.println();
		
		System.out.println("The front element is " + que.peek());
		System.out.println();
		
		que.clear();
		System.out.println("After clearing the queue...");
		print(que);
		System.out.println();
		
		System.out.println("Trying to get the front element...");
		String element = que.peek();
		if (element != null)
			System.out.println("The front element is " + element);
		else
			System.out.println("Error: queue is empty");
		System.out.println();
		
		System.out.println("End of test.");
		System.exit(0);
	}
	
	// Prints the data, size and empty status of this queue.
	public static <E> void print(Queue<E> que) {
		System.out.println("This is the queue: " + que);
		System.out.println("Its size is " + que.size());
		System.out.println("Is it empty? " + que.isEmpty());
	}

}