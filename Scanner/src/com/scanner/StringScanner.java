package com.scanner;

import java.util.Scanner;
public class StringScanner {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		String name = n.next();
		System.out.println("\nYour Name : " + name);
		
		Scanner w = new Scanner(System.in);
		System.out.println("Enter Mother Name : ");
		String mother = w.nextLine();
		System.out.println("Mother Name : " + mother);

		String join = name.concat(mother);
		System.out.println(join);
		
		
	}
}
