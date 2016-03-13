package com.bit.test;

import org.junit.Test;

public class loop 
{

	String str = "0,1,2,3,4,5,6,7,8,9";
	
	@Test
	public void forLoop()
	{
		String[] num=str.split(",");
		
		int num0=Integer.parseInt(num[0]);
		int num1=Integer.parseInt(num[1]);
		int num2=Integer.parseInt(num[2]);
		int num3=Integer.parseInt(num[3]);
		int num4=Integer.parseInt(num[4]);
		int num5=Integer.parseInt(num[5]);
		int num6=Integer.parseInt(num[6]);
		int num7=Integer.parseInt(num[7]);
		int num8=Integer.parseInt(num[8]);
		int num9=Integer.parseInt(num[9]);
		
		int sum=num0+num1+num2+num3+num4+num5+num6+num7+num8+num9;
		System.out.println(sum);
	}			
			
	@Test
	public void loop1()
	{
		
		StringBuffer sb=new StringBuffer();
		char[] chr=str.toCharArray();
		for(int i=0;i<chr.length;i++)
		//for(int i=num.length-1;i>=0;i--)
		{
			sb.append(chr[i]);
			System.out.println(chr[i]);
		}
			
			System.out.println(sb);	
		
		
	}
	
}
