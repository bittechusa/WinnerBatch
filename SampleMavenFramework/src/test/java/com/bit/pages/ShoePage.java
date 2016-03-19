package com.bit.pages;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
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
	public void clickShoeProductWithWhileLoop() throws InterruptedException
	{
		/*
		dr.findElement(By.xpath(".//*[@id='slotMcolMain1']/div/div[2]/ul/li[1]/a/div/img")).click();
		List<WebElement>ele=dr.findElements(By.xpath("html/body/div[4]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/a"));
		while(dr.findElement(By.xpath("html/body/div[4]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/a[3]")).isDisplayed())
		{
			for(int i=1;i<=ele.size();i++)
			{
			 Thread.sleep(3000);
			dr.findElement(By.xpath("html/body/div[4]/div[1]/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[2]/div[2]/div/a["+i+"]")).click();
		    Thread.sleep(3000);
		}
			break;
		}*/
		/*while(5>4)
		{
			System.out.println("hi");
		}*/
		
		
		
		/*int a=2;
		do{
			
			System.out.println("hi");
			a++;
		}while(a>3);
		*/
		int s=dr.findElements(By.xpath("//ul[@id='main-nav-list']/li/a")).size();
		for(int i=1;i<s;i++)
		{
			WebElement e=dr.findElement(By.xpath("//ul[@id='main-nav-list']/li["+i+"]/a"));
			Actions ac=new Actions(dr);
			ac.moveToElement(e).build().perform();
			int s1=dr.findElements(By.xpath(".//*[@id='main-nav-woman']/div/div[2]/ul[2]/li/a")).size();
		//	.//*[@id='main-nav-shoes']/div/div[2]/ul[1]/li[2]/a
			for(int j=1;j<s1;j++)
			{
				dr.findElement(By.xpath(".//ul[@id='main-nav-list']/li["+i+"]/div/div[2]/ul[2]/li["+j+"]/a")).click();
				Thread.sleep(2000);
				WebElement e1=dr.findElement(By.xpath("//ul[@id='main-nav-list']/li["+i+"]/a"));
				Actions ac1=new Actions(dr);
				ac1.moveToElement(e1).build().perform();
				Thread.sleep(2000);

			}
		}
		
	}
	public void loopConcept() throws InterruptedException
	{
		//foreachloop or enhanced loop
		//List<WebElement> eles=dr.findElements(By.xpath(".//*[@id='slotMcolMain1']/div/div[2]/ul/li/a/div/img"));
		List<WebElement> eles=dr.findElements(By.tagName("a"));
		int s=eles.size();
		log.info(s);
		for(WebElement ele:eles)
		{
			log.info(ele.getText());
			/*ele.click();
			Thread.sleep(3000);
			dr.navigate().back();*/
		}
		
		
		
		
		//syntex: for(initialization;condition;increment/decreement){ //statement}
		
		/*
		for(int i=1;i<10;i++)
		{
			System.out.println("the value of i"+ i+" is right");
			
			
		}
		List<WebElement> ele=dr.findElements(By.xpath(".//*[@id='slotMcolMain1']/div/div[2]/ul/li/a/div/img"));
	
		
		int size=ele.size();
		
		for(int i=1;i<=size;i++)
		{
			dr.findElement(By.xpath(".//*[@id='slotMcolMain1']/div/div[2]/ul/li["+i+"]/a/div/img")).click();
			Thread.sleep(3000);
			dr.navigate().back();
		}
		*/
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
		
		dr.get("http://www.bluefly.com/a/shoes");
		log.info("assert fail");
	}

	@Override
	protected void isLoaded() throws Error {
		
		Assert.assertTrue(dr.getCurrentUrl().equals("http://www.bluefly.com/a/shoes"));
		log.info("assert pass");
	}
	

}
