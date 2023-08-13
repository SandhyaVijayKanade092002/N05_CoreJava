package org.tnsif.singleinheritance;
// derived class parent lass
public class Student extends Citizen{
	
	//private class data members
	private int rollno;
	private String collegeName;
	
	
	
	
	
	public Student() {
		//super() it calls to parent class default constructor
 		super();
		
		System.out.println("Child class default constructor");
		
		
		
	}
	public Student(String city, int pincode, long adharno, long contactno, int rollno,String collegeName) {
		super(city, pincode, adharno, contactno);
		// TODO Auto-generated constructor stub
		this.rollno=rollno;
		this.collegeName=collegeName;
	}
	
	
	
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	

}
