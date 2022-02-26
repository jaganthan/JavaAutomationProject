package org.familydetails;

public class FamilyInfo implements MotherDetails,FatherDetails{
		
	public void motherInfo() {
		System.out.println("Mother Name : JothiLakshmi");
	}
	
	public void fatherName() {
		System.out.println("Father Name : Manimaran");
	}
	
	public static void main(String[] args) {
		
		FamilyInfo f = new FamilyInfo();
		f.motherInfo();
		f.fatherName();
	}
}
