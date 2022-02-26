package org.college;

public class College {
	
	public void collegeName() {
		// TODO Auto-generated method stub
		
		System.out.println("College Name : Kings Engineering College");
		
	}
	
	public void collegeCode() {
		// TODO Auto-generated method stub
			
		System.out.println("Code : 2108");
		
	}
	
	public void collegeRank() {
		// TODO Auto-generated method stub
		
		System.out.println("Rank : #1");
	}
	
	public static void main(String[] args)
	{
		
		Student s = new Student();
		
		s.studentName();
		s.studentDept();
		s.studentId();
	
College c = new College();
		
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		
Dept d = new Dept();
		
		d.deptName();
		
Hostel h = new Hostel();
		
		h.hostelName();
	}
}
