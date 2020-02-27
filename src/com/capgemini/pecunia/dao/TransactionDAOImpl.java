package com.capgemini.pecunia.dao;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.capgemini.pecunia.controller.Account;
import com.capgemini.pecunia.controller.Transaction;

@SuppressWarnings("unused")
public class TransactionDAOImpl implements TransactionDAO{
	private Logger logger = Logger.getLogger( TransactionDAO.class);
	
	Transaction transaction = new Transaction();
	//Account account = new Account();
	
	public double balance;
	
	public TransactionDAOImpl() {
		//TODO
	}
	
	public double getBalance(Account A)
	{
		balance = A.getBalance();
		return balance;
	}
	
	public boolean updateBalance(Account A, double amount)
	{
		double balance = getBalance(A);
		
		A.setBalance(balance + amount);
       logger.info("updated amount:"+amount);
		return true;
	}
	

}
