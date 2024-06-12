package com.tnsif.collectiondemocom.tnsif.genericsdemo;

public class ClassDemo {

	public static void main(String[] args) {
		GenericClass<String> obj=new GenericClass<>();
		obj.setData("Nayna");
		System.out.println(obj.getData());
		
		GenericClass<Integer> obj1=new GenericClass<>();
		obj1.setData(676);
		System.out.println(obj.getData());
		
		GenericClass<Student> student1=new GenericClass<>();
		Student s1=new Student(24,"Mukta");
		//student1.setData(new Student());
		student1.setData(s1);
		System.out.println(student1.getData());
	}

}
