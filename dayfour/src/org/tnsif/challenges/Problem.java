package org.tnsif.challenges;
import java.util.*;
/* There are n people standing in a circle waiting to be executed. the counting out beings at some point in the 
 * circle and trucsits around the circle in a fix direction in each step a certain no of people are skip and the next person is 
 * executed. the elimination trucsit around the circle (which is becoming smaller and smaller as the people are removed),
 * until only the last person remains who is given freedom.
 * given the total number of person n and a number k which indicated that k-1 person are skip and the k th person is killed in circle
 * the task is the choose the person in the initial circle is services .*/

public class Problem {
	static int survive(int n,int k) {
		if(n==1)
			return 1;
		else
			return(survive (n-1,k)+k-1)%n+1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n and k");
		int n=sc.nextInt();
		int k=sc.nextInt();
		System.out.println(survive(n,k));
		
		
		
		

	}

}
