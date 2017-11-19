package com.Edmund_8_5;

public class Account {
	private  int balance;
	public Account(int balance){
		this.balance=balance;
	}
	public int getBalance(){
		return balance;
	}
	
	public void withdraw(int amt){
		this.balance=balance-amt;
	}
}
