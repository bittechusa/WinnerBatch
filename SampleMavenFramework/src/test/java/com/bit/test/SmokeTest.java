 package com.bit.test;

import org.apache.log4j.Logger;
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
	//Utility ut;
	
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
	@Test(dependsOnMethods={"test1"})
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
