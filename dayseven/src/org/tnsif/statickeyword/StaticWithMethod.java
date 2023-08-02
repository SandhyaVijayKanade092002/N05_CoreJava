package org.tnsif.statickeyword;

public class StaticWithMethod {
	
	int x=2;
	static String collegename="met";
	
	/* if any method outside the main function if we want to access it into main function
	 * you want to create the method as static method*/
	
	//static method
	public static void print() {
		System.out.println(collegename);
		
		
		/*we can not use any un static variable in static method*/
		//System.out.println(x);
	}

	public static void main(String[] args) {
		print();

	}

}
