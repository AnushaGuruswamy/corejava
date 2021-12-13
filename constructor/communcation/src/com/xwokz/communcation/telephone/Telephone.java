package com.xwokz.communcation.telephone;

public class Telephone {
	String type;
	String medium;
	int year;
	String inventor;
	
	public Telephone() {
		System.out.println("Telephone Evolution");
	}

	public Telephone(String type) {
		this.type = type;
	}

	public Telephone(String type, String medium) {
		this(type);
		this.medium = medium;
	}

	public Telephone(String type, String medium, int year) {
		this(type,medium);
		this.year = year;
	}

	public Telephone(String type, String medium, int year, String inventor) {
		this(type,medium,year);
		this.inventor = inventor;
	}
	
	public String getAll() {
		String t = type +"\n"+ medium +"\n"+ year +"\n"+ inventor;
		System.out.println("\n");
		return t;
	}
}
