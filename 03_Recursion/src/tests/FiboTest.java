package tests;

import java.util.Scanner;

import algorithms.Iteration;
import algorithms.Recursion;

/*
 * FiboTest.java
 * By Gabriel Rivera Per-ossenkopp
 * Student Number: 841-11-6930
 * March 13, 2014
 * Description: This tests the Fibonnaci Method of Recursion and Iteration
 */
public class FiboTest {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a non-negative number: ");
		int num=kb.nextInt();
		
		System.out.println("Recursive Fibonacci Term " + num + " is: " + Recursion.Fibo(num));
		System.out.println();
		System.out.println("Iterative Fibonacci Term " + num + " is: " + Iteration.Fibo(num));
		
		kb.close();
		System.out.println();
		System.out.println("End of Fibonacci Test.");
		System.exit(0);
		
		

	}

}
