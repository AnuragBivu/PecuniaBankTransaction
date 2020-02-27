package com.capgemini.pecunia.service;

import com.capgemini.pecunia.controller.Account;
import com.capgemini.pecunia.dao.TransactionDAO;
import com.capgemini.pecunia.dao.TransactionDAOImpl;

public class TransactionServiceImpl implements TransactionService {
	
	TransactionDAO transactiondao = new TransactionDAOImpl();
	
	public TransactionServiceImpl()
	{
		@SuppressWarnings("unused")
		TransactionDAO transactiondao = new TransactionDAOImpl();
	}

	@Override
	public int creditUsingSlip(Account A, double amount) {
		// TODO Auto-generated method stub
		if(A.equals(null))
			System.out.println("It is NULL");
		//System.out.println(A.getBalance());
		
		if(transactiondao.updateBalance(A,amount))
			return 1;
		return 0;
	}

	@Override
	public int debitUsingSlip(Account A, double amount) {
		// TODO Auto-generated method stub
		amount = -amount;
		if(transactiondao.updateBalance(A,amount))
			return 1;
		return 0;
	}

	@Override
	public int creditUsingCheque(Account A, double amount) {
		// TODO Auto-generated method stub
		if(transactiondao.updateBalance(A,amount))
			return 1;
		return 0;
	}

	@Override
	public int debitUsingCheque(Account A, double amount) {
		// TODO Auto-generated method stub
		amount = -amount;
		if(transactiondao.updateBalance(A,amount))
			return 1;
		return 0;
	}

	@Override
	public double getBalance(Account account) {
		// TODO Auto-generated method stub
		return account.getBalance();
	}

	@Override
	public boolean updateBalance(Account account) {
		// TODO Auto-generated method stub
		return false;
	}

}
