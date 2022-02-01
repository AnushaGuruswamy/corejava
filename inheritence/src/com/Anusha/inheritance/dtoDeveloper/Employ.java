package com.Anusha.inheritance.dtoDeveloper;

public class Employ{
	public byte typesOfEmploye=35;
	public int fields=2695;
	public boolean BankPayment=true; 
	public boolean insurance=true;
	public String documentsNeeded = "Adhar card,Education docs,Passport photos,pan card";
	
	public Employ() {
		System.out.println("Employ class");
	} 
	
	public byte typesOfEmploye(byte typesOfEmploye) {
		return typesOfEmploye;
	}
	
	public int fields(int fields) {
		return fields;
	}
	
	public boolean BankPayment(boolean BankPayment) {
		return BankPayment;
	}
	
	public boolean insurance(boolean insurance) {
		return insurance;
	}
	
	public String documentsNeeded(String documentsNeeded) {
		return documentsNeeded;
	}
}
