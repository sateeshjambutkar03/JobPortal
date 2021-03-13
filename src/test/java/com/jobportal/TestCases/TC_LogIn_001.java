package com.jobportal.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.jobportal.PageObject.LogInPage;

public class TC_LogIn_001 extends BaseClass{
	
	
	@Test
	public void logintest() throws InterruptedException
	{
		LogInPage obj2=new LogInPage(driver);
		obj2.loginpage(Username1, Password1);
		
		if(driver.getTitle().equals("ViewProfile"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
	}

}
