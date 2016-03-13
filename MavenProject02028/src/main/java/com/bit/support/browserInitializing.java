package com.bit.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browserInitializing 
{

	WebDriver dr;
	
	public void opeBroser()
	{
		
		String s=System.getProperty("browser");
		
		if(s.equals("firefox"))
		{
			dr=new FirefoxDriver();
			dr.get("http://www.eshopper24.com");
			dr.manage().window().maximize();
		}
		else if(s.equals("chrome"))
		{
		
			System.setProperty("webdriver.chrome.driver", "C:/Driver/Chrome/chromedriver.exe");
			dr=new ChromeDriver();
			dr.get("http://www.eshopper24.com");
			dr.manage().window().maximize();
		}
		else if(s.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:/Driver/IE/MicrosoftWebDriver.exe");
			dr=new InternetExplorerDriver();
			dr.get("http://www.eshopper24.com");
			dr.manage().window().maximize();
		}
		else
		{
			dr=new FirefoxDriver();
			dr.get("http://www.eshopper24.com");
			dr.manage().window().maximize();
		}
		
	}
	
	public void closeBroser()
	{
		dr.close();
	}
	
}
