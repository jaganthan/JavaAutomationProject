
package org.emp;

public class Employee {
	
	private void empId(byte age) {
	
		System.out.println("Age : " + age);
	}
	
	private void empId(short Id) {
		
		System.out.println("Id : " + Id);
	}
	
	private void empId(String name) {
		
		System.out.println("Name : " + name);
	}
	
	public static void main(String[] args) {
		
		Employee e = new Employee();
		
		e.empId((short)264);
		e.empId("Jaganathan");
		e.empId((byte)34);
		
	}
}

