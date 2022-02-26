package com.juitframework;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass  extends BaseClass{
	public PojoClass() {
		PageFactory.initElements(adactin, this);
	}
	 @FindBy(id="username")
	 private WebElement username;
	 public WebElement getUsername() {
		return username;
	}
	@FindBy(id="password")
	private WebElement password;
	public WebElement getPassword() {
	return password;
	}
	@FindBy(id="login")
	private WebElement click;
	public WebElement getClick() {
		return click;
	}
}