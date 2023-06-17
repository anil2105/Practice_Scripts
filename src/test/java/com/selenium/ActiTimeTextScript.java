package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTimeTextScript 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://localhost/login.do");
		
		driver.navigate().refresh();
		System.out.println("Refreshed..........");
		
		ActiTimePOM a1=new ActiTimePOM(driver);
				a1.setUserName("admin");
				a1.setPassword("manager");
				a1.clickOnCheckBox();
				a1.clickOnLoginBtn();
				a1.clickOnLogoutBtn();
				a1.clickOnAvtiTimeInc();
				
		Thread.sleep(2000);
		driver.quit();
		
		System.out.println("Executed..........");
	}

}
