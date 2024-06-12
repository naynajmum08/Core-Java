package com.tnsif.collectiondemocom.tnsif.genericsdemo;

public class GenericMethod {

	
	public <E> void displayArrayElements(E[] elements)
	{
		for(E e:elements)
		{
		System.out.println(e);		
		}
	}
}
