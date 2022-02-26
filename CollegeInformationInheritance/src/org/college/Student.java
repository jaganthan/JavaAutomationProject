package org.college;

public class Student extends Hostel1{

		public void studentName() {
			
			System.out.println("Jaganathan");

		}
		
		public void studentDept() {
			
			System.out.println("CSE");

		}
		
		public void studentId() {
			
			System.out.println("210813104017");
		}
		
		public static void main(String[] args) {
			
			Student s = new Student();
			
			s.collegeName();
			s.collegeCode();
			s.collegeRank();
			
			s.studentName();
			s.studentDept();
			s.studentId();
			
			s.deptName();
			
			s.HostelName();
		}
}
