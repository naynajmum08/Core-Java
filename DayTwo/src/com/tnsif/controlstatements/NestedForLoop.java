//to demonstrate nested for loop
package com.tnsif.controlstatements;

public class NestedForLoop {

	public static void main(String[] args) {
		int begin=1,end=10;
		
		for(int j=begin;j<=end;j++)
		{
		for(int i=1;i<=10;i++)
		{
			System.out.println(j*i);
		}
		System.out.println(" ");
		}
	}

}
