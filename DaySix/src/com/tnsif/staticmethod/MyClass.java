//to demonstrate Static block and static method
package com.tnsif.staticmethod;

public class MyClass {
	//instance variable
private int section;
//static member
private static int srNo;

static
{
	System.out.println("Static block");
	srNo=100;
	//section=10;
}

public MyClass() {
	System.out.println("Inside the constructor");
	section++;
	srNo++;
}

@Override
public String toString() {
	return "MyClass [section= " + section + "srNo= " + srNo +"]";
}

public void display()
{
	System.out.println(section);
	System.out.println(srNo);
}

static void print()
{
	//System.out.println(section);
	System.out.println(srNo);
}


}
