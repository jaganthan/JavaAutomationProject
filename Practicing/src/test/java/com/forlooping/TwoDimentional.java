package com.forlooping;

public class TwoDimentional {
	public static void main(String[] args) {
		
	int a[][] = {{1,2,3,4},{0,9,8,7,6,}};
	for(int i=0; i<a.length; i++)
	{
		for(int j=0; j<a[i].length; j++)
		{
			System.out.println(a[i][j]);
		}
	}
}

}