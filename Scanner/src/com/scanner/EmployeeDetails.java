package com.scanner;
import java.util.*;

public class EmployeeDetails {
	
	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter EmpId : " );
		System.out.println("Enter Name : " );
		System.out.println("Enter Email Id : " );
		System.out.println("Enter Phone Number : " );
		System.out.println("Enter Avarage Salary : " );
		System.out.println("Enter Gender : " );
		System.out.println("Enter City : " );
		
		int empid = a.nextInt();
		String name = a.next();
		String emailid = a.next();
		long phno = a.nextLong();
		float avg = a.nextFloat();
		String gender = a.next();
		String city = a.next();
		
		System.out.println("Emp Id : " + empid);
		System.out.println("Name : " + name);
		System.out.println("Email Id : " + emailid);
		System.out.println("Phone Number : " + phno);
		System.out.println("Avarage Salary : " + avg);
		System.out.println("Gender : " + gender);
		System.out.println("City : " + city);
		
		
		
	}
	

}
