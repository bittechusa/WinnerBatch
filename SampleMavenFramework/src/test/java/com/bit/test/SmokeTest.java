 package com.bit.test;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.bit.pages.HomePage;
import com.bit.pages.ProdaShoe;
import com.bit.pages.ShoePage;
import com.bit.utility.Utility;

public class SmokeTest extends BaseTest
{
	Logger log=Logger.getLogger(SmokeTest.class);
	HomePage hp;
	ShoePage sp;
	ProdaShoe ps;
	//Utility ut;
	
	@Test
	public void test1()
	{
		log.info("test1 started");
		hp=new HomePage(dr);
		hp.verifyHomeTitle();
<<<<<<< HEAD
		hp.hverOverOnMenu();
		so=hp.clickShoeLink().get();
		so.verifyShoeTitle();
		so.clickShoeProduct();
=======
		sp=hp.clickShoeLink().get();
		sp.verifyShoeTitle();
		sp.clickShoeProduct();
>>>>>>> 4ecc9eb81f4c7615dd58dda382c2298d56246ff2
		
		ps=sp.clickShoeProduct();
		
	}
	@Test
	public void test2()
	{
		hp=new HomePage(dr);
		hp.searchText();
	}

}
