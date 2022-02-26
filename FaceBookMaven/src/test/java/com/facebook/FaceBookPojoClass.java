package com.facebook;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FaceBookPojoClass extends FaceBookBaseClass{
	public FaceBookPojoClass() {
		PageFactory.initElements(fac, this);
	}
	
	@FindBy(id="email")
	private WebElement passEmail;

	public WebElement getPassEmail() {
		return passEmail;
	}
	
	@FindBys({
		@FindBy(xpath="//input[@type='password']")
		
	})
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	
	@FindAll({
		@FindBy(xpath="//button[@id='u_0_d_Xc']"),
		@FindBy(xpath="//button[contains(text(),'Log In')]"),
		@FindBy(xpath="//button[contains(text(),'akjsdh In')]")
	})
	private WebElement clickBtn;
	public WebElement getclickBtn() {
		return clickBtn;
	}
}

