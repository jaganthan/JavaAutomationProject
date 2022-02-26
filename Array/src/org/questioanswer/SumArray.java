package org.questioanswer;

public class SumArray {

	
	public static void main(String[] args) {
		
		int sum = 0;
		int a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		//System.out.println(Arrays.toString(a));
		
		
		for(int i : a)
		{
			sum = sum + i;
		}
		System.out.println(sum);
		
	}
}
