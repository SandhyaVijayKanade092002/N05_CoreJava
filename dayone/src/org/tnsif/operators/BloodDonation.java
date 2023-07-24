
package org.tnsif.operators;
import java.util.*;

public class BloodDonation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter age");
		int x=sc.nextInt();
		System.out.println("Enter weight");
		int y=sc.nextInt();
		if(x>=18 && y>=60) {
			System.out.println("Person is eligibal to donate blood");
		}
		else {
			System.out.println("Person is not eligibal to donate blood");
		}

	}

}
