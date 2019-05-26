package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class New_To_VisionWork {
	

	public New_To_VisionWork(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="firstName")
	public WebElement FirstName;
	
	@FindBy(name="lastName")
	public WebElement LastName;
	
	
	@FindBy(name="email")
	public WebElement Email;
	
	
	@FindBy(name="confirmEmail")
	public WebElement Conf_Email;
	
	
	@FindBy(id="registerPassword")
	public WebElement Creat_Password;
	
	
	@FindBy(id="confirmPassword")
	public WebElement Conf_Creat_Password;
	
	
	@FindBy(name="agree")
	public WebElement Agree_To;
	
	@FindBy(name="registerAgreePolicy")
	public WebElement Cheack_this;
	
	@FindBy(id="submitRegister")
	public WebElement Agree_Create_Button;



}
