package com.capgemini.pecunia.controller;

import java.util.Scanner;

import com.capgemini.pecunia.service.TransactionService;
import com.capgemini.pecunia.service.TransactionServiceImpl;

public class TransactionController {
	static TransactionService transactionservice=new TransactionServiceImpl();
	static Scanner scanner=new Scanner(System.in);
	
	static Validator Validation = new Validator();
	
	public static Account account = new Account();
	
	public TransactionController() {

		while(true) {
			int choice;
			System.out.println("Enter your choice");
			System.out.println("1.credit using slip");
			System.out.println("2.debit using slip");
			System.out.println("3.credit using cheque");
			System.out.println("4.debit using cheque");
			System.out.println("5.Exit");
			System.out.println("6.Display balance");
			choice=scanner.nextInt();
			switch(choice) {
			case 1:
				creditUsingSlip();
				break;
			case 2:
				debitUsingSlip();
				break;
			case 3:
				creditUsingCheque();
				break;
			case 4:
				debitUsingCheque();
				break;
			case 5:
				System.out.println("THANK YOU");
				System.exit(0);
				break;
			case 6:
				System.out.println(account.getBalance());
				break;
			default:
				System.out.println("Invalid Choice");
				break;
			}
		}
	}
	
	//CREDIT USING SLIP
	@SuppressWarnings("static-access")
	private static void creditUsingSlip() {
		System.out.println("Enter Account No.:\t");
		String AccountNo=scanner.next()+scanner.nextLine();
		
		if(!(Validation.accountNoValidation(AccountNo)))
		{
			System.out.println("\n\nAc count No. is Invalid");
			System.exit(0);
		}
		
		account.setAccountNumber(AccountNo);
		
		System.out.println("Enter Amount to be credited:\t");
		double amount=scanner.nextDouble();
		
		if(!(Validation.amountValidation(amount)))
		{
			System.out.println("\n\nAmount entered is Invalid");
			System.exit(0);
		}
		
		if(transactionservice.creditUsingSlip(account,amount) == 1) {
			System.out.println("amount deposited successfully");
		}
		
		System.out.println("\n---------------\n");
		System.out.println("Account No.\t" + account.getAccountNumber());
		System.out.println("Current Balance\t" + account.getBalance());
		System.out.println("\n---------------\n");
	}
	
	//DEBIT USING SLIP
	@SuppressWarnings("static-access")
	private static void debitUsingSlip() {
		System.out.println("Enter Account No.:\t");
		String AccountNo=scanner.next()+scanner.nextLine();
		
		if(!(Validation.accountNoValidation(AccountNo)))
		{
			System.out.println("\n\nAccount No. is Invalid");
			System.exit(0);
		}
		
		account.setAccountNumber(AccountNo);
		
		System.out.println("Enter Amount to be debited:\t");
		double amount=scanner.nextDouble();
		
		if(!(Validation.amountValidation(amount)))
		{
			System.out.println("\n\nAmount entered is Invalid");
			System.exit(0);
		}
		
		
		if(transactionservice.debitUsingSlip(account,amount) == 1) {
			System.out.println("amount debited successfully");
		}
		
		System.out.println("\n---------------\n");
		System.out.println("Account No.\t" + account.getAccountNumber());
		System.out.println("Current Balance\t" + account.getBalance());
		System.out.println("\n---------------\n");
		
	}
	
	//CREDIT USING CHEQUE
	@SuppressWarnings("static-access")
	private static void creditUsingCheque() {
		
		Cheque cheque = new Cheque();
		
		System.out.println("Enter Payee Account No.:\t");
		String PAccountNo=scanner.next()+scanner.nextLine();
		
		if(!(Validation.accountNoValidation(PAccountNo)))
		{
			System.out.println("\n\nAccount No. is Invalid");
			System.exit(0);
		}
		
		cheque.setPayeeAccountNumber(PAccountNo);
		
		System.out.println("Enter Beneficiary Account No.:\t");
		String BAccountNo=scanner.next()+scanner.nextLine();
		
		if(!(Validation.accountNoValidation(BAccountNo)))
		{
			System.out.println("\n\nAccount No. is Invalid");
			System.exit(0);
		}
		
		cheque.setBeneficiaryAccountNumber(BAccountNo);
		
		System.out.println("Enter Cheque No:\t");
		String ChequeNo = scanner.next()+scanner.nextLine();
		
		if(!(Validation.chequeNumberValidation(ChequeNo)))
		{
			System.out.println("\n\nCheque no. is Invalid");
			System.exit(0);
		}
		
		cheque.setChequeNumber(ChequeNo);
		
		System.out.println("Enter Amount to be credited:\t");
		double amount=scanner.nextDouble();
		
		if(!(Validation.amountValidation(amount)))
		{
			System.out.println("\n\nAmount entered is Invalid");
			System.exit(0);
		}
		
		if(transactionservice.creditUsingCheque(account,amount) == 1) {
			System.out.println("amount deposited successfully");
		}
		
		System.out.println("\n---------------\n");
		System.out.println("Cheque No.\t" + cheque.getChequeNumber());
		System.out.println("Payee Account No.\t" + cheque.getPayeeAccountNumber());
		System.out.println("Benificiary Account No.\t" + cheque.getBeneficiaryAccountNumber());
		System.out.println("Current Balance\t" + account.getBalance());
		System.out.println("\n---------------\n");
	}
	
	//DEBIT USING CHEQUE
	@SuppressWarnings("static-access")
	private static void debitUsingCheque() {
		
		Cheque cheque = new Cheque();
		
		System.out.println("Enter Payee Account No.:\t");
		String PAccountNo=scanner.next()+scanner.nextLine();
		
		if(!(Validation.accountNoValidation(PAccountNo)))
		{
			System.out.println("\n\nAccount No. is Invalid");
			System.exit(0);
		}
		
		cheque.setPayeeAccountNumber(PAccountNo);
		
		System.out.println("Enter Beneficiary Account No.:\t");
		String BAccountNo=scanner.next()+scanner.nextLine();
		
		if(!(Validation.accountNoValidation(BAccountNo)))
		{
			System.out.println("\n\nAccount No. is Invalid");
			System.exit(0);
		}
		
		cheque.setBeneficiaryAccountNumber(BAccountNo);
		
		System.out.println("Enter Cheque No:\t");
		String ChequeNo = scanner.next()+scanner.nextLine();
		
		if(!(Validation.chequeNumberValidation(ChequeNo)))
		{
			System.out.println("\n\nCheque no. is Invalid");
			System.exit(0);
		}
		
		cheque.setChequeNumber(ChequeNo);
		
		System.out.println("Enter Amount to be debited:\t");
		double amount=scanner.nextDouble();
		
		if(!(Validation.amountValidation(amount)))
		{
			System.out.println("\n\nAmount entered is Invalid");
			System.exit(0);
		}
		
		if(transactionservice.debitUsingCheque(account,amount) == 1) {
			System.out.println("amount deposited successfully");
		}
		
		System.out.println("\n---------------\n");
		System.out.println("Cheque No.\t" + cheque.getChequeNumber());
		System.out.println("Payee Account No.\t" + cheque.getPayeeAccountNumber());
		System.out.println("Benificiary Account No.\t" + cheque.getBeneficiaryAccountNumber());
		System.out.println("Current Balance\t" + account.getBalance());
		System.out.println("\n---------------\n");
		
	}
	
	//MAIN METHOD
	public static void main(String args[])
	{
		
		TransactionController TC = new TransactionController();
		
		System.out.println("\n\nClosing the program");
	}
}

