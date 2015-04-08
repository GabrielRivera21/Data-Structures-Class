package tests;

import sorting.InsertionSorter;
/*
 * InsertionSorterTest
 * This tests the InsertionSorter class by creating an array and using the sort method
 * and finally displays the sorted array
 */
public class InsertionSorterTest {

	public static void main(String[] args) {
		//String[] array = { "cat", "dog", "tree", "house", "boat", "woman", "man" };
		String[] array = {"h", "g", "a", "c", "d", "b"};
//		1.g,h,a,c,d,b
//		g,a,h,c,d,b
//		2.a,g,h,c,d,b
//		a,g,c,h,d,b
//		3.a,c,g,h,d,b,
//		a,c,g,d,h,b
//		4.a,c,d,g,h,b
//		a,c,d,g,b,h
//		a,c,d,b,g,h
//		a,c,b,d,g,h
//		5.a,b,c,d,g,h
		System.out.print("The array has the following elements: ");
		for (String element : array)
			System.out.print(element + " ");
		System.out.println("\n");
		
		InsertionSorter<String> insertion = new InsertionSorter<>();
		insertion.sort(array);
		
		System.out.println("After sorting...");
		System.out.print("The array has the following elements: ");
		for (String element : array)
			System.out.print(element + " ");
		System.out.println("\n");
		
		System.out.println("End of test.");
		System.exit(0);

	}

}
