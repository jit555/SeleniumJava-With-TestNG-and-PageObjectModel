package com.banking.baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	
	public String baseURL="https://demo.guru99.com/V1/index.php";
    public String username="mngr578858";
    public String password="avUsyna";
    public static WebDriver driver;
    
    @BeforeClass
    public void setup()
    {
    	driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get(baseURL);
    	
 
    }
    
    @AfterClass
    public void tearDown()
    {
    	driver.quit();
    }

}
