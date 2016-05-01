package com.bit.PageObject;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	FirefoxDriver dr;
	
	public void start()
	{
		dr = new FirefoxDriver();
		dr.manage().window().maximize();
		dr.get("http://www.macys.com");
	}
	
	public void end() throws InterruptedException
	{
		Thread.sleep(3000);
		dr.quit();
	}

}
