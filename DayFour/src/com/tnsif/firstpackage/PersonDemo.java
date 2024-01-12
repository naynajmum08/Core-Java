package com.tnsif.firstpackage;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		Person person=new Person();//default constructor
		//person.personName="Nayna";//can't access private member 
		person.setPersonName("Sakshi");
		person.setPersonAge(23);
		person.setPersonCity("Mumbai");
		System.out.println(person.getPersonName());
		person.getPersonAge();
		person.getPersonCity();
		System.out.println(person);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the age");
		int age=sc.nextInt();
		System.out.println("Enter the city");
		String city=sc.next();
		
		Person person1=new Person(name,age,city);
		System.out.println(person1);
		
		//System.out.println((person instanceof Base));//CTE //Incompatible type
	}

}
