package org.tnsif.interfacedemo;
//implementable class for child class
//program to demonstrate on multiple inheritance
public class Person implements ColdDrink,Alcohol{

	@Override
	public void showDrinkName() {
		
	System.out.println(brand+" "+alcoholname+" "+name);
		
	}

	

}
