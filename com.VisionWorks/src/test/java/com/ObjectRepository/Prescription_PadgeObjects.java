package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Prescription_PadgeObjects {
	
	public Prescription_PadgeObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name="firstName")  
	 public WebElement firstName;
	
	@FindBy(name="lastName")  
	 public WebElement lastName;
	
	
	@FindBy(xpath="//button[@class='btn btn-primary center-block btn-apply']")  
	 public WebElement Submit_Button;
	
	//-----------------adding to cart-------------//
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-primary btn-addToCart center-block']")  
	 public WebElement Adding_to_Cart;
	
	
	@FindBy(css=".col-md-offset-3.col-sm-5 > button.btn.btn-primary.btn-lg.center-block.btn-checkout")  
	 public WebElement Adding_to_Cart_Out;
	

}
