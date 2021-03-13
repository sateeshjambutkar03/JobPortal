package com.jobportal.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@href='/Account/LoginPage']")
	WebElement signin;
	@FindBy(xpath="//input[@id='EmailId']")
	WebElement email;
	@FindBy(xpath="//input[@id='Password']")
	WebElement password;
	@FindBy(xpath="//input[@value='Log In']")
	WebElement login;
	
	public LogInPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void loginpage(String uname, String pass) throws InterruptedException
	{
		signin.click();
		Thread.sleep(3000);
		email.sendKeys(uname);
		Thread.sleep(3000);
		password.sendKeys(pass);
		Thread.sleep(3000);
		login.click();
		Thread.sleep(3000);
	}

}
