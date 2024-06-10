//to demonstrate Multiple catch
package com.tnsif.exceptionhandlingdemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOne, numberTwo, numberThree;
		try {
			System.out.println("Enter the first no");
			numberOne = sc.nextInt();
			System.out.println("Enter the second no");
			numberTwo = sc.nextInt();

			numberThree = numberOne / numberTwo;
			System.out.println(numberThree);
		} catch (InputMismatchException e) {
			System.out.println("Input mismatch Exception " + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception " + e.getMessage());
		} catch (Exception e) {
			System.out.println(" Exception " + e.getMessage());

		} finally {
			sc.close();
		}
	}
}
