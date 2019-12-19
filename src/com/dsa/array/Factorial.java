package com.dsa.array;

public class Factorial {
	static int result=1;
	
	public void fact(int n) {
		
		
		for(int i=n;i>1;i--) {
			result=result*i;
		
			
		
	}
		System.out.println("factorial of no" +n+ "is:"+result);
}
	public static void main(String[] args) {
		
		Factorial fac=new Factorial();
		fac.fact(10);
		
	}
	       
      
}
