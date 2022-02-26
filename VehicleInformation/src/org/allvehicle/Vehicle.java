package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheller;

public class Vehicle {

	public void VehicleNecessery() {
		
		System.out.println("Vehicle Name : BMW");
		
	}
	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		
		v.VehicleNecessery();
		
	TwoWheller t = new TwoWheller();
	
		t.bike();
		t.cycle();
	
	ThreeWheeler t1 = new ThreeWheeler();
	
		t1.auto();
		
	FourWheeler f = new FourWheeler();
		
		f.bus();
		f.car();
		f.lorry();
		
		
	}
}
