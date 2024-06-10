package com.tnsif.exceptionhandlingdemo;

public class TryCatchDemo {

	public static void main(String[] args) {
		
		int result;
		
		result=TryCatchExample.performDivision(14, 2);
		if(result!=0)
		{
			System.out.println(result);
		}
		
		float result1;
		result1=TryCatchExample.performDivision(14f, 0f);
		if(result1!=0)
		{
			System.out.println(result1);
		}

	}

}
