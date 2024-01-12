package com.tnsif.thirdpackage;

public class MyClassDriver {

	public static void main(String[] args) {
	//MyClass obj=new MyClass();
		
		MyClass m=MyClass.getObject();
		m.setId(20);
		m.disp();
		MyClass m1=MyClass.getObject();
		//m.setId(20);
		m.disp();
		
	}

}
