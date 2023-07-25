// program to demonstrate default and parameterized constructor
package org.tnsif.classandobject;

public class Citizen {
	//data members
	String citizenType;
	long aadharNo;
	String gender;
	String city;

	//default constructor
	Citizen(){
		System.out.println("De,onstration on default condtructor");
	}
	//Parameterized constructor

	public Citizen(String citizenType, long aadharNo, String gender, String city) {
		super();
		this.citizenType = citizenType;
		this.aadharNo = aadharNo;
		this.gender = gender;
		this.city = city;
		
	}

	@Override
	public String toString() {
		return "Citizen [citizenType=" + citizenType + ", aadharNo=" + aadharNo + ", gender=" + gender + ", city="
				+ city + "]";
	}
	
	
	
	
}
