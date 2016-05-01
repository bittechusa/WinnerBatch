package com.bit.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MenPage 
{
	FirefoxDriver dr;
	
	MenPage(FirefoxDriver dr)
	{
		this.dr=dr;
	}
	
	public ShoesPage clickShoesImage()
	{
		dr.findElement(By.xpath(".//*[@id='row3_column1']/ul/li[1]/div/a/img")).click();
		return new ShoesPage(dr);
	}

}
