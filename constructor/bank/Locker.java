package com.xworkz.bank.locker;

public class Locker {
	String bankName;
	String location;
	String locker_holder_name;
	int locker_holder_id;
	long mobileNo;
	long aadharNo;
	String PANCard;
	
	public Locker(String bankName) {
		this.bankName = bankName;
	}

	public Locker(String location, String locker_holder_name) {
		this.location = location;
		this.locker_holder_name = locker_holder_name;
	}

	public Locker(int locker_holder_id) {
		this.locker_holder_id = locker_holder_id;
	}

	public Locker(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public Locker(long aadharNo, String pANCard) {
		this.aadharNo = aadharNo;
		this.PANCard = pANCard;
	}

	public Locker(String bank_name, String location, String locker_holder_name, int locker_holder_id, long mobile_No,
		long aadharNo, String pANCard) {
		this(aadharNo,pANCard);
		this.bankName = bankName;
		this.location = location;
		this.locker_holder_name = locker_holder_name;
		this.locker_holder_id = locker_holder_id;
		this.mobileNo = mobileNo;
		
	}

	public String printAll() {
	String res = "Bank Name="+bankName +"\t"+"Location="+location +"\t"+ "Locker Holder Name="+locker_holder_name +"\t"+ "Locker Holder ID="+locker_holder_id +"\t"+ "Mobile No="+mobileNo +"\t"+ "Aadhar No="+aadharNo +"\t"+ "PAN Card="+PANCard;
	return res;
	}
	
}


