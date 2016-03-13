package com.bit.utility;

//<<<<<<< HEAD
import java.util.concurrent.TimeUnit; 
import java.util.function.Function;
//=======
import java.util.concurrent.TimeUnit;
//import java.util.function.Function;
//>>>>>>> bcc2fff0b2071ae7fe2052d907e6c9a70ad5b804

import org.apache.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Utility 
{
	static FirefoxDriver dr;
	Logger log=Logger.getLogger(Utility.class);
	
	public Utility(FirefoxDriver dr)
	{
		this.dr=dr;
	}
	public void click(WebElement by)
	{
		by.click();
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
	
	public void verifyElement(WebElement ele)
	{
		try{
			if(ele.isDisplayed())
				
				{
					log.info(ele+"is present");
				}
			}
		catch(NoSuchElementException e)
				{
					log.info(ele+" not present");
				}
	}
	public static WebElement waitForElement(WebElement ele)
	{
		WebDriverWait wait=new WebDriverWait(dr,10);
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		return ele;
	}
	public void fluentWaitForElement(WebElement ele)
	{
		FluentWait<WebElement> wait=new FluentWait<WebElement>(ele);
		wait.pollingEvery(40, TimeUnit.SECONDS);
		wait.pollingEvery(2, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
		
		Function<WebElement,Boolean> f=new Function<WebElement,Boolean>()
		{

			public Boolean apply(WebElement t)
			{
			//	System.out.println("wait");
				log.info("wait");
				if(t.isDisplayed())
				{
					System.out.println("present");
					return true;
				}else
					
				return false;
			}

			};
	   f.apply(ele);
	}
	
	

}
