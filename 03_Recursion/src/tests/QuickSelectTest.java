package tests;

import sorting.QuickSelect;

/*
 * QuickSelectTest.java
 * By Gabriel Rivera Per-ossenkopp
 * Student Number: 841-11-6930
 * March 13, 2014
 * Description: This tests the method of QuickSelect which finds the median by doing a QuickSelect
 */
public class QuickSelectTest {

	public static void main(String[] args) {
		int[] array = {5, 3, 9, 7, 2, 1, 8, 6, 4}; //[1,2,3,4,5,6,7,8,9] Median 5
		
						
		//int[] array = {3,6,8,1,7,2,10}; //[1, 2, 3 , 6 , 7, 8 , 10] Median 6
					  
		
		System.out.println("This is the Array: ");
		for(int elem : array)
			System.out.print(elem + " ");
		System.out.println();
		System.out.println("The Median is " + QuickSelect.quickSelectMedian(array));
		System.out.println("End of Selecting Median");
		
		System.exit(0);
		
	}

}
