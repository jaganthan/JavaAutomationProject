package com.frameworkpara;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BaseclassPara{
	public PojoClass()
	{
		PageFactory.initElements(adactin, this);
	}
	@FindBy(id="username")
	private WebElement txtUser;
	
	@FindBy(id="password")
	private WebElement txtPass;
	
	@FindBy(id="login")
	private WebElement click;
	
	public WebElement getClick() {
		return click;
	}

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}
}
