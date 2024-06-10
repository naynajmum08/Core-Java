//to demonstrate throw keyword
package com.tnsif.throwdemo;

import java.util.Scanner;

public class PercentageValidator {
	
	
	
	static float acceptNumber()
	{
		Scanner sc=new Scanner(System.in);
		while(!sc.hasNextFloat())
		{
			System.out.println("Invalid Input...Please Enter valid input");
			sc.next(); //Discard Non-Integer
		}
		int n=sc.nextInt();
		sc.close();
		return n;
	}
	
	static void isValidPercentage(float per) throws ArithmeticException
	{
		if(per >=0 && per<=100)
		{
			System.out.println("Valid Percentage "+per);
		}else
		{
			//System.err.println("Invalid Percentage");
			throw new ArithmeticException("Percentage shoud be between 0 to 100");
		}
		
	}

}
