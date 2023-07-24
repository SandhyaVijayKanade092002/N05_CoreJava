//program to demonstrate cascaded if else
package org.tnsif.decisionmaking;
import java.util.*;

public class CascadedIfElseExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter age of three person");
        int age1=sc.nextInt();
        int age2=sc.nextInt();
        int age3=sc.nextInt();
        if(age1>age2 && age1>age3) {
        	System.out.println("age one greater" + age1);
        }
        else if(age2>age3 && age2>age3) {
        	System.out.println("age 2 is greater" + age2);
        }
        else {
        	System.out.println("age 3 is greater" + age3);
        }
	}

}
