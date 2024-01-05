//to demonstrate encapsulation
package com.tnsif.encapsulationdemo;

public class OopsConceptDemo {
	
	//field data members
private int serialNum;
private String name;
private int age;

//getters and setters
public int getSerialNum() {
	return serialNum;
}
public void setSerialNum(int serialNum) {
	this.serialNum = serialNum;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}





//object class 
@Override
public String toString() {
	return "OopsConceptDemo [serialNum=" + serialNum + ", name=" + name + ", age=" + age + "]";
}




}
