package algorithms;

/*
 * ArrayRecursion.java
 * Edited by Gabriel Rivera Per-ossenkopp
 * Student Number: 841-11-6930
 * March 13, 2014
 * Description: Utility Array Recursion method class to use on arrays.
 */
public class ArrayRecursion {
	
	private ArrayRecursion() {}
	
	public static double sumElements(double[] arr){
		return sumElements(arr, arr.length);
	}

	private static double sumElements(double[] arr, int len) {
		if(len==0)
			return 0;
		else
			return sumElements(arr,len-1) + arr[len-1];
	}
	
	public static String toString(double[] arr){
		return "["+ toString(arr,arr.length) + "]";
	}

	private static String toString(double[] arr, int len) {
		if(len==0)
			return "";
		else if(len==1)
			return String.valueOf(arr[0]);
		else
			return toString(arr,len-1) + ", " + arr[len-1];
	}
	
	public static String toString(int[] arr){
		return "["+ toString(arr,arr.length) + "]";
	}

	private static String toString(int[] arr, int len) {
		if(len==0)
			return "";
		else if(len==1)
			return String.valueOf(arr[0]);
		else
			return toString(arr,len-1) + ", " + arr[len-1];
	}
	
	public static boolean equals(double[] arr1, double[] arr2){
		if(arr1.length!=arr2.length)
			return false;
		else
			return equals(arr1,arr2,arr1.length);
	}

	private static boolean equals(double[] arr1, double[] arr2, int len) {
		if(len==0)
			return true;
		else
			return equals(arr1, arr2, len-1) && arr1[len-1]==arr2[len];
	}
	
	//Precondition array must have at least 1 element
	public static int maxElement(int[] array){
		return maxElement(array, 0 , array[0]);
	}
	//Helper method for max Element
	private static int maxElement(int[] array, int len,int max) {
		if(len == array.length-1)
			return max;
		max=maxOfTwo(array[len+1], max); //Returns the biggest number
		return maxElement(array, len+1, max);
	}
	//Compares two elements and returns the Biggest
	private static int maxOfTwo(int num1, int num2) {
		return (num1 > num2)? num1 : num2;
	}

	
	
}
