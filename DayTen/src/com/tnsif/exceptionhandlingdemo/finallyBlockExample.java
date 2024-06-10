//to demonstrate finally block
package com.tnsif.exceptionhandlingdemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class finallyBlockExample {

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("in try block");
			System.out.println("Enter the input number");
			int number=sc.nextInt();
			System.out.println(number%2==0 ? number +" is Even" : number +" is odd");
		} catch (InputMismatchException e) {
			System.out.println("in catch block");
			System.out.println("Please enter Integer input "+e.getMessage());
		}finally
		{
			System.out.println("in finally block");
			sc.close();
		}
		System.out.println("Outside the finally block");
	}
}
