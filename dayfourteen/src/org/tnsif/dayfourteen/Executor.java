package org.tnsif.dayfourteen;

public class Executor {

	public static void main(String[] args) {
		//throw new ArithmeticException();
		// Thread.sleep(100);
		
		Account acc=new.Account(111,"sandhya",12000);
		try {
			acc.deposit(500);
			System.out.prinln(acc);
		}
		catch(Exception e) { 
			
		}

}
}
