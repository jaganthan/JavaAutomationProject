package org.emp;

public class Employee {
	
	private void empId() {
		
		System.out.println("ID : 0505");
		
	}
	
	private void empName() {
		
		System.out.println("Name : Jagan");
	}
	
	private void empDob() {
		// TODO Auto-generated method stub
			System.out.println("DOB : 25/03/95");
		
	}
	
	private void empPhone() {
		// TODO Auto-generated method stub
			
		System.out.println("Ph.No : 8072267883");
	}
	
	private void empEmail() {
		// TODO Auto-generated method stub

		System.out.println("Email : manijagan2595@gmail.com");
	}
	
	private void empAddress() {
		// TODO Auto-generated method stub
		
		System.out.println("Address : 136, chennai - 62");
	}
	
	public static void main(String[] args) 
	{
		Employee j = new Employee();
		
		j.empId();
		j.empName();
		j.empDob();
		j.empPhone();
		j.empEmail();
		j.empAddress();
	}
}
