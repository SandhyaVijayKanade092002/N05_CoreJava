package org.tnsif.thiskeyword;

public class ThisKeywordDemoFour {
	int x;
	//default constructor
	ThisKeywordDemoFour(){
		//invoking current constructor , calling parameterized constructor
		this(34);
		System.out.println("Default constructor");
	}
	ThisKeywordDemoFour(int x){
		this.x=x;
		System.out.println("parametrized costructor");
	}

	public static void main(String[] args) {
		ThisKeywordDemoFour t=new ThisKeywordDemoFour();
		

	}

}
