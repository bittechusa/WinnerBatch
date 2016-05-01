package com.bit.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
	
FirefoxDriver dr;
	
	public LoginPage(FirefoxDriver dr)
	{
		this.dr=dr;
	}
	public void enteruserid()
	{
		dr.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtUserName']")).sendKeys("sdfsd");
		
	}
	
	public void enterpass()
	{
		dr.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_txtPass']")).sendKeys("2134");
		
	}
	public void clicklogin()
	{
		dr.findElement(By.xpath(".//*[@id='ContentPlaceHolder1_btnLogin']")).click();
		
	}

}
