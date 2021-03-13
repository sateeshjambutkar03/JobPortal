package com.jobportal.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
	public WebDriver driver;
	
	@FindBy(xpath="//a[@class='signin']")
	WebElement registernow;
	@FindBy(xpath="//select[@id='dropdownUsr']")
	WebElement selectusertype;
	@FindBy(xpath="//input[@id='EnteredEmail']")
	WebElement emailid;
	@FindBy(xpath="//input[@id='Password']")
	WebElement passwd;
	@FindBy(xpath="//input[@id='MobileNo']")
	WebElement mobileno;
	@FindBy(xpath="//input[@id='btnsave']")
	WebElement register;
	
	public RegisterPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void registeruser(String uname, String Pass) throws InterruptedException
	{
		registernow.click();
		Thread.sleep(3000);
		Select oselect=new Select(selectusertype);
		oselect.selectByVisibleText("Jobseeker");
		Thread.sleep(3000);
		emailid.sendKeys(uname);
		Thread.sleep(3000);
		passwd.sendKeys(Pass);
		Thread.sleep(3000);
		mobileno.sendKeys("7498227274");
		Thread.sleep(3000);
		register.click();
		Thread.sleep(3000);
		
		
	}

}
