package com.bit.test;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A 
{
	//JUnit is a testing framework. It has some annotation
	//@Test annotation must be present to run the project
	//@Before,@After,@Test,@BeforeClass, @AfterClass, @Ignore,@Parameter
	
	static FirefoxDriver dr;
	
	@BeforeClass
	public static void browserOpen()
	{
		
		System.out.println("Execute beforeClass-BrowserOpened");		
		dr=new FirefoxDriver();
		dr.get("https://www.facebook.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public static void browserClose()
	{
		dr.close();
		System.out.println("Execute afterClass-BrowserClass");
	}
	
	@Before
	public void before()
	{
		System.out.println("Execute before-running test");
	}
	
	@After
	public void after()
	{
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Execute after-running test");		
	}
		
}
