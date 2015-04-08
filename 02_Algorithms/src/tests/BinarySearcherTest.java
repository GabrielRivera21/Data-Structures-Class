package tests;

import java.util.Scanner;

import searching.BinarySearcher;

/*
 * BinarySearcherTest Class
 * This tests the BinarySearcher class by taking a user input
 * to look for an element in an array
 */
public class BinarySearcherTest {

	public static void main(String[] args) {
		
		String[] array = { "boat", "cat", "dog", "house", "man", "tree", "woman" };
		
		System.out.print("The array has the following elements: ");
		for (String element : array)
			System.out.print(element + " ");
		System.out.println("\n");
		
		BinarySearcher<String> binary = new BinarySearcher<>(array);
		
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter a value to search: ");
		String value = kb.nextLine();
		kb.close();
		
		int pos = binary.search(value);
		
		if (pos != -1)
			System.out.println("The value was found at position #" + pos);
		else
			System.out.println("The value was not found.");
		System.out.println();
		
		System.out.println("End of test.");
		System.exit(0);
	}

}
