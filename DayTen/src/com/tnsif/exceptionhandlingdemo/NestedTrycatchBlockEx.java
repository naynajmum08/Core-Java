//to demonstrate Nested Try catch 
package com.tnsif.exceptionhandlingdemo;

public class NestedTrycatchBlockEx {

	
		public static int divide(int x,int y)
		{
			int z=0;
			z=x/y;
			System.out.println("Result is  "+z);
			return z;
		}
		
		public static void main(String[] args) {
			int x,y,z;
			
			try {
				x=Integer.parseInt(args[0]);
				y=Integer.parseInt(args[1]);
				try {
					z=divide(x,y);
				} catch (ArithmeticException e) {
					System.out.println("Division Exception "+e.getMessage());
				}
			} catch (NumberFormatException e) {
				System.out.println("Number format exception  "+e.getMessage());
			}catch(ArrayIndexOutOfBoundsException  e) {
				System.out.println("Index out of bound  "+e.getMessage());
		
			
		}

	}
}


