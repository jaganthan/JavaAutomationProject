package org.transport;

import org.road.Road;
import org.air.Air;
import org.water.Water;

public class Transport {

	public void transportForm() {
		
		System.out.println("Transport Form");
		
	}
	
	public static void main(String[] args) {
		 Air a = new Air();
		 
		 a.aeroPane();
		 
		 Road r = new Road();
		 
		 r.bike();
		 r.bus();
		 r.car();
		 r.cycle();
		 
		 Transport t = new Transport();
		 
		 t.transportForm();
		 
		 Water w = new Water();
		 
		 w.boat();
		 w.ship();
		 
	}
}
