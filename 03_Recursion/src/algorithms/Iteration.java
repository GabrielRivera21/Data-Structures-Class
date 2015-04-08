package algorithms;

/*
 * Iteration.java
 * Edited By Gabriel Rivera Per-ossenkopp
 * Student Number: 841-11-6930
 * March 13, 2014
 * Description: Utility class that performs some method on numbers
 */
public class Iteration {
	
	private Iteration() {}
	public static long factorial(int n){
		long product = 1;
		while(n>0){
			product*=n--;
		}
		
		return product;
	}
	
	public static long sumUpTo(int n){
		long sum = 0;
		
		while(n>0)
			sum+=n--;
		return sum;
	}
	//Precondition n >= 0
	public static int gcd(int a, int b){
		while(b!=0){
			int temp =b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	//Precondition n >= 0
	public static long Fibo(int n){
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		int firstTerm=0, secondTerm=1, lastTerm=0;
		for(int x = 2; x <= n; x++){
			lastTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=lastTerm;
		}
		return lastTerm;
	}
}
