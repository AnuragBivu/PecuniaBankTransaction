package com.capgemini.pecunia.service;

import com.capgemini.pecunia.controller.Account;

public interface TransactionService {
	
	//public double getBalance(Account account);
	public boolean updateBalance(Account account);
	public double getBalance(Account account);
	public int creditUsingSlip(Account A, double amount);
	public int debitUsingSlip(Account A, double amount);
	public int creditUsingCheque(Account A, double amount);
	public int debitUsingCheque(Account A, double amount);
}
