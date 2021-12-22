package com.xworkz.bank.loan;

public class Loan {
	String bankName;
	String loanName;
	int loanId;
	String ApplicantName;
	double phNum;
	String adharNum;
	float Amount;
	
 
public Loan(String bankName){
		this.bankName= bankName;
	}

public Loan(String bankname,String loanName,int loanId){
	this(bankname);
	this.loanName=loanName;
	this.loanId= loanId;
}

public Loan(String ApplicantName,double phNum){
	this.ApplicantName= ApplicantName;
	this.phNum= phNum;
}

public Loan(String adharNum,float Amount){
	this.adharNum= adharNum;
	this.Amount= Amount;
}

public Loan(String bankName,String loanName,int loanId,String ApplicantName,double phNum,String adharNum,float Amount){
	this(bankName,loanName,loanId);
	this.ApplicantName= ApplicantName;
	this.phNum= phNum;
	this.adharNum= adharNum;
	this.Amount= Amount;
}



public String printAll() {
	String a =  "Bankname=" +  bankName +"\n" + "Loanname=" + loanName + "\n" + " Loanid=" + loanId + "\n" + " ApplicantName="
			+ ApplicantName+ "\n" + "Phnum=" + phNum+ "\n" + "Adharnumber=" + adharNum + "\n" + "Amount=" + Amount;
	return a;
}
}

