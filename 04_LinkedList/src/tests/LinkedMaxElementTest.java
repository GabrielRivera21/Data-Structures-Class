package tests;

import algorithms.LinkedRecursion;
import datastructures.Node;

/*
 * LinkedMaxElement.java
 * Edited By Gabriel Rivera Per-ossenkopp
 * Student Number: 841-11-6930
 * March 31, 2014
 * Description: This class tests the LinkedRecursion and LinkedIteration max element methods.
 */
public class LinkedMaxElementTest {

	public static void main(String[] args) {
		Node<Integer> list = new Node<>(25,
									new Node<>(10,
											new Node<>(30,
													new Node<>(55,
															new Node<>(45,null)))));
		System.out.println("The max element of this linked list Recursively is: " 
										+ LinkedRecursion.maxElement(list));
		System.out.println("The max element of this linked list Iteratively is: "
										+ LinkedRecursion.maxElement(list));
		System.out.println("End of Max Element Test.");
		System.exit(0);
	}

}
