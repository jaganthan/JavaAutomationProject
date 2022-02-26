package com.facebook;

public class FaceBookChildClass extends FaceBookBaseClass{
	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		maximize();
		passUrl("https://facebook.com");
		
		FaceBookPojoClass pojo = new FaceBookPojoClass();
		
		toInput(pojo.getPassEmail(), "jagan.cool95@gmail.com");
		toInput(pojo.getPassword(),"Qwerty@123");
		buttonClick(pojo.getclickBtn());
		Thread.sleep(2000);
		backpage();
		refresh();
		toInput(pojo.getPassEmail(), "jagan.cool95@gmail.com");
		toInput(pojo.getPassword(),"Qwerty@123");
		buttonClick(pojo.getclickBtn());
	}
}
