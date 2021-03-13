package com.jobportal.TestCases;

import org.testng.annotations.Test;

import com.jobportal.PageObject.RegisterPage;

public class TC_Register_00 extends BaseClass {
	
	
	@Test
	public void regisetrnow() throws InterruptedException
	{
		
		RegisterPage obj1=new RegisterPage(driver);
		obj1.registeruser(Username1, Password1);
		
		/*
		 * if(driver.getTitle().equals("")) { Assert.assertTrue(true); } else {
		 * Assert.assertTrue(false); }
		 */
	
		
			
		
	}

}
