package com.xwokz.communcation.mobile;

public class Mobile {
	String type;
	String company;
	String series;
	int price;
	boolean bluetooth;
	
	public Mobile() {
		System.out.println("Mobile phone");
	}

	public Mobile(String type) {
		this.type = type;
	}

	public Mobile(String type, String company) {
		this(type);
		this.company = company;
	}

	public Mobile(String type, String company, String series) {
		this(type,company);
		this.series = series;
	}

	public Mobile(String type, String company, String series, int price, boolean bluetooth) {
		this(type,company,series);
		this.price = price;
		this.bluetooth = bluetooth;
	}
	
	public String getAll() {
		String m = type +"\n"+ company +"\n"+ series +"\n"+ price +"\n"+ bluetooth;
		System.out.println("\n");
		return m;
	}
}
