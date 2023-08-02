package org.tnsif.statickeyword;

public class StaticWithBlock {
	
	static float salary;
	String companyName;
	
	
	/* static block is used to initialize static variable we can not initialize un static variable in static block*/
	
	//static block
	static {
		
		
		//companyName="Accenture";
		
		salary=567834.93f;
		
		
	}

	//static method
	static void print() {
		System.out.println(salary);
	}
	public static void main(String[] args) {
		
    print();
	}

}
