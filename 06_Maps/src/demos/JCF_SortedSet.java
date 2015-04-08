/*
 * JCF_SortedSetDemo.java
 * This source file contains a class that demonstrates the SortedSet interface
 * and the TreeSet class from the Java Collections Framework.
 */

package demos;

import java.util.*;

public class JCF_SortedSet {

	// Serves as the entry point for this application.
	public static void main(String[] args) {
		SortedSet<String> set = new TreeSet<>();
		
		System.out.println("After creating a new set...");
		print(set);
		System.out.println();
		
		set.add("dog");
		set.add("cat");
		set.add("tree");
		set.add("house");
		set.add("boat");
		set.add("woman");
		set.add("man");
		
		System.out.println("After adding some elements...");
		print(set);
		System.out.println("Its first element is " + set.first());
		System.out.println("Its last element is " + set.last());
		System.out.println();
				
		System.out.println("Does it contains house? " + set.contains("house"));
		System.out.println();
		
		System.out.println("Traversing the set...");
		for (String element : set)
			System.out.println("Element: " + element);
		System.out.println();
		
		boolean success = set.add("boat");
		
		System.out.println("Trying to add boat...");
		if (success)
			System.out.println("Element boat was added to the set.");
		else
			System.out.println("Duplicate! Element boat was NOT added to the set.");
		System.out.println();
				
		set.remove("boat");
		set.remove("house");
		set.remove("woman");
		
		System.out.println("After removing three elements...");
		print(set);
		System.out.println("Its first element is " + set.first());
		System.out.println("Its last element is " + set.last());
		System.out.println();
		
		System.out.println("Does it contains house? " + set.contains("house"));
		System.out.println();
		
		set.clear();
		System.out.println("After clearing the map...");
		print(set);
		System.out.println();
		
		success = set.remove("boat");
		
		System.out.println("Trying to remove boat...");
		if (success)
			System.out.println("Element boat was removed.");
		else
			System.out.println("Missing! Element boat was not removed.");
	}
	
	// Prints the data, size and empty status of this set.
	public static <E> void print(SortedSet<String> set) {
		System.out.println("This is the collection: " + set);
		System.out.println("Its size is " + set.size());
		System.out.println("Is it empty? " + set.isEmpty());
	}

}