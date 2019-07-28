package com.wordpress.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LogInPage {

	WebDriver driver;
	By username=By.id("user_login");
	By pass=By.id("user_pass");
	By continueButton=By.xpath("//input[@type='submit']");
	
	
	
	public LogInPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void typeUsername(String username)
	{
		driver.findElement(this.username).sendKeys(username);
	}
	
	public void clickContinue()
	{
		driver.findElement(continueButton).click();
	}
	
	public void typePassword(String password)
	{
		driver.findElement(pass).sendKeys(password);
	}
	
}
