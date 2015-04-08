package algorithms;

import datastructures.Node;

/*
 * LinkedRecursion.java
 * Edited By Gabriel Rivera Per-ossenkopp
 * Student Number: 841-11-6930
 * March 31, 2014
 * Description: This is a Linked List utility methods class recursively.
 */
public class LinkedRecursion {
	
	private LinkedRecursion(){}
	
	public static String toString(Node<Integer> ls){
		return "[" + toStringHelper(ls) + "]";
	}
	
	private static String toStringHelper(Node<Integer> ls) {
		if(ls == null)
			return "";
		else if(ls.getNext() == null)
			return Integer.toString(ls.getData());
		else
			return ls.getData() + ", "+ toStringHelper(ls.getNext());
	}

	public static int size(Node<Integer> ls){
		if(ls == null)
			return 0;
		else
			return 1 + size(ls.getNext());
	}
	
	public static int sumElements(Node<Integer> ls){
		if(ls == null)
			return 0;
		else
			return ls.getData() + sumElements(ls.getNext());
	}
	//Precondition at least 1 element
	public static int maxElement(Node<Integer> list){
		return maxElement(list.getNext(), list.getData());
	}
	//Returns the max element in a linked list
	private static int maxElement(Node<Integer> list, Integer max) {
		if(list == null)
			return max;
		max = maxOfTwo(max, list.getData()); //Compares current max value with the next Element.
		return maxElement(list.getNext(),max);
	}
	//Returns biggest Number between two integers
	private static int maxOfTwo(int num1, int num2) {
		return (num1 > num2)? num1 : num2;
	}

}
