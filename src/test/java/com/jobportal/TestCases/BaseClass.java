package com.jobportal.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public String baseURL1="http://jobportal.gayasofttech.com/?";
	public String Username1="satishjambutkar21@gmail.com";
	public String Password1="S7498227274#s";
	public WebDriver driver;
	
	@BeforeClass
	public void setup() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseURL1);
		Thread.sleep(3000);
	}
	
	@AfterClass
	public void teardown()
	{
		driver.close();
	}

}
