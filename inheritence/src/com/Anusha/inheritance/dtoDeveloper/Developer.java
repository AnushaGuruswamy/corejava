package com.Anusha.inheritance.dtoDeveloper;

public class Developer extends Employ{
	public String designition = "developer";
	public int salary=30000;
	public String company="Xworkz";
	public byte bondYear=2;
	public boolean laptopProvided = true;
	
	public Developer() {
		System.out.println("Developer class");
	}
	
	public String designition(String designition) {
		return designition;
	}
	
	public int salary(int salary) {
		return salary;
	}
	
	public String company(String company) {
		return company;
	}
	
	public byte bondYear(byte bondYear) {
		return bondYear;
	}
	
	public boolean laptopProvided(boolean laptopProvided) {
		return laptopProvided;
	}
}
