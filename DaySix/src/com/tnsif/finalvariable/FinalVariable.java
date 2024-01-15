//to demonstrate final variable
package com.tnsif.finalvariable;

public class FinalVariable {

	//final int x;  //final instance variable must be initialized
	
	
	final int x=100;
	
	final static int y;
	
	final static int z=20;
	
	void change()
	{
		//x=30; //final variable can't be changed
		//y=40;
	}
	
	static
	{
		y=50;
		//z=67;
		System.out.println(y);
	}
	
}
