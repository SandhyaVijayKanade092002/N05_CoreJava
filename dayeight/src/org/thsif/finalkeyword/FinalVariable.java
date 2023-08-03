package org.thsif.finalkeyword;
//program to demonstrate on final keyword with variable
public class FinalVariable {
	
	//we have to initialize variable at the time of delclartion
       //final int NUM;
	
	final float SALARY=78000.68f;
	
	public void print() {
		
		//we can not change the value of final variable
		//SALARY=89000.56f;
		
		System.out.println(" salary is " +SALARY);
	}
}
