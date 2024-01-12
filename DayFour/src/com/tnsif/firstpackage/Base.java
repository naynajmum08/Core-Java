//to demonstrate packages and access modifiers
package com.tnsif.firstpackage;

public class Base {
	//data members
	public int varPublic=10;
	int vardefault=20;
	protected int varProtected=30;
	private int varPrivate=40;
	
	//methods
	public void methodPublic()
	{
		System.out.println(varPublic);
	}
	
	 void methodDefault()
	{
		System.out.println(vardefault);
	}

	 protected void methodProtected()
	 {
		 System.out.println(varProtected);
	 }
	 
	 private void methodPrivate()
	 {
		 System.out.println(varPrivate);
	 }
	 
	 public void disp()
	 {
		 methodProtected();
	 }
}
