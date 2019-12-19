package com.dsa.basic;

public class FibonacciRecursive {
	
	
	 static int fabonacci(int n) {
		
		if (n<1) 
			return 0;
		else if(n==1|n==2)
			return (n-1);
		else
			return (fabonacci(n-1)+ fabonacci(n-2));
		
		
	}

	public static void main(String[] args) {
		int fib, num=4;
		fib=fabonacci(num);
		
		System.out.println("fabonacci of "+num+"th number is: "+fib);
		
	}

}
