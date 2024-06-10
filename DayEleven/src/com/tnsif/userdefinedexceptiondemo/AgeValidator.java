package com.tnsif.userdefinedexceptiondemo;

public class AgeValidator {
	
	static void validateAge(int age) throws InValidAgeException
	{
		if(age>18) {
			System.out.println("Valid Candidate");
		}else
		{
			throw new InValidAgeException("You can not apply for voter Id due age");
		}
	}

}
