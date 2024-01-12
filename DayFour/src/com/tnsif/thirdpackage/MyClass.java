//to demonstrate Private Constructor and Singleton class
package com.tnsif.thirdpackage;

public class MyClass {
	
	private  static MyClass obj=new MyClass();
	
private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public static MyClass getObject()
{
	return obj;
	
}

private MyClass() {
	System.out.println("Private Constructor");
}
public void disp()
{
	System.err.println(id);
}

@Override
public String toString() {
	return "MyClass [id=" + id + "]";
}


}
