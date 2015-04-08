package algorithms;

/*
 * Recursion.java
 * Edited By Gabriel Rivera Per-ossenkopp
 * Student Number: 841-11-6930
 * March 13, 2014
 * Description: Utility class that performs methods recursively.
 */
public class Recursion {
	
	private Recursion() {}
	
	//Precondition: n >= 0
	public static long factorial(int n){
		if(n==0)
			return 1;
		else
			return n*factorial(n-1);
		
	}
	
	//Precondition n >= 0
	public static long sumUpTo(int n){
		if(n==0){
			return 0;
		}else
			return n+sumUpTo(n-1);
	}
	
	//Precondition n >= 0
	public static int gcd(int a, int b){
		if(b==0)
			return a;
		else
			return gcd(b,a % b);
	}
	//Precondition n>=0
	public static long Fibo(int n){
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		return Fibo(n-1) + Fibo(n-2);
	}
}
