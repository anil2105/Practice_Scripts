package com.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindows
{
	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver", ".//drivers//chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
			int count = allWindows.size();
			System.out.println("Total windows: "+count);
			
			/*
			 * List<String> winIds=new ArrayList(allWindows);
			 * 
			 * String parentWindow = winIds.get(0); 
			 * String parentWindowTitle = driver.switchTo().window(parentWindow).getTitle();
			 * System.out.println("Parent window Title: "+parentWindowTitle);
			 * 
			 * String childWindow = winIds.get(1); 
			 * String childwindowTitle = driver.switchTo().window(childWindow).getTitle();
			 * System.out.println("Child window title: "+childwindowTitle);
			 */
		
		for(String win : allWindows)
		{
			String title = driver.switchTo().window(win).getTitle();
			System.out.println(title);
			
			if(title.equals("OrangeHRM")) //title.contains("  ")
			{
				driver.close();
				System.out.println("Parent window closed........");
			}
		}
		
		driver.close();
		System.out.println("Child window closed............");
		
		//driver.quit(); //closes all the windows
	}	
}
