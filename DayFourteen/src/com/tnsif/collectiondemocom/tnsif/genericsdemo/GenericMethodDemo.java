package com.tnsif.collectiondemocom.tnsif.genericsdemo;

public class GenericMethodDemo {

	public static void main(String[] args) {
		Integer[] arrInt={10,56,88,656,45};
		GenericMethod obj=new GenericMethod();
		obj.displayArrayElements(arrInt);
		
		String[] arrString= {"Java","Programmimg","Course"};
		obj.displayArrayElements(arrString);
		
		Student arrStudent[]= {new Student(1,"Neha"),new Student(2,"Pranjali"),new Student(3,"Dhanraj")};
		obj.displayArrayElements(arrStudent);

	}

}
