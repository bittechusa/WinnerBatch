package com.bit.utility;

import java.io.File;
import java.io.IOException;
//<<<<<<< HEAD
import java.util.concurrent.TimeUnit; 
import java.util.function.Function;
//=======
import java.util.concurrent.TimeUnit;
//import java.util.function.Function;
//>>>>>>> bcc2fff0b2071ae7fe2052d907e6c9a70ad5b804

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Utility 
{
	static WebDriver dr;
	Logger log=Logger.getLogger(Utility.class);
	
	public Utility(WebDriver dr2)
	{
		this.dr=dr2;
	}
	@Test
	public static void reverseString()
	{
		String s ="Hellow";
		char[] a=s.toCharArray();
		StringBuffer b=new StringBuffer();
		for(int i=s.length()-1;i>=0;i--)
		{
			b.append(a[i]).toString();
		}
		System.out.println(b);
		
	}
	public void s1()
	{
		String testResult="Failed";
		switch(testResult)
		{
			case "Failed":
				System.out.println("crying");
				break;
			case "Passed":
				System.out.println("walking");
				break;
			case "Skipp":
				System.out.println("some");
				break;
			default:
				System.out.println("not match");
		}
	}
	public static void screenShot() throws IOException
	{
		  File sf=((TakesScreenshot)dr).getScreenshotAs(OutputType.FILE);
	        FileUtils.copyFile(sf, new File("./image/shot"+Math.random()*1000+".png"),true);
	}
	
	public void typeOntext(WebElement ele,String text)
	{
		ele.sendKeys(text);
	}
	
	@DataProvider(name="hi")
	public Object[][] getData()
	{
		return new Object[][]{{"user1","1234"},{"user2","1234"}};
	}
	
	public String getAttributeFromElement(WebElement ele)
	{
		return ele.getAttribute("class");
	}
	
	public int getCountLink(By by)
	{
		return dr.findElements(by).size();
	}
	public String getTextFromElement(WebElement ele)
	{
		return ele.getText();
	}
	public void mouseOver(WebElement ele)
	{
		Actions ac=new Actions(dr);
		ac.moveToElement(ele).build().perform();
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
		try
		{
			if(ele.isDisplayed())
			{
				Thread.sleep(3000);
				log.info(ele+"is present");
			}
		}
		catch(NoSuchElementException e)
		{
			log.info(ele+" not present");
		}
		catch(ElementNotVisibleException e)
		{
			log.info(ele+" not present");
		}
		catch(Exception e)
		{
			log.info(ele+" not present");
		}
		finally
		{
			System.out.println("always execute");
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
				}
				else
				return false;
			}

		};
	   f.apply(ele);
	}
	
	

}
