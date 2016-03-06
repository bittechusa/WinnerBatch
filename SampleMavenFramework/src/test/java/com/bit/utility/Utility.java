package com.bit.utility;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bit.test.BaseTest;

public class Utility 
{
	FirefoxDriver dr;
	Logger log=Logger.getLogger(Utility.class);
	public Utility(FirefoxDriver dr)
	{
		this.dr=dr;
	}
	public void click(By by)
	{
		dr.findElement(by).click();
	}
	public void verifyTitle(String title)
	{
		if(dr.getTitle().contains(title))
		{
			log.info(title +" is present title");
		}
		else
			log.info(title +" is not present title");
	}

}
