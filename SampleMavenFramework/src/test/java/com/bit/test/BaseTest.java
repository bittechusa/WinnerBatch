package com.bit.test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest 
{
	FirefoxDriver dr;
	Logger log=Logger.getLogger(BaseTest.class);
	@BeforeMethod
	public void start() throws IOException
	{
		DOMConfigurator.configure("log4j.xml");
		FileInputStream fis=new FileInputStream("config.properties");
		log.info("file initialized");
		log.trace("trace");
		//System.out.println("file initialized");
		Properties p=new Properties();
		p.load(fis);
		dr=new FirefoxDriver();
		dr.get(p.getProperty("url"));
		log.info("url initialized");
		System.out.println();
	}
	
	@AfterMethod
	public void end()
	{
		dr.quit();
		log.info("browser quit");
	}

}
