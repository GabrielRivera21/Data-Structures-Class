package tests;

import algorithms.ArrayIteration;

public class ArrayIterationTest {

	public static void main(String[] args) {
		double[] firstArray = { 10.0, 15.0, 8.0, 3.0, 20.0 };

		System.out.println("firstArray: " + 
				ArrayIteration.toString(firstArray));
		System.out.println("Sum of its elements: " + 
				ArrayIteration.sumElements(firstArray));
		System.out.println();
		
		double[] secondArray = { 9.0, 10.4, 5.0, 27.0 };
		
		System.out.println("secondArray: " + 
				ArrayIteration.toString(secondArray));
		System.out.println("Sum of its elements: " + 
				ArrayIteration.sumElements(secondArray));
		System.out.println();
		
		if (ArrayIteration.equals(firstArray, secondArray))
			System.out.println("Arrays are equal.");
		else
			System.out.println("Arrays are NOT equal.");
		System.out.println();
		
		System.out.println("End of test.");
		System.exit(0);

	}

}
