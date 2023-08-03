//method overriding same method name and parameter
package org.tnsif.polymorphism;

import java.util.Scanner;

class Laptop{
	String generation1;
	void specification(String generation1,String generation2) {
		System.out.println("laptop: "+generation1);
	}
	
}
class Asus extends Laptop{
	String generation2;
	 void specification(String generation1,String generation2) {
		super.specification(generation1,generation2);
		System.out.println("Asus: "+generation2);
	}
	
	
}
//driver class
public class MethodOverridingExecutor {

	public static void main(String[] args) {
	Asus a=new Asus();
	Scanner s=new Scanner(System.in);
	String generation1=s.nextLine();
	String generation2=s.nextLine();
	a.specification(generation1,generation2);
	
	}

}
