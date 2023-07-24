//nested if demonstration
package org.tnsif.decisionmaking;
import java.util.*;
public class NestedIfExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age and weight");
		int age=sc.nextInt();
		int weight=sc.nextInt();
		if (age>=12) {
			if(weight>=40) {
				System.out.println("eligible");
			if(weight>=110) {
				System.out.println("Extra roops are added");
			}
			}
		
		else {
			System.out.println("not eligible");
		}
		}
		else {
			System.out.println("not eligible");
		}
	}

}
