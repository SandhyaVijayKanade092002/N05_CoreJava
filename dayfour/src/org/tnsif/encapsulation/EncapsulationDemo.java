// Program to demonstrate on encapsulation
/* encapsulation achieves the data hiding using private access specifier*/

//Driver class

package org.tnsif.encapsulation;

public class EncapsulationDemo {

	public static void main(String[] args) {
		HDFC b=new HDFC();
		b.setAccountNo(123456789L);
		b.setAccountType("Current");
	    b.setCvvNo(123);
        b.setPinNo(1221);
       /* System.out.println(b.getAccountNo());
        System.out.println(b.getAccountType());
        System.out.println(b.getCvvNo());
        System.out.println(b.getPinNo());*/
        
        System.out.println(b);
	}

}
