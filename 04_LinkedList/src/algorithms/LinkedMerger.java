package algorithms;

import datastructures.Node;

/*
 * LinkedMerger.java
 * By Gabriel Rivera Per-ossenkopp
 * Student Number: 841-11-6930
 * April 2, 2014
 * Description: This merges two Linked Lists into one Linked List.
 */
public class LinkedMerger<E extends Comparable<E>> {
	
	@SuppressWarnings("unchecked")
	public static <E> Node<E> merge(Node<E> list1, Node<E> list2){
		//Initializing each list to be ran by while
		Node<E> currLeft = list1, currRight = list2, mergedList = null;
		
		while(currLeft != null && currRight !=null){
			if(((Comparable<E>) currLeft.getData()).compareTo(currRight.getData()) <= 0){
				mergedList = new Node<>(currLeft.getData(), mergedList); 
				currLeft = currLeft.getNext(); //reads next Node from list 1
			}else{
				mergedList = new Node<>(currRight.getData(), mergedList);
				currRight = currRight.getNext(); //reads next Node from list 2
			}
		}
		while(currLeft != null){
			mergedList = new Node<>(currLeft.getData(), mergedList);
			currLeft = currLeft.getNext(); //continues merging from list 1
		}
		while(currRight != null){
			mergedList = new Node<>(currRight.getData(), mergedList);
			currRight = currRight.getNext(); //continues merging from list 2
		}
		return mergedList; //returns the merged list
	}

}
