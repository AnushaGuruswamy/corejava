package com.Anusha.inheritance.dtoInstitution;

public class Institution {
	public int noOfInstitutions = 25121;
	public byte types = 86;
	public boolean multiCourse = true;
	public String entry = "Exam";
	public String stay = "Hostel or pg";
	
	public Institution() {
		System.out.println("Institution class");
	}
	
	public int noOfInstitutions(int noOfInstitutions) {
		return noOfInstitutions;
	}
	
	public byte types(byte types) {
		return types;
	}
	
	public boolean multiCourse(boolean multiCourse) {
		return multiCourse;
	}
	
	public String entry(String entry) {
		return entry;
	}
	
	public String stay(String stay) {
		return stay;
	}
}
