package org.abstrat;
import org.abstrat.Abstract1;

public class Abstract2 extends Abstract1{
	
	public void name()
	{
		System.out.println("Jagan");
	}
	
	public static void main(String[] args) {
		Abstract2 w = new Abstract2();
		w.name();
		
	}
}
