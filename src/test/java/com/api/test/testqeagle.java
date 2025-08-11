package com.api.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class testqeagle {
	
	WebDriver driver = New WebDriver();
	
	System.setProperty = driver Chromedriver ("");
	driver.get ("https://opensource-demo.orangehrmlive.com");
	driver.manage().window().maximize();
	
	WebElement userName = driver.findElement("//input[@name='username']").click();
	userName.sendKeys("Admin");
	
	WebElement password = driver.findElement("//input[@name='password'])").click();
	password.sendKeys("admin123");
	
	driver.findElement("//button[@type='submit']").click();
	
	WebdElement pim = driver.findElement("//*[text()='PIM']").click();
	
			driver.findElement("(//button[@type='button'])[4]").click();
		WebElement empStatus = 	driver.findElement("(//*[contains (text(),'Select ')])[1]").click();
		
		list listempStatus = 
				
			driver.findElement("//button[@type='submit']").click();
		
		WebElement result = driver.findElement("//span[text()=' (7) Records Found']") ;
		System.out.println(result);
		
		driver.close();
			
	
	

	

}
