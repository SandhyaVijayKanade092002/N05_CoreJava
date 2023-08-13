/* program to demonstrate on interface*/

package org.tnsif.interfacedemo;
//DRIVER CLASS
public class InterfaceExecutor {

	public static void main(String[] args) {
		
		
		//we can not instantiate an interface
		//DebitCred d=new DebitCard()
		
		SBIDebitcard s=new SBIDebitcard();
		s.displayCardDetails();
		//we can call default method of an interface using obj.implementable class
		s.display();
		/* print is the static method inside an interface to call print method we have to use 
		 * interface name.method name*/
		DebitCard.print();
		
		
		
		
		CheesePopcorn sc=new CheesePopcorn();
		sc.displayReceip();
		
		Person p=new Person();
		p.showDrinkName();
        
	}

}
