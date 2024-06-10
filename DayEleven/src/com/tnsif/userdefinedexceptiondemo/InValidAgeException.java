package com.tnsif.userdefinedexceptiondemo;

public class InValidAgeException extends Exception {
	
	InValidAgeException()
	{
		super();
		
	}

	
	InValidAgeException(String s)
	{
		System.out.println("Ypu are not eleigible for voting..");
		
	}
}
