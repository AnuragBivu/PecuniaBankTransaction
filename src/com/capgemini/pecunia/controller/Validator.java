package com.capgemini.pecunia.controller;

public class Validator {
	
	public Validator()
	{
		//Constructor
	}
	
	public static boolean accountNoValidation(String AccountNo)
	{
		if(AccountNo.length() == 12)
			return true;		
		return false;
		
	}
	
	public static boolean amountValidation(double amount)
	{
		if(amount == (double)amount && amount >= 100 && amount <= 100000)
			return true;
		return false;
		
	}
	
	public static boolean chequeNumberValidation(String ChequeNo)
	{
		if(ChequeNo.length() == 6)
			return true;
		return false;
		
	}
	
	public static boolean IFSCValidation(String IFSC)
	{
		if(IFSC.length() == 10 && IFSC.matches("[A-Za-z0-9]+"))
			return true;
		return false;
		
	}
	
//	public static boolean chequeIssueDateValidation(String ChequeIssueDate)
//	{
//		return false;
//		
//	}

}
