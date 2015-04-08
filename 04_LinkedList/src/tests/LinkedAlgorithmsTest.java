/*
 * LinkedAlgorithmsTest.java
 * This source file contains a class to test the LinkedIteration and
 * LinkedRecursion classes.
 */

package tests;

import algorithms.LinkedIteration;
import algorithms.LinkedRecursion;
//import algorithms.LinkedRecursion;
import datastructures.Node;

public class LinkedAlgorithmsTest {

	// Serves as the entry point for the application.
	public static void main(String[] args) {
		Node<Integer> list = 
				new Node<>(10, 
						new Node<>(20, 
								new Node<>(30, 
										new Node<>(40, 
												new Node<>(50, null)))));
		
		System.out.println("Iteration: This is the list: " + 
				LinkedIteration.toString(list));
		System.out.println("Recursion: This is the list: " + 
				LinkedRecursion.toString(list));
		System.out.println();
		
		System.out.println("Iteration: The number of nodes is " + 
				LinkedIteration.size(list));
		System.out.println("Recursion: The number of nodes is " + 
				LinkedRecursion.size(list));
		System.out.println();
		
		System.out.println("Iteration: The sum of its elements is " +
				LinkedIteration.sumElements(list));
		System.out.println("Recursion: The sum of its elements is " +
				LinkedRecursion.sumElements(list));
		System.exit(0);
	}

}