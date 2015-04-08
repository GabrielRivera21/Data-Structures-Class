package sorting;

/*
 * QuickSelect.java
 * By Gabriel Rivera Per-ossenkopp
 * Student Number: 841-11-6930
 * March 13, 2014 Last Edited: March 17, 2014
 * Description: This class does a QuickSelect to find the median of an Array. 
 */

public class QuickSelect {
	
	//Pre-Condition Array must be odd numbered
	public static int quickSelectMedian(int[] array){
		return quickSelectMedian(array, 0 , array.length-1);
	}
	
	private static int quickSelectMedian(int[] array, int first, int last){
			int pivotIdx= partition(array, first, last);
			int median = (array.length)/2; //selects the index of the middle of the array
			if(pivotIdx==median)
	            return array[median]; //pivot is in the middle
			else if(pivotIdx<median)
				return quickSelectMedian(array, pivotIdx+1, last); //recursive partition on right half of pivot
			else
				return quickSelectMedian(array, first, pivotIdx-1); //recursive partition on left half of pivot
	
	}
	private static int partition(int[] arr, int lo, int hi)
	{	
		int left=lo;
		int right=hi;
		int pivot=arr[hi]; //Selects pivot
		
		do{
			while((left < right)  && arr[left]<=pivot)
				left++;
		while((right > left) && arr[right]>=pivot)
				right--;
			if(left < right){
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}while(left < right);
		
		arr[hi] = arr[left];
		arr[left] = pivot;
		return left; //returns index of pivot
	}

}
