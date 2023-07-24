package org.tnsif.loopingmaking;
import java.util.*;

public class WhileLoopExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		int i=1;
		while(n>=i) {
			System.out.print(n+ " ");
			n--;
		}

	}

}
