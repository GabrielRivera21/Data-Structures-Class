package tests;

import java.util.Scanner;
import searching.LinearSearcher;

/*
 * LinearSearcherTest class
 * This tests the Linear Searcher class by creating an array 
 * and takes user inputs to look for the data
 */
public class LinearSearcherTest {

	public static void main(String[] args) {
		String[] array = { "cat", "dog", "tree", "house", "boat", "woman", "man" };
		
		System.out.print("The array has the following elements: ");
		for (String element : array)
			System.out.print(element + " ");
		System.out.println("\n");
		
		LinearSearcher<String> linear = new LinearSearcher<>(array);
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a value to search: ");
		String value = kb.nextLine();
		kb.close();
		
		int pos = linear.search(value);
		
		if (pos != -1)
			System.out.println("The value was found at position #" + pos);
		else
			System.out.println("The value was not found.");
		System.out.println();
		
		System.out.println("End of test.");
		System.exit(0);
	}

}
