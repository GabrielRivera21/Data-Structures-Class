/*
 * MapIteratorTest.java
 * By Antonio F. Huertas
 * Test application for map iterators.
 */

package tests;

import java.util.Iterator;

import datastructures.*;

public class MapIteratorTest {

	public static void main(String[] args) {
		Map<String, String> map = new ArrayMap<>();
		
		map.put("house", "casa");
		map.put("dog", "perro");
		map.put("cat", "gato");
		map.put("tree", "árbol");
		map.put("woman", "mujer");
		map.put("man", "hombre");
		map.put("boat", "bote");
		
		System.out.println("This is the map: " + map);
		System.out.println();
		
		System.out.println("Traversing the map with an explicit iterator...");
		Iterator<Entry<String, String>> iter = map.iterator();
		while (iter.hasNext()) {
			Entry<String, String> entry = iter.next();
			System.out.println("Key: " + entry.getKey() + 
					"\tValue: " + entry.getValue());
		}
			
		System.out.println();
		
		System.out.println("Traversing the map using enhanced for...");
		for (Entry<String, String> element : map)
			System.out.println("Key: " + element.getKey() + 
					"\tValue: " + element.getValue());
		System.out.println();
		
		System.out.println("End of test.");
		System.exit(0);
	}

}