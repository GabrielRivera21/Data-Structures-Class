package tests;

import sorting.BubbleSorter;

/*
 * BubbleSorterTest class
 * This tests the BubbleSorter Class by creating an array and using the sort method
 * and finally displays the sorted array
 * 
 * By Gabriel Rivera Per-ossenkopp
 * 841-11-6930
 */
public class BubbleSorterTest {

	public static void main(String[] args) {
		
		//String[] array = { "cat", "dog", "tree", "house", "boat", "woman", "man" };
		String[] array = {"h", "g", "a", "c", "d", "b"};
		System.out.print("The array has the following elements: ");
		for (String element : array)
			System.out.print(element + " ");
		System.out.println("\n");
		
		BubbleSorter<String> bubble = new BubbleSorter<>();
		bubble.sort(array);
		
		System.out.println("After sorting...");
		System.out.print("The array has the following elements: ");
		for (String element : array)
			System.out.print(element + " ");
		System.out.println("\n");
		
		System.out.println("End of test.");
		System.exit(0);

	}

}
