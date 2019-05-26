package com.systemadmin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.ObjectRepository.Cheack_Out_PadgeObjects;
import com.ObjectRepository.Prescription_PadgeObjects;
import com.ObjectRepository.Sign_InPadgeObjects;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cheack_Out_Lenses {
	
	
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
	public void checkOut() {
		Cheack_Out_PadgeObjects lenses = new Cheack_Out_PadgeObjects(driver);
		lenses.Contacat_Lenses_Button.click();
		lenses.Aquatech.click();
		
		/*List<WebElement> listElement = driver.findElements(By.tagName("ul"));
		for(int i =0;i<listElement.size();i++) {
		 String elementText = listElement.get(i).getText(); 
		 System.out.println(elementText);  
		}*/
		
	    lenses.Aquatech_Plus.click();
	    Prescription_PadgeObjects out = new Prescription_PadgeObjects(driver);
	    out.firstName.sendKeys("Farhan");
	    out.lastName.sendKeys("Kahan");
	    
	    Select month = new Select(driver.findElement(By.name("patientMonth")));
        month.selectByVisibleText("01");
        
        Select day = new Select(driver.findElement(By.name("patientDay")));
        day.selectByVisibleText("01");
        
        Select year = new Select(driver.findElement(By.name("patientYear")));
        year.selectByVisibleText("1979");
        
        Select gender = new Select(driver.findElement(By.name("gender")));
        gender.selectByVisibleText("Male");
        
        //--------------------------------------------------------------------//
        
        Select state = new Select(driver.findElement(By.name("state")));
        state.selectByVisibleText("TX");
        
        Select month2 = new Select(driver.findElement(By.name("prescriptionMonth")));
        month2.selectByVisibleText("01");
        
        Select day2 = new Select(driver.findElement(By.name("prescriptionDay")));
        day2.selectByVisibleText("01");
        
        Select year2 = new Select(driver.findElement(By.name("prescriptionYear")));
        year2.selectByVisibleText("2019");
        
        //-------------------------right------------------------------------------//
        
        Select right = new Select(driver.findElement(By.name("rightBC")));
        right.selectByVisibleText("8.60");
        
        Select dia = new Select(driver.findElement(By.name("rightDIA")));
        dia.selectByVisibleText("14.10");
        
        Select rpower = new Select(driver.findElement(By.name("rightpower")));
        rpower.selectByVisibleText("-5.75");
        
        Select rightadvance = new Select(driver.findElement(By.name("rightadvance")));
        rightadvance.selectByVisibleText("High (+2.25 to +3.00)");
        
        //-------------------------left------------------------------------------//
         
        Select left = new Select(driver.findElement(By.name("leftBC")));
        left.selectByVisibleText("8.60");
        
        Select ldia = new Select(driver.findElement(By.name("leftDIA")));
        ldia.selectByVisibleText("14.10");
        
        Select lpower = new Select(driver.findElement(By.name("leftpower")));
        lpower.selectByVisibleText("-5.75");
        
        Select leftadvance = new Select(driver.findElement(By.name("leftadvance")));
        leftadvance.selectByVisibleText("Low (up to +2.25)");
        
        //-----------------------------------------------------------------------//
         
         out.Submit_Button.click();
         out.Adding_to_Cart.click();
        
        
 		List<WebElement> listElement2 = driver.findElements(By.tagName("ul"));
 		for(int i =0;i<listElement2.size();i++) {
 		 String elementText = listElement2.get(i).getText(); 
 		 System.out.println(elementText);  
 		}
	 
 		out.Adding_to_Cart_Out.click();
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


