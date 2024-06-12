package com.tnsif.collectiondemocom.tnsif.genericsdemo;

public class GenericConstructor {
	
	private double v;

	public <T extends Number>GenericConstructor(T t) {
		v=t.doubleValue();
	}
	
	void show()
	{
		System.out.println("Value of v is ");
	}

}
