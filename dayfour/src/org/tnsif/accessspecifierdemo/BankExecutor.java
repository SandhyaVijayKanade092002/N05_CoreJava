package org.tnsif.accessspecifierdemo;

import org.tnsif.accessspecifier.*;

public class BankExecutor {

	public static void main(String[] args) {
		Bank b =new Bank();
		b.bankName="SBI";
		b.displayPublic();
		
		/*pinNo and displayPrivate() method are private so we can not acces them
		into another class or another method only we can access them into another class or another method.*/
		
		//b.pinNo;
		//b.displayPrivate();
		
		/*Account number and display default method are default that why we are not able to access into another package
		  only we can access within the same package*/
		
		//b.accountNo;
		//b.displayDefault();	
		

	}

}
