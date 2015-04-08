/*
 * PartitionTest.java
 * By Antonio F. Huertas
 * Test application for the partition method.
 */

package tests;

import java.util.Arrays;

public class PartitionTest {

	// Serves as the entry point for the application.
	public static void main(String[] args) {
		int[] arr = {5, 3, 9, 7, 2, 1, 8, 6, 4};

		System.out.println("This is arr: " + Arrays.toString(arr));
		System.out.println();

		int pivotIdx = partition(arr, 0, arr.length - 1);

		System.out.println("After partition, this is arr: " + Arrays.toString(arr));
		System.out.println("The selected pivot was " + arr[pivotIdx]);
		System.out.println();

		System.out.println("End of test.");
		System.exit(0);
	}

	// Partitions an array in two halves, one with the elements <= pivot
	// and the other with elements >= pivot.
	private static int partition(int[] arr, int lo, int hi)
	{
		int left = lo;
		int right = hi;
		int pivot = arr[hi];

		do {
			while ((left < right) && (arr[left] <= pivot)) 
				left++;
			while ((right > left) && (arr[right] >= pivot))
				right--;
			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		} while (left < right);

		arr[hi] = arr[left];
		arr[left] = pivot;
		return left;
	}
	
}