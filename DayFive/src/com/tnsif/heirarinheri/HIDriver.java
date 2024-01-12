package com.tnsif.heirarinheri;

public class HIDriver {

	public static void main(String[] args) {
		Person p1=new Person("Nayna","Mumbai"); //tightly coupling 
		System.out.println(p1);
		
		
		Person p; //obj reference
		
		p=new Person("Mukund","nashik");//loose coupling //dynamic binding
		if(p instanceof Person)
		System.out.println(p);
		
		p=new Employee("Divya","Mumbai",12,45000,"TNS");
		
		if(p instanceof Employee)
			System.out.println(p);
		
		p=new Doctor("ABC","Pune","Heart","fortis");
		if(p instanceof Doctor)
		System.out.println(p);

	}

}
