package com.tnsif.covariantoverriddingdemo;

public class CloningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Student s1=new Student(12,"Nayna","CSE");
		s1.printData();
		
		Student s2=s1.clone();
		s2.setName("Brijesh");
		s2.setRollNo(30);
		s2.setBranch("IT");
		s2.printData();

	}

}
