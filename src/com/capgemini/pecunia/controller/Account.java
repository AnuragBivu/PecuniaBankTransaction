package com.capgemini.pecunia.controller;

public class Account {
	
	private String accountNumber;
	private double balance;
	
	public Account() {
		super();
		
	}
	
	public Account(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public String getAccountNumber() {
		return (String) accountNumber;
	}
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = (String) accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}

}
