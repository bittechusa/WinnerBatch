package com.bit.test;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class StringPlay 
{

	//Date: 2.27..16
	
	@Test
	public void crossbroewserChrome()
	{
		//System.out.println(System.getProperty("user.dir"));
		//System.setProperty("webdriver.chrome.driver", "JunitProject/src/chromedriver.exe");
		
		FirefoxDriver dr=new FirefoxDriver();
		dr.get("https://www.facebook.com/");
		dr.manage().window().maximize();
		dr.quit();
		System.out.println("Firefox Done");
		
		System.setProperty("webdriver.chrome.driver", "C:/Driver/Chrome/chromedriver.exe");
		ChromeDriver dr1=new ChromeDriver();
		dr1.get("https://www.facebook.com/");
		dr1.manage().window().maximize();
		dr1.quit();
		System.out.println("Chrome Done");
	
		/*System.setProperty("webdriver.ie.driver", "C:/Driver/IE/MicrosoftWebDriver.exe");
		InternetExplorerDriver dr2=new InternetExplorerDriver();
		dr2.get("https://www.facebook.com/");
		dr2.manage().window().maximize();
		dr2.quit();*/
		
		
		
	}
	
	
	

	/*String s = new String("How are you?");
	
	@Test
	public void f()
	{

		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.equals("Amit"));
		System.out.println(s.contains("Amit"));
		System.out.println(s.trim());
		System.out.println(s.replace(" ", ","));
		System.out.println(s.indexOf("H"));
		System.out.println(s.indexOf("jthfytfyj"));
		System.out.println(s.substring(3));
		System.out.println(s.concat("Emtiaz"));
		System.out.println(s.compareTo("how are you?"));
		System.out.println(s.endsWith("you?"));
		System.out.println(s.toUpperCase());
		String [] s1 = (s.split(" "));
		System.out.println(s1[0]);
		
		char [] s2 = s.toCharArray();
		
		StringBuffer sb = new StringBuffer();
		
		
		
		for (int i=0;i<s2.length;i++)
		{
		sb.append(s2[i]);
		}
		System.out.println("-----"+sb);	
		
		for (int i=s2.length-1;i>=0;i--)
		{
		sb.append(s2[i]);
		}
		System.out.println("-----"+sb);	
	
		for(int j=s2.length-1;j>=0;j--)
		{
			sb.append(s2[j]);	
		}	
			System.out.println("-----"+sb);	
			
		String s4 = "12.5ab21";
		String s5=s4.replace("ab",",");
		String[] s6=s5.split(",");
		double a = Double.parseDouble(s6[0]);
		int b = Integer.parseInt(s6[1]);
		System.out.println(a+b);		
	}

	
	@Test
	public void statement()
	{
	
		for (int k=1;k<=20;k++)
		{
			
			if(k%3==0 && k%5==0)
			{
				System.out.println("Shahidul "+k);
			}
			else if(k%3==0)
			{
				System.out.println("Emtiaz "+k);
			}
			else if(k%5==0)
			{
				System.out.println("Rakib "+k);
			}
			else
			{
				System.out.println("No Match "+k);
			}
	
		}
	
	}*/
	
}
