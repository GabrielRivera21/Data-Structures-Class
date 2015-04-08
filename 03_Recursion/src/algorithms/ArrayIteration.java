package algorithms;

/*
 * ArrayIteration.java
 * Edited By Gabriel Rivera Per-ossenkopp
 * March 13, 2014
 * Description: Utility Array Iteration class implements different methods Iteratively to use on array.
 */
public class ArrayIteration {
	
	private ArrayIteration(){}
	
	public static double sumElements(double[] arr){
		double sum = 0.0;
		
		for(double elem : arr){
			sum+=elem;
		}
		return sum;
	}
	public static String toString(double[] arr){
		String out = "[";
		
		if(arr.length>0){
			out +=arr[0];
			for(int idx =1; idx<arr.length;idx++)
				out+=", " + arr[idx];
		}
		
		return out + "]";
	}
	
	public static boolean equals(double[] arr1, double[] arr2){
		if(arr1.length!=arr2.length)
			return false;
		else{
			for(int x =0; x<arr1.length; x++){
				if(arr1[x]!=arr2[x])
					return false;
			}
			return true;
		}
	}
	//Looks for the MaxElement in array
	public static int maxElement(int[] array){
		int max=0;
		for(int x=0;x<array.length;x++)
			if(array[x]>max)
				max=array[x];
		return max;
	}
}
