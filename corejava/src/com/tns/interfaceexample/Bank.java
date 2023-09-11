package com.tns.interfaceexample;

public interface Bank {
	double min_balance=100;
	double deposit_limit=25000;
	double interest_rate=7.8;
	void deposit(Account a,double amt);
	void withdraw(Account a,double amt)
}
