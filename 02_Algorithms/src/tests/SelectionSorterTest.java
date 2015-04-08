package tests;

import sorting.SelectionSorter;
/*
 * This is a test for the SelectionSorter class that uses the sort method
 * for the created array and finally displays the sorted array
 * 
 */

public class SelectionSorterTest {

	public static void main(String[] args) {
		
		//String[] array = { "cat", "dog", "tree", "house", "boat", "woman", "man" };
		String[] array = {"h", "g", "a", "c", "d", "b"};
//		1.a,g,h,c,d,b
//		2.a,b,h,c,d,g
//		3.a,b,c,h,d,g
//		4.a,b,c,d,h,g
//		5.a,b,c,d,g,h
		System.out.print("The array has the following elements: ");
		for (String element : array)
			System.out.print(element + " ");
		System.out.println("\n");
		
		SelectionSorter<String> selection = new SelectionSorter<>();
		selection.sort(array);
		
		System.out.println("After sorting...");
		System.out.print("The array has the following elements: ");
		for (String element : array)
			System.out.print(element + " ");
		System.out.println("\n");
		
		System.out.println("End of test.");
		System.exit(0);

	}

}
