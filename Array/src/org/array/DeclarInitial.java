package org.array;

import java.util.Arrays;

public class DeclarInitial {
	
	public static void main(String[] args) {
		
		//Declaration
		int j[] =  new int[5];
		
		//Initialization
		j[0] = 35;
 		j[1] = 26;
  		j[2] = 10;
  		j[3] = 17;
  		j[4] = 46;
  		
  	    //to print value stored in array------need library function ----- import java.util.Arrays;
  		System.out.println(Arrays.toString(j));
  		
  		//to print direct array value
  		System.out.println(j[4]);
  		
  		for(int i=0; i<j.length; i++)
  		{
  		//to print index of array	
  		System.out.println(i);
  		
  		//to print value stored in array
  		System.out.println(j[i]);
  		}
  		
  		
	}

}
