/*
 * QuickSorterTest.java
 * By Antonio F. Huertas
 * Test application for the QuickSorter<E> class.
 */

package tests;

import sorting.QuickSorter;

public class QuickSorterTest {

	// Serves as the entry point for this application.
	public static void main(String[] args) {
		String[] array = { "cat", "dog", "tree", "house", "boat", "woman", "man" };
				
		System.out.print("The array has the following elements: ");
		for (String element : array)
			System.out.print(element + " ");
		System.out.println("\n");
		
		QuickSorter<String> merge = new QuickSorter<>();
		merge.sort(array);
		
		System.out.println("After sorting...");
		System.out.print("The array has the following elements: ");
		for (String element : array)
			System.out.print(element + " ");
		System.out.println("\n");
		
		System.out.println("End of test.");
		System.exit(0);
	}

}