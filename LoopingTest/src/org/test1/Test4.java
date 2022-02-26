package org.test1;

public class Test4 {
	public static void main(String[] args) {
	    for (int i = 1; i <= 3; i++) 
	    {  
	      for (int j = i+ 1; j <= 3; j++) 
	      {
	    	  System.out.println(j);
	      }
	    }
	  }
}

//	i		i<=3	j=i+1	j<=3	output		j++		i++

//	1		true	1+1=2	2<=3	  2		   2+1=3	 -
//	-		 -		  -		3<=3	  3		   3+1=4	 -
//	-		 -		  -		false	  -			 -		1+1=2
//	2		true	2+1=3   3<=3	  3		   3+1=4	 -
//  -		 -		  -		false	  -			 -		2+1=3
//	3		true	3+1=4 	false	  -			 -		3+1=4
//	4		false	----------------------------Terminate	

