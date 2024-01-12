//to demonstrate child 2 class
package com.tnsif.heirarinheri;

public class Doctor extends Person {
	private String specialization;
	private String hospitalName;

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public Doctor(String name, String city, String specialization, String hospitalName) {
		super(name, city);
		this.specialization = specialization;
		this.hospitalName = hospitalName;
	}

	public Doctor() {

	}

	@Override
	public String toString() {
		return "Doctor [specialization=" + specialization + ", hospitalName=" + hospitalName + ", toString()="
				+ super.toString() + "]";
	}

}
