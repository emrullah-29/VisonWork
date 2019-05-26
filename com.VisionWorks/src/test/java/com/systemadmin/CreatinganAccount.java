package com.systemadmin;

import org.testng.annotations.Test;

import com.ObjectRepository.CreatinganAccountWebObjects;
import com.ObjectRepository.New_To_VisionWork;
import com.ObjectRepository.Sign_InPadgeObjects;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CreatinganAccount {
	
	WebDriver driver;
	
	
	@BeforeTest
	
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.visionworks.com/");
	}

	@Test
	public void clickTomyAccount() {
		CreatinganAccountWebObjects accountclick = new CreatinganAccountWebObjects(driver);
		accountclick.My_Account.click();
		accountclick.Create_An_Account.click();
		New_To_VisionWork account = new New_To_VisionWork(driver);
		account.FirstName.sendKeys("Farhan");
		account.LastName.sendKeys("Khan");
		account.Email.sendKeys("oknarf786@gmail.com");
		account.Conf_Email.sendKeys("oknarf786@gmail.com");
		account.Creat_Password.sendKeys("123Weare");
		account.Conf_Creat_Password.sendKeys("123Weare");
		account.Agree_To.click();
		account.Cheack_this.click();
		account.Agree_Create_Button.click();
		Sign_InPadgeObjects signIn = new Sign_InPadgeObjects(driver);
    	signIn.email.sendKeys("oknarf786@gmail.com");
    	signIn.password.sendKeys("123Weare");
    	signIn.Login.click();
    	
		
	}
	
 

	
	@AfterTest
	public void closeUp() {
		driver.close();
		driver.quit();
	}
}
