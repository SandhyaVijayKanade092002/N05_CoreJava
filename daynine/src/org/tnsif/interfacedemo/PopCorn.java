package org.tnsif.interfacedemo;
//functional interface:
    // a interface which contain exactly one abstract method then that interface known as functional interface

/* below annotation ensures that we have to use exactly one abstract method inside an interface*/
@FunctionalInterface
public interface PopCorn {
	//abstract method
	void displayReceip();
	
	//void display();

}
