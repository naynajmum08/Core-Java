package com.tnsif.associationdemo;

public class AssciationDemo {

	public static void main(String[] args) {
		Address address=new Address("JM Road","Pune","Maharashtra","421 501");
		Person p=new Person("Nayna",address);
		p.printDetails();

	}

}
