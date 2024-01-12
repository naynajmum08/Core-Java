//to demonstrate  child class
package com.tnsif.singleinheridemo;

public class Student extends Citizen{
	private int rollNo;
	private String stream;
	private String collegeName;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Student(String name, String aadharNo, String address, long phNo, int rollNo, String stream,
			String collegeName) {
		super(name, aadharNo, address, phNo);
		this.rollNo = rollNo;
		this.stream = stream;
		this.collegeName = collegeName;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", stream=" + stream + ", collegeName=" + collegeName + ", getName()="
				+ getName() + ", getAadharNo()=" + getAadharNo() + ", getAddress()=" + getAddress() + ", getPhNo()="
				+ getPhNo() + "]";
	}
	
	
	

}
