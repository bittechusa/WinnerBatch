package com.bit.test;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.bit.pages.HomePage;
import com.bit.pages.ProdaShoe;
import com.bit.pages.ShoePage;

public class SmokeTest extends BaseTest
{
	Logger log=Logger.getLogger(SmokeTest.class);
	HomePage hp;
	ShoePage so;
	ProdaShoe ps;
	@Test
	public void test1()
	{
		log.info("test1 started");
		hp=new HomePage(dr);
		hp.verifyHomeTitle();
		so=hp.clickShoeLink().get();
		so.verifyShoeTitle();
		ps=so.clickShoeProduct().get();
		
	}
	@Test
	public void test2()
	{
		
	}

}
