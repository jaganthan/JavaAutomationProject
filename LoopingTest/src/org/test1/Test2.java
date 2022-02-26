package org.test1;

public class Test2 {
	public static void main(String[] args) {
	    for (int i = 1; i <= 3; i++)
	    {
	      for (int j = 1; j <= 3; j++) 
	      {
	        System.out.println(i);
	      }
	    }
	  }
}
//i=1 	1<=3
//			 j=1	j<=3	1+1=2
//									1
//			 j=2	j<=3	2+1=3
//									1
//			 j=3	j<=3	3+1=4
//									1
//			 j=4	j<=3-----terminate
								
//										1+1=2
//i=2	2<=3
//			 j=1	j<=3	1+1=2
//									2
//			 j=2	j<=3	2+1=3
//									2
//			 j=3	j<=3	3+1=4
//									2
//			 j=4	j<=3-----terminate

//										2+1=3
//i=3	3<=3
//			j=1	j<=3	1+1=2
//									3
//			j=2	j<=3	2+1=3
//									3
//			j=3	j<=3	3+1=4
//									3
//			j=4	j<=3-----terminate

//										3+1=4
//i=4	4<=3-----------------------terminate
