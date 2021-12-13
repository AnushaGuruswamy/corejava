package com.xwokz.communcation.telegram;

public class Telegram {
	String type;
	String medium;
	String base;
	int year;
	
	public Telegram() {
		System.out.println("Telegraph");
	}

	public Telegram(String type) {
		this.type = type;
	}

	public Telegram(String type, String medium) {
		this(type);
		this.medium = medium;
	}

	public Telegram(String type, String medium, String base) {
		this(type,medium);
		this.base = base;
	}

	public Telegram(String type, String medium, String base, int year) {
		this(type,medium,base);
		this.year = year;
	}
	
	public String getAll() {
		String t = type +"\n"+ medium +"\n"+ base +"\n"+ year;
		System.out.println("\n");
		return t;
	}
}
