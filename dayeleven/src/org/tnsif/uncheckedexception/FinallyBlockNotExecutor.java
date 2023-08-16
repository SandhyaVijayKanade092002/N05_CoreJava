package org.tnsif.uncheckedexception;

import java.util.Scanner;

//program to demonstrate on finally block executor
public class FinallyBlockNotExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		//try block contain exception code
		try {
			System.out.println(x/y);
			//when we use system.exit(0) then finally block is not executed
			//System.exit(0);
		}
		//catch is used to handle an exception
		catch(Exception e) {
			System.out.println("Exception handled"+e);
			//when we use system.exit(0) then finally block is not executed
			//System.exit(0);
			
		}
		finally {
			
			/*when finally block contain exception then finally block does not executed*/
		    //System.out.println(4/0);
			
			System.out.println("finally block executed");
		}
		
		

	}

}
