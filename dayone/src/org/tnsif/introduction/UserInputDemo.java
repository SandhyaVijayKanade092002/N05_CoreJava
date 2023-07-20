package org.tnsif.introduction;
import java.util.*;

public class UserInputDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter num");
		int num=sc.nextInt();
		System.out.println("Value of num is " +num);
		
		System.out.println("Enter floatnum");
		float num1=sc.nextFloat();
		System.out.println("Value of float is " +num1);
		
		System.out.println("Enter char");
		char c=sc.next().charAt(1);
		System.out.println("Value of charater is " +c);
		
		System.out.println("Enter string");
		String str=sc.nextLine();
		//sc.next();
		System.out.println("String is " +str);

	}

}
