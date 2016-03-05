package com.bit.test;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class SmokeTest extends BaseTest
{
	Logger log=Logger.getLogger(SmokeTest.class);
	@Test
	public void test1()
	{
		log.info("test1 started");
	}
	@Test
	public void test2()
	{
		
	}

}
