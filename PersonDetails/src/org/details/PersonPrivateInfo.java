package org.details;

public class PersonPrivateInfo extends PersonInfo {
	
			public void phNo() {
				System.out.println("Phone number : 8072267883");
			}
			public void dob() {
				System.out.println("Date Of Birth : 25/03/1995");
			}
			public void age() {
				System.out.println("Age : 26");
			}
			public void gender() {
				System.out.println("Gender : Male");
			}
			
			public static void main(String[] args) {
				PersonPrivateInfo p = new PersonPrivateInfo();
				p.personName();
				p.age();
				p.dob();
				p.gender();
				p.phNo();
			}
			
			
}
