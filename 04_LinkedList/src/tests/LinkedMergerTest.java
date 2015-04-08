package tests;

import algorithms.LinkedMerger;
import datastructures.Node;

/*
 * LinkedMergerTest.java
 * By Gabriel Rivera Per-ossenkopp
 * Student Number: 841-11-6930
 * April 2, 2014
 * Description: Tests the LinkedMerger class merge method.
 */
public class LinkedMergerTest {

	public static void main(String[] args) {
		Node<String> list1 = new Node<>("ana",
									new Node<>("carla", 
											new Node<>("eliza",
													new Node<>("zahira", null))));
		Node<String> list2 = new Node<>("bob",
									new Node<>("daniel",
											new Node<>("felix", null)));
		Node<String> list3 = LinkedMerger.merge(list1, list2);
		System.out.println("This is the Merged List: ");
		for(Node<String> curr = list3; curr!= null; curr = curr.getNext())
			System.out.print(curr.getData() + " ");

	}

}
