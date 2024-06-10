//Program to define Array Operations
package com.tnsif.exceptionhandlingdemo;

public class ArrayOperations {

	int intArray[] ;
	
	//default constructor
	public ArrayOperations() {
		super();
		
	}

	//Para. constructor
	public ArrayOperations(int[] intArray) {
		super();
		this.intArray = intArray;
		
	}
	
	public void displayArray() {
		for(int no:intArray) {
			System.out.println("The array elements are: "+no);
		}
	}
	
	public int getElement(int position) {
		return intArray[position];
	}
	
	
}
