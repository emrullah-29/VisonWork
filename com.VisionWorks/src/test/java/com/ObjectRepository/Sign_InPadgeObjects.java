package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sign_InPadgeObjects {

	
	public Sign_InPadgeObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="userlogin")
	public WebElement email;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(id="submitLogin")
	public WebElement Login;
	
}


