//to demonstrate static variable
package com.tnsif.staticvariabledemo;

public class Employee {
	//instance variable
private String name;
private int empId;

//company name is static member
static String companyName="TNS";

public Employee(String name, int empId) {
	
	this.name = name;
	this.empId = empId;
}

@Override
public String toString() {
	return "Employee [name=" + name + ", empId=" + empId + ",Company Name="+companyName+" ]";
}


}
