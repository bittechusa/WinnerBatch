package com.bit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bit.utility.Utility;

public class HomePage
{
	FirefoxDriver dr;
	Utility ut;
	public String shoeLink=".//*[@id='main-nav-shoes']/a";
	public HomePage(FirefoxDriver dr)
	{
		this.dr=dr;
	}
	
	public void verifyHomeTitle()
	{
		ut=new Utility(dr);
		ut.verifyTitle("bluefly");
	}
	public ShoePage clickShoeLink()
	{
		ut=new Utility(dr);
		ut.click(By.xpath(shoeLink));
		return new ShoePage(dr);
	}
	

}
