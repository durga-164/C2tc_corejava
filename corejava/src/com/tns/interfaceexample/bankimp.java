package com.tns.interfaceexample;

public class bankimpl implements Bank {

	@Override
	public void deposit(Account a, double amt) {
		// TODO Auto-generated method stub
		if(amt>deposit_limit)
		{
			System.out.println("deposit not possible");
		}
		else {
			a.setBalance(a.getBalance()+amt);
		}
	}

	@Override
	public void withdraw(Account a, double amt) {
		// TODO Auto-generated method stub
		if(a.getBalance()-amt>=min_balance)
		{
			a.setBalance(a.getBalance()-amt);
			System.out.println("withdraw"+amt+"from account"+a.getAccNo());
		}
		else {
			System.out.println("insufficient balance");
		}
		
	}
}
