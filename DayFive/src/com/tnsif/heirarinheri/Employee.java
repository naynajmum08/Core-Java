// to demonstrate Child 1 class
package com.tnsif.heirarinheri;

public class Employee extends Person{
	private int empId;
	private float salary;
	private String companyName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Employee(String name, String city, int empId, float salary, String companyName) {
		super(name, city);
		this.empId = empId;
		this.salary = salary;
		this.companyName = companyName;
	}
	
	public Employee( int empId, float salary, String companyName) {
		
		this.empId = empId;
		this.salary = salary;
		this.companyName = companyName;
	}
	public Employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", companyName=" + companyName + ", toString()="
				+ super.toString() + "]";
	}
	
	
	

}
