package com.banking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.banking.baseClass.BaseClass;

public class LoginPage extends BaseClass{
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath="//input[@name='uid']")
	WebElement uname;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement pwd;
	
	@FindBy(xpath="//input[@value='LOGIN']")
	WebElement lgn;
	
	public void loginMethod(String uname01, String pwd01)
	{
		uname.sendKeys(uname01);
		pwd.sendKeys(pwd01);
		lgn.click();
	}


}
