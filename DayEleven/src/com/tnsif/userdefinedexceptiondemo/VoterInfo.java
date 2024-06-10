package com.tnsif.userdefinedexceptiondemo;

public class VoterInfo {
	
	private String name;
	private String city;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		
		try {
			AgeValidator.validateAge(age);
			this.age = age;
		} catch (InValidAgeException e) {
			System.out.println("Age is below 18  "+e.getMessage());
		}
		
	}
	@Override
	public String toString() {
		return "VoterInfo [name=" + name + ", city=" + city + ", age=" + age + "]";
	}
	
	
	
	

}
