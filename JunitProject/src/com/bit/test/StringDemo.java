package com.bit.test;

import org.junit.Ignore;
import org.junit.Test;

public class StringDemo 
{

	String text = "I like to play football 21/22!";
	
	@Ignore
	@Test
	public void StringPlay()
	{
		
		String g = text.substring(5);
		System.out.println(g);
		String[] str1 = text.split(" ");
		String str2 = (str1[5]);
		String str4 = str2.replace("/", ",");
		String str5 = str4.replace("!", ",");
		String[] str6 = str5.split(",");
		int a = Integer.parseInt(str6[0]);
		int b = Integer.parseInt(str6[1]);
		int c=a+b;
		System.out.println(c);	
	}
	
	@Ignore
	@Test
	public void StringPlay2()
	{
		
		StringBuffer sb = new StringBuffer("I liike juice");
		sb.append(" & soda!");
		System.out.println(sb);
		
	}
	@Test
	
	public void StringPlay3()
	{
		char [] t = text.toCharArray();
		StringBuffer sb = new StringBuffer();
		//for(int i=t.length-1;i>=0;i--)
		for(int i=0;i<t.length;i++)
		{
			sb.append(t[i]);
			System.out.println(t[i]);
		}
			System.out.println("-----"+sb);
	}
}
