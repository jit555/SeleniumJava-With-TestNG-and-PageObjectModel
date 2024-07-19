package com.banking.TestCases;

import org.testng.annotations.Test;

import com.banking.baseClass.BaseClass;
import com.banking.pageObjects.LoginPage;

public class LoginTestCase extends BaseClass{
	
	@Test
	public void loginMethodTestCase() 
	{
		LoginPage lp= new LoginPage(driver);
		lp.loginMethod(username, password);
		
	}
	

}
