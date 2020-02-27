package com.capgemini.pecunia.controller;

public class Cheque {
	
	public String PayeeAccountNumber, BeneficiaryAccountNumber, ChequeNumber, BankName, IFSC;

	public String getPayeeAccountNumber() {
		return PayeeAccountNumber;
	}

	public void setPayeeAccountNumber(String payeeAccountNumber) {
		PayeeAccountNumber = payeeAccountNumber;
	}

	public String getBeneficiaryAccountNumber() {
		return BeneficiaryAccountNumber;
	}

	public void setBeneficiaryAccountNumber(String beneficiaryAccountNumber) {
		BeneficiaryAccountNumber = beneficiaryAccountNumber;
	}

	public String getChequeNumber() {
		return ChequeNumber;
	}

	public void setChequeNumber(String chequeNumber) {
		ChequeNumber = chequeNumber;
	}

	public String getBankName() {
		return BankName;
	}

	public void setBankName(String bankName) {
		BankName = bankName;
	}

	public String getIFSC() {
		return IFSC;
	}

	public void setIFSC(String iFSC) {
		IFSC = iFSC;
	}
	
}
