/*
 * ColorTest.java
 * By Antonio F. Huertas
 * Test application for the Color enumerated type.
 */

package tests;

import geometry.Color;
import java.util.Scanner;

public class ColorTest {

	// Serves as the entry point for this application.
	public static void main(String[] args) {
		Color c1 = Color.BLUE;
		
		System.out.println("This is c1: " + c1);
		System.out.println("Its real name: " + c1.name());
		System.out.println("Its ordinal value: " + c1.ordinal());
		System.out.println();
		
		Color c2 = Color.defaultValue();
		
		System.out.println("This is c2: " + c2);
		System.out.println("Its real name: " + c2.name());
		System.out.println("Its ordinal value: " + c2.ordinal());
		System.out.println();

		System.out.println("Are c1 and c2 equal? " + c1.equals(c2));
		System.out.println();
		
		System.out.print("Comparing c1 and c2: ");
		if (c1.compareTo(c2) < 0)
			System.out.println("c1 is less than c2");
		else if (c1.compareTo(c2) > 0)
			System.out.println("c1 is greater than c2");
		else
			System.out.println("c1 is equal to c2");
		System.out.println();
		
		Scanner kb = new Scanner(System.in);
		
		try {
			System.out.print("Enter a new color for c2: ");
			String input = kb.next().toUpperCase();
			c2 = Color.valueOf(input);
			System.out.println("The color was changed to " + input);
		}
		catch (IllegalArgumentException ex) {
			System.out.println("Error: " + ex.getMessage());
			System.out.println("The color was not changed");
		}
		System.out.println();

		kb.close();
		
		System.out.println("This is c2: " + c2);
		System.out.println("Its real name: " + c2.name());
		System.out.println("Its ordinal value: " + c2.ordinal());
		System.out.println();
				
		System.out.print("These are the available colors: ");
		for (Color c : Color.values())
			System.out.print(c + " ");
		System.out.println("\n");
		
		System.out.println("End of test.");
		System.exit(0);
	}

}