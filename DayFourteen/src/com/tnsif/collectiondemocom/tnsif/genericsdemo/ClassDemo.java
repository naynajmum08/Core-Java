package com.tnsif.collectiondemocom.tnsif.genericsdemo;

public class ClassDemo {

	public static void main(String[] args) {
		GenericClass<String> obj=new GenericClass<>();
		obj.setData("Nayna");
		System.out.println(obj.getData());
	}

}
