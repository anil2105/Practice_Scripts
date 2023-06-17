package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePOM 
{
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement checkBox;
	
	@FindBy(id="loginButton")
	private WebElement loginBtn;
	
	@FindBy(id="logoutLink")
	private WebElement logOutBtn;
	
	@FindBy(xpath = "//a[text()='actiTIME Inc.']")
	private WebElement actiTimeInc;
	
	
	public ActiTimePOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void setPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void clickOnCheckBox()
	{
		checkBox.click();
	}
	
	public void clickOnLoginBtn()
	{
		loginBtn.click();
	}
	
	public void clickOnLogoutBtn()
	{
		logOutBtn.click();
	}
	
	public void clickOnAvtiTimeInc()
	{
		actiTimeInc.click();
	}
	
}

