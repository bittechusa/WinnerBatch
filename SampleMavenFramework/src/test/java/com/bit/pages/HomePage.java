 package com.bit.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bit.utility.Utility;

public class HomePage
{
	FirefoxDriver dr;
	Utility ut;
	@FindBy(how=How.XPATH, using="//ul[@id='main-nav-list']/li[2]/a")
	WebElement shoeLink;
	
	//public WebElement shoeLink=dr.findElement(By.xpath(".//*[@id='main-nav-shoes']/a"));
	public HomePage(FirefoxDriver dr)
	{
		this.dr=dr;
		PageFactory.initElements(dr, this);
	}
	
	public void verifyHomeTitle()
	{
		ut=new Utility(dr);
		ut.verifyTitle("bluefly");
	}
	public ShoePage clickShoeLink()
	{
		shoeLink.click();
		//ut=new Utility(dr);
		//ut.click(shoeLink);
		System.out.println("shoe");
		return new ShoePage(dr);
	}
	

}
