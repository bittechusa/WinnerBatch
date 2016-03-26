package com.bit.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest
{
	WebDriver dr;
	
	@Test
	//@Parameters("browser")
	public void m1()
	{
		String browse=System.getProperty("browser");
				if(browse.equals("f"))
				{
		         dr=new FirefoxDriver();
				}
				else if(browse.equals("c"))
				{
		          
		           dr=new ChromeDriver();
				}
				else if(browse.equals("ie"))
				{
		          System.setProperty("webdriver.ie.driver", "C:/driver/IEDriverServer.exe");
		          dr=new InternetExplorerDriver();
				}
				else
					dr=new FirefoxDriver();
	}
	

}
