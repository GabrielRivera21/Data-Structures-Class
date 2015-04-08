package tests;

import java.util.Scanner;

import algorithms.Recursion;

public class RecursionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter first non-negative integer: ");
		int num1 = kb.nextInt();

		if (num1 < 0) {
			System.err.println("Fatal error: negative integer");
			System.exit(1);  // Exits with error status code
		}
		System.out.println("Sum up to " + num1 + ": " +
				Recursion.sumUpTo(num1));
		System.out.println("Factorial of " + num1 + ": " +
				Recursion.factorial(num1));
		System.out.println();
		
		System.out.print("Enter second non-negative integer: ");
		int num2 = kb.nextInt();

		if (num2 < 0) {
			System.err.println("Fatal error: negative integer");
			System.exit(1);  // Exits with error status code
		}
		System.out.println("Sum up to " + num2 + ": " +
				Recursion.sumUpTo(num2));
		System.out.println("Factorial of " + num2 + ": " +
				Recursion.factorial(num2));
		System.out.println();
		
		System.out.println("Gcd of " + num1 + " and " + num2 + ": " +
				Recursion.gcd(num1, num2));
		System.out.println();
		
		System.out.println("Fibonacci term " + num1 + " is " + Recursion.Fibo(num1));
		
		
		kb.close();
		
		System.out.println("End of test.");
		System.exit(0);
	}	

}
