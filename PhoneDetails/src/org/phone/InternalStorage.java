package org.phone;

public class InternalStorage {

	private void processorName() {
		
		System.out.println("Intel i5");
		
	}
	
	private void ramSize() {

		System.out.println("8 GB");
		
	}
	
	public static void main(String[] args) {
			
		InternalStorage i = new InternalStorage();
		
		i.processorName();
		i.ramSize();
		
		ExternalStorage e = new ExternalStorage();
		
		e.size();
	}
		
}
