//to demonstrate For Each loop
package com.tnsif.controlstatements;

public class ForEachLoop {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50}; //integer array
		/*
		 * for(int i=0;i<=a.length-1;i++) { System.out.println(a[i]); }
		 */

		
		//for each
		for(int i:a)
		{
			System.out.println(i*4);
		}
		
		String names[]= {"Kishan","Brijesh","Mayuri","Divya","Mukund","Chetan"};
		for(String n:names)
		{
			System.out.println("Student names are "+n);
		}
	}

}
