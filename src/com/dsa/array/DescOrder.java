package com.dsa.array;

public class DescOrder {
	
	public void DescArray(int[]a)
	{
		int i=0;
		int j=0;
		int temp;
		for(i=0;i<a.length;i++) {
			for(j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) //Asc order if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
		}
	}
	private void printArray(int[] a) {
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]+"");
		}
		
	}


	
	
	
	
	public static void main(String[] args) {
		int[]a= {1,8,3,2,6,5,9,4};
		DescOrder desc=new DescOrder();
		desc.DescArray(a);
		desc.printArray(a);
		
		
		
		
		
		
	}
}
