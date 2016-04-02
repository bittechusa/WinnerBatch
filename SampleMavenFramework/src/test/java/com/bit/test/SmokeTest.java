 package com.bit.test;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.bit.pages.HomePage;
import com.bit.pages.ProdaShoe;
import com.bit.pages.ShoePage;
import com.bit.pages.loop;
import com.bit.utility.Utility;

public class SmokeTest extends BaseTest
{
	Logger log=Logger.getLogger(SmokeTest.class);
	HomePage hp;
	ShoePage so;
	ProdaShoe ps;
	Utility ut;
	
	/*@DataProvider(name="hi")
	public Object[][] getData()
	{
		return new Object[][]{{"user1","1234"},{"user2","1234"}};
	}*/
	
	@Test
	public void m1() throws IOException
	{
		ut=new Utility(dr);
		
		ut.screenShot();
	}
	
	@Test(dataProvider="hi" , dataProviderClass=Utility.class)
	public void logIntoFacebook(String moga2, String moga1) throws InterruptedException
	{
		FirefoxDriver dr;
		dr = new FirefoxDriver();
		dr.get("http://www.facebook.com");
		dr.manage().window().maximize();
		dr.findElement(By.xpath(".//*[@id='email']")).sendKeys(moga2);
		dr.findElement(By.xpath(".//*[@id='pass']")).sendKeys(moga1);
		dr.findElement(By.xpath(".//*[@id='u_0_x']")).click();
		Thread.sleep(5000);
		dr.quit();
	}
	
	
	@Test(priority=1)
	public void test1()
	{
		log.info("test1 started");
		hp=new HomePage(dr);
		hp.verifyHomeTitle();

		hp.hverOverOnMenu();
		so=hp.clickShoeLink().get();
		so.verifyShoeTitle();
		so.clickShoeProduct();
//=======
		so=hp.clickShoeLink().get();
		so.verifyShoeTitle();
		so.clickShoeProduct();

		
		ps=so.clickShoeProduct();
		
	}
	
	
	@Test(dependsOnMethods={"test1"}, alwaysRun=true)
	public void test2() throws InterruptedException
	{
		//hp=new HomePage(dr);
		//so=hp.clickShoeLink();
		//so.clickShoeProduct();
		so=new ShoePage(dr);
		so.clickShoeProductWithWhileLoop();
		//so.loopConcept();
		
	}
	@Test(priority=2)
	public void test3() throws InterruptedException
	{
		loop lp=new loop(dr);
		//lp.loop();
		//lp.selectDropDown();
		lp.arrayDemo();
	}

}
