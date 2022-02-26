package org.company;

public class CompanyInfo {
	
	private void companyName() {
		
		System.out.println("TVS");
	}
	
	private void companyId() {
		
		System.out.println("1928");
	}
	
	private void companyAddress() {
		
		System.out.println("chennai - 62");
	}
	
	public static void main(String[] args) {
		
		CompanyInfo c = new CompanyInfo();
		
		c.companyName();
		c.companyId();
		c.companyAddress();
	}

}
