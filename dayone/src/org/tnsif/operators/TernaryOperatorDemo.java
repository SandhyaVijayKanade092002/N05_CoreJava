//Ternary Operator Demonstration
package org.tnsif.operators;
import java.util.*;

public class TernaryOperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		String res=(num%2==0)?"Even":"Odd";
		System.out.println("Result is "+res);
		sc.close();

	}

}
