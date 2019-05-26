package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatinganAccountWebObjects {
	
	public CreatinganAccountWebObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="dtAccount")
	public WebElement My_Account;
	
	@FindBy(linkText="Create An Account")
	public WebElement Create_An_Account;
}
