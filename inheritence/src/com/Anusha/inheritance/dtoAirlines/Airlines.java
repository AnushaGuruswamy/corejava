package com.Anusha.inheritance.dtoAirlines;

public class Airlines {
	public byte count=23;
	public String no1Airline="Indigo";
	public boolean safety=true;
	public byte compartments=4;
	public boolean foodFacility=true;
	public String num;
	
	public Airlines() {
		System.out.println("Airlines class");
	}
	
	public Airlines(String num) {
		this.num=num;
		System.out.println(num);
	}
		
	public String no1Airline(String no1Airline) {
		return no1Airline;
	}
	
	public boolean safety(boolean safety) {
		return safety;
	}
	
	public byte compartments(byte compartments) {
		return compartments;
	}
	
	public boolean foodFacility(boolean foodFacility) {
		return foodFacility;
	}
}
