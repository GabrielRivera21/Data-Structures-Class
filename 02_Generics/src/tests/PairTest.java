package tests;

import data.Pair;

public class PairTest {
	// Serves as the entry point for the application.
	public static void main(String[] args) {
		Pair<String> p1 = new Pair<>("cat", "dog");

		System.out.println("This is p1: " + p1);
		System.out.println("Its first element is " + p1.getFirst());
		System.out.println("Its second element is " + p1.getSecond());
		System.out.println();

		Pair<Integer> p2 = new Pair<>(10, 20);

		System.out.println("This is p2: " + p2);
		System.out.println("Its first element is " + p2.getFirst());
		System.out.println("Its second element is " + p2.getSecond());
		System.out.println();

		System.out.println("Are p1 and p2 equal? " + p1.equals(p2));
		System.out.println();

		System.out.println("End of test.");
		System.exit(0);
	}
}
