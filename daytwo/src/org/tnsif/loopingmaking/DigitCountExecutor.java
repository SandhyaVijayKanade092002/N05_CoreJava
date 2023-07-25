package org.tnsif.loopingmaking;

public class DigitCountExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=12345;
		int count=0;
		do{
			n=n/10;
			count++;
		}while(n != 0);
		System.out.println(count);

	}

}
