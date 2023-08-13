package org.tnsif.singleinheritance;
//this is my base class
public class Citizen {
	private String city;
	private int pincode;
	private long adharno;
	private long contactno;
	
	
	//default constructor
	public Citizen() {
		System.out.println("Default Constructor");
	}
	
	
	//Parameterized constructor
	public Citizen(String city, int pincode, long adharno, long contactno) {
		super();
		this.city = city;
		this.pincode = pincode;
		this.adharno = adharno;
		this.contactno = contactno;
		System.out.println("Parametrized constructor");
	}
	
	
	//getters setters
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public long getAdharno() {
		return adharno;
	}
	public void setAdharno(long adharno) {
		this.adharno = adharno;
	}
	public long getContactno() {
		return contactno;
	}
	public void setContactno(long contactno) {
		this.contactno = contactno;
	}
	@Override
	public String toString() {
		return "Citizen [city=" + city + ", pincode=" + pincode + ", adharno=" + adharno + ", contactno=" + contactno
				+ "]";
	}
	
	
	

}
