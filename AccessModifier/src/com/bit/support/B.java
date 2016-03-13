package com.bit.support;

public class B extends A
{
	//inheritance (extends A)
	//Object creation
	A x = new A();
	
	public void m1()
	{
		//object creation public variable
		System.out.println(x.publicVariable);
		
		//inheritance
		System.out.println(publicVariable);
		
		//we can't access privatevariable in the same package
		//System.out.println(privateVariable);
		
		//protectedVariable in the same package
		System.out.println(protectedVariable);
		
		//defaultVariable in the same package
		System.out.println(defaultVariable);
	}
	

}
