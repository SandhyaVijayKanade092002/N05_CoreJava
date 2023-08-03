package org.thsif.finalkeyword;
//program to demonstrate final method

//we can not inherit the final class
public class Shape {
	
	final String ShapeName="Circle";
	//final method
	final void printShapeType() {
		System.out.println(ShapeName);
	}

}
