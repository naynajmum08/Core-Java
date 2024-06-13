//Program to demonstrate List collection for user defined objects and 
//sort elements using comparable and comparator
package com.tnsif.comaratorandcomparable;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// Adding User Defined objects into ArrayList
		// List studentList = new ArrayList(); //

		List<Student> studentList = new ArrayList<Student>();
		Student s1 = new Student(11, "Neha", 78);
		studentList.add(s1);
		s1 = new Student(21, "Dnyneshwari", 85);
		studentList.add(s1);
		s1 = new Student(13, "Sanjivani", 68);
		studentList.add(s1);
		s1 = new Student(41, "Pranjali", 72);
		studentList.add(s1);
		System.out.println("Students Details are as follows\n" + studentList);

		// Using Comparable interface
		System.out.println("---------------Student Details Before Sorting-------------------");
		System.out.println(studentList);

		Collections.sort(studentList);

		System.out.println("---------------Student Details After Sorting-------------------");
		System.out.println(studentList);

		// Adding Person objects into ArrayList
		List<Person> personList = new ArrayList<Person>();
		Person p = new Person("Dhanraj", "Mumbai");
		personList.add(p);

		p = new Person("Yash", "Pune");
		personList.add(p);

		p = new Person("Jayesh", "Bangalore");
		personList.add(p);

		p = new Person("Sarthak", "Delhi");
		personList.add(p);

		System.out.println("Person list is as follows\n" + personList);

		// Using Comparator interface
		System.out.println("---------------Person Details Before Sorting-------------------");
		System.out.println(personList);

		Collections.sort(personList, new SortByName());

		System.out.println("---------------Person Details After Sorting by Name -------------------");
		System.out.println(personList);

		Collections.sort(personList, new SortByCity());

		System.out.println("---------------Person Details After Sorting by City -------------------");
		System.out.println(personList);
	}

}

