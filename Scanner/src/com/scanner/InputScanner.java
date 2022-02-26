package com.scanner;

import java.util.Scanner;

public class InputScanner {
	
	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		
		System.out.println("Enter Your Age : ");
		
		byte age = n.nextByte();
		
		Scanner q = new Scanner(System.in);
		
		System.out.println("Enter Your ID No :");
		
		int id = q.nextInt();
		
		Scanner w = new Scanner(System.in);
		
		System.out.println("Enter Your Avg.Salary :");
		
		float avg = w.nextFloat();
		
		Scanner b = new Scanner(System.in);
		
		System.out.println("You Are Male ?");
		
		boolean male = b.nextBoolean();
		
		System.out.println("\nAGE :" + age);
		System.out.println("ID :" + id);
		System.out.println("AVG.SAL :" + avg);
		System.out.println("Am Male :" + male);
		
		
		
	
		

	}
}
