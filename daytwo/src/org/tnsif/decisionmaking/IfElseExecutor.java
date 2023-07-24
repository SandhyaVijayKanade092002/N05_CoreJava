package org.tnsif.decisionmaking;
import java.util.*;
public class IfElseExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner (System.in);
         int age=sc.nextInt();
         int weight=sc.nextInt();
         if(age>18 && weight>40) {
        	 System.out.println("Eligible to donate blood");
         }
         else {
        	 System.out.println("Not eligible to donate");
         }
	}

}
