package com.capgemini.pecunia.dao;

import com.capgemini.pecunia.controller.Account;
import com.capgemini.pecunia.controller.Transaction;

@SuppressWarnings("unused")
public interface TransactionDAO {
		public double getBalance(Account A);
		public boolean updateBalance(Account A, double amount);
		
		

	}
