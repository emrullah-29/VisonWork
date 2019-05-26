package com.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cheack_Out_PadgeObjects {
	
	public Cheack_Out_PadgeObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText="CONTACT LENSES")  
	 public WebElement Contacat_Lenses_Button;
	
	@FindBy(xpath="//li[@class='dropdown hidden-xs open']//li[3]//a[1]//img[1]")
	public WebElement Aquatech;
	
	@FindBy(linkText="Aquatech Plus 1Day Multifocal 90 PK")
	public WebElement Aquatech_Plus;
	
	
	
	
	
	
	
	
	
	
	
	
}


