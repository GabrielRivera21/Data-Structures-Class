package tests;

import algorithms.ArrayIteration;
import algorithms.ArrayRecursion;

/*
 * ArrayMaxElementTest.java
 * By Gabriel Rivera Per-ossenkopp
 * Student Number: 841-11-6930
 * March 13, 2014
 * Description: It tests the Max Element methods of ArrayRecursion & ArrayIteration
 */
public class ArrayMaxElementTest {

	public static void main(String[] args) {
		int[] Array = { 10, 15, 20, 3, 8, 1, 4 };
		System.out.println("Array is ");
		for(int elem : Array){
			System.out.print(elem + " ");
		}
		System.out.println();
		
		System.out.println("The max element Recursively "
				+ "is: " + ArrayRecursion.maxElement(Array));
		
		System.out.println();
		System.out.println("The max Element Iteratively is: " + ArrayIteration.maxElement(Array));
		System.out.println();
		System.out.println("End of Max Element Test");
		System.exit(0);
		
	}

}
