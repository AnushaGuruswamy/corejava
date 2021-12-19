package com.Anusha.inheitance.dtoAirlines;

public class Indigo extends Airlines{
	public String owner="Rahul Bhatia";
	public String headOffice="Delhi";
	public int since = 2006;
	public byte nationalFlights=71;
	public byte InterNationakFlights=24;
	
	public Indigo() {
		System.out.println("Indigo class");
	}
	
	public String owner(String owner) {
		return owner;
	}
	
	public String headOffice(String headOffice) {
		return headOffice; 
	}
	
	public int since(int since) {
		return since;
	}
	
	public byte nationalFlights(byte nationalFlights) {
		return nationalFlights;
	}
	
	public byte InterNationakFlights(byte InterNationakFlights) {
		return InterNationakFlights;
	}
}
