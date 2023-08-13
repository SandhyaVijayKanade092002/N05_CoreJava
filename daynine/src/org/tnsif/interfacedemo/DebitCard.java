package org.tnsif.interfacedemo;

public interface DebitCard {
	//by default all the variable inside the interface is public static final and if it is final then we must have 
	//to initialize value fir that variable
	long cardno=29873578543L;
	/* we can not use concert method inside an interface by default method inside interface is abstarct*/
	void displayCardDetails() ;
	
	
	/*default method and the static method is new features of java 8 
	 * which can use inside an interface*/
	default void display() {
		System.out.println("Default interface");
	}
	
	//this is static method
	static void print() {
		System.out.println("Static method");
	}

}
