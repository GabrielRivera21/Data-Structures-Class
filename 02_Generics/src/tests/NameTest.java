package tests;

import data.Name;

public class NameTest {
	// Serves as the entry point for the application.
	public static void main(String[] args) {
		Name n1 = new Name("John", "Doe");

		System.out.println("This is n1: " + n1);
		System.out.println();

		Name n2 = new Name("Alan", "Smith");

		System.out.println("This is n2: " + n2);
		System.out.println();

		System.out.println("Are n1 and n2 equal? " + n1.equals(n2));
		if (n1.compareTo(n2) < 0)
			System.out.println("Name n1 comes before n2");
		else if (n1.compareTo(n2) > 0)
			System.out.println("Name n1 comes after n2");
		else
			System.out.println("Names n1 and n2 are the same");
		System.out.println();

		Name n3 = new Name("Jane", "Doe");

		System.out.println("This is n3: " + n3);
		System.out.println();

		System.out.println("Are n1 and n3 equal? " + n1.equals(n3));
		if (n1.compareTo(n3) < 0)
			System.out.println("Name n1 comes before n3");
		else if (n1.compareTo(n3) > 0)
			System.out.println("Name n1 comes after n3");
		else
			System.out.println("Names n1 and n3 are the same");
		System.out.println();

		System.out.println("End of test.");
		System.exit(0);
	}
}
