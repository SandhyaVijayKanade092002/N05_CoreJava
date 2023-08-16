package org.tnsif.uncheckedexception;

import java.util.Scanner;
//program to demonstrate on arithmetic exception
public class ArithimeticExceptionExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		
		//try block contain exception code
		try {
			System.out.println(x/y);
		}
		//catch block used to handle exception
		catch(Exception e){
			System.out.println("exception handled"+e);
		}
		

	}

}
