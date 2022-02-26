package org.questioanswer;

public class AverageElement {
	
	public static void main(String[] args) {
		
		int sum= 0;
		int a[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
				
		for(int i : a)
		{
			sum = sum + i;
			
		}
		
		System.out.println(sum);
		
		//sum of average 
		double r = sum/a.length;
		System.out.println(r);
		
	}

}
