//program to demonstrate do while
package org.tnsif.loopingmaking;
import java.util.*;
public class DoWhileExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Emter a number");
		int n=sc.nextInt();
		do {
			System.out.println("Value of n is" + n);
			n++;
		}while(n<14);

	}

}
