//driver class
package com.tnsif.methodoverloading;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		System.out.println(MethodOverloading.addition(12, 45));
		System.out.println(MethodOverloading.addition(12.6f, 45));
		System.out.println(MethodOverloading.addition(12, 45.8f));
		System.out.println(MethodOverloading.addition("Hello", "Everyone"));

		Point p = new Point();
		System.out.println(p);

		Point p1 = new Point(5.0f);
		System.out.println(p1);

		Point p2 = new Point(2, 8);
		System.out.println(p2);

	}

}
