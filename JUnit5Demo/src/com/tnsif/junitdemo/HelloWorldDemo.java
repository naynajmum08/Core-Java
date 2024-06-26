package com.tnsif.junitdemo;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

//@Disabled
//@Test
public class HelloWorldDemo extends TestLifeCycle{
	
	
	@Test
	public void add()
	{
		System.out.println("Add method");
	}
	
	@Test
	public void sub()
	{
		System.out.println("Sub method");
	}
	
	@Test
	public void mul()
	{
		System.out.println("Mul method");
	}
	
	@Test
	public void div()
	{
		System.out.println("Div method");
	}
	@Disabled
	@Test
	public void print()
	{
		
		System.out.println("Print method");
	}
	@Disabled
	@Test
	public void display()
	{
		
		System.out.println("Display Hello world");
	}


}
