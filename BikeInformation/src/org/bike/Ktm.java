package org.bike;

public class Ktm implements Bike{
	
	@Override
	public void cost(long cost) {
	
		System.out.println("Bike age is :" +  cost);
	}
	
	@Override
	public void speed(float speed) {
		
		System.out.println("Bike Id is : " + speed);
	}
	
	public static void main(String[] args) {
		
		Ktm k = new Ktm();
		k.cost(2623l);
		k.speed(234.56f);
		
	}
}
