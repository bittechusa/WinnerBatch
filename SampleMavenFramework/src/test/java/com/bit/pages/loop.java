package com.bit.pages;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class loop
{
	WebDriver dr;
	public loop(WebDriver dr2)
	{
		this.dr=dr2;
	}
	public static void m2(int a[])
	{
		System.out.println(a[0]);
		Arrays.sort(a);
		System.out.println(a[a.length-1]);
		int min=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
	}
	
	@Test
	public static void arrayDemo()
	{
		
		int a=9;
		int b[]={2,4,7,4,3};
		m2(b);
		Arrays.sort(b);
		System.out.println(b[b.length-1]);
		int max=b[0];
		for(int i=1;i<b.length;i++)
		{
			if(b[i]>max)
			{
				max=b[i];
			}
		}
		System.out.println(max);
		
		String s="dhgf";
		
		String color[]={"red","green"};
		int d[]=new int[3];
		d[0]=10;
		d[1]=7;
		d[2]=9;
		String s1="cow";
		System.out.println(s1.charAt(0));
		Arrays.sort(d);
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
		for(int i=d.length-1;i>=0;i--)
		{
			System.out.println(d[i]);
		}
		System.out.println(color[1]);
		//for(int i=0;i<color.length)
		
	}
	
	
	
	
	
	public void m1()
	{
	boolean flag=true;
	while(flag)
	{
		int a=3;
		if(a==10)
		{
			flag=false;
		}
		a++;
		System.out.println("a");
	}
	}
	
	
	
	public void selectDropDown()
	{
		dr.get("http://www.facebook.com");
		Select s=new Select(dr.findElement(By.xpath(".//*[@id='day']")));
		s.selectByVisibleText("20");
		for(int i=0;i<8;i++)
		{
			if(i==4)
			{
				continue;
			}
			s.selectByIndex(i);
			
			
		}
		
		/*Select s3=new Select(dr.findElement(By.id("month")));
		for(int k=1;k<5;k++)
		{
			s3.selectByIndex(k);
	
		
		
		
	    int size=s.getOptions().size();
		for(int i=4;i>=1;i--)
		{
			
			s.selectByIndex(i);
			WebElement ele=dr.findElement(By.xpath(".//*[@id='year']"));
			Select s1=new Select(ele);
			int size2=s1.getOptions().size();
			for(int j=1;j<5;j++)
			{
				s1.selectByIndex(j);
			}
			
		}
		}*/
	}
	public void loop() throws InterruptedException
	{
		dr.findElements(By.xpath(".//*[@id='main-nav-list']/li")).get(1).click();
		Thread.sleep(3000);
		/*List<WebElement> eles=dr.findElements(By.xpath(".//*[@id='main-nav-list']/li"));
		for(WebElement ele:eles)
		{
			if(ele.getText().equals("Kids"))
			{
				ele.click();
				break;
			}
		}*/
		
		for(int i=1;i<100;i++)
		{
			System.out.println(i);
		}
	}

}
