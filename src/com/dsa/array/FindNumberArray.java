package com.dsa.array;

public class FindNumberArray {
	
	public static int findNumber(int[]a,int numwefind) {
		
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]==numwefind) {
		System.out.println("Given number is there in "+(i+1)+"th place");
			}

		
}	
		
		return numwefind;
}

	public static void main(String[] args) {
		int []a= {2,3,20,30,56,120,40,50,130,560,34,444,123};
		//int numwefind=560;
		int num=findNumber(a,560);
		System.out.println("Our number is:"+num);
		
		
		
	}

}
