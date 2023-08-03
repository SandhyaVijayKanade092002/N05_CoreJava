package org.tnsif.statickeyword;

public class Tiger extends Animal {
	
		 void eat() {
			 System.out.println("eating");
		 }
		 static void run() {
			 //we cant not override static method
			// super.run();
			 System.out.println("running");
			 
		 }

}
