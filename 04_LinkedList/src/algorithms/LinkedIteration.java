package algorithms;

import datastructures.Node;

/*
 * LinkedIteration.java
 * Edited By Gabriel Rivera Per-ossenkopp
 * Student Number: 841-11-6930
 * March 31, 2014
 * Description: Linked List utility methods class iteratively.
 */
public class LinkedIteration {
	
	private LinkedIteration(){};
	
	public static String toString(Node<Integer> ls){
		String str = "[";
		if(ls != null){
			str += ls.getData();
			
			Node<Integer> curr = ls.getNext();
			while(curr != null){
				str += ", " + curr.getData();
				curr = curr.getNext();
			}
		}
		str += "]";
		return str;
	}
	
	public static int size(Node<Integer> ls){
		int size = 0;
		Node<Integer> curr = ls;
		while(curr != null){
			size++;
			curr = curr.getNext();
		}
		return size;
	}
	
	public static int sumElements(Node<Integer> ls){
		int sum = 0;
		Node<Integer> curr = ls;
		while(curr != null){
			sum+=curr.getData();
			curr = curr.getNext();
		}
		return sum;
	}
	
	//Precondition at least 1 element
	public static int maxElement(Node<Integer> list){
		int max = list.getData();
		Node<Integer> curr = list;
		while(curr != null){
			max = maxOfTwo(max, list.getData()); //returns the max number
			curr = curr.getNext();
		}
		return max;
	}
	//Returns the biggest number between two integers.
	private static int maxOfTwo(int num1, int num2) {
		return (num1 > num2)? num1 : num2;
	}
}
