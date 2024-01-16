package com.tnsif.covariantoverriddingdemo;

public class Student implements Cloneable{
	
	private int rollNo;
	private String name;
	private String branch;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public Student(int rollNo, String name, String branch) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.branch = branch;
	}
	
	
	public void printData()
	{
		System.out.println("Name: "+name+"Roll No:" +rollNo+"Branch: "+branch);
	}
	
	/*
	 * public Object clone() throws CloneNotSupportedException{ return
	 * super.clone();
	 * 
	 * }
	 */
	
	public Student clone()throws CloneNotSupportedException{	{
		return (Student)super.clone();
	}

}
}
