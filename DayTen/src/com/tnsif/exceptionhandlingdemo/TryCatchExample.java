//demonstrate try catch keywords
package com.tnsif.exceptionhandlingdemo;

public class TryCatchExample {
	
	static int performDivision(int x,int y)
	
	{
		int z=0;
		System.out.println("I am in main method");
		try {
			System.out.println("In try block");
			z=x/y;
			
		} catch (ArithmeticException ae) {
			
			System.out.println("In catch block");
			System.err.println("Exception occured due to division by zero.."+ae.getMessage());
		}
		return z;
	}
	
	static float performDivision(float a,float b)
	{
		return a/b;
	}

}
