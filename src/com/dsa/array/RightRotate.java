package com.dsa.array;

public class RightRotate {

	public void rightRotateArray(int[]a,int d) {
		for (int i=0;i<d;i++)
			shift(a);
	}
	
	public void shift(int[]a) {
		int temp;
		int i;
		temp=a[7];
		for (i=7;i>0;i--) {
			a[i]=a[i-1];
		}
			a[i]=temp;
		
	}
	private void printArray(int[] a,int n) {
		for (int i=0;i<n;i++) {
			System.out.println(a[i]+"");
		}
		
	}
	
	
	public static void main(String[] args) {
		RightRotate rotate= new RightRotate();
		int[]a= {1,2,3,4,5,6,7,8};
		rotate.rightRotateArray(a, 3);
		rotate.printArray(a,8);
		
		
		
	}

	

}