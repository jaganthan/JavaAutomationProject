package org.array;

import java.util.Arrays;

public class EnhancedLoop {
	
	public static void main(String[] args) {
		
		String r[] = {"Jagan","Mani", "Jothi","Angel"};
		
		//enhanced For loop ----- for(datatype newvariable : Storedvariable)
		for(String w : r)
		{
			System.out.println(w);
		}
		
		//to print value stored in array------need library function ----- import java.util.Arrays;
		System.out.println(Arrays.toString(r));
	
	}

}
