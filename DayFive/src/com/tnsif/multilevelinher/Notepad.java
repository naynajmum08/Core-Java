// to demonstrate grand parent class
package com.tnsif.multilevelinher;

public class Notepad {
	protected String content;

	public Notepad() {
		this.content="";
	}
	
	public void write(String text)
	{
		content+=text;
	}
	
	public void display()
	{
		System.out.println("notepad content is "+content);
	}
	
	

}
