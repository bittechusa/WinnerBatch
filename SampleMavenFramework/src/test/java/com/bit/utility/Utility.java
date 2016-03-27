package com.bit.utility;

//<<<<<<< HEAD
import java.util.concurrent.TimeUnit; 
import java.util.function.Function;
//=======
import java.util.concurrent.TimeUnit;
//import java.util.function.Function;
//>>>>>>> bcc2fff0b2071ae7fe2052d907e6c9a70ad5b804




import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Utility 
{
	static WebDriver dr;
	Logger log=Logger.getLogger(Utility.class);
	
	public Utility(WebDriver dr2)
	{
		this.dr=dr2;
	}
	
	public void typeOntext(WebElement ele,String text)
	{
		ele.sendKeys(text);
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
		try{
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
		finally{
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
				}else
					
				return false;
			}

			};
	   f.apply(ele);
	}
	
	

}
