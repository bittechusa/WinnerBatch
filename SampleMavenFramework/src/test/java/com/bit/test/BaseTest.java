package com.bit.test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bit.utility.Utility;

public class BaseTest 
{
	WebDriver dr;
	Logger log=Logger.getLogger(BaseTest.class);
	/*@BeforeSuite
	public void sui()
	{
		System.out.println("beforesuit");
	}
	@BeforeTest
	public void suit()
	{
		System.out.println("beforetest");
	}
	@BeforeClass
	public void suie()
	{
		System.out.println("beforeClass");
	}*/
	@BeforeMethod
	public void start() throws IOException
	{
		System.out.println("beforemethod");
		//PropertyConfigurator.configure("log4j.properties");
		DOMConfigurator.configure("log4j.xml");
		FileInputStream fis=new FileInputStream("config.properties");
		log.info("file initialized");
		log.trace("trace");
		//System.out.println("file initialized");
		Properties p=new Properties();
		p.load(fis);
		dr=new FirefoxDriver();
		//dr=new ChromeDriver();
		dr.get(p.getProperty("url"));
		log.info("url initialized");
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		dr.navigate().refresh();
		System.out.println();
	}
	/*@Test
	public void m1()
	{
		System.out.println("test1");
	}
	@Test
	public void m2()
	{
		System.out.println("test2");
	}
	@AfterSuite
	public void asui()
	{
		System.out.println("aftersuit");
	}
	@AfterTest
	public void asuit()
	{
		System.out.println("aftertest");
	}
	@AfterClass
	public void asuie()
	{
		System.out.println("afterClass");
	}
	*/
	
	@AfterMethod
	public void end(ITestResult i) throws IOException
	{
		if(i.getStatus()==i.FAILURE)
		{
			Utility.screenShot();
			log.info(i.getTestClass().getName());
		}
		System.out.println("aftermethod");
		dr.quit();
		log.info("browser quit");
	}

}
