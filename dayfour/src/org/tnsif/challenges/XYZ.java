/* ASK the user for their birth year encoded as two digit (like "62")and for the current year , also encoded as two digit(like 99)like 
 * a program to find users current age in years */

package org.tnsif.challenges;

import java.util.Scanner;

public class XYZ {
	static void year(int by,int cy) {
		if(cy>by) {
			System.out.println(cy-by);
		}
		else{
			System.out.println((100-by)+cy);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cy and by");
		int cy=sc.nextInt();
		int by=sc.nextInt();
		year(by,cy);

	}

}
