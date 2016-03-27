 package com.bit.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.bit.utility.Utility;

public class HomePage
{
	Logger log=Logger.getLogger(HomePage.class);
	WebDriver dr;
	Utility ut;
	@FindBy(how=How.XPATH, using="//ul[@id='main-nav-list']/li[2]/a")
	WebElement shoeLink;
	
	//public WebElement shoeLink=dr.findElement(By.xpath(".//*[@id='main-nav-shoes']/a"));
	public HomePage(WebDriver dr2)
	{
		this.dr=dr2;
		PageFactory.initElements(dr2, this);
	}
	public void hverOverOnMenu()
	{
		ut=new Utility(dr);
		ut.mouseOver(shoeLink);
	}
	
	public void verifyHomeTitle()
	{
		ut=new Utility(dr);
		ut.verifyTitle("bluefly");
		int size= ut.getCountLink(By.tagName("a"));
		log.info("link count "+size);
	}
	public void searchText()
	{
		ut=new Utility(dr);
		ut.typeOntext(dr.findElement(By.xpath(".//*[@id='searchterms']")), "women");
		ut.click(dr.findElement(By.xpath(".//*[@id='homeContainer']/header/div[1]/div[2]/div[2]/form/span[2]")));
	}
	
	
	
	public ShoePage clickShoeLink()
	{
		shoeLink.click();
		/*ut=new Utility(dr);
		String test=ut.getTextFromElement(shoeLink);
		if(test.equals("Shofds"))
		{
		shoeLink.click();
		log.info("clicked");
		}
		else
			log.info(ut.getAttributeFromElement(shoeLink));
		//ut=new Utility(dr);
		//ut.click(shoeLink);
		System.out.println("shoe");*/
		return new ShoePage(dr);
	}
	

}
