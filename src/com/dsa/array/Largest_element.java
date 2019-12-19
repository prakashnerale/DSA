package com.dsa.array;

public class Largest_element {

	static int max;

	public void largest(int[] a) {

		max = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			if (max < a[i]) {

				max = a[i];
			}

		}
	}



	public static void main(String[] args) 
	{
		int[] a = { 4, 6, 8, 9, 20, 78, 56, 1, 0 };
		Largest_element larg = new Largest_element();
		larg.largest(a);
		System.out.println("Largest element:" + max);
	}

}


