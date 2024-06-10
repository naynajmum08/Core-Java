package com.tnsif.checkedexceptionsdemo;

import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws IOException {
		try {
			String str=CheckedException.acceptText();
		} catch (IOException e) {
			System.out.println("IO Exception "+e.getMessage());
		}

	}

}
