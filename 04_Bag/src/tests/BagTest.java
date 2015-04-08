/*
 * BagTest.java
 * By Antonio F. Huertas
 * Edited By Gabriel Rivera Per-ossenkopp
 * Student Number: 841-11-6930
 * April 2, 2014
 * Test application for bags.
 */

package tests;

import datastructures.*;


public class BagTest {

	// Serves as the entry point for this application.
	public static void main(String[] args) {
		Bag<String> bag = new ArrayBag<>();
		
		System.out.println("After creating a new bag...");
		print(bag);
		System.out.println();
		
		bag.add("cat");
		bag.add("dog");
		bag.add("tree");
		bag.add("house");
		bag.add("boat");
		bag.add("woman");
		bag.add("man");
		
		System.out.println("After adding some elements...");
		print(bag);
		System.out.println();
		
		//Converts Bag to an array and then displays it
		Object[] array = bag.toArray();
		System.out.println("Now Displaying in array: ");
		for(Object elem : array)
			System.out.print(elem + " ");
		System.out.println("\n");
		
		System.out.println("Does it contains a boat? " + bag.contains("boat"));
		System.out.println();
			
		bag.remove("cat");
		bag.remove("boat");
		
		System.out.println("After removing the cat and the boat...");
		print(bag);
		System.out.println();
		
		//Edited
		System.out.println("Removing at random we removed : " + bag.remove());
		print(bag);
		System.out.println();
		
		System.out.println("Does it contains a boat? " + bag.contains("boat"));
		System.out.println();
		
		bag.clear();
		System.out.println("After clearing the bag...");
		print(bag);
		System.out.println();
		
		System.out.println("End of test.");
		System.exit(0);
	}
	
	// Prints the data, size and empty status of this bag.
	public static <E> void print(Bag<E> bag) {
		System.out.println("This is the bag: " + bag);
		System.out.println("Its size is " + bag.size());
		System.out.println("Is it empty? " + bag.isEmpty());
	}


}