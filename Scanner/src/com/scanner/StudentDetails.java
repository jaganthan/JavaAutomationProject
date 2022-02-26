package com.scanner;
import java.util.*;

public class StudentDetails {

	public static void main(String[] args) {
		
		int sum,average;
		Scanner m = new Scanner(System.in);
		System.out.println("Enter Student Id : ");
		System.out.println("Enter Student Name : ");
		
		int stdid = m.nextInt();
		String name = m.next();
		
		Scanner r = new Scanner(System.in);
		System.out.println("Enter Mark 1 : ");
		System.out.println("Enter Mark 2 : ");
		System.out.println("Enter Mark 3 : ");
		System.out.println("Enter Mark 4 : ");
		System.out.println("Enter Mark 5 : ");
						
		int mark1 = r.nextInt();
		int mark2 = r.nextInt();
		int mark3 = r.nextInt();
		int mark4 = r.nextInt();
		int mark5 = r.nextInt();
		
		System.out.println("Id : " + stdid);
		System.out.println("Name : " + name);
		System.out.println("Mark 1 : " + mark1);
		System.out.println("Mark 2 : " + mark2);
		System.out.println("Mark 3 : " + mark3);
		System.out.println("Mark 4 : " + mark4);
		System.out.println("Mark 5 : " + mark5);
		
		sum = mark1 + mark2 + mark3 + mark4 + mark5;
		average =  sum / 5;
		System.out.println("Total Sum of Marks :" + sum);
		System.out.println("Averag Mark :" + average);
		
	}
}
