package com.bit.test;

import jdk.nashorn.internal.ir.annotations.Ignore;

import org.junit.Test;
import org.openqa.selenium.By;

public class B extends A
{

	@Test
	public void stringManipulation()
	{
		
		String s = new String("hello");
		s = s.substring(0, 2);
		System.out.println(s);
		
		StringBuffer s1 = new StringBuffer("hello");
		s1.append("testing");
		s1.length();
		System.out.println(s1);
	
	}
	
	@Ignore
	@Test
	public void login()
	{
		System.out.println("1st Test");
		dr.findElement(By.id("email")).sendKeys("emtiaz_amit@yahoo.com");
		dr.findElement(By.id("pass")).sendKeys("abc123");
		dr.findElement(By.id("u_0_x")).click();
	}
	
	@Ignore
	@Test
	public void logout()
	{
		System.out.println("2st Test");
	}
	
	
	
	
}
