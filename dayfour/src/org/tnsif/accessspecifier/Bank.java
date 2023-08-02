// program to demonstrate different access specifiers

package org.tnsif.accessspecifier;

public class Bank {
	//DIFFERENT PACKAGE SPECIFIER
	public String bankName;
	private int pinNo;
	long accountNo=1234456789L;
	
	//public method
  public void displayPublic() {
	  System.out.println("Bank name is " +bankName);
  }
  //private method
  private void displayPrivate() {
	  System.out.println("Pin no is "+pinNo);
  }
  void displayDefault() {
	  System.out.println("Account no is "+accountNo);
  }
	
}
