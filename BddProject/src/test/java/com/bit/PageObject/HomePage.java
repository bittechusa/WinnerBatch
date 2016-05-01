package com.bit.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage 
{
	FirefoxDriver dr;
	
	public HomePage(FirefoxDriver dr)
	{
		this.dr=dr;
	}
	
	public LoginPage clicklogin()
	{
		dr.findElement(By.xpath(".//*[@id='me-header']/div[1]/div/ul/li[2]/a/strong")).click();
		return new LoginPage(dr);
	}
	
	public void searchProducts(String value)
	{
		dr.findElement(By.xpath(".//*[@id='globalSearchInputField']")).sendKeys(value);
	}
	
	public SerchResultPage clickSearchButton()
	{
		dr.findElement(By.xpath(".//*[@id='subnavSearchSubmit']")).click();
		return new SerchResultPage();
	}
	
	
	

}
