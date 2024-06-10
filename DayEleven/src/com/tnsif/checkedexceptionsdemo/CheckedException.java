//to demonstrate IO checked Exception
package com.tnsif.checkedexceptionsdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckedException {

	
	static String acceptText() throws IOException 
	{
		
		try {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String ");
		String text=br.readLine();
		//br.close();
		return text;
		
		}
		finally
		{
			System.out.println("End of the program");
		}
		
	}
}
