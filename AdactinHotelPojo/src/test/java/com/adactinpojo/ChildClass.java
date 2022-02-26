package com.adactinpojo;

import java.io.IOException;

public class ChildClass extends PojoClass{
	public static void main(String[] args) throws IOException, InterruptedException {
		launchBrowser();
		maximize();
		passUrl("https://adactinhotelapp.com/");
		waitTime();
		PojoClass p = new PojoClass();
		sendTxt(p.getUsername(),excelSheet(1, 0));
		sendTxt(p.getPassword(),excelSheet(1,1));
		buttonClick(p.getClick());
	}
}
