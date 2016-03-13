package com.bit.test;

import com.bit.suopport.C;
//in class level u just can use public and default
public class A extends B {

	public static void main(String[] args) {
		int b=7;
		//B x=new B();
		//int x1=x.getShahid()+b;
		//in a same package using object creation
		B x=new B();
		x.m1();
		x.m2();
		x.m3();
		//x.m4();//private can not be accessable
		
		
		//in different -package using object creation
		C y=new C();
		//y.m5(); default can not be access
		y.m6();
		//y.m7();protected can not access
		//y.m8();private can not access
		 
		
		
	/*	 //in same package using inheritance
		m1();
		m2();
		m3();
		//m4();private can not access
		*/
		
	/*	//in different package using inheritance
		//m5();default can not access
		m6();
		m7();
		//m8();private can not access
		*/
		
		
		   
	}

}
