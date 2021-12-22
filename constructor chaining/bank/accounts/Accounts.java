package com.xworkz.bank.accounts;

public class Accounts {
	
		String bankName;
		String holderName;
		int DOB;
		long accountNo;
		int ifscCode;
		String pancard;
		String MRIcode;
		long contactNo;
		long aadharNo;
		String address;
		
		public Accounts(String bankName, String holderName) {
			this.bankName = bankName;
			this.holderName = holderName;
		}

		public Accounts(String bankName, String holderName,int dOB) {
			this(bankName,holderName);
			this.DOB = dOB;
			
		}

		public Accounts(String bankName, String holderName,int dOB,long accountno,int ifscCode ) {
			this(bankName,holderName,dOB);
			this.accountNo = accountNo;
			this.ifscCode = ifscCode;
			
		}

		public Accounts(String bankName, String holderName,int dOB,long accountNo,int ifscCode,String pancard) {
			this( bankName,  holderName, dOB, accountNo, ifscCode);
			this.pancard = pancard;
		}

		public Accounts(String bankName, String holderName,int dOB,long accountNo,int ifscCode,String pancard,String MRIcode, long aadharNo ) {
			this(bankName,  holderName, dOB, accountNo, ifscCode, pancard);
			this.MRIcode = MRIcode;
			this.aadharNo = aadharNo;
		}
		
	   
		
		public Accounts(String bankName, String holderName, int dOB, long accountNo, int ifscCode, String pancard,
				String MRIcode, long contactNo, long aadharNo, String address) {
			
			this(bankName,  holderName, dOB, accountNo, ifscCode, pancard, MRIcode, aadharNo);
			this.contactNo = contactNo;
			this.address = address;
		}

	 public	String printall() {
	   	String response= "bankname="  +bankName+ "\t" +"holdername="  +holderName +"\t" +DOB +"\t" +accountNo +"\t" +ifscCode +"\t" +"pancard=" +pancard  +"\t" + "MRIcode="+MRIcode+"\t" +contactNo +"\t" +aadharNo	+"\t" +"address=" +address; 
	   	 return response;
	   	}
}
