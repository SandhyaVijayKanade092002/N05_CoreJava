/* Pratik is so much interested in gardening and hence he plants more trees in his garden.
 * he plants tress in rectangular fashion with the order of rows and  and numbers the trees in roes wise order.
 * he planted the mango tree only in the first row first column and last column.
 * so, given the tree number and rows and columns. your task is to find out whether the given tree is mango tree or not.
 * input n=5; rows and columns number
 * t=11; t stands for tree no. */



package org.tnsif.challenges;

import java.util.Scanner;

public class MangoTreeExecutor {
	 static void isMangoTree(int n,int t) {
		if(t%n==0 || t%n==1 || t<=5) {
			System.out.println("mango tree");
		}
		
		else {
			System.out.println("not mango trss");
	}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t=sc.nextInt();
		isMangoTree(n,t);

		
		
	}
	 

	}


