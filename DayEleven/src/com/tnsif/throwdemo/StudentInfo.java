//student Entity class
package com.tnsif.throwdemo;

public class StudentInfo {
	private int rollNo;
	private String name;
	private float per;
	
	public StudentInfo(int rollNo, String name, float per) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.per = per;
	}

	public StudentInfo() {
		super();
	}

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

	public float getPer() {
		return per;
	}

	public void setPer(float per) {
		this.per = per;
	}
	
	
	public void show()
	{
		System.out.println("Roll no is "+rollNo);
		System.out.println("Name is "+name);
		try
		{
		PercentageValidator.isValidPercentage(per);
		}catch(ArithmeticException ae)
		{
			System.err.println("Invalid Percentage "+ae.getMessage());
		}
		System.out.println("Percentage is "+per);
	}
	

}
