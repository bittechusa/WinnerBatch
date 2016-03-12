package com.bit.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.Assert;

import com.bit.utility.Utility;

public class ShoePage extends LoadableComponent<ShoePage>
{
	FirefoxDriver dr;
	Utility ut;
	Logger log=Logger.getLogger(Utility.class);
	@FindBy(how=How.XPATH , using=".//*[@id='slotMcolMain1']/div/div[2]/ul/li[1]/a/div/img")
	WebElement shoeProduct;
	

	public ShoePage(FirefoxDriver dr)
	{
		this.dr=dr;
	PageFactory.initElements(dr, this);
	}
	
	public void verifyShoeTitle()
	{
		ut=new Utility(dr);
		ut.verifyTitle("shoe");
	}
	
	public ProdaShoe clickShoeProduct()
	{
		//shoeProduct.click();
		ut=new Utility(dr);
		//ut.waitForElement(shoeProduct);
		ut.fluentWaitForElement(shoeProduct);
		log.info("fluent");
		ut.click(shoeProduct);
		return new ProdaShoe();
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		dr.get("http://www.bluefly.com/a/shoes");
		log.info("assert fail");
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		Assert.assertTrue(dr.getCurrentUrl().equals("http://www.bluefly.com/a/shoes"));
		log.info("assert pass");
	}
	

}
