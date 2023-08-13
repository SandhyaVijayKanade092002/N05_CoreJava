package org.tnsif.interfacedemo;
//implementable class
public class SBIDebitcard implements DebitCard {

	
	@Override
	public void displayCardDetails() {
		System.out.println("card number is"+cardno);
		
	}

}
