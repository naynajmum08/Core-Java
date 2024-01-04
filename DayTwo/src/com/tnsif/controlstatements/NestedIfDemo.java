//to demonstrate Nested If
package com.tnsif.controlstatements;

public class NestedIfDemo {

	public static void main(String[] args) {
		boolean nationality=false;;
		
		int age=10;
		if(nationality)
		{
		if(age>=18 && age<=100)
		{
			System.out.println("You are eligible for voting");
		}
		else
		{
			System.out.println("Your age not in the range ");
		}
		}
		else 
		{System.out.println("Not an Indian");
		}
		
		}
		
	}


