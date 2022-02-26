package com.gmailtestng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class PojoClassGmail extends BaseClassGmail{
	public PojoClassGmail() {
	
		PageFactory.initElements(gmail, this);
	}
	
	@FindBy(id="identifierId")
	private WebElement txtuser;
	
	@FindBy(className="VfPpkd-RLmnJb")
	private WebElement clickBtn;
	
	
	@FindBys({
		
		@FindBy(xpath="//div[contains(text(),'Enter your password')]")
	})
	private WebElement txtpass;


	public WebElement getTxtuser() {
		return txtuser;
	}


	public WebElement getClickBtn() {
		return clickBtn;
	}


	public WebElement getTxtpass() {
		return txtpass;
	}
}
