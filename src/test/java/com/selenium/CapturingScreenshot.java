package com.selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CapturingScreenshot 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		driver.get("https://demo.nopcommerce.com/");
		
		//Full Page Screenshot
		TakesScreenshot ts=(TakesScreenshot)driver; 
		File src = ts.getScreenshotAs(OutputType.FILE); 
		File trg = new File(".//screenshots//homepage.png");
		FileUtils.copyFile(src, trg);
		 
		//Section of Page Screenshot --> no need of TakesScreenshot intreface
		
		  WebElement section = driver.findElement(By.xpath("//body/div[6]/div[3]/div/div/div/div/div[4]"));
		  File src1 = section.getScreenshotAs(OutputType.FILE); 
		  File trg1 = new File(".//screenshots//featuredproducts.png"); 
		  FileUtils.copyFile(src1, trg1);
		 
		
		//Element Screenshot --> no need of TakesScreenshot intreface
		
		  WebElement ele = driver.findElement(By.xpath("//body/div[6]/div/div[2]/div/a/img")); 
		  File src2= ele.getScreenshotAs(OutputType.FILE); 
		  File trg2 = new File(".//screenshots//logo.png"); 
		  FileUtils.copyFile(src2, trg2);
		 
		Thread.sleep(3000);
		driver.close();
	}
}
