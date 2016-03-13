package com.bit.test;

import com.bit.support.A;

public class D 
{
	A x = new A();
	
	void abc()
	{
		//public variable in different package
		System.out.println(x.publicVariable);
		
		//we can't access privatevariable in different package
		//System.out.println(privateVariable);
		
		//protectedVariable in different package can't be accessed 
		//System.out.println(protectedVariable);
		
		//defaultVariable in different package can't be accessed and it acts like private
		//System.out.println(defaultVariable);
	}
	

}
