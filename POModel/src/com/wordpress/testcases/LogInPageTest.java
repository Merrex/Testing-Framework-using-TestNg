package com.wordpress.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.wordpress.config.ExcelConfig;
import com.wordpress.pages.LogInPage;

public class LogInPageTest {
	
	WebDriver driver;
	
	@Test
	public void verifyLogInPage()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Test Docs\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.manage().window().maximize();
		
		ExcelConfig data=new ExcelConfig("D:\\Test Docs\\ExcelData\\LoginData.xlsx");
		
		LogInPage login=new LogInPage(driver);
		login.typeUsername(data.getData(0, 1, 0));
		login.typePassword(data.getData(0, 1, 1));
		login.clickContinue();
		
		try {
			Thread.sleep(5000);
			data.closeSheet();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		driver.quit();
		
	}

}
