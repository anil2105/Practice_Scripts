package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleElements 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.ideapoke.com/growthleader.html");
				
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='owl-stage']/div"));
		
		//Count all the links 
		int count = allLinks.size();
		System.out.println("Total links: "+count);
		
		//Print all the links 
		
		/*
		 * for (int i = 0; i<count; i++) 
		 * { 
		 * 		String text = allLinks.get(i).getText();
		 * 		System.out.println(text); 
		 * }
		 */
		
		  for(WebElement ele:allLinks) 
		  { 
		  		System.out.println(ele.getText()); 
		  }
		 
		
	    //Click on any one link except Amazon
		allLinks.get(1).click();
		
		Thread.sleep(3000);
		driver.close();
				
	}

}
