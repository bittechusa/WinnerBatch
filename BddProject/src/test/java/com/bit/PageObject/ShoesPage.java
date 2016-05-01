package com.bit.PageObject;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ShoesPage 
{
	FirefoxDriver dr;
	
	ShoesPage(FirefoxDriver dr)
	{
		this.dr=dr;
	}
	
	public void verifyShoesPageTitle()
	{
		System.out.println(dr.getTitle());
	}

}
