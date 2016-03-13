package shilpi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class share
{
	FirefoxDriver dr;
	share(FirefoxDriver y)
	{
		dr=y;
	}
	
	void type(WebElement x,String y)
	{
		x.sendKeys(y);
	}
	
	WebElement click(By b)
	{
		return dr.findElement(b);
	}

}




String s=System.getProperty("browser");


if(s.equals("one"))
{
  dr=new FirefoxDriver();
  dr.get("http://www.eshopper24.com");
}
else if(s.equals("two"))
{

	System.setProperty("webdriver.chrome.driver", "/Users/ashrafulalam/Downloads/chromedriver");
	 dr=new ChromeDriver();
	dr.get("https://www.eshopper24.com");
}	
else

	dr=new FirefoxDriver();
	dr.get("http://www.eshopper24.com");
	
}


public void closeBrowser() throws InterruptedException
{
	Thread.sleep(50000);
	dr.quit();
}

