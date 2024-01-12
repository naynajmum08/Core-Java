//to demonstrate Person Entity
package com.tnsif.firstpackage;

public class Person {
	private String personName;
	private int personAge;
	private String personCity;
	
	
	public Person(String personName, int personAge, String personCity) {
		
		this.personName = personName;
		this.personAge = personAge;
		this.personCity = personCity;
	}


	 public Person()
	{
		
	}


	public String getPersonName() {
		return personName;
	}


	public void setPersonName(String personName) {
		this.personName = personName;
	}


	public int getPersonAge() {
		return personAge;
	}


	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}


	public String getPersonCity() {
		return personCity;
	}


	public void setPersonCity(String personCity) {
		this.personCity = personCity;
	}


	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personAge=" + personAge + ", personCity=" + personCity + "]";
	}
	
	
	
	

}
