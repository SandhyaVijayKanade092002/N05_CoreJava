package org.tnsif.dayfourteen;

public interface Bank {

	public static final int DEPOSIT_LIMIT = 25000;
	static final int MINIMUN_BALANCE = 1000;
	
	public abstract void deposit(int amount);
	void withdraw(int amount);
	

}
