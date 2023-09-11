package com.tns.interfaceexample;

public class Account {
	private int accNo;
	private String name;
	private double balance;
	private Bank b;
	
	public Account(int accNo, String name, double balance, Bank b) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
		this.b = b;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Bank getB() {
		return b;
	}
	public void setB(Bank b) {
		this.b = b;
	}
	
	public void deposit(Account a,double amt) {
		b.deposit(this, amt);
	}
	public void withdraw(Account a,double amt) {
		b.withdraw(this, amt);
	}
	@Override
	public String toString() {
		return "account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + ", b=" + b + "]";
	}
}
