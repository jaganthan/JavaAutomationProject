package org.bank;

public class AxisBank extends BankInfo{
	
	@Override
	public void deposit() {
		
		System.out.println("Deposit Amount is 78%");
	}
	
	public static void main(String[] args) {
		
		AxisBank a = new AxisBank();
		
		a.deposit();
		a.fixed();
		a.saving();
	}
}
